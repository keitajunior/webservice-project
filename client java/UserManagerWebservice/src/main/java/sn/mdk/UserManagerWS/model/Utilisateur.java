package sn.mdk.UserManagerWS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@XmlRootElement
@Entity
@Table(name="USERS")
@XmlAccessorType(XmlAccessType.FIELD)
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Utilisateur {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
   @Column(nullable = false)
    private String nom;
   @Column(nullable = false)
    private String prenom ;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String role;
    
}

