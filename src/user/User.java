package user;

import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variable declaration
        /*
        int num;
        //get user input
        System.out.print("Enter your Number :");
        num = in.nextInt();
        //check validation
        if (num == 1) {
            System.out.println("Monday");
        } else if (num == 2) {
            System.out.println("Tuesday");
        } else if (num == 3) {
            System.out.println("Wednesday");
        } else if (num == 4) {
            System.out.println("Thursday");
        } else if (num == 5) {
            System.out.println("Friday");
        } else if (num == 6) {
            System.out.println("Saturday");
        } else if (num == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong");
        }
         */
 /*
        get user -> favourite color car
        //Red->danderous color
        //green->go
        //yellow->ready
         */

        //variables declaration
        /*
        String color;
        //get user
        System.out.print("Enter Your Favourite Car Color :");
        color = in.nextLine().toUpperCase();

        // check validation
        if (color.equals("PINK")) {
            System.out.println(color +"color is Dangerous");
        } else if (color.equals("GREEN")) {
            System.out.println(color +"color is Go");
        } else if (color.equals("BLUE")) {
            System.out.println(color +"color is ready");
        }
        else{
            System.out.println("SORRY this color car NOT available");
        }
         */
        //variables declaration
        String color, prize, quality, model;
        //get user
        System.out.print("Enter Your Favourite Car Color :");
        color = in.nextLine().toUpperCase();
        System.out.print("Enter your prize :");
        prize = in.nextLine();
        System.out.print("Enter your Quality :");
        quality = in.nextLine();
        System.out.print("Enter your Model :");
        model = in.nextLine();
        //check validation
        if (color.equals("PINK")|| color.equals("GREEN")|| color.equals("BLUE")&& prize.equals("250000")|| prize.equals("300000")|| prize.equals("350000")&& quality.equals("Additional design") || quality.equals("Topview")|| quality.equals("Ac availble")&& model.equals("2020")||model.equals("2022")||model.equals("2023")){
            System.out.println("This color car is avalible");
        }
        else{
            System.out.println("Sorry This color car is not available");
        }
        }
    }

