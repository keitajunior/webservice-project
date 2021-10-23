<?php
  require_once("inc/entete.php");
  require_once("inc/menu.php");
  ?>
<body>
    <?php 
        if (isset($articles['content']) && empty($articles['content'])){?>
        <div class="main">
          <h2>Aucun article trouvé</h2>
          <p>aucun article correspondant n'a été trouvé</p>
        </div>
    <?php 
    }
    elseif (isset($articles)){
      //  echo "<pre>";
      // print_r($articles);
      // echo"</pre>"; 
      //echo "<pre>";
      //   print_r($data);
      //echo"</pre>"; 
      
      if (isset($articles['content'])){
        $donnees = $articles['content'];
      }
      else $donnees = $articles;
      foreach ($donnees as $article): ?>                                           
            <div class="main">
              <a href="index.php?idArticle=<?=$article['id']?>">
                <h1><?=$article['titre']?></h1>
                <p>
                    <?=$article['contenu']?>
                </p>
              </a>
            </div>
      <?php         
      endforeach;
    } 
    elseif (isset ($articleItem)){?>

      <h1><?=$articleItem['titre']?></h1>
        <p>
          <?=$articleItem['contenu']?>
        </p>
    <?php }
    if (isset ($data)){
      if (isset($data['size'])){
        $numberOfPages = (int) $data["size"] / 4;   
      }
      else {
        foreach($data as $cat){
          if ($cat['id'] == $_GET['idCategory']){
            $numberOfPages = (int) $cat['numberOfArticles'] / 4;
          }
        }
      }
    }
    
   if(isset($numberOfPages)){?>
    <nav aria-label="Page navigation example">
      <ul class="pagination justify-content-center">
        <?php
          for ($i=0; $i < $numberOfPages ; $i++) { ?>
            <li class="page-item"><a class="page-link" href="index.php?page=<?=$i?>"><?=$i?></a></li>
        <?php }
        } ?>   
      </ul>
    </nav> 
</body>
<?php require_once("inc/footer.php");
?>
