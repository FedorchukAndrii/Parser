import java.nio.file.Path;
import java.nio.file.Paths;

public class Parser {
    public static void main(String[] args) {
        String filename = "derived_germany__soil__daily__recent__2932.txt";
        Path file = Paths.get(filename);
        DataReader.readLines(file);
        //testDB();
        Statistik.getStatistik();
    }

    //Method aufrufen, um Daten aus DB zu bekommen
    private static void testDB() {
        for (int i = 0; i < DataBase.bodenParameters.size(); i++) {
            DataBase.getInfo(i);
        }
    }

}







/*
    InputStreamReader inputStreamReader = null;
        try {
                URL url = new URL("https://opendata.dwd.de/climate_environment/CDC/derived_germany/soil/daily/recent/derived_germany_soil_daily_recent_stations_list.txt");
                URLConnection uc = url.openConnection();
                inputStreamReader = new InputStreamReader(uc.getInputStream());
                } catch (MalformedURLException e) {
                e.printStackTrace();
                } catch (IOException e) {
                e.printStackTrace();
                }
*/
