package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Om {
    /**
     * Cimpuri
     */
    public static String statutulSocial;
    int inaltimea;
    String  culoareOchilor;//*Char-are numai 1 singur simbol si din cauza asta o sa folosim String
    float greutate;
    boolean sexul;//true-fata,false-baiet

    /**
     * Constructor fara parametri
     */
    public Om() {

    }

    /**
     * Constructor cu parametri
     */
    public Om(int inaltimea, String culoareOchilor, float greutate, boolean sexul) {

        this.inaltimea = inaltimea;
        this.culoareOchilor = culoareOchilor;
        this.greutate = greutate;
        this.sexul = sexul;
    }

    /**
     * functii de setare si afisare
     */
    public static void setStatutulSocial(String statutulSocial) {
        Om.statutulSocial = statutulSocial;
    }

    public static String getStatutulSocial() {
        return statutulSocial;
    }

    public int getInaltimea() {
        return inaltimea;
    }

    public String getCuloareOchilor() {
        return culoareOchilor;
    }

    public float getGreutate() {
        return greutate;
    }

    public boolean isSexul() {
        return sexul;
    }

    public void setInaltimea(int inaltimea) {
        this.inaltimea = inaltimea;
    }

    public void setCuloareOchilor(String culoareOchilor) {
        this.culoareOchilor = culoareOchilor;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        return "Om{" +
                "inaltimea=" + inaltimea +
                ", culoareOchilor='" + culoareOchilor + '\'' +
                ", greutate=" + greutate +
                ", sexul=" + sexul +
                '}';
    }

    public void setSexul(boolean sexul) {
        this.sexul = sexul;
    }
        public static void main(String[] args) {
            List<Om> personList = new ArrayList<Om>();
            personList.add(new Om(175, "Albastri", 60f, false));
            personList.add(new Om(165, "Verde", 55f, true));
            personList.add(new Om(170, "Cafeniu", 50f, true));
/**Afisare datelor espre persoana*/
            System.out.println(personList);
/**Salvare datelor in fisier*/
            PrintWriter out = null; try { out = new PrintWriter("date.txt"); }
            catch (FileNotFoundException e) { e.printStackTrace(); }
            out.println(personList); out.close(); } }
