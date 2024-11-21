package vn.project.Service;

import java.util.List;
import java.util.Optional;

import vn.project.Entity.Cart;

public interface ICartService {

	void deleteAll();

	void deleteById(Integer id);

	long count();

	Optional<Cart> findById(Integer id);

	List<Cart> findAll();

	List<Cart> findByUser(int userid);

}
