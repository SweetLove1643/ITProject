package vn.project.Service.Impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.project.DTO.CartDTO;
import vn.project.DTO.ProductsDTO;
import vn.project.Entity.Cart;
import vn.project.Entity.Products;
import vn.project.Repository.ICartRepository;
import vn.project.Repository.IProductRepository;
import vn.project.Repository.IUserRepository;
import vn.project.Service.ICartService;
import vn.project.Service.IProductService;

@Service
public class CartService implements ICartService{
	
	@Autowired
	ICartRepository cartRepository;
	
	@Autowired
	IProductService productService;

	public List<CartDTO> findByUserid(int userid) {
		List<Cart> usercart = cartRepository.findByUserid(userid);
		
		return null;
	}

	public void deleteByUserid(int userid) {
		cartRepository.deleteByUserid(userid);
	}

	public void deleteByUseridAndProductid(int userid, int productid) {
		cartRepository.deleteByUseridAndProductid(userid, productid);
	}

	public <S extends Cart> S save(S entity) {
		return cartRepository.save(entity);
	}

	public long count() {
		return cartRepository.count();
	}

	public List<CartDTO> ConvertCartToCartDTO(List<Cart> carts){
		List<CartDTO> cartdto = new ArrayList<>();
		
		for(Cart cart : carts) {
			CartDTO cartdtopresent = new CartDTO();
			cartdtopresent.setCartid(cart.getCartid());
			cartdtopresent.setUserid(cart.getUserid());
			cartdtopresent.setProductid(cart.getProductid());
			
			ProductsDTO product = productService.findbyIdDTO(cart.getProductid());
			
			cartdtopresent.setProductname(product.getProductname());
			cartdtopresent.setCategory(product.getCategory());
			cartdtopresent.setSupplier(product.getSupplier());
			cartdtopresent.setBrand(product.getBrand());
			cartdtopresent.setPrice(product.getPrice());
			cartdtopresent.setDescription(product.getDescription());
			cartdtopresent.setImageurl(product.getImageurl());
			cartdtopresent.setQuantity(String.valueOf(cart.getQuantity()));
			
			cartdto.add(cartdtopresent);
		}
		return cartdto;
	}
	
}
