/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pb0.week09;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Manajer extends Pegawai{
    
    public Manajer(){
        super();
    }
    
    public Manajer(String name){
        super(name);
    }
    
    public void setGaji(int pokok, int tunjangan){
        super.setGaji(pokok+tunjangan);
    }

}
