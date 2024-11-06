package vn.project.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.project.Entity.Users;
import vn.project.Repository.IUserRepository;
import vn.project.Service.IUserService;

@Service
public class UserService implements IUserService {

	
	@Override
	public Optional<Users> findByIdOrUsername(Integer id, String name) {
		return userRepository.findByIdOrUsername(id, name);
	}

	@Override
	public List<Users> findByFullnameContaining(String fullname) {
		return userRepository.findByFullnameContaining(fullname);
	}

	@Autowired(required=true)
	IUserRepository userRepository;

	public UserService(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public Optional<Users> findByUsername(String keyword) {
		return userRepository.findByUsername(keyword);
	}

	@Override
	public <S extends Users> S save(S entity) {
		return userRepository.save(entity);
	}

	@Override
	public List<Users> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Optional<Users> findById(Integer id) {
		return userRepository.findById(id);
	}

	@Override
	public long count() {
		return userRepository.count();
	}

	



	

}
