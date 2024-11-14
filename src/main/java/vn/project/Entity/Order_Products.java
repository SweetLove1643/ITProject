package vn.project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Order_Product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order_Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Order_ProductID", nullable = false, unique = true)
	private int order_productid;
	
	@Column(name = "OrderID", nullable = false)
	private int orderid;
	
	@Column(name = "ProductID", nullable = false)
	private int productid;
	
	@Column(name = "Quantity", nullable = false)
	private int quantity;

	public int getOrder_productid() {
		return order_productid;
	}

	public void setOrder_productid(int order_productid) {
		this.order_productid = order_productid;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
