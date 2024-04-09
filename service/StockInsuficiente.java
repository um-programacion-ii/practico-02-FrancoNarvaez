package service;

public class StockInsuficiente extends Exception {
    public StockInsuficiente(String message) {
        super(message);
    }
}