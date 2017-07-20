package Controller;

import DAO.FileDAO;
import DAO.Validation;

import java.util.Scanner;

/**
 * Created by Mark on 7/20/2017.
 */
public class CountriesAPP {
    public static void main(String[] args) {
        FileDAO file = new FileDAO();
        boolean userCont = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to do?");
        do {
            System.out.println("Option 1: Display a list of countries. \nOption 2: Add a country to the list." +  "\nOption 3: Exit the program");
            //int userChoice = scan.nextInt();
            int menuNum = scan.nextInt();
            menuNum = Validation.menuNumValidation(menuNum);
            switch (menuNum) {
                case 1:
                    file.readCountry();
                    System.out.println("Here is the list of countries");
                    System.out.println();
                    break;
                case 2:
                    file.createCountry();
                    //System.out.println("this country has been added to the list");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("goodbye");
                    userCont = false;
                    break;
            }
        }while (userCont);
    }

    }

