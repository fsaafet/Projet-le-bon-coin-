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
        <form method="post" action=ConnecterController>
            <fieldset>
                <label for="email">email <span class="requis">*</span></label>
                <input type="email" id="email" name="email" size="20" maxlength="60" />
                <span class="erreur">${form.erreurs['email']}</span>
                <br />

                <label for="password">password <span class="requis">*</span></label>
                <input type="password" id="password" name="password" size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['password']}</span>
                <br />
                  <input type="submit" value="Se Connecter" class="sansLabel" />
                <br />
                  
                <a href="/LeBonCoin/UtilisateurController">Créer un compte</a>
                 <br />
                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
            </fieldset>
        </form>
    </body>
</html>