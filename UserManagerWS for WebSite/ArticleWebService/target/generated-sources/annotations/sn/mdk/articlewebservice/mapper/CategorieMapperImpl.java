package sn.mdk.articlewebservice.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import sn.mdk.articlewebservice.dto.CategorieDto;
import sn.mdk.articlewebservice.model.Categorie;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-03T09:48:37+0000",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class CategorieMapperImpl implements CategorieMapper {

    @Override
    public CategorieDto mapToDto(Categorie categorie) {
        if ( categorie == null ) {
            return null;
        }

        CategorieDto categorieDto = new CategorieDto();

        categorieDto.setId( categorie.getId() );
        categorieDto.setLibelle( categorie.getLibelle() );

        categorieDto.setNumberOfArticles( mapArticles(categorie.getArticles()) );

        return categorieDto;
    }

    @Override
    public Categorie map(CategorieDto categorieDto) {
        if ( categorieDto == null ) {
            return null;
        }

        Categorie categorie = new Categorie();

        categorie.setId( categorieDto.getId() );
        categorie.setLibelle( categorieDto.getLibelle() );

        return categorie;
    }
}
