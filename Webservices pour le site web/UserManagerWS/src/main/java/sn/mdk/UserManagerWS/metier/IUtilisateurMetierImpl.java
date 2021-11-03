package sn.mdk.UserManagerWS.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import sn.mdk.UserManagerWS.dao.IUtilisateurDAO;
import sn.mdk.UserManagerWS.model.Utilisateur;

import java.util.Collection;

@Transactional
public class IUtilisateurMetierImpl implements IUtilisateurMetier {
    @Autowired
    private IUtilisateurDAO iUtilisateurDAO;

    @Override
    public void ajout(Utilisateur u) {
        iUtilisateurDAO.ajout(u);
    }

    @Override
    public void modifier(Utilisateur u) {
        iUtilisateurDAO.modifier(u);
    }

    @Override
    public void supprimer(Long id) {
        iUtilisateurDAO.supprimer(id);
    }

    @Override
    public Utilisateur getUtilisateur(Long id) {
        return iUtilisateurDAO.getUtilisateur(id);
    }

    @Override
    public Collection<Utilisateur> lister() {
        return iUtilisateurDAO.lister();
    }
}
