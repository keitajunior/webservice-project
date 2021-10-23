package sn.mdk.UserManagerWS.service;

import org.springframework.stereotype.Service;

import sn.mdk.UserManagerWS.dto.IdRequest;

import sn.mdk.UserManagerWS.model.Utilisateur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import java.util.List;

@Service
public class UtilisateurWebServiceImpl implements UtilisateurWebService {

    private final EntityManagerFactory entityManagerFactory;

    public UtilisateurWebServiceImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }
    @Override
    public String ajout(Utilisateur utilisateur) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(utilisateur);
        entityManager.getTransaction().commit();
        return "Utilisateur "+ utilisateur.getId()+" ajouté avec succes";
    }


    @Override
    public String modifier(Utilisateur utilisateur) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Utilisateur user = entityManager.find(Utilisateur.class, utilisateur.getId());
        if (user == null) return "Utilisateur "+ utilisateur.getId()+" non trouvé";
        else {
            entityManager.merge(utilisateur);
            entityManager.getTransaction().commit();
        }
        return "Utilisateur "+ utilisateur.getId()+" a été mis a jour";
    }

    @Override
    public Utilisateur getUserById(IdRequest idRequest) {

        Long id = idRequest.getId();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Utilisateur user = entityManager.find(Utilisateur.class, id);
        if (user == null) throw new RuntimeException("Utilisateur inexistant");
        //entityManager.getTransaction().commit();
        return user;
    }

    @Override
    public String supprimer(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Utilisateur user = entityManager.find(Utilisateur.class, id);
        if (user == null) return "Utilisateur "+id+" non Trouvé";
        else {
            entityManager.remove(user);
            entityManager.getTransaction().commit();
        }
       return "Suppression effectuée avec succes";
    }

    @Override
    public List<Utilisateur> lister() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query req=entityManager.createQuery("select u from Utilisateur u");
        return req.getResultList();
    }

    @Override
    public Utilisateur authentication(String log, String pass) {
        /*String login = loginRequest.getLogin();
        String password  = loginRequest.getPassword();*/

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select a from Utilisateur a where a.login =:login and a.password=:password");
        query.setParameter("login", log);
        query.setParameter("password", pass);
        Utilisateur user = (Utilisateur) query.getSingleResult();
        if (user ==null ) throw new RuntimeException("login ou mot de passe incrorrecte");
        return user ;
        //entityManager.getTransaction().commit();
    }
}
