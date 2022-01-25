public class BodenParametr {
    private int bodenFeuchte;
    private Float bodenTemperatur;
    private int year;
    private int month;

    public BodenParametr (int bodenFeuchte, Float bodenTemperatur, int year, int month) {
        this.bodenFeuchte = bodenFeuchte;
        this.bodenTemperatur = bodenTemperatur;
        this.year = year;
        this.month = month;
    }

    public int getBodenFeuchte() {
        return bodenFeuchte;
    }

    public Float getBodenTemperatur() {
        return bodenTemperatur;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }
}
