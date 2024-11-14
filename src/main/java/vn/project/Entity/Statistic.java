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
@Table(name = "Statistic")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Statistic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StatisticID", nullable = false, unique = true)
	private int statisticID;
	
	@Column(name = "ProductID")
	private int productid;
	
	@Column(name = "SupplierID")
	private int supplierid;
	
	@Column(name = "BrandID")
	private int brandid;
	
	@Column(name = "MonthlySales")
	private int monthlysales;
	
	@Column(name = "QuarterlySales")
	private int quarterlysales;
	
	@Column(name = "YearlySales")
	private int yearlysales;
	
	@Column(name = "StockRemaining")
	private int stockremaining;

	public int getStatisticID() {
		return statisticID;
	}

	public void setStatisticID(int statisticID) {
		this.statisticID = statisticID;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}

	public int getBrandid() {
		return brandid;
	}

	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}

	public int getMonthlysales() {
		return monthlysales;
	}

	public void setMonthlysales(int monthlysales) {
		this.monthlysales = monthlysales;
	}

	public int getQuarterlysales() {
		return quarterlysales;
	}

	public void setQuarterlysales(int quarterlysales) {
		this.quarterlysales = quarterlysales;
	}

	public int getYearlysales() {
		return yearlysales;
	}

	public void setYearlysales(int yearlysales) {
		this.yearlysales = yearlysales;
	}

	public int getStockremaining() {
		return stockremaining;
	}

	public void setStockremaining(int stockremaining) {
		this.stockremaining = stockremaining;
	}
	
	

}
