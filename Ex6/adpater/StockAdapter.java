public class StockAdapter implements CSVParser {

    private StockMarketDataParser sm;

    public StockAdapter(StockMarketDataParser csv) {
        this.sm = csv;
    }

    @Override
    public void parseCSV() {
        sm.parseFromCSV();
    }
}
