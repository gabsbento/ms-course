package com.gabrielbento.hrpayroll.domain.entities;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Worker {
    private Long id;
    private String name;
    private Double dailyIncome;
}
