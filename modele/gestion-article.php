<?php
  function validerDonneesArticle(){
    if (isset($_POST['titre'],$_POST['categorie'],$_POST['contenu']) && !empty($_POST['titre']) && !empty($_POST['contenu']) && !empty($_POST['categorie'])){

      $validateData = [];
      $validateData['titre'] = htmlentities($_POST['titre']);
      $validateData['contenu'] = htmlentities($_POST['contenu']);
      $validateData['categorie'] =htmlentities($_POST['categorie']);
      $validateData['dateCreation'] = $_POST['dateCreation'];


      return $validateData;
    }else{
      return null;
    }
  }
  function ajoutArticle(){
    $resultat = [];
    $resultat['status'] =false;
    $resultat['message'] = "Erreur lors de l'ajout";
    $validateData = validerDonneesArticle();
   
    if($validateData != null){
        $status= addArticle($validateData['titre'],$validateData['contenu'],$validateData['dateCreation'],$validateData['categorie']);

        if($status){
          $resultat['message'] = "Ajout effectué";
          $resultat['status'] =true;
        }
      }
      return $resultat;

    }
?>
  
 