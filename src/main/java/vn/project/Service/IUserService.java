package vn.project.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import vn.project.Entity.Users;

@Service
public interface IUserService {

	long count();

	Optional<Users> findById(Integer id);

	List<Users> findAll();

	<S extends Users> S save(S entity);

	Optional<Users> findByUsername(String keyword);

	List<Users> findByFullnameContaining(String fullname);

	Optional<Users> findByIdOrUsername(Integer id, String name);

	void deleteAll();

	void deleteByUsername(String username);

	void deleteById(int id);

	
	
}
