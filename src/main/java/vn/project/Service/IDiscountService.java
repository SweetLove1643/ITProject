package vn.project.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.project.Entity.Discounts;

@Service
public interface IDiscountService {

	void deleteAll();

	void delete(Discounts entity);

	void deleteById(Integer id);

	long count();

	List<Discounts> findAll();

	<S extends Discounts> S save(S entity);

	List<Discounts> findByDiscountcode(String discountcode);

	List<Discounts> findByDiscountid(int discountid);

}
