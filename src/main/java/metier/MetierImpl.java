package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("metier")
public class MetierImpl implements Imetier{

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Autowired
    private IDao dao;

    @Override
    public double calcul() {
        double temp=dao.getData();
        double result=temp*393;
        return result;
    }


    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
