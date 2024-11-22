package vn.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.project.Entity.Cart;

import java.util.List;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findByUserid(int userid);

    void deleteByUserid(int userid);
    
    void deleteByUseridAndProductid(int userid, int productid);

}
