package com.enlightendev.spring.restservices.web;

import com.enlightendev.spring.restservices.domain.TradeLogEntry;
import retrofit.client.Response;
import retrofit.http.*;
import retrofit.mime.TypedFile;

import java.util.List;

public interface TradeLogControllerApi {

    @GET("/tradelogentry")
    public List<TradeLogEntry> getAll();

    @GET("/tradelogentry/{id}")
    public TradeLogEntry getEntryById(@Path("id") Long id);

    @POST("/tradelogentry")
    public TradeLogEntry create(@Body TradeLogEntry tradeLogEntry);

}
