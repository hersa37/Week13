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
public class Manajer extends Pegawai{
    private int tunjangan;
    
    public Manajer(){
        super();
    }
    
    public Manajer(String name){
        super(name);
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan=tunjangan;
    }    
    
    @Override
    public int getGaji(){
        return gaji+tunjangan;
    }
}
