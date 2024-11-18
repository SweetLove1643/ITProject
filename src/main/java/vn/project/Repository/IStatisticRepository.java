package vn.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.project.Entity.Statistic;
import java.util.List;

@Repository
public interface IStatisticRepository extends JpaRepository<Statistic, Integer> {

    List<Statistic> findByProductid(int productid);

    List<Statistic> findBySupplierid(int supplierid);

    List<Statistic> findByBrandid(int brandid);

    List<Statistic> findByMonthlysalesGreaterThan(int sales);

    List<Statistic> findByQuarterlysalesGreaterThan(int sales);

    List<Statistic> findByYearlysalesGreaterThan(int sales);

    List<Statistic> findByStockremainingLessThan(int stock);
}
