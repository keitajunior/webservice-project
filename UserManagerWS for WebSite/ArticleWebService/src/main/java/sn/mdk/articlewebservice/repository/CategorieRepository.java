package sn.mdk.articlewebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.mdk.articlewebservice.model.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    public Categorie findByLibelle(String categorieName);
}
