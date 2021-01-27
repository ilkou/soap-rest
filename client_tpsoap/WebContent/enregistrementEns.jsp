<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
          "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://xmlns.jcp.org/jsf/facelets">
<head>
<title>Enregistrement enseignant</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	<style>
#form {
	max-width: 600px
}

.center_div {
	margin: 0 auto;
	width: 80% /* value of your choice which suits your alignment */
}
</style>
</head>

<body>
	<div class="container center_div mt-4">
		<form id="form" name="enregistrement" method="post"
			action="EnregistrementServletEns">
			<h2 class="text-info mb-2">Enregistrer un enseignant</h2>
			<div class="form-group row">
				<label for="cni" class="col-sm-2 col-form-label">CNI</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="cni" id="cni"
						placeholder="cni" />
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
				<label for="prenom" class="col-sm-2 col-form-label">Prenom</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="prenom" id="prenom"
						placeholder="prenom" />
				</div>
			</div>
			<div class="form-group row">
				<label for="age" class="col-sm-2 col-form-label">Age</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="age" id="age"
						placeholder="age" />
				</div>
			</div>
			<div class="form-group row">
				<label for="addresse" class="col-sm-2 col-form-label">Addresse</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="addresse"
						id="addresse" placeholder="addresse" />
				</div>
			</div>
			<div class="form-group row">
				<label for="ville" class="col-sm-2 col-form-label">Ville</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="ville" id="ville"
						placeholder="ville" />
				</div>
			</div>
			<div class="form-group row">
				<label for="photo" class="col-sm-2 col-form-label">Photo</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="photo" id="photo"
						placeholder="photo link" />
				</div>
			</div>
			<div class="form-group row">
				<label for="sexe" class="col-sm-2 col-form-label">Sexe</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="sexe" id="sexe"
						placeholder="sexe" />
				</div>
			</div>
			<button type="submit" class="btn btn-info float-right">Enregistrer</button>
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
