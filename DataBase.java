import java.util.List;

public class DataBase {
    public static List<BodenParametr> bodenParameters;

    public static void setBodenParameters(List<BodenParametr> bodenParameters) {
        DataBase.bodenParameters = bodenParameters;
    }

    public static void getInfo(int nummer) {
        BodenParametr bodenParametr = bodenParameters.get(nummer);
        System.out.println(
            "Year: "+bodenParametr.getYear()+" Month: "+ bodenParametr.getMonth()
            + " Boden Temperatur: "+bodenParametr.getBodenTemperatur()
            + " Boden Feuchtigkeit: " + bodenParametr.getBodenFeuchte()
        );
    }
}
