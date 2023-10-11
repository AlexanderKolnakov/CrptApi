package ru.SelSup.CrptApi;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.SelSup.CrptApi.clients.ClientCrpt;
import ru.SelSup.CrptApi.model.BodeResponse;
import ru.SelSup.CrptApi.model.BodyRequest;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class CrptServer {

    private final ClientCrpt clientCrpt;



//    Создание документа для ввода в оборот
//товара, произведенного в РФ. Документ и подпись должны передаваться в метод  (2.2.4)

//    @Transactional(rollbackOn = Exception.class)
    public BodeResponse createTurnoverDoc(String pg, BodyRequest bodyRequest) {

        return clientCrpt.createTurnoverDoc(pg, bodyRequest);

    }


}
