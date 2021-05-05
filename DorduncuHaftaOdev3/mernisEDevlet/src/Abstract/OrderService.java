package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public interface OrderService {
	void sell(Member member,Game game);
	void sellWithCampaign(Member member,Game game,Campaign campaign);
}
