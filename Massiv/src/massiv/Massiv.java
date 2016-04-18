
package massiv;
import java.util.Random;
public class Massiv {
    public static void main(String[] args) {
    int ar[] = new int [10];
    mass(ar);
    }
    public static void mass(int ar[]){
    Random rand = new Random();
    for (int i = 0; i<10; i++){
    ar[i] = rand.nextInt(10);
    System.out.println(ar[i]);
    }
    }
    }

           


    

