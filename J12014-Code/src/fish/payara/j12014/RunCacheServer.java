/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.j12014;

import fish.payara.j12014.model.Stock.Stock;
import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.spi.CachingProvider;

/**
 *
 * @author steve
 */
public class RunCacheServer {
    
    public static void main(String args[]) throws InterruptedException {
        CachingProvider cp = Caching.getCachingProvider();
        CacheManager cm = cp.getCacheManager();
        MutableConfiguration<String,Stock> config = new MutableConfiguration<String, Stock>();
        config.setStoreByValue(true).setTypes(String.class, Stock.class)
                .setManagementEnabled(true)
                .setStatisticsEnabled(true); 
        Cache<String,Stock> cache = cm.createCache("J12014", config);
        
        while(true) {
            Thread.sleep(1000);
        }
        
    }
    
}
