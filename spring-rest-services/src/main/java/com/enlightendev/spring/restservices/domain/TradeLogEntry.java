package com.enlightendev.spring.restservices.domain;

/**
 * Created by JL25292 on 8/25/2014.
 */
public class TradeLogEntry {

    private long id;
    private String ticker = "";
    private String name = "";

    public TradeLogEntry(String ticker, String name){
        this.ticker = ticker;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
