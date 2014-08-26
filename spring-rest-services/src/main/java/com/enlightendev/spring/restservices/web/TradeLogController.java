package com.enlightendev.spring.restservices.web;

import com.enlightendev.spring.restservices.domain.TradeLogEntry;
import com.enlightendev.spring.restservices.service.TradeLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 */
@Controller
@RequestMapping(value = "/tradelogentry")
public class TradeLogController {

    private AtomicLong idCreator = new AtomicLong();

    @Autowired
    TradeLogServiceImpl tradeLogService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<TradeLogEntry> getAll(){
        return tradeLogService.getAll();
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public TradeLogEntry getEntryById(@PathVariable("id") Long id){
        return tradeLogService.getById(id);
    }

    @RequestMapping( method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public TradeLogEntry create(@RequestBody TradeLogEntry tradeLogEntry){
        tradeLogEntry.setId(idCreator.incrementAndGet());
        return tradeLogService.create(tradeLogEntry);
    }

    @RequestMapping( method = RequestMethod.PUT)
    @ResponseStatus( HttpStatus.OK)
    public void update( @RequestBody TradeLogEntry tradeLogEntry){
        tradeLogService.update(tradeLogEntry);
    }

    @RequestMapping( method = RequestMethod.DELETE)
    @ResponseStatus( HttpStatus.OK)
    public void delete( @PathVariable( "id") Long id){
        tradeLogService.delete(id);
    }
}
