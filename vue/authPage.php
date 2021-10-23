<?php
  require_once("../inc/menuauth.php");
  ?>

 <div class="row mt-4">
   <div class="col-sm-6 mx-auto">
      <div class="card text-center">
        <div class="card-header">
        Page d'authentification
        </div>
        <div class="card-body">
          <h5 class="card-title ">Veuiller renseigner login et mot de passe </h5>
          <form action="" method="post">
          <div class="mb-3 row">
              <label for="username" class="col-sm-3 col-form-label">Nom utilisateur</label>
              <div class="col-sm-6">
                <input type="text" class="form-control" id="username" name="login" placeholder="Moussa" >
              </div>
          </div>
          <div class="mb-3 row">
              <label for="inputPassword" class="col-sm-3 col-form-label">Mot de passe</label>
              <div class="col-sm-6">
                <input type="password" class="form-control" name="password" id="inputPassword">
              </div>
          </div>
          <button type="submit" class="btn btn-primary rounded-pill">se connecter</button>
          </form> 
        </div>
      </div>
   </div>
 </div>
 <?php
    if (isset($_POST['login'],$_POST['password'])){
          $login=htmlentities($_POST['login']);
          $password=htmlentities($_POST['password']);
          $parametre = [
              'login'=> $login,
              'password'=> $password
          ];

          $client = new SoapClient('http://localhost:8080/services/UserWebService?wsdl');
          $resultat = $client->__soapCall('authentication', array($parametre));
         
          $response = [$resultat->return];
          echo "<pre>";
            print_r();
          echo"</pre>";
          if ($resultat->return->id){
            session_start();
            $_SESSION['id'] = $resultat->return->id;
            $_SESSION['login'] = $resultat->return->login;
            $_SESSION['role'] = $resultat->return->role;
            header('location:../index.php?admin');
          }
      }
      ?>