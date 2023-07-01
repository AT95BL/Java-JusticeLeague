package org.unibl.etf.pj2.geometricFigure;

import org.unibl.etf.pj2.geometricFigureException.*;
import java.util.Scanner;

public class Sphere extends GeometricFigure{

    private double r; // radius

    public Sphere (double specificWeight){
        super(specificWeight);
        this.identifier = GeometricFigure.id;
    }

    //@Override
    public String toString(){
        return super.toString() + "\nRadius: " + r;
    }

    @Override 
    public void print(){
        String str = new String(this.toString());
        System.out.print(str);
    }

    @Override
    public void read(Scanner scanner) throws GeometricFigureException{
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Radius size: ");
        r = scanner.nextDouble();
        if( r<1 || r>100){
            throw new GeometricFigureException("Radius size is the number from [1,100] segment!");
        }
        //scanner.close();
    }

    @Override
    public double volume(){
        return ((double)4/3) * Math.PI * Math.pow(this.r, 3);
    }

}