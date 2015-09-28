<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="es">
<head>
	
</head>
<body class="login-page">

	<div class="login-box">
      <div class="login-logo">
        <a href="#"><b>Administrador</b></a>
      </div><!-- /.login-logo -->
      <div class="login-box-body">

      	
        <p class="login-box-msg">Ingrese sus datos para iniciar sesión</p>
        
        <f:form commandName="usuario" action="/usuario/valida.htm" 
        		autocomplete="false" method="post">
        	<f:label path="usuario">Usuario:</f:label>
        	<f:input path="usuario"/>
        	<f:label path="clave">Clave:</f:label>
        	<f:input path="clave"/>
        	
        	<input type="submit" />
        </f:form>

        
        <a href="a_cambiarpassword">Olvidé mi contraseña</a><br>

      </div><!-- /.login-box-body -->
    </div><!-- /.login-box -->

</body>
</html>