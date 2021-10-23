<?php
    if (isset ($_GET['id'])){
      $parametre = [
        'arg0'=> (int) $_GET['id']  
      ];
      $client = new SoapClient('http://localhost:8080/services/UserWebService?wsdl');
      $resultat = $client->__soapCall('supprimer', array($parametre));
  
      echo $resultat->return;
  
      echo '<meta http-equiv="refresh" content="1; url=index.php"';
    }
    else{
      header('location:index.php');
    }
?>
   
