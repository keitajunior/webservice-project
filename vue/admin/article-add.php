<?php
  require_once("inctwo/entete.php");
  require_once("inctwo/menu.php");
  ?>
<body>
<div class="row my-4">
      <?php if (isset($_SESSION['message'])):?>
          <div class="alert alert-info " role="alert"><?php echo $_SESSION['message'];?></div>
      <?php endif;?>
   <div class="col-sm-6 mx-auto">
      <div class="card text-center">
        <div class="card-header">
        <?=isset($option) ? 'Modification' :'Ajout' ?> d'un Article
        </div>
        <div class="card-body">
          <h5 class="card-title ">Veuiller renseigner :<?=isset($option) ? 'Modification' :'Ajout' ?> d'un Article </h5>

            <form action="index.php?admin=article&option=store" method="post">
                <div class="mb-3 row">
                  <label for="nom" class="col-sm-3 col-form-label">Titre<em>*</em></label>
                  <div class="col-sm-6 ">
                    <input id="titre" class="form-control" type="text" placeholder="lutte" name="titre" value="<?=isset($article) ? $article['titre'] :''?>"  required="">
                  </div>
                </div>
                <div class="mb-3 row">
                  <label for="contenu" class="col-sm-3 col-form-label">contenu de l'article</label>
                  <div class="col-sm-6">
                    <textarea id="contenu" name="contenu"class="form-control" ><?=isset($article) ? $article['contenu'] :''?></textarea>
                  </div>
                </div>
                <div class="mb-3 row">
                  <label for="dateCreation" class="col-sm-3 col-form-label">Date creation<em>*</em></label>
                  <div class="col-sm-6">
                    <input id="dateCreation" type="date" class="form-control" name="dateCreation" value="<?=isset($article) ? $article['dateCreation'] :''?>"  required="">
                  </div>
                </div>
                <div class="mb-3 row">
                  <label for="categorie" class="col-sm-3 col-form-label">Categorie</label>
                  <select id="categorie" name="categorie" class="col-sm-6">
                        <?php foreach($categories as $category) :?>
                        <option value="<?=$category['libelle']?>" <?=(isset($article['categorieName']) && $article['categorieName']== $category['libelle']) ? 'selected' : ''?> ><?= $category['libelle'] ?></option>
                        <?php endforeach;?> 
                  </select>
                </div>
                <div>
                  <button type="submit" class="btn btn-primary rounded-pill"><?=isset($option) ? 'Modifier' :'Ajouter' ?></button>
                </div>   
            </form>
        </div>
      </div> 
    </div>
  </div> 
</body>
  <?php require_once("inctwo/footer.php");
?>