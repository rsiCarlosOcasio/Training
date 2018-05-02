package Interfaces;

public class RealState implements IRealState {
	
	private String address = "10140 Del Lago Ct. San Antonio, TX 78245";
	
	public String getAssetAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}