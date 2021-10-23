<?php require_once("inctwo/entete.php");
      require_once("inctwo/menu.php");
      if (isset ($_GET['id'])){
        $parametre = [
          'arg0' =>[
            'id' => (int) $_GET['id']
          ] 
        ];
        // echo "<pre>".print_r($parametre)."</pre>";
        $client = new SoapClient('http://localhost:8080/services/UserWebService?wsdl');
        $resultat = $client->__soapCall('getUserById', array($parametre));
        $utilisateur = $resultat->return;
      }
      ?>
<body>
<div class="row my-4">
   <div class="col-sm-6 mx-auto">
      <div class="card text-center">
        <div class="card-header">
        Modifier un utilisateur
        </div>
        <div class="card-body">
          <h5 class="card-title ">Update user </h5>
     
          <?php if (!isset($_POST['nom'],$_POST['prenom'],$_POST['login'],$_POST['password'],$_POST['role'])){?>
            <form action="" method="post">
                <div class="mb-3 row">
                  <label for="nom" class="col-sm-3 col-form-label" value="<?=$utilisateur->nom?>">Nom</label>
                  <div class="col-sm-6 ">
                    <input type="text" class="form-control" name="nom" id="nom">
                  </div>
                </div>
                <div class="mb-3 row">
                  <label for="prenom" class="col-sm-3 col-form-label">prenom</label>
                  <div class="col-sm-6">
                    <input type="text" class="form-control" name="prenom" id="nom" value="<?=$utilisateur->prenom?>">
                  </div>
                </div>
                <div class="mb-3 row">
                  <label for="login" class="col-sm-3 col-form-label">login</label>
                  <div class="col-sm-6">
                    <input type="text" class="form-control" name="login" id="login" value="<?=$utilisateur->login?>">
                  </div>
                </div>
                <div class="mb-3 row">
                  <label for="password" class="col-sm-3 col-form-label">password</label>
                  <div class="col-sm-6">
                    <input type="password" class="form-control" name="password" id="nom" value="<?=$utilisateur->password?>">
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
      }else {
          $id = (int) $_GET['id'];
          $nom=htmlentities($_POST['nom']);
          $prenom=htmlentities($_POST['prenom']);
          $login=htmlentities($_POST['login']);
          $password=htmlentities($_POST['password']);
          $role=htmlentities($_POST['role']);

          $parametre = [
            'arg0'=> [
              'id' =>$id,
              'nom'=> $nom,
              'prenom'=> $prenom,
              'login'=> $login,
              'password'=> $password,
              'role'=> $role
            ] 
          ];

          $resultat = $client->__soapCall('modifier', array($parametre));
          echo $resultat->return;
      }
      ?>
  </div>
  
</body>

<?php
require_once("../inctwo/footer.php");?>

   


<!-- 
  <div class="main">
      <h1>Modifier un utilisateur</h1>

      
        <form action="" method="post">
          <fieldset>
            <legend>Update user</legend>
            <div class="form-control">
              <label for="nom">Nom</label>
              <input type="text" name="nom" id="nom" value="<?=$utilisateur->nom?>">
            </div>
            <div class="form-control">
              <label for="prenom">Prenom</label>
              <input type="text" name="prenom" id="prenom" value="<?=$utilisateur->prenom?>">
            </div>
            <div class="form-control">
              <label for="login">login</label>
              <input type="text" name="login" id="login" value="<?=$utilisateur->login?>">
            </div>
            <div class="form-control">
              <label for="password">password</label>
              <input type="password" name="password" id="password" value="<?=$utilisateur->password?>">
            </div>
            <div class="form-control">
              <label for="role">role</label>
              <select name="role" id="role">
                <option value="admin">admin</option>
                <option value="editeur">editeur</option>
              </select>
            </div>
            <div>
              <input type="submit" value="Ajouter">
            </div>
          </fieldset>

        </form>
       -->