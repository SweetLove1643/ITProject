package vn.project.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import vn.project.Entity.Users;
import vn.project.Repository.IUserRepository;
import vn.project.Service.IUserService;

public class UserService implements IUserService {

	@Autowired
	private IUserRepository userreposiory;

	@Override
	public <S extends Users> S save(S entity) {

		return userreposiory.save(entity);
	}

	@Override
	public List<Users> findAll() {

		return userreposiory.findAll();
	}

	@Override
	public void deleteById(int id) {
		Users u = userreposiory.findById(id).getFirst();

		if (u != null) {
			userreposiory.deleteById(id);
		}
	}

	@Override
	public void delete(Users user) {
		Users u = userreposiory.findById(user.getId()).getFirst();

		if (u != null) {
			userreposiory.delete(user);
		}
	}

	@Override
	public void deleteAll() {
		userreposiory.deleteAll();
	}

	@Override
	public List<Users> findByName(String name) {
		// TODO Auto-generated method stub
		return userreposiory.findByFullname(name);
	}

	@Override
	public Users findById(int id) {
		// TODO Auto-generated method stub
		return userreposiory.findById(id).getFirst();
	}

	@Override
	public List<Users> findbyUsername(String username) {
		// TODO Auto-generated method stub
		return userreposiory.findByUsername(username);
	}

	@Override
	public void createUser(Users user) {
		Users u = userreposiory.findByUsername(user.getUsername()).getFirst();

		if (u == null) {
			userreposiory.save(user);
		}
	}

}
