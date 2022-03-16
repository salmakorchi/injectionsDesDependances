package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Scanner scanner = new Scanner(new File("testconfig.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();
        System.out.println( dao.getData());


        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println(metier.calcul());
    }
}
