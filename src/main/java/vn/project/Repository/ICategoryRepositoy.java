package vn.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.project.Entity.Categories;
import java.util.List;


@Repository
public interface ICategoryRepositoy extends JpaRepository<Categories, Integer>{
	
	List<Categories> findByCategoryname(String categoryname);

}
