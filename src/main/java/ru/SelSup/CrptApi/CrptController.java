package ru.SelSup.CrptApi;


import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.SelSup.CrptApi.model.BodeResponse;
import ru.SelSup.CrptApi.model.BodyRequest;
import ru.SelSup.CrptApi.model.DocForCrpt;

@Controller
@Slf4j
@AllArgsConstructor
@RequestMapping()
public class CrptController {

    private CrptServer crptServer;


    @PostMapping("/create/doc/turnover")
    public BodeResponse createTurnoverDoc(
            @RequestParam(name = "pg") String pg,
            @RequestBody @Valid DocForCrpt docForCrpt) {
        crptServer.createTurnoverDoc(pg, docForCrpt);

    }
}
