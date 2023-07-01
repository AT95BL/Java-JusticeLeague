package net.etfbl.pj2.supercity.superheroes;

import net.etfbl.pj2.supercity.citizens.GoodCitizen;
import net.etfbl.pj2.supercity.gadgets.Gadget;
import net.etfbl.pj2.supercity.interfaces.SuperSwim;
import net.etfbl.pj2.supercity.interfaces.SuperRunFast;

public class Aquaman extends GoodCitizen implements SuperSwim, SuperRunFast{

    public Aquaman() {
		super();
		setCitizensName("Arthur Curry");
		setNickname("Aquaman");
		setSuperpower(true);
	}

    public Aquaman(String name, Integer positionX, Integer positionY) {
		super(name, positionX, positionY);
	}

	public Aquaman(String nickname, Gadget gadget, boolean superpower) {
		super(nickname, gadget, superpower);
	}

    @Override
	public String superSwim() {
		return "I am Aquaman and I can swim super fast!";
	}

	@Override
	public String superRunFast() {
		return "I am Aquaman and I can run super fast!";
	}

    @Override
    public String toString(){
       return new String("Aquaman [swim()=" + superSwim() + ", runFast()=" + superRunFast() 
				+ ", getNickname()=" + getNickname()  
				+ ", getName()=" + getCitizensName()
				+ ", getPositionX()=" + getPositionX() + ", getPositionY()="
				+ getPositionY() + "]);");
    }
}