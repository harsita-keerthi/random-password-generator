import java.util.Scanner;
/*
 * A program that generates secure passwords. The password will contain
 * two lowercase characters, two uppercase characters, two digits, and two special 
 * characters. The password must have a length of 20 characters, so the rest 
 * will be random chars.
 * 
 * @author Harsita Keerthikanth
 * @version 6/2/2023
 */
class RandomPassword {
    /*
     * A method that randomly generates numbers(0-9) or letters(lowercase and uppercase)
     * using ASCII
     * 
     * '0'-'9' : 48-57 in ASCII
     * 'A'-'Z' : 65-90 
     * 'a'-'z' : 97-122
     * 
     * @return a random character
     */
    public static char randomCharacter() {
        //26 lowercase + 26 uppercase + 10 digits = 62
        //random has values between 0 and 62
        int random = (int)(Math.random()*62);
        if (random <= 9) { //random is a digit
            int number = random + 48; 
            return (char)number;
        } else if (random <= 35) { //random is an uppercase letter
            int uppercase = random + 55;
            return (char)uppercase;
        } else { //random is a lowercase letter
            int lowercase = random + 61;
            return (char)lowercase;
        }
    }
    
    /*
     * A method that prints the array in the parameter
     * 
     * @param arr is the array to be printed
     */
    public static void printArray(String[] arr) {
        
    }
    
    /*
     * A method that returns a the strength of the password relative to
     * its length.
     * 
     * @param length is the password length
     * @return the strength of the password
     */
    public static String getPasswordStrength(int length) {
        return "";
    }

    public static void main(String[] args) {

    }
}