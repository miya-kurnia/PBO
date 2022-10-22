
package Overloading;

/**
 *
 * @author Miya Kurnia
 */
public class Manusia 
{
    public void setBiodata(String nama){
        System.out.println("Method setBiodata pertama dipanggil");
        System.out.print("Nama :");
        System.out.println(nama);
    }
    public void setBiodata(String nama, int umur){
        System.out.println("Method setBiodata pertama dipanggil");
        System.out.print("Nama :");
        System.out.println(nama);
        System.out.print("Umur :");
        System.out.println(umur);
    }
    public void setBiodata(String nama, int umur , String alamat){
        System.out.println("Method setBiodata pertama dipanggil");
        System.out.print("Nama :");
        System.out.println(nama);
        System.out.print("Umur :");
        System.out.println(umur);
        System.out.print("Alamat :");
        System.out.println(alamat);
    }
}
