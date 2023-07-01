package org.unibl.etf.pj2.geometricFigure;

import java.util.Scanner;
import org.unibl.etf.pj2.geometricFigureException.*;

public class Cube extends GeometricFigure{

    private double a, b, c;

    public Cube(double specificWeight){
        super(specificWeight);
        this.identifier = GeometricFigure.id;
    }

    // @Override
    public String toString(){
        return super.toString() + "\na = " + a + "\nb = " + b + "\nc = " + c; 
    }

    @Override
    public void print(){
        String str = new String(this.toString());
        System.out.print(str);
    }

    @Override
    public void read(Scanner scanner) throws GeometricFigureException{
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();

        if( a < 1 || b < 1 || c < 1 || a > 100 || b > 100 || c > 100){
            throw new GeometricFigureException("a,b and c are from [1,100] segment..");
        }
        //scanner.close();
    }

    @Override
    public double volume(){
        return a * b * c;
    }
}