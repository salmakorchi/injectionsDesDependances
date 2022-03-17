package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
        double tmp =dao.getData();
        double res=tmp*540+740-1+500;
        return res;

    }
/*inject an object in dao*/
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
