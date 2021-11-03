package sn.mdk.articlewebservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import sn.mdk.articlewebservice.dto.ArticleDto;
import sn.mdk.articlewebservice.dto.TailleDto;
import sn.mdk.articlewebservice.service.IArticleService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ArticleController {

    private final IArticleService iArticleService;

    @GetMapping("/articles")
    public Page<ArticleDto> listArticle(@RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "4") int size){
        return iArticleService.listArticle(page, size);
    }
    @GetMapping("/admin/articles")
    public List<ArticleDto> listForAdminTreatement(){
        return iArticleService.lister();
    }
    @GetMapping("/articlesize")
    public TailleDto getNumberOfArticle(){
        return  iArticleService.numberArticle();
    }

    @GetMapping("/articles/{id}")
    public ArticleDto showArticleById(@PathVariable Long id){
        return iArticleService.getArticle(id);
    }

    @GetMapping("/by-categorie/{id}")
    public Page<ArticleDto> showArticlesBycategory(@PathVariable Long id,
                                                   @RequestParam(defaultValue = "0") int page,
                                                   @RequestParam(defaultValue = "4") int size){
        return iArticleService.getArticlesByCategorie(id,page,size);
    }

    @PostMapping("/articles")
    public String saveArticle(@RequestBody ArticleDto articleDto) {
        return iArticleService.saveArticle(articleDto);
    }

    @PutMapping("/articles")
    public String updateArticle(@RequestBody ArticleDto articleDto ){
        return iArticleService.updateArticle(articleDto);
    }

    @DeleteMapping("/articles/{id}")
    public String deleteArticle(@PathVariable Long id){
        return iArticleService.deleteArticle(id);
    }
}
