package ru.SelSup.CrptApi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import ru.SelSup.CrptApi.model.enums.CertificateDocument;

@AllArgsConstructor
@Data
public class Product {
    private CertificateDocument certificateDocument;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private String certificateDocumentDate;
    private String certificateDocumentNumber;
    @NotNull(message = "не указан ИНН собственника")
    private String ownerInn;
    @NotNull(message = "не указан ИНН производителя товара")
    private String producerInn;
    @NotNull(message = "Дата производства товара из общих сведениях о вводе товаров в оборот")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private String productionDate;
    @NotNull(message = "не указан Код товарной номенклатуры (10 знаков)")
    @Min(10)
    @Max(10)
    private String tnvedCode;
    @NotNull(message = "не указан Уникальный идентификатор товара")
    private String uitCode;
    @NotNull(message = "Уникальный идентификатор транспортной упаковки")
    private String uituCode;
}
