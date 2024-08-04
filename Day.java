import java.util.Scanner;

public class Day {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the position in the Ranga(0-6) : ");
        int dayPosition=in.nextInt();
        String dayName[]={"Sunday","Monday","Tuesday","Wednesday","Thurday","Friday","Saturday"};
        try{
            System.out.println(dayName[dayPosition]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invaild Day position, Give Range between (0-6)" );
        }
    }
}
