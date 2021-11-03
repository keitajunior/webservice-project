package sn.mdk.articlewebservice.service;

import sn.mdk.articlewebservice.dto.CategorieDto;
import sn.mdk.articlewebservice.model.Categorie;

import java.util.List;

public interface ICategorieService {

    String addCategorie(CategorieDto cat);
    List<CategorieDto> listCategorie();
    CategorieDto getCategorieById(Long id);
    String updateCategorie(CategorieDto cat);
    String deleteCategorie(Long id);

}
