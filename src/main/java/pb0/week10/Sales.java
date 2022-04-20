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
    private final int KOMISI_PER_BARANG=10000;
    private int jumlahBarang;
    
    public Sales(){
        super();
    }
    
    public Sales(String name){
        super(name);
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang=jumlahBarang;
    }
    
    public int getKomisi(){
        return jumlahBarang*KOMISI_PER_BARANG;
    }
    
    public int getGaji(){
        return gajiPokok+(getKomisi());
    }
}
