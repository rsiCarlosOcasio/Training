package Interfaces;

public interface IRealstate {
	default boolean isOffMarket() { return init(); }
	default boolean isForRent() { return init(); }
	default boolean isForSale() { return init(); }
	default boolean needsRepairs() { return init(); }
	default boolean potentialBuyer() { return init(); }
	default boolean potentialInvestment() { return init(); }
	default String getAssetType() { return getType(); }
	String getAssetAddress();	
	void setAddress(String address);
	
	private boolean init() { return false; }
	private String getType() { return "House"; }
}
