package ru.SelSup.CrptApi.clients;


import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.json.simple.JSONObject;


import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import ru.SelSup.CrptApi.model.BodeResponse;
import ru.SelSup.CrptApi.model.BodyRequest;

import java.util.Map;


@Service
@Slf4j
public class ClientCrpt extends BaseClient{

    @Autowired
    public ClientCrpt(@Value("https://ismp.crpt.ru") String serverUrl, RestTemplateBuilder builder) {

        super(
                builder
                        .uriTemplateHandler(new DefaultUriBuilderFactory(serverUrl))
//                        .requestFactory(HttpComponentsClientHttpRequestFactory::new)
                        .build()
        );
    }


    // pg - Наименование товарных групп
    public BodeResponse createTurnoverDoc(String pg, BodyRequest body) {
        Gson gson = new Gson();
        Map<String, Object> parameters = Map.of(
                "pg", pg
        );

        ResponseEntity<Object> objectResponse =
                post("/api/v3/lk/documents/commissioning/contract/create?pg={pg}", parameters, body);

        String jsonString = gson.toJson(objectResponse.getBody());



        LocationInMap location = new LocationInMap();
        JSONParser parser = new JSONParser();

    }
}
