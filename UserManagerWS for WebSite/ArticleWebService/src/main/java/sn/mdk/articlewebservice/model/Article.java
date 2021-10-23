package sn.mdk.articlewebservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

import static javax.persistence.FetchType.LAZY;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private String contenu;
    private Date dateCreation;
    private Instant dateModification;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name ="categorie")
    private Categorie categorie;
}
