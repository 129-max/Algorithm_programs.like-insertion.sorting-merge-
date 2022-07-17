import java.util.Scanner;

public class Angram_detection {




        public static void main(String[] args) {
            Algorithm_Utility utility = new Algorithm_Utility();
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter string 1: ");
            String str1 = sc.next();
            System.out.print("Enter string 2: ");
            String str2 = sc.next();

            System.out.println(utility.anagramDetection(str1 , str2));
        }

    }

