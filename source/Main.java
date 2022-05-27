import java.util.*;
import java.lang.Math;

class Main {
  static boolean loop=true;
  static Double output;
  public static void main(String[] args) {
  
    System.out.println("Calculator");
    Scanner input= new Scanner(System.in);
  while (loop==true){
    System.out.println("Input First Number:");
    Double firstInput =input.nextDouble();

    System.out.println("Input Operator");
  
    char operator = input.next().charAt(0);
  
    System.out.println("Input Second Number");
    Double secondInput =input.nextDouble();

    if(operator=='+'){
      
      output= firstInput+secondInput;

    } else if(operator=='-'){

       output= firstInput-secondInput;

    } else if(operator=='*'){

       output= firstInput*secondInput;

    } else if(operator=='/'){

      output= firstInput/secondInput;

    } else if(operator=='^'){

      output= Math.pow(firstInput, secondInput);

    } else{
      System.out.println("You did not enter a valid operator. +, -, *, /, and ^ are valid operators.");

    }
    
    System.out.println(output);
    System.out.println("Would you like to continue?(y/n)");
    if(input.next().charAt(0)=='y'){
        loop=true;
    }else{
      loop=false;
    }
    }
  }
}