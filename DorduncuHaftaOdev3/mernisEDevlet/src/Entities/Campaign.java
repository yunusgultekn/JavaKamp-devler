package Entities;

public class Campaign {
	
	private int id;
	private String campaignName;
	private double rate;
	public Campaign(int id, String campaignName, double rate) {
		this.id = id;
		this.campaignName = campaignName;
		this.rate = rate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	} 

}
