package ru.fiarr4ikdev.dreamexecutorapi.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import ru.fiarr4ikdev.dreamexecutorapi.data.entyty.Category;
import ru.fiarr4ikdev.dreamexecutorapi.data.entyty.Status;

import java.math.BigDecimal;

@Getter
@Setter
@Schema(name = "DTO желания")
public class DreamDTO {

    @JsonProperty
    String name;

    String description;

    BigDecimal price;

    Category category;

    Status status;
}
