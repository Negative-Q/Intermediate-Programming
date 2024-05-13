/*Christian Kenneth F. Gonzales
 * BSIT 1B
 * LEARNING ACTIVITY NO.1
 * Instruction:
 * 
 * 1) PROMPT THE USER TO ENTER A STRING REPRESENTING AN INTEGER.
 * USE  THE Integer.parseInt() METHOD TO PARSE THE INPUT STRING INTO AN INTEGER.
 * HANDLE THE NumberFormatException THAT MAY OCCUR IF THE INPUT STRING CANNOT BE PARSED AS AN NTEGER
 * 
 * 2) DECLARE A REFERENCE VARIABLE OF TYPE STRING AND ASSIGN IT THE VALUE NULL. 
 * ATTEMPT TO CALL A METHOD ON THIS REFERENCE VARIABLE(E.G., length())). 
 * USE A try-catch BLOCK TO CATCH THE NullPointerException THAT MAY OCCUR.
 * 
 * 3) USE THE SCANNER CLASS TO READ AN INTEGER FROM THE USER'S INPUT. 
 * HANDLE THE InputMismatchException THAT MAY OCCUR IF THE INPUT PROVIDED BY THE USER IS NOT AN INTEGER.
 */

 import java.util.Scanner;




public class exec_activity_no1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        item1(scan);

        
    }

    public static int item1(Scanner scan){
        System.out.println("Enter a number:");
        String user = scan.nextLine();

        try{

            int number = Integer.parseInt(user);
            System.out.println("The number you input is:" + number);

        }
        catch(NumberFormatException e){
            System.out.println("Error. You put the wrong input. Please try again");
        
        }
        finally{
            scan.close();
        }
        return 0;
        
    }
    

    



    
    
}
