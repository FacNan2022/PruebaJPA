
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de prueba</title>
    </head>
    <body>
        <h1>Datos de la persona</h1>
        <form action="svPersona" method="Post">
            <p><label>Dni:</label><input type="text" name="Dni"></p>
          <p><label>Nombre:</label><input type="text" name="Nombre"></p>
           <p><label>Apellido:</label><input type="text" name="Apellido"></p>
            <p><label>Telefono:</label><input type="text" name="Telefono"></p>
            <button type="submit">Enviar</button>
            
        </form>
        
        <h1>Lista de personas</h1>
        <p>Ver personas</p>
        <form action="" method="">
            <button type="submit">Ver</button>
        </form>
        
        <h1>Eliminar persona</h1>
        <p>Ingresa el dni para eliminar</p>
        <form action="" method="">
            <p><label>Dni:</label> <input type="text" name="Dni_elim"></p>
            <button type="submit">Eliminar</button>
            
        </form>
        
    </body>
</html>
