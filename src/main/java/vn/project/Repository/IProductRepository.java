package vn.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.project.Entity.Products;
import java.util.List;
import java.util.Optional;


@Repository
public interface IProductRepository extends JpaRepository<Products, Integer>{

	Optional<Products> findByProductid(int productid);
	
	List<Products> findByProductname(String productname);
	
	List<Products> findByPrice(long price);
	
	List<Products> findBySupplierid(int supplierid);
	
	List<Products> findByBrandid(int brandid);
	
	List<Products> findByCategoryid(int categoryid);
	
}
