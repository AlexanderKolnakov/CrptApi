package ru.SelSup.CrptApi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import ru.SelSup.CrptApi.model.enums.ProductionType;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class DocForCrpt {
    private Description description;
    @NotNull(message = "не указан Идентификатор ")
    private String docId;
    @NotNull(message = "не указан Статус документа")
    private String docStatus;
    @NotNull(message = "не указан Тип документа ")
    private String docType;

    private Boolean importRequest;
    @NotNull(message = "не указан ИНН собственника товара")
    private String ownerInn;
    @NotNull(message = "не указан ИНН участника оборота товаров")

    private String participantInn;
    @NotNull(message = "не указан ИНН производителя товара")
    private String producerInn;

    @NotNull(message = "не указана Дата производства товара")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDateTime productionDate;
    @NotNull(message = "не указан Тип производственного заказа")
    private ProductionType productionType;

    private Product products;

    @NotNull(message = "не указана Дата и время регистрации")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private String regDate;
    private String regNumber;
}
