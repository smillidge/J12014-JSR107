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
public class PrintStock implements EntryProcessor<String, Stock, String>, Serializable{

    @Override
    public String process(MutableEntry<String, Stock> me, Object... os) throws EntryProcessorException {
        System.out.println(me.getValue() + " IS HERE ....................");
        return null;
    }
    
}
