package locations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import locations.coordinate;

public class all_coordinates {
    public static List<coordinate> world_locations = new ArrayList<coordinate>();

    public static void main(String[] args) {

        String csvFile = "/Users/fatimamohamed/Desktop/coords/csvfile.csv";
        String line = "";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] location = line.split(cvsSplitBy);
                coordinate temp = new coordinate();
                temp.setIndex(location[0]);
                temp.setCountry(location[1]);
                temp.setCity(location[2]);
                temp.setLatitude(location[3]);
                temp.setLongitude(location[4]);
                temp.setAltitude(location[5]);

                world_locations.add(temp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}