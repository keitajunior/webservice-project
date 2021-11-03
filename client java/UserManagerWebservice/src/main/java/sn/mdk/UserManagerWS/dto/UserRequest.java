package sn.mdk.UserManagerWS.dto;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "UserRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserRequest {

    @XmlElement(required = true)
    private Long id;
    @XmlElement(required = true)
    private String nom;
    @XmlElement(required = true)
    private String prenom;
    @XmlElement(required = true)
    private String login;
    @XmlElement(required = true)
    private String password;
    @XmlElement(required = true)
    private String role;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
