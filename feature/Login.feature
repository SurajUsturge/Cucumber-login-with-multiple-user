Feature: login with multiple credentials

  Scenario Outline: login with multiple credentials
    Given launch app
    When user enter username "<username>" and password "<password>"
		Then login in successfully 
    Examples: 
      | username | password  |
      | Admin    | admin123  |
      | rajesh   | rajesh123 |
      | viskal   | kes hav   |
