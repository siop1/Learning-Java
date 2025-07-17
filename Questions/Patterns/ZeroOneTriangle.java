/*
1
01
101
0101
10101
*/

// public class ZeroOneTriangle{
//     public static void main(String[] args){
//         int n=5;
//         String a="";
//         for(int i=1;i<=5;i++){
//             if(i%2==0){
//                 a=0+a;
//             }
//             else{
//                 a=1+a;
//             }
//             System.out.println(a);
//         }
//     }
// }


public class ZeroOneTriangle{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}