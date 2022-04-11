Feature: Reqresin

    @list-user @positif
  Scenario: Success GET Users
    When user send GET Users request to reqresin
    Then response status code should be 200
    And response structure should match json schema "users.json"

    @login @positif
  Scenario: Success POST login
    When user send POST success login request to reqresin
    Then response status code should be 200
    And response structure should match json schema "login.json"

    @login @negatif
  Scenario: Unsuccess POST login
    When user send POST unsuccess login request to reqresin
    Then response status code should be 400
    And response structure should match json schema "unsuccess-login.json"

    @update @positif
  Scenario: Success PUT Update
    When user send PUT Update request to reqresin
    Then response status code should be 200
    And response structure should match json schema "update.json"

    @delete
  Scenario: Success DELETE Users
    When user send DELETE Users request to reqresin
    Then response status code should be 204

    @register @positif
  Scenario: Success POST register
    When user send POST success register request to reqresin
    Then response status code should be 200
    And response structure should match json schema "register.json"

    @register @negatif
  Scenario: Unsuccess POST register
    When user send POST unsuccess register request to reqresin
    Then response status code should be 400
    And response structure should match json schema "unsuccess-register.json"

    @create-user @positif
  Scenario: Success POST create users
    When user send POST success create users request to reqresin
    Then response status code should be 201
    And response structure should match json schema "create.json"