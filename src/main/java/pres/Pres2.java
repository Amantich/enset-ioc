package pres;

import dao.IDao;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(new File("src/config.txt"));
        String daoClassName=sc.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao)cDao.newInstance();

        String metierClassName=sc.nextLine();
        Class cMetier=Class.forName(metierClassName);
        Imetier metier=(Imetier) cMetier.newInstance();
        /*
         next line of code is how to get dinamicly a method from class by its name
         first parm is the name of the method and the second the type of params it takes
         */
        Method method=cMetier.getMethod("setDao",IDao.class);
        //  metier.setDao(dao)
        method.invoke(metier,dao);

        System.out.println(metier.calcul());




    }
}
