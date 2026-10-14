package com.grocery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GroceryServiceIMPL implements GroceryService{

	@Override
	public ArrayList<Product> getproduct() throws SQLException {
		
		ArrayList<Product> products = new ArrayList<>();
		Connection conn = DbConnection.getConnection();
		
		PreparedStatement ps = conn.prepareStatement("select * from products");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			double price = rs.getDouble("price");
			int stock = rs.getInt("stock");
			
			Product p = new Product(id,name,price,stock);
			products.add(p);
		}
		
		conn.close();
		
		return products;
	}

	@Override
	public void saveOrder(double total, int bagType, int paymentMethod) throws SQLException {
		
		Connection conn = DbConnection.getConnection();
		
		String query = "insert into orders(total,bag_type,payment_method) values (?,?,?)";
		
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setDouble(1, total);
		ps.setInt(2, bagType);
		ps.setInt(3, paymentMethod);
		
		ps.executeUpdate();
		
		ps.close();
		conn.close();
	}

}
