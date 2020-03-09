import java.util.Scanner;
public class Strategy_Design_Pattern {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values of a and b");
	int a1=sc.nextInt();
	int b1=sc.nextInt();
	AccessFactor a = new AccessFactor(new Addition());		
    a.accessing(a1,b1);
    AccessFactor a3 = new AccessFactor(new Modulus());		
    a3.accessing(a1,b1);
    AccessFactor a4 = new AccessFactor(new power());		
    a4.accessing(a1,b1);	
}
}