package com.grocery;

import java.sql.SQLException;
import java.util.ArrayList;

public interface GroceryService {
	
	ArrayList<Product> getproduct() throws SQLException;
	
	void saveOrder(double price, int bagType, int payment_method) throws SQLException;
}
