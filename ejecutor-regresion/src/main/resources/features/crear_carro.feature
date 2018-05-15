Feature: Crear carro caracteristica

  Scenario: Añadir un carro ingresando los valores 
    Given I press "Create a car"
	Then I enter "Koup azul" into input field number 1
    And I enter "10000" into input field number 2
    And I press "Done"
	Then I should see "Fuel consumption"
