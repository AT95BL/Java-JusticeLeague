package net.etfbl.pj2.supercity.justiceLeague;

import java.util.Random;

import net.etfbl.pj2.supercity.citizens.*;
import net.etfbl.pj2.supercity.gadgets.*;
import net.etfbl.pj2.supercity.superheroes.*;

public class JusticeLeague{

    private static String checkBadGuysPosition(BadCitizen villain){

        String position = "";   //  vs String position = new String(); ?

        if(villain.getPositionX() < 30)
            position = "water";
        else if(villain.getPositionX() >= 30 && villain.getPositionX() < 60)
            position = "ground";
        else
            position = "air";

        return position;
    }

    public static void main(String[] args){

        boolean isBadGuysThere = false;
        Citizen supercity[][] = new Citizen[90][30];

        System.out.println("Setting the bad guys on the map.. \n");
        BadCitizen[] bads = new BadCitizen[6];
        for(int i = 0; i < bads.length; i++){
            bads[i] = new BadCitizen();
            bads[i].setCitizensName("villian number: " + (i+1));
            supercity[bads[i].getPositionX()][bads[i].getPositionY()] = bads[i];
            System.out.println(bads[i]);
        }

        GoodCitizen[] goods = { new WonderWoman(), new Superman(), new Supergirl(), new Aquaman(), new GreenArrow(),  new Batman() };
        
        Random rand = new Random();

        for(int i = 0; i < 90; i++){
            for(int j = 0; j < 30; j++){
                if(supercity[i][j] instanceof BadCitizen){

                    String place = JusticeLeague.checkBadGuysPosition((BadCitizen)supercity[i][j]);

                    if(place.equals("water"))
                    {
                        System.out.println("Villain " + supercity[i][j].getCitizensName() + " has been destroyed! Superhero " + goods[3].getNickname() + " was victorious! \n");
                        supercity[i][j] = goods[3];
                    }

                    else if(place.equals("ground")){

                            boolean batmanOrGreenArrow = rand.nextBoolean();

                            if( batmanOrGreenArrow ){

                                System.out.println("Villain " + supercity[i][j].getCitizensName() + " has been destroyed! Superhero " + goods[4].getNickname() + " was victorious! \n");
                                supercity[i][j] = goods[4];
                            }
                            else{
                                    System.out.println("Villain " + supercity[i][j].getCitizensName() + " has been destroyed! Superhero " + goods[5].getNickname() + " was victorious! \n");
                                supercity[i][j] = goods[5];
                            }

                        }
                    
                    else if(place.equals("air")){

                        int superheroes =  rand.nextInt(3);

                        if( superheroes == 0 ){
                            System.out.println("Villain " + supercity[i][j].getCitizensName() + " has been destroyed! Superhero " + goods[0].getNickname() + " was victorious! \n");
                                supercity[i][j] = goods[0];
                        }

                        else if( superheroes == 1 && ((BadCitizen)supercity[i][j]).isGreenKriptonyte()){
                            System.out.println("Superman has been destroyed! \n");
                            isBadGuysThere = true;
                        } 

                        else if( superheroes == 1 && !((BadCitizen)supercity[i][j]).isGreenKriptonyte()){
                            System.out.println("Villain " + supercity[i][j].getCitizensName() + " has been destroyed! Superhero " + goods[1].getNickname() + " was victorious! \n");
                                supercity[i][j] = goods[1];
                        }

                        else if( superheroes == 2 && ((BadCitizen)supercity[i][j]).isGreenKriptonyte()){
                            System.out.println("Supergirl has been destroyed! \n");
                            isBadGuysThere = true;
                        }

                        else if( superheroes == 2 && !((BadCitizen)supercity[i][j]).isGreenKriptonyte()){
                            System.out.println("Villain " + supercity[i][j].getCitizensName() + " has been destroyed! Superhero " + goods[2].getNickname() + " was victorious! \n");
                                supercity[i][j] = goods[2];
                        }
                    }
                }
            }
        }

        if(!isBadGuysThere)
            System.out.println("Justice League has saved the world! \n");
        else
            System.out.println("Lucky for us..it wasn't a Doomsday..\n");
    }
}