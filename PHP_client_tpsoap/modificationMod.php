<?PHP
if(isset($_POST['SubmitButton'])) {
  $curl = curl_init();
  curl_setopt_array($curl, array(
    CURLOPT_URL => "http://localhost:9998/module?WSDL=",
    CURLOPT_RETURNTRANSFER => true,
    CURLOPT_CUSTOMREQUEST => "POST",
    CURLOPT_POSTFIELDS =>
    "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:mod=\"http://module.metiers.soap.ensakh.com/\">
        <soapenv:Header/>
        <soapenv:Body>
          <mod:modification>
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
          </mod:modification>
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
  <title>Modification d'un module</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body class="bg-secondary text-white">
	<div class="container center_div mt-4">

		<form id="form" name="enregistrement" method="post"
			action="">
			<h2 class="text-warning mb-2">Modifier un module</h2>
			<div class="form-group row">
				<label for="id" class="col-sm-2 col-form-label">ID</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="id" id="id"
						placeholder="id" />
				</div>
			</div>
			<div class="form-group row">
				<label for="nom" class="col-sm-2 col-form-label">Nom</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="nom" id="nom"
						placeholder="nom" />
				</div>
			</div>
			<div class="form-group row">
				<label for="desc" class="col-sm-2 col-form-label">Description</label>
				<div class="col-sm-10">
					<textarea class="form-control" name="desc" id="desc"
						placeholder="description" rows="3" ></textarea>
				</div>
			</div>
			<div class="form-group row">
				<label for="cni" class="col-sm-2 col-form-label">CNI</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="cni" id="cni"
						placeholder="cni" />
				</div>
			</div>
			<button type="submit" name="SubmitButton" class="btn btn-warning float-right">Modifier</button>
		</form>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>