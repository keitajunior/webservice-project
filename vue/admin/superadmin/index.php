<?php require_once("inctwo/entete.php");
      require_once("inctwo/menu.php");
      ?>

<div>
    <h1 class="text-center">Liste des utilisateurs</h1>
    <?php
      $client = new SoapClient('http://localhost:8080/services/UserWebService?wsdl');
      $resultat = $client->__soapCall('lister', array());
      
      if (!isset ($resultat->return)){
        echo "Desolé aucun client trouvé";
      }
      else {
            ?>
        <div class="row">
          <div class="col-sm-10 mx-auto">
            <table class="table table-hover">
                <thead>
                  <th>Nom</th>
                  <th>Prenom</th>
                  <th>Login</th>
                  <th>Password</th>
                  <th>Role</th>
                  <th colspan="2">Action</th>
                </thead>
                <tbody>
                  <?php 
                    $utilisateurs = is_array($resultat->return) ? $resultat->return : [$resultat->return];
                    foreach($utilisateurs as $utilisateur):
                    ?>
                    <tr>
                      <td><?=$utilisateur->nom?></td>
                      <td><?=$utilisateur->prenom?></td>
                      <td><?=$utilisateur->login?></td>
                      <td><?=$utilisateur->password?></td>
                      <td><?=$utilisateur->role?></td>
                      <td><a class="button" href="modifier.php?id=<?=$utilisateur->id?>">Modifier</a></td>
                      <td><a class="button" href="supprimer.php?id=<?=$utilisateur->id?>">Supprimer</a></td>
                    </tr>
                  <?php endforeach;?>
                </tbody>
              </table>
          </div>  
        </div>
      <?php }?>
</div>
<div class="row my-3 mx-auto col-sm-3">
  <a class="btn btn-primary" href="ajouter.php">ajouter un utilisateur</a>
</div>

<?php require_once("../inctwo/footer.php");?>
