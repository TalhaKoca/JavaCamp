package Concrete;

import Entities.Game;
import Entities.Gamer;
import Interfaces.GameService;

public class GameManager implements GameService{

	@Override
	public void add(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " kullan�c�s�na " +game.getId()+ "no lu oyun eklendi." );
		
	}

	@Override
	public void delete(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " kullan�c�s�ndan " +game.getId()+ "no lu oyun silindi." );

		
	}

	
}
