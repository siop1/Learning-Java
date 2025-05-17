Better approach
import java.lang.*;
import java.util.Scanner;
public class OddEvenArray{
    public static void main(String[] args){
        int ec=0,oc=0,n;
        Scanner scObj=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n=scObj.nextInt();
        int[] num=new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0;i<num.length;i++){
            num[i]=scObj.nextInt();
            if(num[i]%2==0){
                ec++;
            }
            else{
                oc++;
            }
        }  
        System.out.println("No. of even number=" + ec);
        System.out.println("No. of odd number=" + oc);

    }
}
