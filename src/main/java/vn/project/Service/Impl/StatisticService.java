package vn.project.Service.Impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.project.Entity.Statistic;
import vn.project.Entity.Suppliers;
import vn.project.Repository.IProductRepository;
import vn.project.Repository.IStatisticRepository;
import vn.project.Repository.ISupplierRepository;
import vn.project.Service.IStatisticService;

@Service
public class StatisticService implements IStatisticService{
	@Autowired
	IStatisticRepository statisticRepository;
	
	@Autowired
	ISupplierRepository supplierRepository;
	
	@Autowired
	IProductRepository productRepository;

	@Override
	public List<Statistic> findByProductid(int productid) {
		return statisticRepository.findByProductid(productid);
	}

	@Override
	public List<Statistic> findBySupplier(String supplier) {
		List<Suppliers> listsupplier = supplierRepository.findBySuppliernameContaining(supplier);
		if (!listsupplier.isEmpty()) {
			Suppliers supplierpresent = listsupplier.getFirst();
			return statisticRepository.findBySupplierid(supplierpresent.getSupplierid());
		}
		return null;
	}

	@Override
	public List<Statistic> findByMonthlysalesGreaterThan(int sales) {
		return statisticRepository.findByMonthlysalesGreaterThan(sales);
	}

	@Override
	public List<Statistic> findByQuarterlysalesGreaterThan(int sales) {
		return statisticRepository.findByQuarterlysalesGreaterThan(sales);
	}

	@Override
	public List<Statistic> findByYearlysalesGreaterThan(int sales) {
		return statisticRepository.findByYearlysalesGreaterThan(sales);
	}

	@Override
	public List<Statistic> findByStockremainingLessThan(int stock) {
		return statisticRepository.findByStockremainingLessThan(stock);
	}

	@Override
	public List<Statistic> findAll() {
		return statisticRepository.findAll();
	}

	@Override
	public Optional<Statistic> findById(Integer id) {
		return statisticRepository.findById(id);
	}
	
	
}
