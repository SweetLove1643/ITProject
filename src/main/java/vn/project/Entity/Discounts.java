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
@Table(name = "Discounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Discounts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DiscountID", nullable = false, unique = true)
	private int discountid;
	
	@Column(name = "DiscountCode", nullable = false)
	private String discountcode;
	
	@Column(name = "DiscountPercentage", nullable = false)
	private long discountpercentage;
	
	@Column(name = "MaxDiscountAmount")
	private long maxdiscountamount;
	
	@Column(name = "Status")
	private int status;
	
	@Column(name = "StartDate", nullable = false)
	private LocalDate startdate;
	
	@Column(name = "EndDate", nullable = false)
	private LocalDate enddate;

	public int getDiscountid() {
		return discountid;
	}

	public void setDiscountid(int discountid) {
		this.discountid = discountid;
	}

	public String getDiscountcode() {
		return discountcode;
	}

	public void setDiscountcode(String discountcode) {
		this.discountcode = discountcode;
	}

	public long getDiscountpercentage() {
		return discountpercentage;
	}

	public void setDiscountpercentage(long discountpercentage) {
		this.discountpercentage = discountpercentage;
	}

	public long getMaxdiscountamount() {
		return maxdiscountamount;
	}

	public void setMaxdiscountamount(long maxdiscountamount) {
		this.maxdiscountamount = maxdiscountamount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public LocalDate getEnddate() {
		return enddate;
	}

	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}
	
	
}
