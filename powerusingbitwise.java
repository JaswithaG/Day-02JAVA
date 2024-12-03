import java.util.*;
public class powerusingbitwise{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int result=1<<a;
        System.out.println("2^" + a +"=" + result);
    }
}