<?php 
  function showHomePage($numPage){
    $articles = getListArticles($numPage);
    $categories = getListCategories();
    $data = getSizeOfArticles();
    require_once 'vue/article-list.php';
  }

  function showCategoryPage($idCategorie){
    $articles = getArticlesByCategory($idCategorie);
    $categories = getListCategories();
    $data = $categories;
    require_once 'vue/article-list.php';

  }

  function showErrorPage(){
    require_once 'vue/error-page.php';
  }
  function showArticleById($idArticle){

    $articleItem = getArticleById($idArticle);
    $categories = getListCategories();

    require_once 'vue/article-list.php';
  }
  function showAdminHomePage(){
    $articles = getListArticlesList();
    require_once 'vue/admin/home.php';
  }
 

 