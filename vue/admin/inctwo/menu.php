<div class="banner">
    <h1> ACTUALITES POLYTECHNICIENNES </h1>
</div>
<ul>
  <li id="first"> <a href="index.php?admin">Accueil</a></li>
  <li><a href="index.php?admin=article&option=add">Ajout article</a></li>
  <li><a href="index.php?admin=category&option=add">Ajout categorie</a></li>
  <?php session_start();
    if ( $_SESSION['role'] == 'admin'){?>
      <li><a href="vue/admin/superadmin">utilisateurs</a></li>
  <?php }?>
  <li id=last> <a href="vue/admin/deconnexion.php">
      deconnexion
      </a>
    </li>
</ul>


        
