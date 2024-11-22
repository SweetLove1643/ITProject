package vn.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.project.Entity.Discounts;
import java.util.List;
import java.time.LocalDate;


@Repository
public interface IDiscountRepository extends JpaRepository<Discounts, Integer>{
	List<Discounts> findByDiscountid(int discountid);
	
	List<Discounts> findByDiscountcode(String discountcode);
	
	List<Discounts> findByStartdate(LocalDate startdate);
	
	List<Discounts> findByEnddate(LocalDate enddate);

}
