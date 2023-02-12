<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" href="form.css" />
    </head>
    <body>
        <form method="post" action="UtilisateurController" >
            <fieldset>
                <legend>Créer un compte</legend>
                <p>Vous pouvez vous inscrire via ce formulaire.</p>
               
                <label for="username">nom  d'utilisateur</label>
                <input type="text" id="username" name="Username"   size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['nom']}</span>
                <br />
                <label for="email">email <span class="requis">*</span></label>
                <input type="email" id="email" name="email" size="20" maxlength="60" />
                <span class="erreur">${form.erreurs['email']}</span>
                <br />

                <label for="password">password <span class="requis">*</span></label>
                <input type="password" id="password" name="password" size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['password']}</span>
                <br />

                <label for="age">	age <span class="requis">*</span></label>
                <input type="number" id="age" name="age"  size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['age']}</span>
                <br />
                <input type="file" value="urlphoto" name=url_photo class="sansLabel" />
                <br />
                <input type="submit" value="Créer un compte " class="sansLabel" />
                <br />
                

                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
            </fieldset>
        </form>
    </body>
</html>