package pres;

import ext.DaoImpl2;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args){
        // Imjection des dependances par instanciation statique => new
        DaoImpl2 dao=new DaoImpl2();
        IMetierImpl metier=new IMetierImpl();
        metier.setDao(dao);
        System.out.println("Resultats = "+metier.calcul());

    }
}
