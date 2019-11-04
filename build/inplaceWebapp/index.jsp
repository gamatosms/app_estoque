<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">
    <title>Caixa</title>
</head>

<body>
    <div class="container container-caixa">
        <h1>Caixa</h1>
        <div>
            <label for="">Código do Produto:</label>
            <input type="text" id="input-search">
            <label for="">Quantidade: </label>
            <input type="number" id="input-qtd">
        </div>
        <div class="buttons">
            <button type="submit" id="buscar" class="btn btn-primary">Buscar</button>
            <table id="table-index" class="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">Código</th>
                        <th scope="col">Nome</th>
                        <th scope="col">Medida</th>
                        <th scope="col">Qtd.</th>
                        <th scope="col">Valor Unit.</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row">001</th>
                        <td>Item 1</td>
                        <td>Kg</td>
                        <td>10</td>
                        <td>R$ 00.00</td>
                    </tr>
                </tbody>
            </table>
            <a href="registro">Registrar produto</a>
            <a href="estoque">Visualizar Estoque</a>
        </div>
        <div class="alert alert-danger" role="alert">
            Nenhum item cadastrado.
        </div>
        <h4>Total: R$ 00.00</h4>
        <form action="produto">
            <button class="btn btn-success">Realizar pagamento</button>
        </form>
    </div>


    <script src="lib\jquery\jquery.min.js"></script>
    <script src="lib\bootstrap\js\bootstrap.min.js"></script>
    <script src="js\efeitos.js"></script>
</body>

</html>