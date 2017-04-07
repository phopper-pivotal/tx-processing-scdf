package com.example.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

/**
 * Created by phopper on 4/6/17.
 */
public class CardBinDeserializer extends StdDeserializer<CardBin> {

    public CardBinDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public CardBin deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String bin = node.get("bin").asText();
        String brand = node.get("brand").asText();
        String issuer = node.get("issuer").asText();
        String type = node.get("type").asText();
        String countryCode = node.get("country_code").asText();
        boolean isPrepaid = node.get("is_prepaid").asBoolean();

        return new CardBin(bin, brand, issuer, type, countryCode, isPrepaid);
    }
}
