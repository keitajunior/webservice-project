package sn.mdk.UserManagerWS.metier;

import sn.mdk.UserManagerWS.model.Utilisateur;

import java.util.Collection;

public interface IUtilisateurMetier {
    public void ajout(Utilisateur u);
    public void modifier(Utilisateur u);
    public void supprimer(Long id);
    public Utilisateur getUtilisateur(Long id);
    public Collection<Utilisateur> lister();
}
