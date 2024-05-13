/*CHRISTIAN KENNETH GONZALES
 * BSIT1B
 * INSTRUCTION:
 * 1)RUN THE PROGRAM IN THE PREVIOUS EXAMPLES
 * 2) DEBUG IF THERE ARE ERRORS IN THE PROGRAM
 */


 //EXAMPLE 1
 //JAVA PROGRAM TO ILLUSTRATE HOW TO DEFINE A CLASS AND FIELDS

class Student{
    //DEFINING FIELDS
    int id; //FIELD OR DATA MEMBER OR INSTANCE VARIABLE
    String name;
    //creating the main method inside the Student class

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class COLA {
    public static void main(String[] args){
        //CREATING AN OBJECT OR INSTANCE 
        Student s1 = new Student(3637, "CKENNETH");
        //PRINTING VALUES OD THE OBJECT

        System.out.println("Student ID" + s1.id);//ACCESSING MEMBER THROUGH REFERENCE VARIABLE
        System.out.println("Student name:" + s1.name);
    }
    
}
