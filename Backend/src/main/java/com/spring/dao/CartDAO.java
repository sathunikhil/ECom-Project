package com.spring.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.model.Cart;


@Repository

public interface CartDAO 
{
	
public boolean saveProductToCart(Cart cart);
	
	public Cart getitem(int prodId,int userId);
	
	public List<Cart>listCart();
	public boolean removeCartById(int cart_id);
	
	public long cartsize(int userId) ;
	
	public double CartPrice(int userId) ;
	
	public Cart editCartById(int cart_id);
	public Cart getCartById(int cart_id);
}