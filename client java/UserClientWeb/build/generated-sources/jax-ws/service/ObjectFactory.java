
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Ajout_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "ajout");
    private final static QName _ListerResponse_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "listerResponse");
    private final static QName _AjoutResponse_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "ajoutResponse");
    private final static QName _Modifier_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "modifier");
    private final static QName _GetUserByIdResponse_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "getUserByIdResponse");
    private final static QName _Lister_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "lister");
    private final static QName _GetUserById_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "getUserById");
    private final static QName _ModifierResponse_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "modifierResponse");
    private final static QName _Authentication_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "authentication");
    private final static QName _SupprimerResponse_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "supprimerResponse");
    private final static QName _Supprimer_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "supprimer");
    private final static QName _Utilisateur_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "utilisateur");
    private final static QName _AuthenticationResponse_QNAME = new QName("http://service.UserManagerWS.mdk.sn/", "authenticationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModifierResponse }
     * 
     */
    public ModifierResponse createModifierResponse() {
        return new ModifierResponse();
    }

    /**
     * Create an instance of {@link Lister }
     * 
     */
    public Lister createLister() {
        return new Lister();
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link GetUserByIdResponse }
     * 
     */
    public GetUserByIdResponse createGetUserByIdResponse() {
        return new GetUserByIdResponse();
    }

    /**
     * Create an instance of {@link AjoutResponse }
     * 
     */
    public AjoutResponse createAjoutResponse() {
        return new AjoutResponse();
    }

    /**
     * Create an instance of {@link Modifier }
     * 
     */
    public Modifier createModifier() {
        return new Modifier();
    }

    /**
     * Create an instance of {@link Ajout }
     * 
     */
    public Ajout createAjout() {
        return new Ajout();
    }

    /**
     * Create an instance of {@link ListerResponse }
     * 
     */
    public ListerResponse createListerResponse() {
        return new ListerResponse();
    }

    /**
     * Create an instance of {@link AuthenticationResponse }
     * 
     */
    public AuthenticationResponse createAuthenticationResponse() {
        return new AuthenticationResponse();
    }

    /**
     * Create an instance of {@link Utilisateur }
     * 
     */
    public Utilisateur createUtilisateur() {
        return new Utilisateur();
    }

    /**
     * Create an instance of {@link Supprimer }
     * 
     */
    public Supprimer createSupprimer() {
        return new Supprimer();
    }

    /**
     * Create an instance of {@link SupprimerResponse }
     * 
     */
    public SupprimerResponse createSupprimerResponse() {
        return new SupprimerResponse();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ajout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "ajout")
    public JAXBElement<Ajout> createAjout(Ajout value) {
        return new JAXBElement<Ajout>(_Ajout_QNAME, Ajout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "listerResponse")
    public JAXBElement<ListerResponse> createListerResponse(ListerResponse value) {
        return new JAXBElement<ListerResponse>(_ListerResponse_QNAME, ListerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "ajoutResponse")
    public JAXBElement<AjoutResponse> createAjoutResponse(AjoutResponse value) {
        return new JAXBElement<AjoutResponse>(_AjoutResponse_QNAME, AjoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "modifier")
    public JAXBElement<Modifier> createModifier(Modifier value) {
        return new JAXBElement<Modifier>(_Modifier_QNAME, Modifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "getUserByIdResponse")
    public JAXBElement<GetUserByIdResponse> createGetUserByIdResponse(GetUserByIdResponse value) {
        return new JAXBElement<GetUserByIdResponse>(_GetUserByIdResponse_QNAME, GetUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "lister")
    public JAXBElement<Lister> createLister(Lister value) {
        return new JAXBElement<Lister>(_Lister_QNAME, Lister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "getUserById")
    public JAXBElement<GetUserById> createGetUserById(GetUserById value) {
        return new JAXBElement<GetUserById>(_GetUserById_QNAME, GetUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "modifierResponse")
    public JAXBElement<ModifierResponse> createModifierResponse(ModifierResponse value) {
        return new JAXBElement<ModifierResponse>(_ModifierResponse_QNAME, ModifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "supprimerResponse")
    public JAXBElement<SupprimerResponse> createSupprimerResponse(SupprimerResponse value) {
        return new JAXBElement<SupprimerResponse>(_SupprimerResponse_QNAME, SupprimerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Supprimer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "supprimer")
    public JAXBElement<Supprimer> createSupprimer(Supprimer value) {
        return new JAXBElement<Supprimer>(_Supprimer_QNAME, Supprimer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Utilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "utilisateur")
    public JAXBElement<Utilisateur> createUtilisateur(Utilisateur value) {
        return new JAXBElement<Utilisateur>(_Utilisateur_QNAME, Utilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.UserManagerWS.mdk.sn/", name = "authenticationResponse")
    public JAXBElement<AuthenticationResponse> createAuthenticationResponse(AuthenticationResponse value) {
        return new JAXBElement<AuthenticationResponse>(_AuthenticationResponse_QNAME, AuthenticationResponse.class, null, value);
    }

}
