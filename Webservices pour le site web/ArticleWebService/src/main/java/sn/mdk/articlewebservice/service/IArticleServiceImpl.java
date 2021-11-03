package sn.mdk.articlewebservice.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.mdk.articlewebservice.dto.ArticleDto;
import sn.mdk.articlewebservice.dto.TailleDto;
import sn.mdk.articlewebservice.exceptions.ArticleNotFoundException;
import sn.mdk.articlewebservice.exceptions.CategorieNotFoundException;
import sn.mdk.articlewebservice.mapper.ArticleMapper;
import sn.mdk.articlewebservice.model.Article;
import sn.mdk.articlewebservice.model.Categorie;
import sn.mdk.articlewebservice.repository.ArticleRepository;
import sn.mdk.articlewebservice.repository.CategorieRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class IArticleServiceImpl implements IArticleService {

    private final ArticleRepository articleRepository;
    private final CategorieRepository categorieRepository;
    private final ArticleMapper articleMapper;

    @Override
    public ArticleDto getArticle(Long id) {
        Article article = articleRepository.getById(id);
        return articleMapper.mapToDto(article);

    }

    @Override
    public Page<ArticleDto> listArticle(int page, int size) {
        List<ArticleDto> articleResponseList = articleRepository.findAll(PageRequest.of(page, size,Sort.by("dateModification").descending()))
                .stream()
                .map(articleMapper::mapToDto)
                .collect(Collectors.toList());
        return new PageImpl<>(articleResponseList);
    }

    @Override
    public String saveArticle(ArticleDto articleDto) {
        Categorie categorie = categorieRepository.findByLibelle(articleDto.getCategorieName());
        if (categorie == null) throw new CategorieNotFoundException(articleDto.getCategorieName().toString());
        Article article = articleMapper.map(articleDto,categorie);
        articleRepository.save(article);
        return "Ajout effectué avec succes";
    }

    @Override
    public String updateArticle(ArticleDto articleDto) {
            Categorie categorie = categorieRepository.findByLibelle(articleDto.getCategorieName());
            Article article = articleRepository.findByTitre(articleDto.getTitre());
            if (article == null) throw new ArticleNotFoundException(articleDto.getTitre().toString());
            Article articleAjour = articleMapper.map(articleDto,categorie);
            article.setContenu(articleAjour.getContenu());
            article.setCategorie(articleAjour.getCategorie());
            article.setDateCreation(articleAjour.getDateCreation());
            article.setDateModification(articleAjour.getDateModification());
            return "Mis a jour avec succes" ;
    }

    @Override
    public String deleteArticle(Long id) {
        articleRepository.deleteById(id);
        return "Suppression avec succes";
    }
    @Override
    public Page<ArticleDto> getArticlesByCategorie(Long categorieId,int page, int size) {
        Categorie categorie = categorieRepository.getById(categorieId);
        if (categorie == null) throw new CategorieNotFoundException("categorie introuvable");
        List<ArticleDto> articleResponseList = articleRepository.findAllByCategorie(categorie,PageRequest.of(page, size,Sort.by("dateCreation").descending()))
                .stream()
                .map(articleMapper::mapToDto)
                .collect(Collectors.toList());
        return new PageImpl<>(articleResponseList);
    }

    @Override
    public TailleDto numberArticle() {
        List<Article> articleList = articleRepository.findAll();
        TailleDto tailleDto = new TailleDto();
        tailleDto.setSize(articleList.size());
        return tailleDto;
    }

    @Override
    public List<ArticleDto> lister() {
        List<ArticleDto> articleResponseList = articleRepository.findAll(Sort.by("dateCreation").descending())
                .stream()
                .map(articleMapper::mapToDto)
                .collect(Collectors.toList());
        return articleResponseList;
    }


}
