package vn.project.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.project.Entity.Discounts;


@Repository
public interface IDiscountRepository extends JpaRepository<Discounts, Integer>{
	Optional<Discounts> findByDiscountid(int discountid);

	Optional<Discounts> findByDiscountcode(String discountcode);

}
