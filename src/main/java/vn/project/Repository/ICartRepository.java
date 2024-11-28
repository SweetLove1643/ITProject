package vn.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.project.Entity.Cart;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findByUserid(int userid);
    
    List<Cart> findByProductid(int productid);

    void deleteByUserid(int userid);
    
    void deleteByUseridAndProductid(int userid, int productid);
    
    void deleteByCartid(int cartid);
    
    void deleteByProductid(int productid);
    
    Optional<Cart> findByUseridAndProductid(int userid, int productid);

}
