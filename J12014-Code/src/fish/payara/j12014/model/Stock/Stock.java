/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.j12014.model.Stock;

import java.io.Serializable;

/**
 *
 * @author steve
 */
public class Stock implements Serializable {

    public Stock(Double price, String symbol) {
        this.price = price;
        this.symbol = symbol;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Stock{" + "price=" + price + ", symbol=" + symbol + '}';
    }
    
    
    
    Double price;
    String symbol;
    
}
