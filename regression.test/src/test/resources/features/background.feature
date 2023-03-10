#Author: oscar_barueri@hotmail.com

@background
Feature: Aprendendo background
  Como aluno
  Quero aprender background
  Para automatizar  testes

  Background: Acessar tela de login
  Given que esteja na tela login
  
  @positivo
  Scenario: Login valido
  And informo o usuario "standard_user"
  And informo a senha "secret_sauce"
  When clicar no botao login
  Then login realizado com sucesso
  
  @negativo
  Scenario: login invalido
  But  informo o usuario invalido "user_nao existe"
  But informo a senha invalida  "sauce"
  When clicar no botao login
  Then login realizado com sucesso
  
    @negativo
    Scenario: login usuario bloqueado
  But informo o ususario invalido "locked_out_user"
  And informo a senha valida  "secret_sauce"
  When clicar no botao login
  Then login mensagem de ussuario bloqueado
  