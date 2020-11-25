package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Sefu_Mare extends Administrator {
    double ndSubaltereni;
    Vector Iqurul = new Vector<>(90, 05);

    /**
     * Construcor fara parametri
     *
     * @param i
     * @param verde
     * @param v
     * @param b
     * @param i1
     * @param administrator
     * @param i2
     * @param i3
     * @param v1
     */
    public Sefu_Mare(int i, String verde, float v, boolean b, int i1, String administrator, int i2, int i3, double v1) {
    }

    /**
     * Construtori cu parametri
     */
     public Sefu_Mare(double ndSubaltereni, Vector iqurul) {

    this.ndSubaltereni = ndSubaltereni;
      Iqurul = iqurul;
    }

    public Sefu_Mare() {

    }

    /**
     * functiile de acces si functiile de setare
     **/
    public double getNdSubaltereni() {
        return ndSubaltereni;
    }

    public void setNdSubaltereni(double ndSubaltereni) {
        this.ndSubaltereni = ndSubaltereni;
    }



    public Vector getIqurul() {
        return Iqurul;
    }

    public void setIqurul(Vector iqurul) {
        Iqurul = iqurul;
    }


    public static void main(String[] args) {
        Vector<Sefu_Mare> sefVector = new Vector<Sefu_Mare>();
        for (int i = 0; i < 1; i++){
            Sefu_Mare s = new Sefu_Mare(170,"albastri",55f,false,2,"user",2,90,8.50);
            sefVector.add(s);
            System.out.println(s);
        }


    }
}
