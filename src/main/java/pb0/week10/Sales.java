/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pb0.week10;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Sales extends Pegawai {
    private final int KOMISI=10000;
    private int sales;
    
    public Sales(){
        super();
    }
    
    public Sales(String name){
        super(name);
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales=sales;
    }
    
    public int getGaji(){
        return gajiPokok+(sales*KOMISI);
    }
}