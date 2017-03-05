<%-- 
    Document   : index
    Created on : 3-mar-2017, 16.44.00
    Author     : Nicola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlet GET e POST</title>
    </head>
    <body>
        <h1>Scegli se usare il metodo GET o il metodo POST</h1>
        <hr>
        <h3>GET</h3>
        <form action="app" method="GET">
            Inserisci nome:<input type="text" name="Nome"><br/>
            Inserisci cognome:<input type="text" name="Cognome"><br/>
            <button type="submit">Invia</button><button type="reset">Reset</button>
        </form>
        <hr>
        <h3>POST</h3>
        <form action="app" method="POST">
            Inserisci nome:<input type="text" name="Nome"><br/>
            Inserisci cognome:<input type="text" name="Cognome"><br/>
            <button type="submit">Invia</button><button type="reset">Reset</button>
        </form>
    </body>
</html>
