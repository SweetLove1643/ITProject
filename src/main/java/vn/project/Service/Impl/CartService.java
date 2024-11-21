package vn.project.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.project.Entity.Cart;
import vn.project.Repository.ICartRepository;
import vn.project.Repository.IUserRepository;
import vn.project.Service.ICartService;

@Service
public class CartService implements ICartService{
	
	@Autowired
	ICartRepository cartRepository;
	
	@Autowired
	IUserRepository userRepository;


	@Override
	public List<Cart> findByUser(int userid) {
	    List<Cart> userCarts = cartRepository.findByUserid(userid);
	    if (!userCarts.isEmpty()) {
	        return userCarts;
	    }
	    return null;
	}


	@Override
	public List<Cart> findAll() {
		return cartRepository.findAll();
	}

	@Override
	public Optional<Cart> findById(Integer id) {
		return cartRepository.findById(id);
	}

	@Override
	public long count() {
		return cartRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		cartRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		cartRepository.deleteAll();
	}
	
	
}
