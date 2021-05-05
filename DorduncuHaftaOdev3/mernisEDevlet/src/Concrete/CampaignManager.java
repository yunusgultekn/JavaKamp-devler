package Concrete;

import java.util.ArrayList;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
	ArrayList<Campaign> campaigns=new ArrayList<Campaign>();

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Kampanya Eklendi : "+campaign.getCampaignName());
		campaigns.add(campaign);
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Kampanya Silindi : "+campaign.getCampaignName());
		campaigns.remove(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Kampanya Güncellendi : "+campaign.getCampaignName());
		
	}

	@Override
	public void list() {
		System.out.println("Kampanyalar Listeleniyor....." );
		for (Campaign campaign : campaigns) {
			System.out.println(campaign.getCampaignName());
		}
		System.out.println("Kampanyalar Listelendi." );

		
	}

}
