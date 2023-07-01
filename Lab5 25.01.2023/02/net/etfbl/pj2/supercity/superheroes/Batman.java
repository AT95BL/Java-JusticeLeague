package net.etfbl.pj2.supercity.superheroes;

import net.etfbl.pj2.supercity.citizens.GoodCitizen;
import net.etfbl.pj2.supercity.gadgets.Gadget;

import net.etfbl.pj2.supercity.interfaces.SuperFly;

public class Batman extends GoodCitizen implements SuperFly{

    public Batman() {
		super();
		setCitizensName("Bruce Wayne");
		setNickname("Batman");
		setSuperpower(false);
        setGadget(new Gadget("batmobile"));
	}

    public Batman(String name, Integer positionX, Integer positionY) {
		super(name, positionX, positionY);
	}

	public Batman(String nickname, Gadget gadget, boolean superpower) {
		super(nickname, gadget, superpower);
	}

    @Override 
    public String superFly(){
        return new String("I'm Batman and I can fly..in a plane..");
    }
}