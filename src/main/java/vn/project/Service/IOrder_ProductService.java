package vn.project.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import vn.project.Entity.Order_Products;

@Service
public interface IOrder_ProductService {

	void deleteById(Integer id);

	long count();

	boolean existsById(Integer id);

	Optional<Order_Products> findById(Integer id);

	<S extends Order_Products> S save(S entity);

}
