package sn.mdk.articlewebservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {
    private Long id;
    private String titre;
    private String contenu;
    private Date dateCreation;
    private Instant dateModification;
    private String categorieName;
}
