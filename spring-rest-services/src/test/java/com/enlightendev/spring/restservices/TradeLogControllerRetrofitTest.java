package com.enlightendev.spring.restservices;

import com.enlightendev.spring.restservices.domain.TradeLogEntry;
import com.enlightendev.spring.restservices.web.TradeLogControllerApi;
import org.junit.Test;
import retrofit.RestAdapter;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * For this test to work server must be running.
 */
public class TradeLogControllerRetrofitTest {

    private static final String SERVER = "http://localhost:8080";

    private TradeLogControllerApi tradeLogControllerApi = new RestAdapter.Builder()
            .setEndpoint(SERVER).build()
            .create(TradeLogControllerApi.class);

    @Test
    public void testController(){

        TradeLogEntry entry1 = new TradeLogEntry("IBM","Int Business Machines" );
        entry1 = tradeLogControllerApi.create(entry1);

        //assert that entity was returned with some id
        assertTrue(entry1.getId() > 0);


        TradeLogEntry tradeLogEntry = tradeLogControllerApi.getEntryById((1l));
        assertTrue(tradeLogEntry.getName().equalsIgnoreCase("IBM"));



        List<TradeLogEntry> tradeLogEntries = tradeLogControllerApi.getAll();
        assertTrue(tradeLogEntries.size() > 0);
    }
}
