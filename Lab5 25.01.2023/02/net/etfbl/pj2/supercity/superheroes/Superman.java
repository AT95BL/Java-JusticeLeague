package net.etfbl.pj2.supercity.superheroes;

import net.etfbl.pj2.supercity.citizens.GoodCitizen;
import net.etfbl.pj2.supercity.gadgets.Gadget;

import net.etfbl.pj2.supercity.interfaces.SuperSwim;
import net.etfbl.pj2.supercity.interfaces.SuperFly;
import net.etfbl.pj2.supercity.interfaces.SuperRunFast;

public class Superman extends GoodCitizen implements SuperSwim, SuperFly, SuperRunFast{

    public Superman() {
		super();
		setCitizensName("Clarck Kent");
		setNickname("Superman");
		setSuperpower(true);
	}

	public Superman(String name, Integer positionX, Integer positionY) {
		super(name, positionX, positionY);
	}

	public Superman(String nickname, Gadget gadget, boolean superpower) {
		super(nickname, gadget, superpower);
	}

    @Override 
    public String superSwim(){
        return new String("I'm Superman and I can swim super fast!");
    }

    @Override 
    public String superFly(){
        return new String("I'm Superman and I can fly super fast!");
    }

     @Override 
    public String superRunFast(){
        return new String("I'm Superman and I can run super fast!");
    }

    @Override
    public String toString(){
        return new String("Superman [fly()=" + superFly() + ", runFast()=" + superRunFast() + ", swimFast()=" + superSwim()
				+ ", getNickname()=" + getNickname() + ", getGadget()="
				+ getGadget/*Description*/() + ", getName()=" + getCitizensName()
				+ ", getPositionX()=" + getPositionX() + ", getPositionY()="
				+ getPositionY() + "]);");
    }
}