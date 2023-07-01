package net.etfbl.pj2.supercity.superheroes;

import net.etfbl.pj2.supercity.citizens.GoodCitizen;
import net.etfbl.pj2.supercity.gadgets.Gadget;

public class GreenArrow extends GoodCitizen{

    public GreenArrow() {
		super();
		setCitizensName("Oliver Queen");
		setNickname("GreenArrow");
		setSuperpower(false);
		setGadget(new Gadget("arrows"));
	}

    public GreenArrow(String nickname, Gadget gadget, boolean superpower) {
		super(nickname, gadget, superpower);
	}

	public GreenArrow(String name, Integer positionX, Integer positionY) {
		super(name, positionX, positionY);
	}

    @Override
    public String toString(){
        return new String("Some people are nobody's enemies but their own, yer know.");
    }
}