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


}
