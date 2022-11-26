/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.iug_2022;

import java.util.ArrayList;
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
public static void convertDistance(String value,boolean iKelo){

    double distanceInDouble = Double.parseDouble(value);

    if(iKelo){
        System.out.println((distanceInDouble *1000)+"m");
    }else {
     System.out.println((distanceInDouble /1000)+"k");
    }
}
 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    
    while(true){
     System.out.print("Enter the distance in kilometer or meter: ");
     String distance = scanner.nextLine();
    String[] parts =  distance.split(" ");
    
    if(parts.length != 2){
        System.out.println("Error, you have to enter valid syntax");
    }else if(!(parts[1].equalsIgnoreCase("k")||parts[1].equalsIgnoreCase("m"))){
        System.out.println("Error, you have to enter either k or m");
   
    }else{
    convertDistance(parts[0],parts[1].equalsIgnoreCase("k"));
    break;
    }
    }
//    String[]names =  fullName.split(" ");
//    for(int i = 0 ; i < names.length ; i++){
//        System.out.println(capetlizeFirstLetter(names[i]));
//    }
     

}}
