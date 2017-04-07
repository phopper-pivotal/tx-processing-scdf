package com.example;

import com.example.model.CardBin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class BinLookupApplication {

    @Autowired
    BinLookup binLookup;

    @Bean
    public RestTemplate rest(RestTemplateBuilder builder) {
        return builder.build();
    }

    @RequestMapping(value = "/bin-lookup/{bin}", method = RequestMethod.GET)
    public CardBin getBin(@PathVariable String bin) {
        return binLookup.getBin(bin);
    }


    public static void main(String[] args) {
		SpringApplication.run(BinLookupApplication.class, args);
	}
}