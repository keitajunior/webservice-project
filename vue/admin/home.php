<?php
  require_once("inctwo/entete.php");
  require_once("inctwo/menu.php");
?>
<body>
  <?php
     if (isset($_SESSION['id'])){
        if (isset ($_SESSION['message'])):?>
          <div class="alert alert-info">
           <?php echo $_SESSION['message'];?> 
          </div>
        <?php endif;
        if (empty($articles)){?>
          <div class="main">
            <h2>Aucun article trouvé</h2>
            <p>aucun article correspondant n'a été trouvé</p>
          </div>
        <?php 
        } 
        else{?>
        <div class="row">
          <div class="col-sm-10 mx-auto">
            <table class="table table-hover">
              <thead>
                <tr>
                  <th scope="col">ID</th>
                  <th scope="col">Titre</th>
                  <th scope="col">Contenue</th>
                  <th scope="col">date creation</th>
                  <th scope="col">Nom categorie</th>
                  <th scope="col" colspan="2">Actions</th>
                </tr>
              </thead>
              <tbody>
              <?php 
                foreach ($articles as $article):?>
                  <tr>
                    <td><?=$article['id']?></td>
                    <td><?=$article['titre']?></td>
                    <td><?=substr($article['contenu'],0,15)?></td>
                    <td><?=$article['dateCreation']?></td>
                    <td><?=$article['categorieName']?></td>
                    <td><a href="index.php?admin=article&option=update&id=<?=$article['id']?>">Modifier</a></td>
                    <td><a href="index.php?admin=article&option=delete&id=<?=$article['id']?>">Supprimer</a></td>
                  </tr>
                <?php endforeach;?>
              </tbody>    
          </table>
      <?php }?>
         </div>
        </div>
    <?php
  } ?>           
</body>
<?php require_once("inctwo/footer.php");?>