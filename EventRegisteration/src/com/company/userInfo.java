package com.company;

import java.util.Random;
import java.util.Scanner;

public class userInfo {

     String fName;
     String lName;
     int age;
     Scanner sc = new Scanner(System.in);
q
    public void registeredInput(){
        System.out.println("Please print your first name");
          fName = sc.nextLine();
        System.out.println("Please print out last name");
          lName = sc.nextLine();
        System.out.println("Please print out age");
          age = sc.nextInt();
    }


    public void printUserInformation(){

        System.out.println("This Registered information: " + fName + " " + lName + " " + age);
    }

    public void userTimeSet(){

          if(age >= 18){
              System.out.println("The user event starts at 1800");
          }else{
              System.out.println("The user event starts at 0900");
          }
    }

    public  void regNumber(){
        Random rand = new Random();
        int registerNumber = rand.nextInt(10000000);
        System.out.println("Registered event number is " + registerNumber);
    }






}
