/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.iug_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author shady
 */
public class Iug_2022 {
    static void getChanges(int itemPrice){
    if(itemPrice>100 || itemPrice<25){
    System.out.println("price can not be larger than 100 or less than 25");
    }else{
        // quarter = 25;
        // nickel = 5;
    int remainingMoney = 100 - itemPrice;
    // 60 / 25 = 2
    int quarters = remainingMoney/25;
    int niccles = (remainingMoney-(quarters*25))/5;
     System.out.println("You bought an item for "+itemPrice+" cents and gave me a dollar,\n so your change is \n" + quarters+" quarters, and \n " +niccles+" nickel.");
    }
    }

    
    static String capetilizeFirstLetter(String name){
        String normalizeName = name.toLowerCase().trim();
    return normalizeName.substring(0,1).toUpperCase()+
            normalizeName.substring(1);
    }
    static String formatFullName(String fName,String sName, String lName){
   /*
     // SOLUTION 1  
        
        String firstLetterInFirstName = String.valueOf(fName.charAt(0)).toUpperCase();
    String restLettersInFirstName = fName.substring(1);
    
    String fitstLetterInSecondName = String.valueOf(sName.charAt(0)).toUpperCase();
    String restLettersInSecondName = sName.substring(1);
    
     String fitstLetterInLastName = String.valueOf(lName.charAt(0)).toUpperCase();
    String restLettersInLastName = lName.substring(1);
    
    String fullName = (firstLetterInFirstName+restLettersInFirstName)+" "+
            (fitstLetterInSecondName+restLettersInSecondName)+" "+
            (fitstLetterInLastName+restLettersInLastName);
   return fullName;*/
        
    // SOLUTION 2
return capetilizeFirstLetter(fName)+" "+
        capetilizeFirstLetter(sName)+" "+
        capetilizeFirstLetter(lName);
        
    
    }  
    
    // defeine function that will recieve two parameters
    // as integers and return the max number or 0 if 
    // both are equals
    // return type, fun name, parameters, body
static String getGrade(int mark){
    String grade = 
            mark>=90 ? "A" : mark>=80 ? "B" : mark>=70 ?"C":mark>=60?"D":"F";
    return  grade;  
//    if(mark>=90){
//       return "A";
//       }else if(mark>=80){
//       return "B";
//       }else if (mark >= 70){
//       return "C";
//       }else if(mark >=60){
//       return "D";}
//       else{
//       return "F";
//       }

}

static String getMax(String name1,String name2,String name3){
int name1Length = name1.length();
int name2Length = name2.length();
int name3Length = name3.length();
if(name1Length>name2Length &&name1Length>name3Length ){
return name1;
}
else if(name2Length>name1Length &&name2Length>name3Length ){
return name2;
}
else if(name3Length>name1Length &&name3Length>name2Length ){
return name3;
}else{
return "All Equals";
}



}
static String nestedIfsExc(int grade){
if(grade>=60){
        if(grade>=90){
        return "A";
        }else if(grade>=80){
        return "B";
        }else if(grade>=70){
        return "C";
        }else{
        return "D";
        }
}
else{
return "Failed";
}
}
  static int calculateAgeInMonthes(int years){
    
      return years*12;}  
  
  

  /*
 اجعل المستخدم يدخل رقمين صحيحين ومن ثم قم باحتساب العامل المشترك الاكبر بينهما

 */
 public static int claculateGreatestFactor(int num1,int num2){
 int result = 1;
     int min = num1;
     if(num2<num1)
         min = num2;
     for(int i = 1; i <= min ; i++){
     if((num1%i==0) && (num2%i==0)){
     result = i;}
     }
     return result;

 }
 public static int getMaxNumberInArray(int[] arr){
 int maxnumber = arr[0];
 for(int i = 0 ; i < arr.length ; i++){
     if(arr[i]>maxnumber){
         maxnumber = arr[i];
     }
 }
 return maxnumber;
 }
 
public static int getStringLength(String[] names){
return names.length;
}

public static String capetlizeFirstLetter(String name){
String firstLetter = name.substring(0,1);
String remainLetters = name.substring(1);
return firstLetter.toUpperCase() + remainLetters;
}
/*
1- return type
2- method name
3- arguemnts / parameters
4- body {}
*/
public static String convertDistance(double distanceValue,boolean isKelo){
if(isKelo){
return (distanceValue * 1000) + " M";
}else{
return (distanceValue / 1000) + " KM";
}
}
 public static int[] sortArray(int[] unsortedArray){
for(int i = 0 ; i < unsortedArray.length ; i ++){
        for (int k = i+1; k < unsortedArray.length; k++) {
            // i = 0 , k = 1
         if(unsortedArray[i]>unsortedArray[k]){
         int temp = unsortedArray[i];
         unsortedArray[i] = unsortedArray[k];
         unsortedArray[k] = temp;
         }
     }
 }
return unsortedArray;
 }

 public static void printArrayValues(int[] array){
     for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + (i==array.length-1?"":","));
     }
    
 }
 // int[][] array = {{1,2,3},{4,3,2},{5,4,6}}
 // x[0];
 public static void printMultiDimentionalArray(int[][] array){
     for (int i = 0; i < array.length; i++) {
        printArrayValues(array[i]);
         System.out.println("");
     }
 }
 // {1,2,3,4,5,6} => 4
public static int[] deleteNumber(int[] numbers,int number){
int[] newArray = new int[numbers.length-1];
int j = -1;
    for (int i = 0; i < numbers.length; i++) {
        j++;
        if(numbers[i] ==number ){
            j = i-1;
         continue;
         
         
        }
       
           
        newArray[j] = numbers[i];
    }
    return newArray;
}
 public static void main(String[] args) {
Student student = new Student("omar","gaza",10,true);
     System.out.println(student.name);
    /*// 1- enter the array length
    // 2- enter the values of each element in the array
    // 3- sort the array
    // 4- find the min and the max number of array
    Scanner scanner = new Scanner(System.in);
    int[] numbers;
    System.out.print("Enter the array length: ");
    int length = scanner.nextInt();
    numbers = new int[length];
     for (int i = 0; i < length; i++) {
         System.out.print("Enter the "+(i+1)+" number: "); 
         numbers[i] = scanner.nextInt();
     }
     for (int i = 0; i < length; i++) {
         for (int j = i+1; j < length; j++) {
             if(numbers[i]>numbers[j]){
             int temp = numbers[i];
             numbers[i] = numbers[j];
             numbers[j] = temp;
             }
         }
     }
    
     System.out.println("the max number is: "+numbers[length-1]);
          System.out.println("the min number is: "+numbers[0]);
  */  
/*
    // midterm last question 
while(true){
   System.out.print("Enter distance ending with k or m: ");
    String userInput =  scanner.nextLine();
    String[] parts =    userInput.split(" ");
   
    if(parts.length!=2){
        System.out.println("please enter valid syntax, example: 20 k");
    }else{
        // this cpde will be excuted when parts length == 2
     String distanceValue = parts[0];
     String distanceType = parts[1];
     if((distanceType.equalsIgnoreCase("k"))||
             (distanceType.equalsIgnoreCase("m"))
             ){
     // this code will be excuted if distanceType = k or m
String result = convertDistance(Double.parseDouble(distanceValue),distanceType.equalsIgnoreCase("k"));
         System.out.println(result);
         break;
     }
     else{
         System.out.println("ditance type must be either k or m");
     }
    }
}
*/

    
     

}}
class Student{
String name;
String city;
int age;
boolean isMale;
Student(String name,String city,int age,boolean isMale){
this.age=age;
this.city=city;
this.isMale=isMale;
this.name=name;
}

}