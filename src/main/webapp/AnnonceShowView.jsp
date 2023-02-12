<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" href="annonce.css" />
    </head>
    <body>
        <form method="post" action="AnnonceController">
            <fieldset>
                <legend>Bonjour veillez déposer votre annonce!</legend>
               <label for="user_id">user_id</label>
                <input type="number" id="user_id" name="user_id"   size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['user_id']}</span>
                <br />
                <label for="Titre">Titre</label>
                <input type="text" id="Titre" name="Titre"   size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['nom']}</span>
                <br />
                <label for="description">description <span class="requis">*</span></label>
                <input type="text" id="" name="description" size="20" maxlength="60" />
                <span class="erreur">${form.erreurs['description']}</span>
                <br />

                <label for="prix">prix <span class="requis">*</span></label>
                <input type="number" id="" name="prix" size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['prix']}</span>
                <br />

                <label for="Categorie">	Categorie <span class="requis">*</span></label>
                <input type="text" id="Categorie" name="Categorie"  size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['Categorie']}</span>
                <br />
                <label for="SousCategorie">	SousCategorie <span class="requis">*</span></label>
                <input type="text" id="SousCategorie" name="SousCategorie"  size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['SousCategorie']}</span>
                <br />
                  <label for="url_photo">url photo <span class="requis">*</span></label>
                <input type="text" id="url_photo" name="url_photo" />
                <br />
                <input type="submit" value="publier" class="sansLabel" />
                <br />

                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
            </fieldset>
        </form>
    </body>
</html>