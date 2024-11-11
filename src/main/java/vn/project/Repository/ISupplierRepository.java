package vn.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.project.Entity.Suppliers;
import java.util.List;


public interface ISupplierRepository extends JpaRepository<Suppliers, Integer>{
	
	List<Suppliers> findBySuppliernameContaining(String suppliername);
}
