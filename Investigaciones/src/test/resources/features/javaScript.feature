#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Interactuar con alertas JavaScript

  @aceptar
  Scenario: Aceptar una alaerta
    
    Given que el usuario ingresa a la pagina de herokuapp
    When cuando selecciona el link javascript_alerts
    And interactua con el control aceptar que hay en esta pantalla
    

	@cancelar
Scenario: Cancelar una alerta
   Given que el usuario ingresa a la pagina de herokuapp
    When cuando selecciona el link javascript_alerts
    And interactua con el control confirmar que hay en esta pantalla
   

	@escribir
Scenario: Escribir información
   Given que el usuario ingresa a la pagina de herokuapp
    When cuando selecciona el link javascript_alerts
    And interactua el prompt que hay en esta pantalla con el texto "hola mundo"

