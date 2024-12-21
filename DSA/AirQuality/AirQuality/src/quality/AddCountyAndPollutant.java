package quality;

public class AddCountyAndPollutant {
    public static void main(String[] args) {
        AirQuality test = new AirQuality();
        test.buildTable("pollutedCounties.csv");
        test.setStatesAQIStats();
        AddState.printEntireTable(test.getHashTable());
    }
}
