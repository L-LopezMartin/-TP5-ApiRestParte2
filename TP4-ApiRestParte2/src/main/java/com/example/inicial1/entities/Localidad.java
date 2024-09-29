package com.example.inicial1.entities;

import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.envers.Audited;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Audited
@ToString
public class Localidad extends Base{
    private String denominacion;
}
