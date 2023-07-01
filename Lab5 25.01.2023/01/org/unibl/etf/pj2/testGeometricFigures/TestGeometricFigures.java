package org.unibl.etf.pj2.testGeometricFigures;

import org.unibl.etf.pj2.geometricFigure.*;
import org.unibl.etf.pj2.geometricFigureException.*;

import java.util.Arrays;
import java.util.Scanner;

public class TestGeometricFigures{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Sphere[] spheres = {new Sphere(25), new Sphere(35)};
        System.out.println("Testing..Sphere Class methods: \n");
        for(int i = 0; i < spheres.length; i++){
            try{
                System.out.println(i+1 + ". Sphere: \n");
                spheres[i].read(scanner);
                spheres[i].print();
                //System.out.println("Volume: " + spheres[i].volume() +"\n");
                //System.out.println("Weight: " + spheres[i].weight() +"\n");

            }catch(GeometricFigureException ex){
                ex.printStackTrace();
            }
            System.out.println("\n************************************\n");
        }

        Cube[] cubes = {new Cube(25), new Cube(35)};
        System.out.println("Testing..Sphere Class methods: \n");
        for(int i = 0; i < cubes.length; i++){
            try{
                System.out.println(i+1 + ". Cube: \n");
                cubes[i].read(scanner);
                cubes[i].print();
                //System.out.println("Volume: " + cubes[i].volume() +"\n");
                //System.out.println("Weight: " + cubes[i].weight() +"\n");

            }catch(GeometricFigureException ex){
                ex.printStackTrace();
            }
            System.out.println("\n************************************");
        }

        scanner.close();

        System.out.println("Testing the comparison method for Spheres class: \n" + GeometricFigure.compareByVolume(spheres[0], spheres[1]));
        System.out.println("Testing the comparison method for Cubes class: \n" + GeometricFigure.compareByVolume(cubes[0], cubes[1]));

        System.out.println("Testing equals method override..\n");
        System.out.println("sphere[0] == sphere[0]: " + ((GeometricFigure)spheres[0]).equals(spheres[0]) + "\n");   // <=> spheres[0].equals(spheres[1]);
        System.out.println("sphere[0] == sphere[1]: " + ((GeometricFigure)spheres[0]).equals(spheres[1]) + "\n");
        System.out.println("cubes[0] == cubes[0]: " + ((GeometricFigure)cubes[0]).equals(cubes[0]) + "\n");
        System.out.println("cubes[0] == cubes[1]: " + ((GeometricFigure)cubes[0]).equals(cubes[1]) + "\n");

    }
}