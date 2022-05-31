import java.util.Scanner;
public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        System.out.println("sum of even Numbers = " +getEvenDigitSum(number));
    }
    public static  int getEvenDigitSum( int number){
        if ( number<0){
            return -1;
        }
        int sum=0;
        while ( number>0){
            if( number%2==0){
                sum+=number%10;
            }
            number/=10;
        }
        return sum;
    }
}