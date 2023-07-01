package net.etfbl.pj2.supercity.citizens;

import net.etfbl.pj2.supercity.gadgets.*;
import net.etfbl.pj2.supercity.interfaces.*;

public class GoodCitizen extends Citizen {

    private String nickname;
    private Gadget gadget;
    private boolean superpower;

    public GoodCitizen(){
        super();
    }
	
    public GoodCitizen(String name, Integer positionX, Integer positionY){
        super(name, positionX, positionY);
    }

    public GoodCitizen(String nickname, Gadget gadget, boolean superpower) {
		super();
		this.nickname = nickname;
		this.gadget = gadget;
		this.superpower = superpower;
	}

    public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Gadget getGadget() {
		return gadget;
	}

	public void setGadget(Gadget gadget) {
		this.gadget = gadget;
	}

	public boolean isSuperpower() {
		return superpower;
	}

	public void setSuperpower(boolean superpower) {
		this.superpower = superpower;
	}
}