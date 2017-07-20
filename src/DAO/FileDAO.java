package DAO;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Mark on 7/20/2017.
 */
public class FileDAO implements CountriesDAO {
    //this will implement my the countries DAO
    @Override
    public void createCountry() {
        //file writers and readers go here
        try {
            Scanner scan = new Scanner(System.in);
            FileWriter writer = new FileWriter("Countries.txt", true);
            System.out.println("Add a country: ");
            String userCountry = scan.nextLine();
            if (!Validation.checkForDuplicateCountry((userCountry))) {
                //write validation here for if country already there
                writer.write(userCountry + "\n");
                System.out.println("country has been saved");
            } else
                System.out.println("country already exists");
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void readCountry() {
//blah,.readd country
        try {

            File myFile = new File("Countries.txt");
            FileReader reader = new FileReader(myFile);
            BufferedReader buff = new BufferedReader(reader);
            String line = null;

            while ((line = buff.readLine()) != null) {
                System.out.println(line);
            }

            buff.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateCountries() {

    }

    @Override
    public void deleteCountry() {

    }



}
