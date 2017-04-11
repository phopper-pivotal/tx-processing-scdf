package io.pivotal;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/enrichWithCardAccount",
        method = RequestMethod.GET,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public class CardAccountController {

    public String enrichWithCardAccount(@RequestBody String payload) throws IOException {
        // merge CardAccount JSON into @ResponseBody
        ObjectMapper mapper = new ObjectMapper();

        // convert request payload to a JsonNode so we can traverse tree
        JsonNode rootNode = mapper.readTree(payload);

        // grab cardAccountNumber from root



        // return the new JSON structure with enriched data

        return "";
    }
}
