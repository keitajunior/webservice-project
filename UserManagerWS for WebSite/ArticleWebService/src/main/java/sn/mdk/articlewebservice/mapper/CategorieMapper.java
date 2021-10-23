package sn.mdk.articlewebservice.mapper;

import org.hibernate.id.uuid.StandardRandomStrategy;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sn.mdk.articlewebservice.dto.ArticleDto;
import sn.mdk.articlewebservice.dto.CategorieDto;
import sn.mdk.articlewebservice.model.Article;
import sn.mdk.articlewebservice.model.Categorie;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategorieMapper {

    @Mapping(target = "numberOfArticles", expression= "java(mapArticles(categorie.getArticles()))")
    CategorieDto mapToDto(Categorie categorie);

    default Integer mapArticles(List<Article> numberOfArticle){ return numberOfArticle.size();}

    @InheritInverseConfiguration
    @Mapping(target = "articles", ignore = true)
    Categorie map(CategorieDto categorieDto);


}
