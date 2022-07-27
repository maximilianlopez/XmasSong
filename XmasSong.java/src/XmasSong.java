//*******************************************************************
//
//   File: XmasSong.java          
//
//   Author: maximilian
//
//   Class: XmasSong
// 
//   
//   --------------------
//      This program outputs a song that is a variation of a classic
//   holiday song.
//*******************************************************************

public class XmasSong {
    public static void main(String[] args){
        System.out.println("On the 1st day of day of \"Xmas\", my true love gave to me");
        partridges();
        System.out.println("On the 2nd day of day of \"Xmas\", my true love gave to me");
        turtleDoves();
        System.out.println("On the 3rd day of day of \"Xmas\", my true love gave to me");
        frenchHens();
        System.out.println("On the 4th day of day of \"Xmas\", my true love gave to me");
        callingBirds();
        System.out.println("On the 5th day of day of \"Xmas\", my true love gave to me");
        goldenRings();
        System.out.println("On the 6th day of day of \"Xmas\", my true love gave to me");
        geeseAlaying();
        System.out.println("On the 7th day of day of \"Xmas\", my true love gave to me");
        freestyle();
    }

// 1st Day of Christmas!
    public static void partridges(){
        System.out.println("a partridge in a pear tree.");
        System.out.println(" ");
    }

// 2nd Day of Christmas!
    public static void turtleDoves(){
        System.out.println("two turtle doves, and");
        partridges();
    }

// 3rd Day of Christmas!
    public static void frenchHens(){
        System.out.println("three French hens,");
        turtleDoves();
    }

// 4th Day of Christmas!
    public static void callingBirds(){
        System.out.println("four calling birds,");
        frenchHens();
    }

// 5th Day of Christmas!
    public static void goldenRings(){
        System.out.println("five golden rings,");
        callingBirds();
    }

// 6th Day of Christmas!
    public static void geeseAlaying(){
        System.out.println("six geese a-laying,");
        goldenRings();
    }

// 7th Day of Christmas!
    public static void freestyle(){
        System.out.println("seven extra credits,");
        geeseAlaying();
    }
}
