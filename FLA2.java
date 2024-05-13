/*CHRISTIAN KENNETH F. GONZALES
BSIT-1B
LEARNING ACTIVITY NO.2
1) WHAT WILL HAPPEN IF WE DO NOT MAINTAIN THE ORDER OF EXCEPTION, I.E, FROM MOST SPECIFI TO MOST GENERAL? SHOW YOUR ANSWERS BY CREATING A PROGRAM THAT DOES NOT MAINTAIN THE ORDER OF EXCEPTIONS.
 * 
 */



public class FLA2{
    public static void main(String[] args){

        //Using try-catch keyword to handle the error of the code and generates meaningful message
        try{

            //Dividing by zero can create an Arithmetic Exception error."
            int x = 32/0;   
            System.out.println(x);

        }

        //This code demonstrates when you implement a multi-exception from general to specific exception types are wrong 
        catch(Exception e){
            System.out.println("dddf"); //It generates an error.

        }
        
        catch(ArithmeticException e){
            System.out.println("Error!Cannot divide by zero");
        }


    }
}