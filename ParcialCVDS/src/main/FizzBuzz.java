package main;

public class FizzBuzz {
    public  static String convert(int numero){
        if(numero % 3 == 0 || String.valueOf(numero).contains("3")){
            return "Fizz";
        } else if (numero % 5 == 0 || String.valueOf(numero).contains("5")) {
            return "Buzz";
        }else {
            return String.valueOf(numero);
        }
    }
}
