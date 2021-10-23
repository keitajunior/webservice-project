<?php
  
   function showArticleList(){
      $categories = getListCategories();
      $articles = getListArticlesList();
      require_once 'vue/admin/home.php';
    }

   function showAddArticleform(){
    $categories = getListCategories();

    require_once 'vue/admin/article-add.php';
    }

  function storeArticle(){

    $categories = getListCategories();
    $articles = getListArticlesList();

    $resultat = ajoutArticle();
    if ($resultat){
      $_SESSION['message'] = $resultat['message'];
      require_once 'vue/admin/home.php';
    }
    else {
      $_SESSION['message'] = $resultat['message'];
      require_once 'vue/admin/article-add.php';
    }
    
  }

  function editArticle($id){

    $option = 'update';
    $article = getArticleById($id);
    $categories = getListCategories();

    require_once 'vue/admin/article-add.php';

  }

  function deleteArticle($id){
    $article = getArticleById($id);
    $message =delete($article['id']);

    require_once('vue/admin/supprimerArticle.php');
  }