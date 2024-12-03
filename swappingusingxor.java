public class swappingusingxor{
    public static void main(String args[]){
        int a=10,b=20;
        a=a^b;
        b=a^b;
        a=a^b;
        String res=String.format("After swapping \n a=%d \n b=%d",a,b);
        System.out.println(res);
    }
}