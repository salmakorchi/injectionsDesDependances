package dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {

        /* connect to db to get temp */
        double temp = Math.random()*40;
        return 0;
    }
}
