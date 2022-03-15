package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        // se connecter a la base de donnees pour recuperer la temperature
        System.out.println("Version base de donnees");
        double temp=Math.random()*40;
        return temp;
    }
}
