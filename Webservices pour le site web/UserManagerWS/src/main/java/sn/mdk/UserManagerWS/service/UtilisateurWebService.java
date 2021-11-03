package sn.mdk.UserManagerWS.service;

import sn.mdk.UserManagerWS.dto.IdRequest;
import sn.mdk.UserManagerWS.model.Utilisateur;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Collection;

@WebService (name = "UserWebService")
public interface UtilisateurWebService {
    @WebMethod
    public String ajout(Utilisateur user);
    @WebMethod
    public String modifier(Utilisateur u);
    @WebMethod
    public Utilisateur getUserById(IdRequest u);
    @WebMethod
    public String supprimer(Long id);
    @WebMethod
    public Collection<Utilisateur> lister();
    @WebMethod
    public Utilisateur authentication(@WebParam(name="login") String log,@WebParam(name = "password") String pass);
}
