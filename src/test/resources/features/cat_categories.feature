Feature: Cat Api

  COMO usuario de CAT API
  DESEO obtener la lista de categorias
  PARA mostrar las mismas

  @CatApi
    Scenario Outline: Obtengo la lista de categorias

      When realizo una petición '<operation>' a '<entity>' al endpoint de categorias - '<request>'
      Then obtengo el status code '<statusCode>'
      And los datos son correctos

    @SuccessCat
    Examples:

    | request                  | statusCode   |operation  | entity    |
    |request/rq_cat_categories |      200     | GET       |CATEGORIES |

  Scenario Outline:Analisis de imagenes

    When realizo una petición '<operation>' a '<entity>' al endpoint de analisis - '<request>'
    Then obtengo el status code '<statusCode>'


    @AnalysisCat
    Examples:

      | request             | statusCode   |operation  | entity    |
      |request/cat_analisis |      401     | POST      | ANALYSIS  |
