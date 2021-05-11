package Concrete;

import Entities.Gamer;
import Interfaces.GamerService;

public class GamerManager implements GamerService{

	@Override
	public void sign(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adl� kullan�c� kaydedildi.");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adl� kullan�c� g�ncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adl� kullan�c� silindi");
	}
	
}
