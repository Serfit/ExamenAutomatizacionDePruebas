

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #fafafa;
  margin: 1rem;
  padding: 1rem;
  border: 2px solid #ccc;
  /* IMPORTANTE */
  display: flex;
  justify-content: center;
  align-items: center;">
        <form action="/SistemaBancoPlatinum/registrarUsuario" method="post">
            <table>
                <tr>
                	<td>Nombre Apellidos:</td> 
                    <td><input type="text" id="nombre" name="nombre"/></td>
                    <td>Usuario:</td> 
                    <td><input type="text" id="usuario" name="usuario"/></td>
                    <td>Password:</td>
                    <td><input type="password" id="password" name="password"/></td>
                </tr>
            </table>
            <br>
            <input type="submit" value="Registrar Usuario" />
            <a href="index.jsp">Volver</a>
        </form>
    </body>
</html>
