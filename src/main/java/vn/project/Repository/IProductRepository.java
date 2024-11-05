package vn.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.project.Entity.Products;
import java.util.List;


@Repository
public interface IProductRepository extends JpaRepository<Products, Integer>{

	List<Products> findByProductid(int productid);
	
	List<Products> findByProductname(String productname);
	
	List<Products> findByPrice(long price);
	
}
