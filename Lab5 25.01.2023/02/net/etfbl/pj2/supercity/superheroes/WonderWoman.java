package net.etfbl.pj2.supercity.superheroes;

import net.etfbl.pj2.supercity.citizens.GoodCitizen;
import net.etfbl.pj2.supercity.gadgets.Gadget;

import net.etfbl.pj2.supercity.interfaces.SuperSwim;
import net.etfbl.pj2.supercity.interfaces.SuperFly;
import net.etfbl.pj2.supercity.interfaces.SuperRunFast;

public class WonderWoman extends GoodCitizen implements SuperSwim, SuperFly, SuperRunFast{

    public WonderWoman() {
		super();
		setCitizensName("Linda Lee");   // Kara Zor-El
		setNickname("Diana Prince");
		setSuperpower(true);
	}

	public WonderWoman(String name, Integer positionX, Integer positionY) {
		super(name, positionX, positionY);
	}

	public WonderWoman(String nickname, Gadget gadget, boolean superpower) {
		super(nickname, gadget, superpower);
	}

    @Override 
    public String superSwim(){
        return new String("I'm WonderWoman and I can swim super fast!");
    }

    @Override 
    public String superFly(){
        return new String("I'm WonderWoman and I can fly super fast!");
    }

     @Override 
    public String superRunFast(){
        return new String("I'm WonderWoman and I can run super fast!");
    }

    @Override
    public String toString(){
        return new String("WomnderWoman [fly()=" + superFly() + ", runFast()=" + superRunFast() + ", swimFast()=" + superSwim()
				+ ", getNickname()=" + getNickname() + ", getGadget()="
				+ getGadget/*Description*/() + ", getName()=" + getCitizensName()
				+ ", getPositionX()=" + getPositionX() + ", getPositionY()="
				+ getPositionY() + "]);");
    }
}