package DAO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
/**
 * Created by Mark on 7/20/2017.
 */
public class Validation {

        public static int menuNumValidation(int menuNum){
            Scanner scan = new Scanner(System.in);

            while ((menuNum != 1) && (menuNum != 2) && (menuNum != 3)){

                System.out.println("invalid entry! please enter 1, 2, or 3!");
                menuNum = scan.nextInt();

            }
            return menuNum;
        }

        public static boolean checkForDuplicateCountry(String country){
            String[]countries;
            boolean isDuplicate = false;
            try {
                countries = Files.readAllLines(new File("countries.txt").toPath()).toArray(new String[0]);
                for (String country1 : countries) {
                    isDuplicate = country1.equalsIgnoreCase(country);
                }
            }catch (IOException e){
                e.printStackTrace();
            }return isDuplicate;

        }
    }



