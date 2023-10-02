/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloggernamev1.pkg2;


import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
// In order to use 'Scanner' & 'Random' I had to import Random, Scanner


/**
 *whahah
 *
 * @author tseid
 */
public class BloggerNamev12 {

    /**
     * @param args the command line arguments
     */
    public static final String reset = "\u001B[0m"; //reseting text colors to default color.
    public static final String red = "\u001B[31m"; //text color - red
    public static final String green = "\u001B[32m";//text color - green
    public static final String yellow = "\u001B[33m"; //text color - yellow
    public static final String cyan = "\u001B[36m";//text color - cyan
    public static void main(String[] args) {
          /*Since we imported Scanner and Random 
        we've no problem putting them in system.    
    */
    Scanner zz = new Scanner(System.in); //"zz" is my scanner input
    Random sad = new Random(); //"sad" is my random input
    
    
    
    
    String[] names = {"Mighty","Super","Beast","Untouchable","Pessimistic","Nerd","Greedy","Rich","All-time","No.1","Ace","Unity","RicknMorty","Something","FanBoy","FanGirl","Dictator","Believer","Dreamer","Mike","Chef","Accountant","Mr.","Mrs.","Miss","Morningstar","Saint","Prince","Queen","King","Darkness","Newcomer","WANTED"};
    // I used Stringarray [] to use multiple strings.
    System.out.println("Hey there, Welcome to Blogger name generator."+reset);
    System.out.println("green+Please enter your name:"+reset);
    
   
    String fullName = zz.nextLine(); //this is the line where the user input their name.
    fullName = fullName.trim().replaceAll("\\s{2,}", " "); // gets rid of leading and trailing spaces
    
 
  
     try {
        
   

      
    
     String[] input = fullName.split(" "); //split is for splitting fullname to firstName and lastName
    if (input.length < 2) { //if user enters less than 2 names (firstName lastName) system will shut down and ask the user try again.
        // and also if the user input more than 2 names system only catch first 2 names
        System.out.println("Please enter your First name and Last name."+reset);
        System.out.println("Please try again."+reset);
        System.out.println("This is the end of the program. . ."+reset);
        return;
    }
    
    String firstName = fullName.split(" ")[0]; //Splits user input to two inputs
    String lastName = fullName.split(" ")[1]; // 2nd input
    
    System.out.println("Wonderful, I like your name "+firstName.toUpperCase()+" "+ lastName.toUpperCase()+reset );
     // OUTPUT 
      
    
    while (true){
        int sadInteger = sad.nextInt(32); //randomly pick up 33names to add and generate blogger name.
        System.out.println("Your blogger name is :  "+ names[sadInteger] + "  " +firstName.charAt(0) +lastName+reset);//Generates blogger name with 33 random words and takes 1st character from firstname and add to last name. Result: [random word]+1stCharacterOfFirstName+lastName. 
        System.out.println("Do you want new one?"+reset);//output program asks question about if the user satisfied with the result.
        System.out.print("Y/N? : "+reset);// "Yes" or "No" simple question. Y/N
        String response = zz.nextLine(); //input
        
        
        if (response.equalsIgnoreCase("y")){ //if the user dissatisfied with the result this is the input to generate another blogger name.
            
            continue; // program continues.
        }
             if (firstName.matches("^[a-zA-Z]*$")){ //----------------------error-----------------
         return; //errrororororororo
     }
       
        if (response.equalsIgnoreCase("n")){ // if the user satisfied wiht the result of blogger name 
            System.out.println("Glad you like it"+reset); //output. program appreciates the satisfaction of user.
            System.out.print("Program shut down successfully."+reset); //output. that program successfully shut down.
            return;
            
        }else { //error: if the user input neither "n" or "y"
            
        System.out.println("Please enter " +"y"+" and "+" n"+red+ " only"+reset);//output. (with colors) error message that says user must input "n" or "y" only.
            
            System.out.println("Please try again, maybe in another dimension..."+reset); //output. simply saying "try again."
            System.out.println("This is the end of the program. have a good life"+reset);//output. end of the program.
    
            return;
        
        }
    
      
              
              }  
        
    }catch(Exception e){ 
       
     }
    
}

    
    
   
}

        

    
    

