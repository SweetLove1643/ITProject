package vn.project.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.project.Entity.Users;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer>{
	
 	  
	  Optional<Users> findByIdOrUsername(Integer id, String name);
//	  
//	  
	  List<Users> findByFullnameContaining(String fullname);
//	  
	  Optional<Users> findByUsername(String keyword);
	 
}
