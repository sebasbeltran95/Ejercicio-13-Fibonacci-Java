package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int  a = 0, b = 1, c =0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Serie con for");
        
        for(int i = 0; i < 10 ; i++){ 
        if(i < 9){
            System.out.println(a + ", ");
            c = a+b;
            a = b;
            b = c;
        }else{ 
        System.out.println(a);
        }
       }
        

        
        
        

        
    }
}
