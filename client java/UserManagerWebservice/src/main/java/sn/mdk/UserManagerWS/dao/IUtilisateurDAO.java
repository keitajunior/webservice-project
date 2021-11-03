package sn.mdk.UserManagerWS.dao;

import sn.mdk.UserManagerWS.model.Utilisateur;

import java.util.Collection;

public interface IUtilisateurDAO {
    public void ajout(Utilisateur u);
    public void modifier(Utilisateur u);
    public void supprimer(Long id);
    public Utilisateur getUtilisateur(Long id);
    public Collection<Utilisateur> lister();
}
