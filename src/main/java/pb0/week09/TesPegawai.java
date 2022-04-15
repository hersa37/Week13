/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pb0.week09;

/**
 *
 * @author echa
 */
public class TesPegawai {

    public static void main(String[] args) {
        
        Manajer manajer=new Manajer("Olive");
        manajer.setGaji(15000000, 5000000);
        
        Sales sales=new Sales("Popeye");
        sales.setGaji(5000000, 2000);
        
        Sekretaris sekretaris=new Sekretaris("Rocket");
        sekretaris.setGaji(4000000);
        
        System.out.println(manajer);
        System.out.println(sales);
        System.out.println(sekretaris);
        
    }
}
