Feature: Validar proceso de login

  Scenario: Validar login con credenciales validas
    Given el usuario está en la página de login
    When el usuario ingresa el usuario "usuarioValido" y contraseña "contraseñaValida"
    And hace clic en el botón de login
    Then el usuario ingresa al sistema exitosamente