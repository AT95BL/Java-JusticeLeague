package net.etfbl.pj2.supercity.citizens;

import java.util.Random;

public class BadCitizen extends Citizen{

    private boolean greenKriptonyte;

    public BadCitizen(){
        super();
        setPositionX();
        setPositionY();
        setGreenKriptonyte();
    }

    /*  maybe nice one but useless..
    public BadCitizen(String name, Integer positionX, Integer positionY){
        super(name, positionX, positionY);
        setGreenKriptonyte();
    }
    */
    public void setGreenKriptonyte(){
        Random rand = new Random();
        this.greenKriptonyte = rand.nextBoolean();
    }

    public boolean isGreenKriptonyte(){
        return this.greenKriptonyte;
    }

    @Override
    public String toString(){
        return new String("Bad guy " + this.getCitizensName() + ( this.isGreenKriptonyte() ? " has an GreenKriptonyte supply.." : " doesn't have a GreenKriptonyte supplies.." ));
    }
}