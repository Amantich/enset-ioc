package extention;

import dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version detecteur");
        double temp=Math.random()*40;
        return temp;
    }
}
