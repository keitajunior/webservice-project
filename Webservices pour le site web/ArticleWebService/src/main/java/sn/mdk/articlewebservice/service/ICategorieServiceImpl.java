package sn.mdk.articlewebservice.service;

import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.mdk.articlewebservice.dto.CategorieDto;
import sn.mdk.articlewebservice.exceptions.CategorieNotFoundException;
import sn.mdk.articlewebservice.mapper.CategorieMapper;
import sn.mdk.articlewebservice.model.Categorie;
import sn.mdk.articlewebservice.repository.CategorieRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class ICategorieServiceImpl implements ICategorieService{

    private final CategorieRepository categorieRepository;
    private final CategorieMapper categorieMapper;
    @Override
    public String addCategorie(CategorieDto cat) {
        Categorie categorie = categorieMapper.map(cat);
        categorieRepository.save(categorie);
        return "Adding successfully";
    }

    @Override
    public List<CategorieDto> listCategorie() {
        return categorieRepository.findAll()
                .stream()
                .map(categorieMapper::mapToDto)
                .collect(Collectors.toList())
         ;
    }

    @Override
    public CategorieDto getCategorieById(Long id) {
        Categorie categorie = categorieRepository.getById(id);
        return categorieMapper.mapToDto(categorie);
    }

    @Override
    public String updateCategorie(CategorieDto cat) {
        Categorie categorie = categorieMapper.map(cat);
        categorieRepository.save(categorie);
        return "Mis à jour éffectué avec succes";
    }

    @Override
    public String deleteCategorie(Long id) {
        categorieRepository.deleteById(id);
        return "Suppression effectuée avec succes";
    }
}
