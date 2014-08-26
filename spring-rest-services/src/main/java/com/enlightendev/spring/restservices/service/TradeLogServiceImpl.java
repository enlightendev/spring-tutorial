package com.enlightendev.spring.restservices.service;

import com.enlightendev.spring.restservices.domain.TradeLogEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */
@Service
public class TradeLogServiceImpl {

    private ConcurrentHashMap<Long, TradeLogEntry> tradeLogEntries
            = new ConcurrentHashMap<Long, TradeLogEntry>();

    public List<TradeLogEntry> getAll() {
        List<TradeLogEntry> list = new ArrayList<TradeLogEntry>(tradeLogEntries.values());
        return list;
    }

    public TradeLogEntry create(TradeLogEntry tradeLogEntry){
        if(getById(tradeLogEntry.getId()) == null){
            tradeLogEntries.put(tradeLogEntry.getId(), tradeLogEntry);
            return tradeLogEntry;
        }else{
            return null;
        }
    }

    public TradeLogEntry getById(Long id){
        if(tradeLogEntries.containsKey(id)){
            return tradeLogEntries.get(id);
        }else{
            return null;
        }
    }

    public TradeLogEntry update(TradeLogEntry tradeLogEntry){
        TradeLogEntry oldEntry = getById(tradeLogEntry.getId());
        if(oldEntry != null){
            oldEntry.setName(tradeLogEntry.getName());
            oldEntry.setTicker(tradeLogEntry.getTicker());
            return oldEntry;
        }else{
            return null;
        }
    }

    public void delete(Long id){
        if(getById(id) != null){
            tradeLogEntries.remove(id);
        }else{

        }
    }

}