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
@Table(name = "Invoices")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Invoices {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "InvoiceID", nullable = false, unique = true)
	private int invoiceid;
	
	@Column(name = "OrderID", nullable = false)
	private int orderid;
	
	@Column(name = "InvoiceDate", nullable = false)
	private LocalDate invoicedate;
	
	@Column(name = "TotalAmount", nullable = false)
	private long totalamount;
	
	@Column(name = "PaymentMethod", nullable = false, columnDefinition = "nvarchar(255)")
	private String paymentmethod;

	public int getInvoiceid() {
		return invoiceid;
	}

	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public LocalDate getInvoicedate() {
		return invoicedate;
	}

	public void setInvoicedate(LocalDate invoicedate) {
		this.invoicedate = invoicedate;
	}

	public long getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(long totalamount) {
		this.totalamount = totalamount;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}
	
}
