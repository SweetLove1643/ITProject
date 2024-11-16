package vn.project.Service.Impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import vn.project.Entity.Discounts;
import vn.project.Entity.Orders;
import vn.project.Entity.Users;
import vn.project.Repository.IDiscountRepository;
import vn.project.Repository.IOrderRepository;
import vn.project.Repository.IUserRepository;
import vn.project.Service.IOrderService;

public class OrderService implements IOrderService{
	
	@Autowired
	IOrderRepository orderRepository;
	
	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	IDiscountRepository discountRepository;

	public OrderService(IOrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public Orders findByOrderid(int orderid) {
		return orderRepository.findByOrderid(orderid);
	}

	@Override
	public List<Orders> findByUserid(int userid) {
		return orderRepository.findByUserid(userid);
	}

	@Override
	public List<Orders> findAll(Sort sort) {
		return orderRepository.findAll(sort);
	}

	@Override
	public Page<Orders> findAll(Pageable pageable) {
		return orderRepository.findAll(pageable);
	}

	@Override
	public List<Orders> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public Optional<Orders> findById(Integer id) {
		return orderRepository.findById(id);
	}

	@Override
	public long count() {
		return orderRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		orderRepository.deleteById(id);
	}

	@Override
	public void delete(Orders entity) {
		orderRepository.delete(entity);
	}

	@Override
	public void deleteAll() {
		orderRepository.deleteAll();
	}
	
	@Override
	public List<Orders> findByUser(String user) {
	    Optional<Users> optionalUser = userRepository.findByUsername(user);
	    if (optionalUser.isPresent()) {
	        Users userPresent = optionalUser.get();
	        return orderRepository.findByUserid(userPresent.getId());
	    }
	    return null;
	}
	
	public List<Orders> findbyDiscount(String discount) {
		List<Discounts> listdiscount = discountRepository.findByDiscountcode(discount);
		if (!listdiscount.isEmpty()) {
			Discounts discountpresent = listdiscount.getFirst();
			return orderRepository.findByDiscountid(discountpresent.getDiscountid());
		}
		return null;
	}
	
}