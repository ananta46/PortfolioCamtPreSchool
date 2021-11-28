package StockClass;

public class Stock {
    
    private String symbol;
    private String name;
    private double previousClosingPrices;
    private double currentPrice;
    
    public Stock(String sym, String naMe){

        symbol = sym;
        name = naMe;
        previousClosingPrices = 0.0;
        currentPrice = 0.0;
    }

    

    public String getSym(){

        return symbol;
    }

    public String getName(){

        return name;
    }

    public double getPPrice(){

        return previousClosingPrices;
    }

    public double getCPrice(){

        return currentPrice;
    }

    public void setPreviousPrice(double pPrice){

        previousClosingPrices = pPrice;
    }

    public void setCurrentPrice(double cPrice){
        currentPrice = cPrice;
    }

    public String getChanges(){

        return (currentPrice - previousClosingPrices) +"$\n"+"Profit/Loss : "+ (((currentPrice-previousClosingPrices)/currentPrice))+"%";
    }


}
