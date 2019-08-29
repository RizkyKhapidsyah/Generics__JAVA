package com.rizkykhapidsyah.javafundamental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lo = new ArrayList();                              //List tanpa type-parameter
        lo.add("lo - string 1");                                //lo menampung objek string
        lo.add(new Planet("Mercury", 0.06));       //lo menampung objek planet

        for (Object o : lo){
            Planet p = (Planet) o;                              //perlu type-casting dari objek ke planet
            p.print();
        }

        List<Planet> lp = new ArrayList();                      //List dengan type-parameter planet
        lp.add(new Planet("Mercury", 0.06));       //lp menampung objek planet
        //lp.add("lp - string 1");                              //baris ini compile-error, lp tidak diijinkan menampung objek String
        lp.add(new Planet("Venus", 0.82));

        for (Planet p : lp){
            p.print();
        }
    }
}
