import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.MemberManager;
import Concrete.OrderManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member=new Member(1, "MUHAMMED YUNUS", "GÜLTEKÝN", "SSD", "123", "myunus.3438@gmail.com", "000000000000",new Date(2001, 6, 25) , "***********");
		Member member1=new Member(2,"Fatma Gül","Yýldýrým","fatmikkkk","**","fatmagulyildirimce@gmail.com","000000000000",new Date(2001,11,13),"**");
		Game game1=new Game(1, "Volarant", 113);
		Game game2=new Game(2, "Devour", 96);
		Game game3=new Game(3, "Phasmophobia", 67);
		Game game4=new Game(4, "GTA5", 289);
		Game game5=new Game(5, "CS GO", 100);
		Campaign campaign1=new Campaign(1,"Anneler Gününe Özel",24);
		Campaign campaign2=new Campaign(2,"Süper Cuma",14);
		Campaign campaign3=new Campaign(3,"Sezon Sonu",8);
		Campaign campaign4=new Campaign(4,"Kýþ Ýndirimi",38);
		MemberManager memberManager=new MemberManager(new MernisServiceAdapter());
		OrderManager orderManager=new OrderManager();
		CampaignManager campaignManager=new CampaignManager();
		GameManager gameManager=new GameManager();
		

		memberManager.add(member);
		memberManager.add(member1);
		System.out.println("***************************");
		memberManager.list();
		System.out.println("***************************");
		memberManager.delete(member);
		System.out.println("***************************");
		memberManager.list();
		System.out.println("***************************");
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.add(campaign3);
		campaignManager.add(campaign4);
		System.out.println("***************************");
		campaignManager.list();
		System.out.println("***************************");
		campaignManager.delete(campaign4);
		System.out.println("***************************");
		campaignManager.list();
		System.out.println("***************************");
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.add(game3);
		gameManager.add(game4);
		gameManager.add(game5);
		System.out.println("***************************");
		gameManager.list();
		System.out.println("***************************");
		gameManager.delete(game5);
		System.out.println("***************************");
		gameManager.list();
		System.out.println("***************************");
		orderManager.sellWithCampaign(member1, game1, campaign1);
		System.out.println("***************************");
		orderManager.sell(member, game2);
	}

}
