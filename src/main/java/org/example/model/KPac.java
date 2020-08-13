package org.example.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "c_pacs")
public class KPac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 250)
    private String title;
    @Column(length = 20000)
    private String description;
    private LocalDate time;
    @ManyToMany
    @JoinTable(
            name = "key_table_id",
            joinColumns = @JoinColumn(name = "kpac_id"),
            inverseJoinColumns = @JoinColumn(name = "kpacset_id"))
    private Set<KPacSet> kPacSetList;
}
