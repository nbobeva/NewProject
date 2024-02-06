package Homework1;

public class Task04 {
    public static void main(String[] args) {

        // declaring double type variables
        int workingHours = 40;
        float money = 20;
        boolean isWorkingDay = false;


        if (isWorkingDay !=false ) {
           System.out.println(
                   "I will go at work ");
        }
        if(money >0 && isWorkingDay == false ){
            System.out.println(
                 "I will go to the cinema");
       }
       if(money < 0){
            System.out.println(
                    "I will stay at home and watching TV");
        }
       if(isWorkingDay != false){

       }
        if(money <10){
            System.out.println("I will go for ice cream");
        }
    }
}