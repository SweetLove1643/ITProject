package vn.project.Service;

import java.util.Optional;
import vn.project.Entity.Roles;

public interface IRoleService {

	Optional<Roles> findById(Integer id);

	Roles findByRolename(String rolename);

}
