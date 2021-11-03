package sn.mdk.articlewebservice.service;


import org.springframework.data.domain.Page;
import sn.mdk.articlewebservice.dto.ArticleDto;
import sn.mdk.articlewebservice.dto.TailleDto;
import sn.mdk.articlewebservice.model.Article;


import java.util.List;

public interface IArticleService {
    public ArticleDto getArticle(Long id);
    public Page<ArticleDto> listArticle(int page, int size);
    public String saveArticle(ArticleDto a);
    public String updateArticle(ArticleDto a);
    public String deleteArticle(Long id);
    //public List<ArticleDto> getArticlesByCategorie(Long categorie,int page,int size);
    public Page<ArticleDto> getArticlesByCategorie(Long categorieId, int page, int size);
    public TailleDto numberArticle ();
    public List<ArticleDto> lister();
}
