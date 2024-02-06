package th.ac.utcc.covidapi.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import th.ac.utcc.covidapi.models.CovidData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RestController
public class CovidDataController {
    @GetMapping("/covid-data")
    CovidData[] getCovidData(@RequestParam(required = false, defaultValue = "") String province) {
        String API_URL = "https://covid19.ddc.moph.go.th/api/Cases/today-cases-by-provinces";
        RestTemplate restTemplate = new RestTemplate();
        CovidData[] data = restTemplate.getForObject(API_URL, CovidData[].class);

        return Arrays.stream(Objects.requireNonNull(data)).filter(d -> d.getProvince().contains(province))
                .toArray(CovidData[]::new);
    }
}
