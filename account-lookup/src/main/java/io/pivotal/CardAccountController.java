package io.pivotal;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/enrichWithCardAccount",
        method = RequestMethod.GET,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public class CardAccountController {

    public String enrichWithCardAccount(@RequestBody String payload) {
        // grab the accountNumber from the payload

        // merge CardAccount JSON into @ResponseBody
        ObjectMapper mapper = new ObjectMapper();

        // return the new JSON structure with enriched data

        return "";
    }
}
