package sn.mdk.articlewebservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategorieDto {
    private Long id;
    private String libelle;
    private int numberOfArticles;
}
