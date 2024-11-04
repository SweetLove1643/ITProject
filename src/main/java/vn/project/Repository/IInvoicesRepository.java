package vn.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.project.Entity.Invoices;
import java.util.List;


@Repository
public interface IInvoicesRepository extends JpaRepository<Invoices, Integer>{

	List<Invoices> findByInvoiceid(int invoiceid);
	
	List<Invoices> findByTotalamount(long totalamount);
}
