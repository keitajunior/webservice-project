package sn.mdk.articlewebservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sn.mdk.articlewebservice.dto.ArticleDto;
import sn.mdk.articlewebservice.model.Article;
import sn.mdk.articlewebservice.model.Categorie;



@Mapper(componentModel = "spring")
public interface ArticleMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "titre", source = "articleDto.titre")
    @Mapping(target = "contenu", source = "articleDto.contenu")
    @Mapping(target = "dateModification", expression = "java(java.time.Instant.now())")
    @Mapping(target = "dateCreation", source = "articleDto.dateCreation")
    @Mapping(target = "categorie", source = "categorie")
    Article map(ArticleDto articleDto, Categorie categorie);


    @Mapping(target = "categorieName", expression = "java(article.getCategorie().getLibelle())")
    ArticleDto mapToDto(Article article);
}
