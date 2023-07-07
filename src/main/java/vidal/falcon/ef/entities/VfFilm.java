package vidal.falcon.ef.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="vf_films")
@Data
@NoArgsConstructor
public class VfFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vfTitle;
    private Date vfDatePremiere;
    private String vfGenre;
    private Double vfSales;
    private String vfType; // Corto | Pelicula

    @ManyToOne
    @JoinColumn(name="vf_director_id")
    private VfDirector vfDirector;
}
