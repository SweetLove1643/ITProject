package vn.project.Service;

import java.util.List;
import java.util.Optional;
import vn.project.Entity.Statistic;

public interface IStatisticService {

	Optional<Statistic> findById(Integer id);

	List<Statistic> findAll();

	List<Statistic> findByStockremainingLessThan(int stock);

	List<Statistic> findByYearlysalesGreaterThan(int sales);

	List<Statistic> findByQuarterlysalesGreaterThan(int sales);

	List<Statistic> findByMonthlysalesGreaterThan(int sales);

	List<Statistic> findBySupplier(String supplier);

	List<Statistic> findByProductid(int productid);

}
