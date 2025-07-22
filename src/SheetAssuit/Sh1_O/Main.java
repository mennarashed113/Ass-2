package SheetAssuit.Sh1_O;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        int operatorIndex = -1;
        char S = ' ';

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                S = ch;
                operatorIndex = i;
                break;
            }
        }

        long A = Long.parseLong(input.substring(0,operatorIndex));
        long B = Long.parseLong(input.substring(operatorIndex+1));

        switch (S) {
            case '+':
                System.out.println(A + B);
                break;
            case  '-':
                System.out.println(A - B);
                break;
            case  '*':
                System.out.println(A * B);
                break;
            case   '/':
                System.out.println(A / B);
                break;
            default:
                System.out.println("Invalid input");
        }



    }
}