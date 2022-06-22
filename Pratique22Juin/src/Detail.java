import java.util.Date;
import java.util.List;

public class Detail extends Ligne{

public List<Ligne> ligne;
    public Detail(int numero, int quantite) {
        super(numero,quantite);
    }
    public double getTva(){
        return getPrixTotal()*0.16;
    }
    public double getTotal(){

        return getPrixTotal() ;
    }

}
