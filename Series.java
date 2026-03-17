
import java.util.*;

public class Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0, n = 0;
        double term = 0, result = 0;
        System.out.print("Enter amount of query : ");
        int queries = in.nextInt(), q = 0;
        int array[][] = new int[queries][3];
        do{
            System.out.print("Enter a : ");
            a = in.nextInt();
            System.out.print("Enter b : ");
            b = in.nextInt();
            System.out.print("Enter n : ");
            n = in.nextInt();
            array[q][0] = a;
            array[q][1] = b;
            array[q][2] = n;
            q++;
        }while(q<queries);
        for(int j=0; j<q; j++){
            term = 0;
            result = 0;
            for(int i=0; i<array[j][2]; i++){
                term = (Math.pow(2,i))*array[j][1] + term;
                result = array[j][0] + term;
                System.out.print((int)result+" ");
            }
            System.out.println();
        }
    }
}