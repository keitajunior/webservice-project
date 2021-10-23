<?php
  function getList($param) {
    $jsonData = file_get_contents("http://localhost:8081/".$param."");
            
    /* Verifie si JSON est vide */
    if (strlen($jsonData) > 0) {
        /* Decoder JSON */
        $data = json_decode($jsonData, true);
        /* Verifie les erreurs et le format final */
        if (!(json_last_error() == JSON_ERROR_NONE and is_array($data)))
            die('Données JSON invalides.');
    } else
        die('Aucune données JSON.');
    return $data;
  }

  function getListArticles($numPage){
    return getList('articles?page='.$numPage);
  }
 
  function getListCategories(){
    return getList('categories');
  }

  function getArticlesByCategory($id){
    $param ='by-categorie/'.$id.'';
    return getList($param);
  }
  
  function addArticle($titre,$contenu,$dateCreation,$category){
    /* Creation des donnees */
    $data = array(
      'titre'        => $titre,
      'contenu'      => $contenu,
      'dateCreation' => $dateCreation,
      'categorieName' => $category
    );
    $verb = 'POST';     
        $articles= getListArticlesList();
        foreach($articles as $article){
          if ($article['titre'] == $titre){
            $url = "http://localhost:8081/articles/";
            $method = "PUT";
            $resultat= CallAPI($method, $url,$data);
            return $resultat;
          }
        }

        /* Creation des options de contexte */
        $options = array(
          'http' => array(
              'method'  => $verb,
              'header'  => "Content-Type: application/json",
              'ignore_errors' => true,
              'timeout' =>  10,
              'content' => json_encode($data),
          ),
        );


        /* Creation du contexte HTTP */
        $context  = stream_context_create($options);

        /* Execution de la requete */
        return file_get_contents('http://localhost:8081/articles', false, $context);
   }

   function getArticleById($id){
     $param = 'articles/'.$id.'';
     return getList($param);
   }

   function getSizeOfArticles(){
    $jsonData = file_get_contents("http://localhost:8081/articlesize");
            
    /* Verifie si JSON est vide */
    if (strlen($jsonData) > 0) {
        /* Decoder JSON */
        $data = json_decode($jsonData, true);
        /* Verifie les erreurs et le format final */
        if (!(json_last_error() == JSON_ERROR_NONE and is_array($data)))
            die('Données JSON invalides.');
    } else
        die('Aucune données JSON.');
    return $data;
   }

   function getListArticlesList(){
    return getList('admin/articles');
  }

  function delete($id){
   
    $url = "http://localhost:8081/articles/".$id;
    $method = "DELETE";
    $data = false;
    return CallAPI($method, $url,$data);
    
  }

  function addCategory($libelle){
    /* Creation des donnees */
    $data = array(
      'libelle'   => $libelle,
    );
    $verb = 'POST';     

    /* Creation des options de contexte */
    $options = array(
        'http' => array(
        'method'  => $verb,
        'header'  => "Content-Type: application/json",
        'ignore_errors' => true,
        'timeout' =>  10,
        'content' => json_encode($data),
        ),
      );


    /* Creation du contexte HTTP */
    $context  = stream_context_create($options);

    /* Execution de la requete */
    file_get_contents('http://localhost:8081/categories', false, $context);
  }

  function ajoutCategory(){
    $resultat = [];
    $resultat['status'] =false;
    $resultat['message'] = "Erreur lors de l'ajout";
    if (isset($_POST['libelle'])){
      $validateData['libelle'] = htmlentities($_POST['libelle']);
    }
    
   
    if($validateData != null){
        $status= addCategory($validateData['libelle']);

        if($status){
          $resultat['message'] = "Ajout effectué";
          $resultat['status'] =true;
        }
      }
      return $resultat;

    }


    function CallAPI($method, $url, $data)
    {
      $curl = curl_init();

      switch ($method)
      {
          case "PUT":
              curl_setopt($curl, CURLOPT_CUSTOMREQUEST, "PUT");
              if ($data)
              curl_setopt($curl, CURLOPT_POSTFIELDS,json_encode($data));
              break;
          default:
              curl_setopt($curl, CURLOPT_CUSTOMREQUEST, $method);
            break;
      }
  
    $headers = array(
        "Content-Type: application/json",
    );
     curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
      curl_setopt($curl, CURLOPT_URL, $url);
      curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);

      $result = curl_exec($curl);

      curl_close($curl);
      return $result;

    }

?>