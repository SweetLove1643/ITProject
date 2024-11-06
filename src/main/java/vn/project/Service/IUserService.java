package vn.project.Service;

import java.util.List;

import java.util.Optional;


import vn.project.Entity.Users;


public interface IUserService {

	long count();

	Optional<Users> findById(Integer id);

	List<Users> findAll();

	<S extends Users> S save(S entity);

	Optional<Users> findByUsername(String keyword);

	List<Users> findByFullnameContaining(String fullname);

	Optional<Users> findByIdOrUsername(Integer id, String name);

	
	
	
	
}
