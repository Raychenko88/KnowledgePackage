package org.example.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "k_pac_sets")
public class KPacSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 250)
    private String title;
    @ManyToMany(mappedBy = "kPacSetList")
    private Set<KPac> kPacList;
}
