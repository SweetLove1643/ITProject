package vn.project.Repository;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.project.Entity.Users;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer>{
	
	List<Users> findbyUsers(String name);
	
	Optional<User> findByIdOrName(Long id, String name);
	
	List<Users> findByUsername(String username);
	
	List<Users> findById(int id);
	
	List<Users> findByFullname(String fullname);
	
	

}
