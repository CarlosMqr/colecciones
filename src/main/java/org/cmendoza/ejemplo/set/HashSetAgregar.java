package org.cmendoza.ejemplo.set;

import java.util.HashSet;

public class HashSetAgregar {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();// el tipo pude de ser de cualquier tipo Persona etc.
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        System.out.println("hs = " + hs);


        boolean b = hs.add("tres");
        System.out.println("permite elementos duplicados? " + b);
    }
}
