package Concrete;

import java.util.ArrayList;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {
	ArrayList<Game> games=new ArrayList<Game>();
	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Oyun Eklendi : "+game.getGameName());
		games.add(game);
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Oyun Silindi : "+game.getGameName());
		games.remove(game);
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Oyun Güncellendi : "+game.getGameName());
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("Oyunlar Listeleniyor....");
		for (Game game : games) {
			System.out.println(game.getGameName());
		}
		System.out.println("Oyunlar Listelendi.");
	}

}
