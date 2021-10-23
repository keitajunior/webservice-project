<?php
  require_once 'controleur/category-controller.php';
  require_once 'controleur/maincontroleur.php';
  require_once 'controleur/article-controleur.php';
  require_once 'modele/gestion-article.php';
  require_once 'modele/database.php';
  
  
  if (isset($_GET['idCategory'])){

    $idCategory = (int) $_GET['idCategory'];

    if($idCategory > 0){
      showCategoryPage($idCategory);
    }
    else {
      showErrorPage();
    }
  }
  elseif (isset($_GET['idArticle'])){

    $idArticle = (int) $_GET['idArticle'];

    if($idArticle > 0){
      showArticleById($idArticle);
    }
    else {
      showErrorPage();
    }
  }
  elseif (isset($_SESSION['id'],$_SESSION['login'],$_SESSION['role'])){
    showAdminHomePage();
  }
  elseif (isset($_GET['admin'])){
    if ( $_GET['admin'] == 'article' && $_GET['option'] == 'add' ){
      showAddArticleform();
    }
    elseif ( $_GET['admin'] == 'category' && $_GET['option'] == 'add' ){

      showAddCategoryForm();

    }
    elseif ( $_GET['admin'] == 'category' && $_GET['option'] == 'store' ){

      storeCategory();

    }
    elseif ( $_GET['admin'] == 'article' && $_GET['option'] == 'update' ){

      $id = (int) $_GET['id'];
      editArticle($id);

    }
    elseif ( $_GET['admin'] == 'article' && $_GET['option'] == 'store' ){
      storeArticle();
    }
    elseif ( $_GET['admin'] == 'article' && $_GET['option'] == 'delete' ){

      $id = (int) $_GET['id'];
      deleteArticle($id);

    }
    else{
      showArticleList();
    }

  }
  elseif (isset ($_GET['page'])){
    $num = (int) $_GET['page'];
    showHomePage($num);
  }
  else{
    showHomePage(0);
  }
  

  