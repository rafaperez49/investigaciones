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
Feature: Aprendiendo a usar Winium Driver

  @autenticacion
  Scenario: Ingresar a una pagina web que pide autenticación con ventana emergente de windows
   Given Ingreso a la pagina web
   When  hago click en la opcion autenticar y me autentico con usuario "admin" y clave "admin"
   #Then verifico que me autentique
  
    
