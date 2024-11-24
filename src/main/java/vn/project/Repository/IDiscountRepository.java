package vn.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import vn.project.Entity.Discounts;
import java.util.Optional;


@Repository
public interface IDiscountRepository extends JpaRepository<Discounts, Integer>{
	Optional<Discounts> findByDiscountid(int discountid);
	
	Optional<Discounts> findByDiscountcode(String discountcode);

}
