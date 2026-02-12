import java.util.*;
public class sumofdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int sum=0;
        while(a>0){
            int num=a%10;
            sum=sum+num;
            a=a/10;
        }
        System.out.println("sum of digits="+sum);
    }
    
}
