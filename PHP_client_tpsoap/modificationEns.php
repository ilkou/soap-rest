<?PHP
if(isset($_POST['SubmitButton'])) {
  $curl = curl_init();
  curl_setopt_array($curl, array(
    CURLOPT_URL => "http://localhost:9997/enseignant?WSDL=",
    CURLOPT_RETURNTRANSFER => true,
    CURLOPT_CUSTOMREQUEST => "POST",
    CURLOPT_POSTFIELDS =>
    "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:met=\"http://metiers.tpsoap.ensakh.com/\">
    <soapenv:Header/>
    <soapenv:Body>
       <met:modification>
          <!--Optional:-->
          <arg0>
             <!--Optional:-->
             <cni>".$_POST['cni']."</cni>
              <!--Optional:-->
              <nom>".$_POST['nom']."</nom>
              <!--Optional:-->
              <prenom>".$_POST['prenom']."</prenom>
              <!--Optional:-->
              <age>".$_POST['age']."</age>
              <!--Optional:-->
              <addresse>".$_POST['addresse']."</addresse>
              <!--Optional:-->
              <ville>".$_POST['ville']."</ville>
              <!--Optional:-->
              <photo>".$_POST['photo']."</photo>
              <!--Optional:-->
              <sexe>".$_POST['sexe']."</sexe>
          </arg0>
       </met:modification>
    </soapenv:Body>
 </soapenv:Envelope>",
    CURLOPT_HTTPHEADER => array("content-type: text/xml"),
  ));

  $response = curl_exec($curl);
  $err = curl_error($curl);

  curl_close($curl);

  if ($err) {
    echo "cURL Error #:" . $err;
  } else {
    echo $response;
  }
} 
?>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Modifier</title>
</head>
<body>
  <form method="post" action="">
    cni: <input type="text" name="cni"/> <br/>
    nom: <input type="text" name="nom"/> <br/>
    prenom: <input type="text" name="prenom"/> <br/>
    age: <input type="text" name="age"/> <br/>
    addresse: <input type="text" name="addresse"/> <br/>
    ville: <input type="text" name="ville"/> <br/>
    photo: <input type="text" name="photo"/> <br/>
    sexe: <input type="text" name="sexe"/> <br/>
    <input type="submit" value="modifier" name="SubmitButton" />
  </form>
</body>
</html>