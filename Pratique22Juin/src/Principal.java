/*LISTE DES MEMBRES
Pungu Wa mupenda Adalbert L2 GL
Pende Mugeni Jérémie L2 MSI
Kanjinga Tshama Josueta L2 MSI
Kapinga Mulamba Belange L2 MSI
Manina Kabambi Cecile L2 MSI
Masangu Mulongo Bikri L2 MSI
Matumona ndongala kevin L2 MSI
Michael Keyzi Michael L2 MSI
Kabange Mukwangu Mike L2 MSI
 */
import java.util.Date;
public class Principal {
    public static void main(String args[]){
        Client client1 = new Client("Pende","Jeremie",new Adresse("Kiwele","N° 414",
                "AB","Lubumbashi","Bendera","Ruashi","RDCongo"),"1");
        Produit<String> produit1 = new Produit<String>(1,34,"001","PC",new Categorie("PC","DELL"),500,
                "12Ghz",new Date(2023,12,26));
        System.out.println(produit1.getPrixTotal());
        System.out.println(produit1.getTva());
        System.out.println(produit1.getTotal());

    }


}
