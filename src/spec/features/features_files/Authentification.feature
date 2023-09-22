Feature: Je verifie la page d authentification
  En tant que utilisateur je souhaite me connecter a l application Mercury

  @connexion
  Scenario: Je verifie la page d authentification
    Given Je me connecte sur l application Mercury
    When Je saisie le username "test"
    And Je saisie le password "test"
    And Je clique sur le bouton submit
    Then Je me redirige vers la page home "Login Successfully"
