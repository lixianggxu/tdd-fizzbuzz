package cn.xpbootcamp.fizzbuzz;

public class CountOff {

   public String checkCountOff(int number){
       String resultStr="";
       if(number%3==0&&number%5==0){
           resultStr="FizzBuzz";
       }else if(number%3==0&&number%7==0){
           resultStr="FizzWhizz";
       }else if(number%5==0&&number%7==0){
           resultStr="BuzzWhizz";
       }else if(number%3==0){
           resultStr="Fizz";
       }else if(number%5==0){
           resultStr="Buzz";
       }else if(number%7==0){
           resultStr="Whizz";
       }

       return resultStr;

   }
}
