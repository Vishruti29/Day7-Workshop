import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number or name :");

        int num1 = in.nextInt();
        int reverse = 0;
         while (num1 != 0){
             int remainder = num1 % 10;
             reverse = reverse * 10 + remainder;
             num1 = num1/10;
         }
        System.out.println("Reverse of Number is :" +reverse);

         String orgStr = "Hello";
         String revStr = "";
         for (int i = 0; i < orgStr.length(); i++){
             revStr = orgStr.charAt(i) + revStr;
         }
        System.out.println("Reverse of String is :" + revStr);
        }

    }
