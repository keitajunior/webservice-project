package sn.mdk.UserManagerWS.dao;

import sn.mdk.UserManagerWS.model.Utilisateur;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

public class IUtilisateurDAOImpl implements IUtilisateurDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void ajout(Utilisateur u) {
        entityManager.persist(u);
    }

    @Override
    public void modifier(Utilisateur u) {
        Utilisateur user = getUtilisateur(u.getId());
        if (user != null){
            entityManager.persist(u);
        }
    }

    @Override
    public void supprimer(Long id) {
        Utilisateur user = getUtilisateur(id);
        entityManager.remove(user);
    }

    @Override
    public Utilisateur getUtilisateur(Long id) {
        Utilisateur user = entityManager.find(Utilisateur.class, id);
        if (user == null ) throw new RuntimeException("Utilisateur introuvabble");
        return user;
    }

    @Override
    public Collection<Utilisateur> lister() {
        Query req=entityManager.createQuery("select u from Utilisateur u");
        return req.getResultList();
    }
}
