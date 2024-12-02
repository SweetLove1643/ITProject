package vn.project.Service;

import java.util.List;
import java.util.Optional;

import vn.project.DTO.CartDTO;
import vn.project.Entity.Cart;

public interface ICartService {

	List<CartDTO> ConvertCartToCartDTO(List<Cart> carts);

	long count();

	<S extends Cart> S save(S entity);

	void deleteByUseridAndProductid(int userid, int productid);

	void deleteByUserid(int userid);

	List<CartDTO> findByUserid(int userid);

	void deleteByCartid(int cartid);

	Optional<Cart> findByUseridAndProductid(int userid, int productid);

	void deleteAllByproductid(int id);

	List<Cart> findbyuserid(int id);

}
