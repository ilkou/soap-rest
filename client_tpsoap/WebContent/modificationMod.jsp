<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modification Module</title>
</head>
<body>
<form name="modification" method="post" action="ModificationServletMod">
    id: <input type="text" name="id"/> <br/>
    nom: <input type="text" name="nom"/> <br/>
    description: <input type="text" name="desc"/> <br/>
    cni: <input type="text" name="cni"/> <br/>
    <input type="submit" value="Login" />
</form>
</body>
</html>