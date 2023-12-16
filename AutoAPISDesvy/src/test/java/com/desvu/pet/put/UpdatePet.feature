Feature: Actualizar mascota

  Scenario: Actualizar Mascota
    Given url "https://petstore.swagger.io/v2" + "/pet"
    And request {  "id": 4,  "category": {  "id": 4,  "name": "string"  },  "name": "Po",  "photoUrls": [  "string"  ],  "tags": [  {  "id": 4,  "name": "string"  }  ],  "status": "sold"  }
    When method put
    Then status 200

