<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css\style.css">
    <link rel="stylesheet" href="lib\bootstrap\css\bootstrap.min.css">
    <title>Caixa</title>
</head>

<body>
    <div class="registro">
        <h1>Registro de Produto</h1>
        <label for="">Código: </label>
        <input type="text">
        <label for="">Nome: </label>
        <input type="text">
        <label for="">Unidade de medida: </label>
        <input type="text">
        <label for="">Valor: </label>
        <input type="text" value="R$ ">
        <button type="submit" class="btn btn-primary" id="registrar">Registrar</button>
        <div class="alert alert-success" role="alert">
            Produto Registrado! <a href="home" class="alert-link">Voltar</a>.
        </div>

        <script src="lib\jquery\jquery.min.js"></script>
        <script src="lib\bootstrap\js\bootstrap.min.js"></script>
        <script src="js\efeitos.js"></script>
    </body>
    
    </html>