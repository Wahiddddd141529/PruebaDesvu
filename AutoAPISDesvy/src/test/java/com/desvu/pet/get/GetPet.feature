Feature: Obtener Mascota

  Scenario: Obtener Mascota por Id
    Given url "https://petstore.swagger.io/v2" + "/pet/" + "3"
    When method get
    Then status 200

  Scenario: Obtener Mascota por Status
    Given url "https://petstore.swagger.io/v2" + "/pet/" + "findByStatus?status=sold"
    When method get
    Then status 200