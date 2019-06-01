<%-- 
    Document   : principal.jsp
    Created on : 01/06/2019, 14:41:42
    Author     : almeida.hugo
--%>

<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal</title>
    </head>
    <body>
        <h1>Principal</h1>
        <%                    
            Usuario u = (Usuario) request.getAttribute("usuario");
            out.print("<h2>" + u.getUsuario() + "</h2>");
        %>
        
        <table>
            <tbody>
                <%
                    out.print(
                            "<tr><td>Nome</td><td>" + u.getNome() + "</td></tr>"
                          + "<tr><td>Email</td><td>" + u.getEmail() + "</td></tr>"
                          + "<tr><td>Data de Nascimento</td><td>" + u.getNascimento() + "</td></tr>"  
                    );
                %>
            </tbody>
        </table>
            
        <h2>Adicionar novo animal</h2>
        <form action="ServletCadastroAnimal" method="POST">
            <input name="nome" required placeholder="nome">
            <input name="email" required type="email" placeholder="email">
            <input placeholder="usuario" required name="usuario">
            <input placeholder="senha" required name="senha">
            <input name="nascimento" required type="date" placeholder="nascimento">
            
            <!--<input placeholder="endereço" name="endereco">
            <input type="file" name="foto">-->
            <button>Enviar</button>
        </form>
    </body>
</html>
