Feature: Verifier le module register
  En tant que utilisteur je souhaite remplir le formulaire afin de m enregistrer

  @moduleRegister
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur l application Mercury
    When Je clique sur le bouton Register
    And Je saisie un data dans le champ username "<username>"
    And Je saisie un data dans le champ lastname "<lastname>"

    Examples: 
      | username | lastname  |||
      | Awatef   | Agrbaoui  |
      | Dorra    | Mechergui |
