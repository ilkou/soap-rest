<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modification</title>
</head>
<body>
<form name="modification" method="post" action="ModificationServletEns">
    cni: <input type="text" name="cni"/> <br/>
    nom: <input type="text" name="nom"/> <br/>
    prenom: <input type="text" name="prenom"/> <br/>
    age: <input type="text" name="age"/> <br/>
    addresse: <input type="text" name="addresse"/> <br/>
    ville: <input type="text" name="ville"/> <br/>
    photo: <input type="text" name="photo"/> <br/>
    sexe: <input type="text" name="sexe"/> <br/>
    <input type="submit" value="Login" />
</form>
</body>
</html>