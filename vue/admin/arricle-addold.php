<!-- <div class="principle">
<?php if (isset($_SESSION['message'])):?>
          <div class="alert"><?=$_SESSION['message']?></div>
      <?php endif;?>
      <h2><?=isset($option) ? 'Modification' :'Ajout' ?> d'un Article</h2>
      <form action="index.php?admin=article&option=store" method="post">
        <fieldset>
          <legend><?=isset($option) ? 'Modification' :'Ajout' ?> d'un Article</legend>
            <label for="titre">Titre<em>*</em></label>
            <input id="titre" type="text" placeholder="lutte" name="titre" value="<?=isset($article) ? $article['titre'] :''?>"  required=""><br>
            <label for="categorie">Categorie</label>
            <select id="categorie" name="categorie">
              <?php foreach($categories as $category) :?>
                <option value="<?=$category['libelle']?>" <?=(isset($article['categorieName']) && $article['categorieName']== $category['libelle']) ? 'selected' : ''?> ><?= $category['libelle'] ?></option>
              <?php endforeach;?> 
            </select><br>
            <label for="contenu">contenu de l'article</label>
            <textarea id="contenu" name="contenu" ><?=isset($article) ? $article['contenu'] :''?></textarea>
            <label for="dateCreation">Date creation<em>*</em></label>
            <input id="dateCreation" type="date"  name="dateCreation" value="<?=isset($article) ? $article['dateCreation'] :''?>"  required=""><br>
            <p><input type="submit" value="<?=isset($option) ? 'Modifier' :'Ajouter' ?>"></p>
        </fieldset>
        
      </form>
    </div> -->