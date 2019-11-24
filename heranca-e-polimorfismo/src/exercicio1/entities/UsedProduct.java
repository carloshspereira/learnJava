package exercicio1.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureData() {
		return manufactureDate;
	}

	public void setManufactureData(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return getName() + " (used) $ " 
				+ String.format("%.2f", getPrice()) 
				+ " (Manufacture date: "
				+ sdf.format(manufactureDate) + ")";
	}

}
