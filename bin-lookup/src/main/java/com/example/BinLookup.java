package com.example;

import com.example.model.CardBin;
import com.example.model.CardBinDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;

@Service
public class BinLookup {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(BinLookup.class);
    @Autowired
    RestTemplate restTemplate;

    public CardBin getBin(String bin) {
        //@TODO externalize the URL into SCS Config
        URI uri = URI.create("https://bins.payout.com/api/v1/bins/" + bin);
        String value = restTemplate.getForObject(uri, String.class);
        log.info(value);

        log.info("JSON to CardBin: " + this.getCardBin(value).toString());

        return new CardBin();
    }

    public CardBin getCardBin(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addDeserializer(CardBin.class, new CardBinDeserializer(CardBin.class));
        objectMapper.registerModule(simpleModule);

        CardBin cardBin = null;

        try {
            cardBin = objectMapper.readValue(json, CardBin.class);
        } catch (IOException e) {
            log.error("failed to convert JSON String to CardBin");
        }

        return cardBin;
    }
}