package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Administrator extends User {
    /**
     * cimpuri
     **/
    double confitientDeLene;
    double IQ;
    double salariu;

    /**
     * constructor fara parametri
     **/
    public Administrator() {

    }

    /**
     * constructori cu parametri
     **/
    public Administrator(int inaltimea, String culoareOchilor, float greutate, boolean sexul, int nrdeaccess, String dreptdeaccess, double confitientDeLene, double IQ, double salariu) {
        super(inaltimea, culoareOchilor, greutate, sexul, nrdeaccess, dreptdeaccess);
        this.confitientDeLene = confitientDeLene;
        this.IQ = IQ;
        this.salariu = salariu;
    }



    /**
     * functiile de setare la ca cmpurile clasei
     **/
    public void setConfitientDeLene(double confitientDeLene) {
        this.confitientDeLene = confitientDeLene;
    }

    public void setIQ(double IQ) {
        this.IQ = IQ;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    /**
     * functiile de acces la ca cmpurile clasei
     **/

    public double getConfitientDeLene() {
        return confitientDeLene;
    }

    public double getIQ() {
        return IQ;
    }

    public double getSalariu() {
        return salariu;
    }




    public static void main(String[] args) {
        ArrayList<Administrator> administrators = new ArrayList<>();
        administrators.add(new Administrator(177, "Verde", 70.5f, false, 1, "administrator", 2, 90, 89999.50));
        administrators.add(new Administrator(177, "Verde", 70.5f, false, 1, "administrator", 0.1, 0.5, 89999.50));
        System.out.println(administrators);//functia de afisare
        /**functia ,care seteaza salariu,daca lene si IQ <1,atunci salariu micsoreaza**/
       for(Administrator administrator:administrators){
           if((administrator.IQ<1 & administrator.confitientDeLene <1)){
               System.out.println("lene<1 si IQ <1 are"+administrator);
               System.out.println("Before change"+administrators.get(1).getSalariu()
               );
               /**schimbare salariu**/
             administrators.get(1).setSalariu(5050.80);
               System.out.println("After change"+administrators.get(1).salariu);


           }
           /**media aritmetica IQ*/
           final float mediaIQ= (float) (administrators.get(0).IQ+administrators.get(1).IQ);
           System.out.println("Media IQ"+mediaIQ);
       }
/** media lenei***/
        final float mediaLenii= (float) (administrators.get(0).getConfitientDeLene()+administrators.get(1).getConfitientDeLene());
        System.out.println("Media lenei"+mediaLenii);
    }
}
