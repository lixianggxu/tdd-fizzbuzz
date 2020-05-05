package cn.xpbootcamp.fizzbuzz;

public class CountOff {

   public String checkCountOff(int number){
       String resultStr="";
       if(number%3==0){
           resultStr="Fizz";
       }else if(number%5==0){
           resultStr="Buzz";
       }
       return resultStr;

   }
}
