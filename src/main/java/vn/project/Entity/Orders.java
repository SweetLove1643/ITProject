package vn.project.Entity;

import java.time.LocalDate;

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
@Table(name = "Orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderID", nullable = false, unique = true)
	private int orderid;
	
	@Column(name = "UserID", nullable = false)
	private int userid;
	
	@Column(name = "OrderDate", nullable = false)
	private LocalDate orderdate;
	
	@Column(name = "TotalAmount", nullable = false)
	private long totalamount;
	
	@Column(name = "PaymentStatus", nullable = false, columnDefinition = "nvarchar(255)")
	private String paymentstatus;
	
	@Column(name = "PaymentMethod", nullable = false, columnDefinition = "nvarchar(255)")
	private String paymentmethod;
	
	@Column(name = "DiscountID")
	private int discountid;
	
	@Column(name = "DeliveryStatus", nullable = false, columnDefinition = "nvarchar(255)")
	private String deliverystatus;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public LocalDate getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}

	public long getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(long totalamount) {
		this.totalamount = totalamount;
	}

	public String getPaymentstatus() {
		return paymentstatus;
	}

	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public int getDiscountid() {
		return discountid;
	}

	public void setDiscountid(int discountid) {
		this.discountid = discountid;
	}

	public String getDeliverystatus() {
		return deliverystatus;
	}

	public void setDeliverystatus(String deliverystatus) {
		this.deliverystatus = deliverystatus;
	}
	
}
