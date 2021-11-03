package sn.mdk.UserManagerWS.dto;

import sn.mdk.UserManagerWS.model.Utilisateur;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "UserResponse")
public class UserResponse {
    private Utilisateur utilisateur;

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
