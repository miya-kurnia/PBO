
package Overridding;


/**
 *
 * @author Miya Kurnia
 */
public class TestBuah 
{
    public static void main(String[] args){
        Manusia Miya = new Manusia();
        
        Apel apl= new Apel();
        Pisang psg = new Pisang();
        
        Miya.makanBuah(psg);
    }
}
