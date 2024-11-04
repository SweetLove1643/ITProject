package vn.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.project.Entity.Brands;

@Repository
public interface IBrandRepository extends JpaRepository<Brands, Integer>{

	List<Brands> findByBrandname(String brandname);
	
	List<Brands> findByBrandid(int brandid);
	
}
