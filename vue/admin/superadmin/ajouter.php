<?php require_once("inctwo/entete.php");
      require_once("inctwo/menu.php");
      ?>
<body>
  <div class="row my-4">
   <div class="col-sm-6 mx-auto">
      <div class="card text-center">
        <div class="card-header">
        Ajout d'un utilisateur
        </div>
        <div class="card-body">
          <h5 class="card-title ">Veuiller renseigner les infos du nouvel user </h5>
     

          <?php if (!isset($_POST['nom'],$_POST['prenom'],$_POST['login'],$_POST['password'],$_POST['role'])){?>
            <form action="" method="post">
                <div class="mb-3 row">
                  <label for="nom" class="col-sm-3 col-form-label">Nom</label>
                  <div class="col-sm-6 ">
                    <input type="text" class="form-control" name="nom" id="nom">
                  </div>
                </div>
                <div class="mb-3 row">
                  <label for="prenom" class="col-sm-3 col-form-label">prenom</label>
                  <div class="col-sm-6">
                    <input type="text" class="form-control" name="prenom" id="nom">
                  </div>
                </div>
                <div class="mb-3 row">
                  <label for="login" class="col-sm-3 col-form-label">login</label>
                  <div class="col-sm-6">
                    <input type="text" class="form-control" name="login" id="login">
                  </div>
                </div>
                <div class="mb-3 row">
                  <label for="password" class="col-sm-3 col-form-label">password</label>
                  <div class="col-sm-6">
                    <input type="password" class="form-control" name="password" id="nom">
                  </div>
                </div>
                <div class="mb-3 row">
                  <label for="role" class="col-sm-3 col-form-label">role</label>
                  <!-- <div > -->
                    <select name="role" id="role" class="col-sm-6">
                      <option value="admin">admin</option>
                      <option value="editeur">editeur</option>
                    </select>
                  <!-- </div> -->
                </div>
                <div>
                  <button type="submit" class="btn btn-primary rounded-pill">ajouter</button>
                </div>   
            </form>
        </div>
      </div> 
    </div>
  </div>   
      <?php
      } else {
            $nom=htmlentities($_POST['nom']);
            $prenom=htmlentities($_POST['prenom']);
            $login=htmlentities($_POST['login']);
            $password=htmlentities($_POST['password']);
            $role=htmlentities($_POST['role']);

            $parametre = [
              'arg0'=> [
                'nom'=> $nom,
                'prenom'=> $prenom,
                'login'=> $login,
                'password'=> $password,
                'role'=> $role
              ] 
            ];

            $client = new SoapClient('http://localhost:8080/services/UserWebService?wsdl');
            $resultat = $client->__soapCall('ajout', array($parametre));

            echo $resultat->return;
      }
      ?> 
</body>
<?php 
      require_once("inctwo/footer.php");
  ?>