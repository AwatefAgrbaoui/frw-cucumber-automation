Feature: Je verifie la page d inscription
  En tant que utilisateur je souhaite m inscrire a l application Mercury
@inscription
  Scenario: Je verifie la page d inscription
    Given Je me connecte sur l application Mercury1
    When Je clique sur le bouton Register
    And Je saisie  first name "Awatef"
    And Je saisie  last name "Agrbaoui"
    And Je saisie  phone "90990990"
    And Je saisie  email "test@gmail.com"
    And Je saisie  address "48Montplaisir"
    And Je saisie  city "Tunis"
    And Je saisie  state/province "Tunisie"
    And Je saisie  postal code "1002"
    And Je selectionne  country "TUNISIA"
    And Je saisie username1 "test"
    And Je saisie password1 "test"
    And Je confirme password1 "test"
    And Je clique sur le bouton Envoyer
    Then Je me redirige vers la page welcome " Note: Your user name is test."
