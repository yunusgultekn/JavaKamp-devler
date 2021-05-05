package Concrete;

import Abstract.OrderService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class OrderManager implements OrderService {

	@Override
	public void sell(Member member, Game game) {
		
		System.out.println(member.getFirstName()+" "+game.getGameName()+" oyununu satýn aldý ");
	}

	@Override
	public void sellWithCampaign(Member member, Game game, Campaign campaign) {
		double newPrice=game.getPrice()-(game.getPrice()*campaign.getRate()/100);
		System.out.println(member.getFirstName()+" "+game.getGameName()+" oyununu "+campaign.getCampaignName()+" kampanyasýyla "+newPrice+" tl ye satýn aldý\n"+"Oyunun Kampanyasýz Fiyatý : "+game.getPrice()+" Tldir.");
		
	}

}
