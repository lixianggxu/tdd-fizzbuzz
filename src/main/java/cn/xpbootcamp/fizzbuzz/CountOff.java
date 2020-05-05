package cn.xpbootcamp.fizzbuzz;

public class CountOff {
   static int StudentSize=300;

   public String checkCountOff(int number){
       String resultStr="";
       if(1<=number&& number<=StudentSize) {

           if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
               resultStr = "FizzBuzzWhizz";
           } else if (number % 3 == 0 && number % 5 == 0) {
               resultStr = "FizzBuzz";
           } else if (number % 3 == 0 && number % 7 == 0) {
               resultStr = "FizzWhizz";
           } else if (number % 5 == 0 && number % 7 == 0) {
               resultStr = "BuzzWhizz";
           } else if (number % 3 == 0) {
               resultStr = "Fizz";
           } else if (number % 5 == 0) {
               resultStr = "Buzz";
           } else if (number % 7 == 0) {
               resultStr = "Whizz";
           }else{
               resultStr=number+"";
           }
       }else{
           resultStr="ExptionNumber";
       }

       return resultStr;

   }
}
