<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
          "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets">
<head>
  <title><ui:insert name="title">Enregistrement</ui:insert></title>
</head>

<body>
<form name="enregistrement" method="post" action="EnregistrementServletEns">
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
