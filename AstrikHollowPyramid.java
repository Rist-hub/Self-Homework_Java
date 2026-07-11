//         *
//        * *
//       *   *
//      *     *
//     *       *
//    *         *
//   *           *
//  *             *
// *****************





public class AstrikHollowPyramid{
    public static void main(String[] args){
        int n = 5;
        int store = n, j=0;
        for(int i=1; i<=n; i++){
            for(int leftSpace=1; leftSpace<=store; leftSpace++){
                System.out.print(" ");
            }
            if(i!=1){
            System.out.print("*");
            }

            for(int midSpace=1; midSpace<=(3*j)-i; midSpace++){
                System.out.print(" ");
            }

            System.out.println("*");
            store--;
            j++;
        }

        for(int i=1; i<=(2*n)+1; i++){
            System.out.print("*");
        }
    }
}