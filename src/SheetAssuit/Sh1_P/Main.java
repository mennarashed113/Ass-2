package SheetAssuit.Sh1_P;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        while (num >= 10) {
            num /=10;

        }
        if(num %2 ==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}