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
public class Pegawai {
    
    private String pegawaiID;
    private static String uniqueID="0"; 
    private String nama;
    protected int gajiPokok;
    
    public Pegawai(){
        this("");
    }
    
    public Pegawai(String nama){
        pegawaiID=Pegawai.getUniqueID();
        this.nama=nama;
    }
        
    public String getPegawaiID() {
        return pegawaiID;
    }

    public void setPegawaiID(String pegawaiID) {
        this.pegawaiID = String.format("%4s", pegawaiID);
    }
    
    public void setUniqueID(int uniqueID){
        Pegawai.uniqueID=String.valueOf(uniqueID);
    }
    
    public String getNama() {
        return nama;
    }
    
    /*
    Static method to automatically set new ID each time a new pegawai is called
    */
    private static String getUniqueID(){
        int id=Integer.parseInt(uniqueID);
        uniqueID=String.format("%04d", ++id);
        return uniqueID;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    @Override
    public String toString(){
        return "{ID: "+getPegawaiID()
                +"; Name: "+getNama()
                +"; Gaji Pokok: "+getGajiPokok()
                +"}";
    }
}
