import java.util.*;
public class largestdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the number");
        int a = sc.nextInt();
        int largest=1;
        while(a>0){
            int d = a%10;
            if(d>largest){
                largest=d;
                
            }
            a=a/10;
        }
        System.out.println("largest number = " + largest);
    }
    
}
