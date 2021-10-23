<?php
    if ($message){
      echo'<pre>'; 
     print_r($message);
    echo'</pre>';
    }
    
    echo 'Mis à jour...';
    echo '<meta http-equiv="refresh" content="2; url=index.php"';
    header('location:index.php?admin');
    ?>