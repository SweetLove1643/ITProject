package vn.project.Entity;

import java.time.LocalDateTime;

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
	private LocalDateTime orderdate;
	
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

}
