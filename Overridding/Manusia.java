package Overridding;

/**
 *
 * @author Miya Kurnia
 */
public class Manusia
{
    public void makanBuah(Buah x){
        if(x instanceof Apel)
        {
         System.out.println("Apel langsung dimakan");
         ((Apel)x).tampilkanWarnaBuah();
         
         
        }
           else if(x instanceof Pisang)
           {
             System.out.println("Pisang dikupas dahulu");
             ((Pisang)x).tampilkanWarnaBuah();
             
             
           }
        System.out.println("Rasanya : " + x.Rasa);
    }
    
}