Feature: Agregar mascota a la tienda petstore_swagger

  Scenario: Post Pet
    Given url "https://petstore.swagger.io/v2" + "/pet"
    And request {"id": 5,"category": {"id": 5,"name": "string"},"name": "Tayler","photoUrls": ["string"],"tags": [{"id": 5,"name": "string"}],"status": "available"}
    When method post
    Then status 200

