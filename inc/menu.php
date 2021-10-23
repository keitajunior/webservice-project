<div class="banner">
    <h1> ACTUALITES POLYTECHNICIENNES </h1>
</div>
<div class="principle">
  
  <ul>
    <li> <a href="index.php">Accueil</a></li>
    <li>
      <?php foreach($categories as $category) :?>
      <a href="index.php?idCategory=<?=$category['id']?>"><?= $category['libelle'] ?></a>
      <?php endforeach;?>
    </li>
    <li id=last> <a href="vue/authPage.php">
      <?= isset($_SESSION['id']) ? 'deconnexion':'connexion'?>
      </a>
    </li>
  </ul>