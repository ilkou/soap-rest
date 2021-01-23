<?PHP
if(isset($_POST['SubmitButton'])) {
  $curl = curl_init();
  curl_setopt_array($curl, array(
    CURLOPT_URL => "http://localhost:9998/module?WSDL=",
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
                <id>".$_POST['id']."</id>
             <!--Optional:-->
             <nom>".$_POST['nom']."</nom>
             <!--Optional:-->
             <desc>".$_POST['desc']."</desc>
             <!--Optional:-->
             <cni>".$_POST['cni']."</cni>
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
    id: <input type="text" name="id"/> <br/>
    nom: <input type="text" name="nom"/> <br/>
    description: <input type="text" name="desc"/> <br/>
    cni: <input type="text" name="cni"/> <br/>
      <input type="submit" value="modifier" name="SubmitButton" />
  </form>
</body>
</html>