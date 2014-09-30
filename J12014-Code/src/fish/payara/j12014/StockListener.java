/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.j12014;

import fish.payara.j12014.model.Stock.Stock;
import java.io.Serializable;
import java.util.Iterator;
import javax.cache.event.CacheEntryEvent;
import javax.cache.event.CacheEntryListenerException;
import javax.cache.event.CacheEntryUpdatedListener;

/**
 *
 * @author steve
 */
public class StockListener implements CacheEntryUpdatedListener<String,Stock>, Serializable {

    @Override
    public void onUpdated(Iterable<CacheEntryEvent<? extends String, ? extends Stock>> itrbl) throws CacheEntryListenerException {
        
      Iterator<CacheEntryEvent<? extends String, ? extends Stock>> i = itrbl.iterator();
      while (i.hasNext()) {
          System.out.println(i.next().getValue());
      }
        
    }
    
}
