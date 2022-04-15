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
public class Sales extends Pegawai {
    
    public Sales(){
        super();
    }
    
    public Sales(String name){
        super(name);
    }
    
    public void setGaji(int pokok, int sales){
        super.setGaji(pokok+(sales*10000));
    }
}
