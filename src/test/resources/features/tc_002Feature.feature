Feature: Validar login con credenciales inválidas

  Scenario: Usuario ingresa credenciales incorrectas para autenticarse
    Given el usuario está en la página de inicio de sesión
    When ingresa el nombre de usuario "usuario_incorrecto" y la contraseña "contraseña_incorrecta"
    Then el sistema muestra un mensaje de error de autenticación