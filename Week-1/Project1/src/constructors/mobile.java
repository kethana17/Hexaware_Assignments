package constructors;

public class mobile {
	private String model;
	private int Storage;
	private String brand;
	public mobile(String model, int storage, String brand) {
		super();
		this.model = model;
		Storage = storage;
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getStorage() {
		return Storage;
	}
	public void setStorage(int storage) {
		Storage = storage;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
 
}
