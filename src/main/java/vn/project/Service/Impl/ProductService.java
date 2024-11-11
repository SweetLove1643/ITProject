package vn.project.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import vn.project.Entity.Brands;
import vn.project.Entity.Products;
import vn.project.Entity.Suppliers;
import vn.project.Repository.IBrandRepository;
import vn.project.Repository.IProductRepository;
import vn.project.Repository.ISupplierRepository;
import vn.project.Service.IProductService;

public class ProductService implements IProductService{

	@Autowired
	IProductRepository productRepository;
	
	@Autowired
	IBrandRepository brandRepository;
	
	@Autowired
	ISupplierRepository supplierRepository;
	
	
	public ProductService(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public <S extends Products> S save(S entity) {
		return productRepository.save(entity);
	}

	@Override
	public List<Products> findAll() {
		return productRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		Optional<Products> product = productRepository.findById(id);
		if(!product.isEmpty()) {
			Products pro = product.get();
			productRepository.deleteById(pro.getProductid());
		}
	}

	@Override
	public void delete(Products product) {
		Optional<Products> productpresent = productRepository.findById(product.getProductid());
		if(!productpresent.isEmpty()) {
			Products productdirect = productpresent.get();
			productRepository.delete(productdirect);
		}
		
	}

	@Override
	public void deleteAll() {
		productRepository.deleteAll();
	}

	@Override
	public List<Products> findByName(String name) {
		return productRepository.findByProductname(name);
	}

	@Override
	public Products findById(int id) {
		return productRepository.findByProductid(id);
	}

	@Override
	public List<Products> findbySupplier(String supplier) {
		List<Suppliers> listsupplier = supplierRepository.findBySuppliernameContaining(supplier);
		if(!listsupplier.isEmpty()) {
			Suppliers supplierpresent = listsupplier.getFirst();
			return productRepository.findBySupplierid(supplierpresent.getSupplierid());
		}
		return null;
	}

	@Override
	public List<Products> findbyBrand(String brand) {
		List<Brands> listbrand =  brandRepository.findByBrandnameContaining(brand);
		if(!listbrand.isEmpty()) {
			Brands brandpresent = listbrand.getFirst();
			return productRepository.findByBrandid(brandpresent.getBrandid());
		}
		return null;
	}

	@Override
	public void createProduct(Products product) {
		productRepository.save(product);
	}

}