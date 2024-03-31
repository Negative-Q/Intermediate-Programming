/* Name: Christian Kenneth F. Gonzales
*BSIT 1B
* LABORATORY ACTIVITY NO.2
*INSTRUCTION:
*Creating a java program for pageant tabulation involves 
 *designing a system to manage and calculate scored for contestants
 * in a pageant.
 * Assumes a pageant with three judges, each scoring contestants
 * in three categories: talent, evening gown, and Q&A. You should indicate the weight of each of the categories,
 * e.g. evening gown: 30%, talent: 30% and Q&A: 40%.
 * Use Java functions or methods in creating the program.
 */


import java.util.Scanner;

public class LA2{

    //This is the starting point of our Program
    public static void main(String[] args){

        //Creates a Scanner object name user_input to read user input from the console
        Scanner user_input = new Scanner(System.in); 

        //Calling the method name user and pass the Scanner object to allow it to read user from the input
        user(user_input); 

    }

    public static void user(Scanner user_input){ 

        //Fix number of categories we needed
        int num_Categories = 3; 

        //Display to the user to enter the number of contestants
        System.out.print("Enter the number of contestant:");
        int num_Contestants = user_input.nextInt();

        //Display to the user to enter the number of contestants
        System.out.print("Enter the number of judges:");
        int num_Judges = user_input.nextInt();

        //Calls the score_tabulation method to proceed with the scores of the contestant
        score_tabulation(num_Contestants,num_Judges,num_Categories, user_input);

        //Close the Scanner to manage the resource
        user_input.close();


    }

    public static void score_tabulation(int numContestants, int numJudges,int numCategories, Scanner user_input){

        //Create a 3D array for storing the scores of each contestants
        int [][][] getContestant_Score = new int [numContestants][numJudges][numCategories];


        //Loop through each contestants
        for (int contestant = 0; contestant < numContestants; contestant++){
            System.out.println("Enter the score for Contestant no." + " " + (contestant + 1));

            //Loop through each judges for the current contestants
            for(int judges = 0; judges < numJudges; judges++){
                System.out.println("Judges no." + " " + (judges + 1));

                //Loop through each categories for the current contestants and judges
                for(int categories = 0; categories < numCategories; categories++){

                    //Determine the category name based on the index in our 3d Array
                    String categoryName;
                    switch(categories){
                        case 0:
                            categoryName = "Talent";
                            break;
                        
                        case 1:
                            categoryName = "Evening Gown";
                            break;
                        
                        case 2:
                            categoryName = "Q&A";
                            break;
                        
                        default:
                            categoryName = "Category" + (categories + 1);
                        
                    }
                    //Display to the user to enter the scores of the contestants depending on the cotestant, judges and category number
                    System.out.println("Category no." + (categories + 1) + ":" + " " + categoryName + "(Score from 0-5)");
                    getContestant_Score[contestant][judges][categories] = user_input.nextInt();
                    
                }
                
            }

        }

        //Declare an array to store the total weighted scores of the contestants
        double [] totalWeightedScores = new double[numContestants];

        //Loop through each contestants
        for (int contestant = 0; contestant < numContestants; contestant++){
            double totalWeightedScore = 0.0;

            //Loop through each judges and and categories
            for (int judges = 0; judges < numJudges; judges++){
                for (int categories = 0; categories < numCategories; categories++){
                    int score = getContestant_Score[contestant][judges][categories];

                    //Calculate the total weight of each contestants
                    totalWeightedScore += score * getWeightedCategories(categories);
                }

            }
            //Stores the total weighted scores of each contestants
            totalWeightedScores[contestant] = totalWeightedScore;
        }

        //Initialize an index to find out who is the highest score of each contestants
        int highestScoreIndex = 0;

        //Looping through each contestant scores
        for(int contestant = 1; contestant < numContestants; contestant++){
            if (totalWeightedScores[contestant] > totalWeightedScores[highestScoreIndex]){
                highestScoreIndex = contestant;
            }
        }

        //Display theoverall scores each contestants
        System.out.println("Overall weight scores of the contestants:");
        for (int contestant = 0; contestant < numContestants; contestant++){
            System.out.println("Contestant no." + (contestant+1) + " " + "is:" + totalWeightedScores[contestant]);

        }

        //Display the winner of the pageant
        System.out.println("The winner for the pageant is: Contestant no." + (highestScoreIndex + 1));

        //Close the scanner
        user_input.close();

    }

    //Private method named getWeightedCategories to determine the weight of each categories based on the given value
    private static double getWeightedCategories(int category) {

        final double talentWeight = 0.3;
        final double eveningGownWeight = 0.3;
        final double QnAWeight = 0.4;

        switch (category){
            case 0:
                return talentWeight;
            case 1:
                return eveningGownWeight;
            case 2:
                return QnAWeight;
            default:
                return 0.0;
        

            

        }
    }
    
    
    
}