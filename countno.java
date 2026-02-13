import java.util.*;
public class countno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int count=0;
        while(a>0){
        
        a=a/10; 
        count++;
        
    
    }
    System.out.println("total digits = " + count);
        

    }
    
}
