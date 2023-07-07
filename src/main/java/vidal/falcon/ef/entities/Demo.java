package vidal.falcon.ef.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="demos")
@Data
@NoArgsConstructor
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Demo(String name) {
        this.name = name;
    }
}
