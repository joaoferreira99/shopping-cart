package com.training.springboot.shoppingcart.service;

import com.training.springboot.shoppingcart.entity.model.CartItem;
import java.util.List;

public interface ICartItemService extends ICrudService<CartItem> {

	List<CartItem> listCartItems(Long cartUid);

	void addItem(CartItem item);

	void removeItem(CartItem item);

	CartItem getCartCartItem(Long cartItemUid, Long cartUid);
}
