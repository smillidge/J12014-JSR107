/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.j12014;

import fish.payara.j12014.model.Stock.Stock;
import java.io.Serializable;
import javax.cache.processor.EntryProcessor;
import javax.cache.processor.EntryProcessorException;
import javax.cache.processor.MutableEntry;

/**
 *
 * @author steve
 */
public class Uprate implements EntryProcessor<String, Stock, Double>, Serializable {

    @Override
    public Double process(MutableEntry<String, Stock> me, Object... os) throws EntryProcessorException {
        
        Stock stock = me.getValue();
        Double percentage = (Double)os[0];
        System.out.println("Revaluing " + stock.getSymbol() + " by " + percentage + "%");
        stock.setPrice(stock.getPrice() + stock.getPrice()*(percentage/100.0d));
        me.setValue(stock);
        return stock.getPrice();
    }

}
