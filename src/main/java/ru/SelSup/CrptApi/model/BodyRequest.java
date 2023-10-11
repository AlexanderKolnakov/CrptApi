package ru.SelSup.CrptApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.SelSup.CrptApi.model.enums.DocumentFormat;
import ru.SelSup.CrptApi.model.enums.TypeDoc;

import java.lang.reflect.Type;

@AllArgsConstructor
@Data
public class BodyRequest {
    private DocumentFormat documentFormat;
    private String productDocument;
    private String productGroup;
    private String signature;
    private TypeDoc type;

}
