package net.etfbl.pj2.supercity.superheroes;

import net.etfbl.pj2.supercity.citizens.GoodCitizen;
import net.etfbl.pj2.supercity.gadgets.Gadget;

import net.etfbl.pj2.supercity.interfaces.SuperSwim;
import net.etfbl.pj2.supercity.interfaces.SuperFly;
import net.etfbl.pj2.supercity.interfaces.SuperRunFast;

public class Supergirl extends GoodCitizen implements SuperSwim, SuperFly, SuperRunFast{

    public Supergirl() {
		super();
		setCitizensName("Linda Lee");   // Kara Zor-El
		setNickname("Supergirl");
		setSuperpower(true);
	}

	public Supergirl(String name, Integer positionX, Integer positionY) {
		super(name, positionX, positionY);
	}

	public Supergirl(String nickname, Gadget gadget, boolean superpower) {
		super(nickname, gadget, superpower);
	}

    @Override 
    public String superSwim(){
        return new String("I'm Supergirl and I can swim super fast!");
    }

    @Override 
    public String superFly(){
        return new String("I'm Supergirl and I can fly super fast!");
    }

     @Override 
    public String superRunFast(){
        return new String("I'm Supergirl and I can run super fast!");
    }

    @Override
    public String toString(){
        return new String("Supergirl [fly()=" + superFly() + ", runFast()=" + superRunFast() + ", swimFast()=" + superSwim()
				+ ", getNickname()=" + getNickname() + ", getGadget()="
				+ getGadget/*Description*/() + ", getName()=" + getCitizensName()
				+ ", getPositionX()=" + getPositionX() + ", getPositionY()="
				+ getPositionY() + "]);");
    }
}