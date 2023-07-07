package vidal.falcon.ef.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="vf_directors")
@Data
@NoArgsConstructor
public class VfDirector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vfFirstName;
    private String vfLastName;
    private Date vfDateAffiliation;
    private Date vfDateBirth;

    @OneToMany(mappedBy = "vfDirector")
    private List<VfFilm> vfFilms;

    public VfDirector(String vfFirstName, String vfLastName, Date vfDateAffiliation, Date vfDateBirth) {
        this.vfFirstName = vfFirstName;
        this.vfLastName = vfLastName;
        this.vfDateAffiliation = vfDateAffiliation;
        this.vfDateBirth = vfDateBirth;
    }
}
