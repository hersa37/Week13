/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pb0.week10;

/**
 *
 * @author echa
 */
public class TesPegawai {

    public static void main(String[] args) {
        int gaji=15000000;
        Manajer manajer=new Manajer("Olive");
        manajer.setGaji(gaji);
        manajer.setTunjangan(15000000);
        
        Sales sales=new Sales("Popeye");
        sales.setGaji(gaji);
        sales.setSales(15);
        
        Sekretaris sekretaris=new Sekretaris("Rocket");
        sekretaris.setGaji(gaji);
        
        System.out.println(manajer);
        System.out.println(sales);
        System.out.println(sekretaris);
        
    }
}
