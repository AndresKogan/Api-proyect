Feature: Cat Api

  COMO usuario de CAT API
  DESEO obtener las imagenes
  PARA mostrar las mismas

  @400
  Scenario Outline: Obtengo la imagen deseada
    When realizo una petición '<operation>' a '<entity>' al endpoint de id - '<request>'
    Then obtengo el status code '<statusCode>'

    Examples:
      | request        | statusCode | operation | entity |
      | request/cat_id | 400        | GET       | ID     |