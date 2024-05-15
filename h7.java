import java.util.Scanner;

public class h7 {
    public static void main(String[] args) {
        // get user input from consle:
        Scanner scan = new Scanner(System.in);
        //Step 1: create an object of the Scanner class
        //Step 2: control + shift + o : import the Scanner class using Eclipse

        System.out.println("Enter a letter? " );
        //Step 3: prompt end-user

        String letter = scan.nextLine();
        //Step 4: read form console
        //using scan (object name) and nextline (method saved in scan = Scanner)
        // assign information entered on the console by the user and read by Scanner to
        // the variable

        System.out.println(letter);
        // Step 5: print to convince myslef it worked

        scan.close();

    }


}
