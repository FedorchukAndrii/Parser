import static java.lang.Float.NaN;

public class Statistik {
    static Float avrTemp2021;
    static Float avrFeucht2021;
    static Float avrTemp2022;
    static Float avrFeucht2022;
    static int gesamtNumber2021;
    static int gesamtNumber2022;

    public static void getStatistik() {
        for (int Month=1; Month<13; Month++) {
            avrTemp2021 = (float) 0;
            avrFeucht2021 = (float) 0;
            avrTemp2022 = (float) 0;
            avrFeucht2022 = (float) 0;
            gesamtNumber2021 = 0;
            gesamtNumber2022 = 0;
            for (int i = 0; i < DataBase.bodenParameters.size(); i++) {
                BodenParametr param = DataBase.bodenParameters.get(i);
                if(Month == param.getMonth()) {
                    if (param.getYear()==2021) {
                        avrTemp2021 = avrTemp2021 + param.getBodenTemperatur();
                        avrFeucht2021 = avrFeucht2021 + param.getBodenFeuchte();
                        gesamtNumber2021++;
                    } else {
                        avrFeucht2022 = avrFeucht2022 + param.getBodenFeuchte();
                        avrTemp2022 = avrTemp2022 + param.getBodenTemperatur();
                        gesamtNumber2022++;
                    }
                }
            }
            avrTemp2021 = avrTemp2021/gesamtNumber2021;
            avrTemp2022 = avrTemp2022/gesamtNumber2022;
            avrFeucht2021 = avrFeucht2021/gesamtNumber2021;
            avrFeucht2022 = avrFeucht2022/gesamtNumber2022;
            if (avrTemp2021 != (float) 0) {
                System.out.println("Durchschnittliche Boden TEMPERATUR auf 10 cm Tiefe im "
                        + Month + " Monat des Jahres 2021 war: " + avrTemp2021);
            }
            if (avrTemp2022!= (float)0) {
                System.out.println("Durchschnittliche Boden TEMPERATUR auf 10 cm Tiefe im "
                        + Month + " Monat des Jahres 2022 war: " + avrTemp2022);
            }
            if (avrFeucht2021!=(float) 0) {
                System.out.println("Durchschnittliche Boden FEUCHTE auf 10 cm Tiefe im "
                        + Month + " Monat des Jahres 2021 war: " + avrFeucht2021);
            }
            if (avrFeucht2022!=(float) 0) {
                System.out.println("Durchschnittliche Boden FEUCHTE auf 10 cm Tiefe im "
                        + Month + " Monat des Jahres 2022 war: " + avrFeucht2022);
            }
            System.out.println();

        }
    }
}
