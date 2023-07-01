package org.unibl.etf.pj2.geometricFigure;

import java.util.Scanner;
import org.unibl.etf.pj2.geometricFigureException.*;

public abstract class GeometricFigure{

    protected double specificWeight;
    protected static int id;
    protected int identifier;

    public GeometricFigure(double specificWeight){
        this.specificWeight = specificWeight;
        id++;
    }

    public abstract void print();
    public abstract void read(Scanner scanner) throws GeometricFigureException;
    public abstract double volume();

    public double weight(){
        return this.specificWeight * this.volume();
    }

    public static int compareByVolume(GeometricFigure obj1, GeometricFigure obj2){
        if( obj1.volume() > obj2.volume() )
            return 1;
        else if( obj1.volume() < obj2.volume())
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object obj){

        if(obj == this)
            return true;
        else if(obj != null && (obj instanceof GeometricFigure)){
            return this.volume() == ((GeometricFigure)obj).volume();
        }return false;
    }

    @Override
    public String toString(){
        return "Specific weight: " + this.specificWeight + "\nIdentifier: " + this.identifier + "\nVolume: " + this.volume() + "\nWeight: " + this.weight();
    }
}