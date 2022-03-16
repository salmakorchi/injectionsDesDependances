package ext;

import dao.IDao;

public class Daoimpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteur");
        double temp=80;
        return temp;
    }
}
