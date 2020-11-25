package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class User extends Om {
    int nrdeaccess;
    String dreptdeaccess;

    /**
     * Constructor fara parametri
     **/

    public User() {
    }

    /**
     * Constructor cu parametri
     **/
    public User(int inaltimea, String culoareOchilor, float greutate, boolean sexul, int nrdeaccess, String dreptdeaccess) {
        super(inaltimea, culoareOchilor, greutate, sexul);
        this.nrdeaccess = nrdeaccess;
        this.dreptdeaccess = dreptdeaccess;
    }

    /**
     * functiile de acces si functiile de setare
     **/
    public int getNrdeaccess() {
        return nrdeaccess;
    }

    public void setNrdeaccess(int nrdeaccess) {
        this.nrdeaccess = nrdeaccess;
    }

    public String getDreptdeaccess() {
        return dreptdeaccess;
    }

    public void setDreptdeaccess(String dreptdeaccess) {
        this.dreptdeaccess = dreptdeaccess;
    }

public static void main(String[] args) {
    Vector<User> userVector = new Vector<User>();
    for (int i = 0; i < 3; i++){
        User u = new User(170,"albastri",55f,false,2,"user");
        userVector.add(u);
    }
    // To access user objects from Vector
    for (int i = 0; i < 3; i++){
        System.out.println("Inaltime" + userVector.get(i).getInaltimea() + " Culoare ochiilor " + userVector.get(i).getCuloareOchilor()+"Greutate"+userVector.get(i).getGreutate()+"DreptulDeAcces"+userVector.get(i).getDreptdeaccess()+"NrDeAccess"+userVector.get(i).getNrdeaccess());
    }
}
}