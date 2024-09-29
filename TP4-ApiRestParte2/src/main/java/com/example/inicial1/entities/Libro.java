package com.example.inicial1.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Audited
public class Libro extends Base{
    private int fecha;
    private String genero;
    private int paginas;
    private String titulo;

    @OneToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
