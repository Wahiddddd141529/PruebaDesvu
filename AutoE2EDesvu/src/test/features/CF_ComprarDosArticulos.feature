Feature: Compra dos articulos
  @AddToCard
  Scenario: Compro dos articulos
    Given Un usuario ingresa a la web opencart
    When al momento agrega dos articulos al carrito
    Then  diligencia sus datos y finaliza la orden
