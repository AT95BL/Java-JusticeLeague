package net.etfbl.pj2.supercity.citizens;

import net.etfbl.pj2.supercity.exceptions.*;

import java.util.Random;

public abstract class Citizen{

    public String citizensName;
    public Integer positionX;
    public Integer positionY;

    public Citizen(){
        super();
    }

    public Citizen(String citizensName, Integer positionX, Integer positionY){
        this.citizensName = citizensName;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    /*  because of this declaration ..
    public Citizen(String citizensName){
        this.citizensName = citizensName;
        this.positionX = new Integer( Random.nextInt(30));      
         this.positionY = new Integer( Random.nextInt(30));        
    }

     warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
     this.positionX = new Integer( Random.nextInt(30));

     error: non-static method nextInt(int) cannot be referenced from a static context
     this.positionY = new Integer( Random.nextInt(30));

    */

    public void setCitizensName(String citizensName){
        this.citizensName = citizensName;
    }

    public String getCitizensName(){
        return this.citizensName;
    }

    public void setPositionXManual(Integer x) throws MapBoundsException{
        if(x < 0 || x > 89){
            throw new MapBoundsException("positionX coordinate moves from 0-89..\n");
        }
        else
        this.positionX = x;
    }

    public void setPositionX(){
        Random rand = new Random();
        this.positionX = rand.nextInt(90);
    }

    public Integer getPositionX(){
        return this.positionX;
    }

    public void setPositionYmanual(Integer y) throws MapBoundsException{
        if( y < 0 ||  y > 29){
            throw new MapBoundsException("positionY coordinate moves from 0-29..\n");
        }
        else
        this.positionX = y;
    }

    public void setPositionY(){
        Random rand = new Random();
        this.positionY = rand.nextInt(30);
    }

    public Integer getPositionY(){
        return this.positionY;
    }
}