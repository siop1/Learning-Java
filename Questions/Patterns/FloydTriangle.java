/*
1
2   3
4   5   6
7   8   9   10
11  12  13  14  15

Floyd's triangle
*/

public class FloydTriangle{
    public static void main(String[] args){
        int count=1,n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count++ + "\t");
            }
            System.out.println();
        }
    }
}