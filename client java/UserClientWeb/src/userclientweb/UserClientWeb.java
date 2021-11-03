/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userclientweb;

import java.util.List;
import java.util.Scanner;
import service.UserWebService;
import service.UtilisateurWebServiceImplService;
import service.Utilisateur;

/**
 *
 * @author AZIZ
 */
public class UserClientWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserWebService stub = new UtilisateurWebServiceImplService().getUtilisateurWebServiceImplPort();

        String saisie = null;
        Utilisateur user1 = new Utilisateur();

        do {
            System.out.println("***********************************");
            System.out.println("Veuillez choisir dans le menu");
            System.out.println(" 1 : Ajouter");
            System.out.println(" 2 : Modifier");
            System.out.println(" 3 : Suprimer");
            System.out.println(" 4 :  Lister");
            System.out.println(" 5 : Exit");
            System.out.println("***********************************");
            System.out.println("Choissez une Rubrique:   ");
            
            saisie = sc.nextLine();
            
            switch (saisie) {

                case "1":
                    System.out.println("***********************************");
                    System.out.println("Donnez votre Nom");
                    user1.setNom(sc.nextLine());
                    System.out.println("Donnez votre Prenom");
                    user1.setPrenom(sc.nextLine());
                    System.out.println("Donnez votre Login");
                    user1.setLogin(sc.nextLine());
                    System.out.println("Donnez votre Password");
                    user1.setPassword(sc.nextLine());
                    System.out.println("Quel est votre Role");
                    user1.setRole(sc.nextLine());
                    System.out.println(stub.ajout(user1));
                    System.out.println("***********************************");
                    sc.nextLine();
                    
                    break;

                case "2":
                    System.out.println("***********************************");
                    System.out.println("Donnez votre identifiant");
                    user1.setId(sc.nextLong());
                    sc.nextLine();
                    System.out.println("Donnez votre Nom");
                    user1.setNom(sc.nextLine());
                    System.out.println("Donnez votre Prenom");
                    user1.setPrenom(sc.nextLine());
                    System.out.println("Donnez votre Login");
                    user1.setLogin(sc.nextLine());
                    System.out.println("Donnez votre Password");
                    user1.setPassword(sc.nextLine());
                    System.out.println("Quel est votre Role");
                    user1.setRole(sc.nextLine());
                    System.out.println(stub.modifier(user1));
                    System.out.println("***********************************");
                    sc.nextLine();
                    break;

                case "3":
                    System.out.println("***********************************");
                    System.out.println("Donnez L'Identifiant");
                    Long id = sc.nextLong();
                    System.out.println(stub.supprimer(id));
                    System.out.println("***********************************");
                    sc.nextLine();
                    break;

                case "4":
                    List<Utilisateur> listeUtilisateurs = stub.lister();
                    for (Utilisateur user : listeUtilisateurs) {

                        System.out.println("********************************");
                        System.out.println("ID : " + user.getId());
                        System.out.println("Nom : " + user.getNom());
                        System.out.println("Prenom : " + user.getPrenom());
                        System.out.println("Login: " + user.getLogin());
                        System.out.println("Password : " + user.getPassword());
                        System.out.println("Role : " + user.getRole());
                        System.out.println("********************************");
                    }
                    sc.nextLine();

                    break;

                case "5":
                    System.exit(0);
                    break;

            }

        } while (!saisie.equals("5"));

    }

}
