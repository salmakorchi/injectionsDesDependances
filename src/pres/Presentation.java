package pres;

import dao.DaoImpl;
import ext.Daoimpl2;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args) {
        Daoimpl2 dao = new Daoimpl2();
        IMetierImpl metier = new IMetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
