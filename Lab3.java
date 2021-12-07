import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int NUM_UPPER_LETTERS = 1;
        final int NUM_LOWER_LETTERS = 6;
        final int NUM_DIGITS = 1;
        int upperCount = 0;
        int lowerCount = 0; 
        int digitCount = 0;
        int letterCount =0;
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a new password. Your password must contain at least one capital letter, one number and an underscore. It should also be 8 digits: ");
        String input = in.nextLine();
        int inputLength = input.length();
        
        for (int i =0; i < inputLength; i++){
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch))
                upperCount++;
            else if (Character.isLowerCase(ch))
                lowerCount++;
            else if (Character.isDigit(ch))
                digitCount++; 
        }
            if (upperCount >= NUM_UPPER_LETTERS && lowerCount>= NUM_LOWER_LETTERS && digitCount>= NUM_DIGITS)
               System.out.println("The password is valid");
                else{
                    System.out.println("The password is invalid. The password must contain at least one capital letter and one digit and an underscore. It should be at least eight digits.");
                }
        }   
    }
