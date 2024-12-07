Feature: Buscando codigos postales
  Scenario Outline: Buscar ubicaciones en los paises por codigo postal
    When Busco un codigo postal <Codigo Postal> para el codigo de pais <Codigo Pais>
    Then la ubicacion deberia ser <Ubicacion> en <Pais>
    Examples:
        | Codigo Postal | Codigo Pais | Pais | Ubicacion |
        | 90210 | US | United States | Beverly Hills |
        | 1010 | AT | Austria | Wien |