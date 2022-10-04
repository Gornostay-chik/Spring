package ermin.vermin.Relocation;

public class Climate {
    private int pressure;
    private String rainfallSummer;
    private String rainfallWinter;
    private int tSummer;
    private int tWinter;
    private boolean changingSeasons;
    private ClimateType climateType;

    public Climate(){}

    //SETTERS
    public void setPressure(int pressure) {this.pressure = pressure;}
    public void setRainfallSummer(String rainfallSummer) {this.rainfallSummer = rainfallSummer;}
    public void setRainfallWinter(String rainfallWinter) {this.rainfallWinter = rainfallWinter;}
    public void settSummer(int tSummer) {this.tSummer = tSummer;}
    public void settWinter(int tWinter) {this.tWinter = tWinter;}
    public void setChangingSeasons(boolean changingSeasons) {this.changingSeasons = changingSeasons;}
    public void setClimateType(ClimateType climateType) {this.climateType = climateType;}

    //GETTERS
    public int getPressure() {return pressure;}
    public String getRainfallSummer() {return rainfallSummer;}
    public String getRainfallWinter() {return rainfallWinter;}
    public int gettSummer() {return tSummer;}
    public int gettWinter() {return tWinter;}
    public boolean isChangingSeasons() {return changingSeasons;}
    public ClimateType getClimateType() {return climateType;}

    public String toString(){
        return "Pressure:" + pressure + "\n" +
        "Rainfall in Summer:" + rainfallSummer + "\n" +
        "Rainfall in Winter:" + rainfallWinter + "\n" +
        "Temperature in Summer:" + tSummer + "\n" +
        "Temperature in Winter:" + tWinter + "\n" +
        "Changing of Seasons:" + changingSeasons + "\n" +
        "Type of climate:" + climateType;
    }
}
