package sn.mdk.articlewebservice.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import sn.mdk.articlewebservice.dto.ArticleDto;
import sn.mdk.articlewebservice.model.Article;
import sn.mdk.articlewebservice.model.Categorie;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-03T09:48:37+0000",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class ArticleMapperImpl implements ArticleMapper {

    @Override
    public Article map(ArticleDto articleDto, Categorie categorie) {
        if ( articleDto == null && categorie == null ) {
            return null;
        }

        Article article = new Article();

        if ( articleDto != null ) {
            article.setDateCreation( articleDto.getDateCreation() );
            article.setTitre( articleDto.getTitre() );
            article.setContenu( articleDto.getContenu() );
        }
        if ( categorie != null ) {
            article.setCategorie( categorie );
        }
        article.setDateModification( java.time.Instant.now() );

        return article;
    }

    @Override
    public ArticleDto mapToDto(Article article) {
        if ( article == null ) {
            return null;
        }

        ArticleDto articleDto = new ArticleDto();

        articleDto.setId( article.getId() );
        articleDto.setTitre( article.getTitre() );
        articleDto.setContenu( article.getContenu() );
        articleDto.setDateCreation( article.getDateCreation() );
        articleDto.setDateModification( article.getDateModification() );

        articleDto.setCategorieName( article.getCategorie().getLibelle() );

        return articleDto;
    }
}
