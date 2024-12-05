package ru.fiarr4ikdev.dreamexecutorapi.data.entyty;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(
        name = "dream"
)
public class DreamEntity {

    @Id @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    long id;

    String name;

    String description;

    BigDecimal  price;

    BigDecimal  collectedPrice;

    BigDecimal leftPrice;

    Instant startTime;

    @Enumerated(EnumType.STRING)
    Category category;

    @Enumerated(EnumType.STRING)
    Status status;

    @PrePersist
    public void prePersist() {
        if (startTime == null) {
            startTime = Instant.now();
        }
        if (category == null) {
            category = Category.NO_CATEGORY;
        }
        if (status == null) {
            status = Status.STARTING;
        }
    }

}
