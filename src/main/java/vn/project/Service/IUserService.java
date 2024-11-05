package vn.project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import vn.project.Entity.Users;

@Service
public interface IUserService {

	public <S extends Users> S save(S entity);

	public List<Users> findAll();

	public void deleteById(int id);

	public void delete(Users user);

	public void deleteAll();

	public List<Users> findByName(String name);

	public Users findById(int id);
	
	public List<Users> findbyUsername(String username);
	
	public void createUser(Users user);
	
	public Optional<Users> findbyOptional(String username);
}
