package vn.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.project.Entity.Orders;

@Repository
public interface IOrderRepository extends JpaRepository<Orders,Integer>{

	Orders findByOrderid(int orderid);

	List<Orders> findByUserid(int userid);

	List<Orders> findByDiscountid(int discountid);

}
