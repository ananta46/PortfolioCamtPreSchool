package StockClass;

public class TradingView {
    public static void main(String[] args) {

        Stock stockOracle = new Stock("ORCL","Oracle Corporation");
        stockOracle.setPreviousPrice(34.5);
        stockOracle.setCurrentPrice(34.35);
        System.out.println("Stock name : "+stockOracle.getName()+"\nSymbol : "+stockOracle.getSym());
        System.out.println("Previous price : "+stockOracle.getPPrice());
        System.out.println("Current price : "+stockOracle.getCPrice());
        System.out.println(stockOracle.getChanges());


    }
}
