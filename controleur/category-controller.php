<?php 
    function showAddCategoryForm(){
      require_once 'vue/admin/categorie-add.php';
    }

  function storeCategory(){

    $categories = getListCategories();
    $articles = getListArticlesList();

    $resultat = ajoutCategory();
    if ($resultat['status'] ==true){
      $_SESSION['message'] = $resultat['message'];
      require_once 'vue/admin/home.php';
    }
    else {
      $_SESSION['message'] = $resultat['message'];
      require_once 'vue/admin/categorie-add.php';
    }
    
  }