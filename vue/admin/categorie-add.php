<?php
  require_once("inctwo/entete.php");
  require_once("inctwo/menu.php");
  ?>
<div class="row my-4">
   <div class="col-sm-6 mx-auto">
      <div class="card text-center">
        <div class="card-header">
        Ajout d'une categorie
        </div>
        <div class="card-body">
          <h5 class="card-title ">renseigner uniquement le titre de la categorie </h5>
          <form action="index.php?admin=category&option=store"  method="post">
          <div class="mb-3 row">
              <label for="libelle" class="col-sm-3 col-form-label">titre</label>
              <div class="col-sm-6">
                <input type="text" class="form-control" id="libelle" name="libelle" placeholder="sujet d'actualite" >
              </div>
          </div>
          <button type="submit" class="btn btn-primary rounded-pill">enregistrer</button>
          </form> 
        </div>
      </div>
   </div>
 </div>
</div>
 <?php require_once("inctwo/footer.php");
?>