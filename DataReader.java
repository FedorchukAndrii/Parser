import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public static void readLines(Path file) {
        BufferedReader br = null;
        List<BodenParametr> bodenParametrList = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(file.toFile()));
            String line = br.readLine();
            String nextLine = null;
            do {
                if (line != null && nextLine != null) {
                    String[] feucht = line.split(";");

                    int year =Integer.parseInt(feucht[1].substring(0,4));
                    int month = Integer.parseInt(feucht[1].substring(4,6));
                    int bodenFeuchte = Integer.parseInt(feucht[11].trim());
                    float bodenTemperatur = Float.parseFloat(feucht[6]);
                    BodenParametr bodenParametr = new BodenParametr(bodenFeuchte, bodenTemperatur, year, month);
                    bodenParametrList.add(bodenParametr);

                }
                nextLine = br.readLine();
                line = nextLine;
            } while (nextLine != null);

        } catch (IOException e) {
            System.out.println("Error: "+e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        DataBase.setBodenParameters(bodenParametrList);
    }
}
