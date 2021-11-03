package sn.mdk.articlewebservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.mdk.articlewebservice.model.Article;
import sn.mdk.articlewebservice.model.Categorie;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
    Article findByTitre(String titre);

    List<Article> findAllByCategorie(Categorie categorie,Pageable pageable);

    Page<Article> findAll(Pageable pageable);
}
