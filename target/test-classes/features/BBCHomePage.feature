Feature: Verify the BBC HomePage Menu Options
  Scenario: Launch BBC website & verify all Menu links are not broken
    Given User launches the BBC Website
    When The WebPage has been loaded compeletly
    Then Verify whether all Main Menu links are not broken and is navigated to corresponding page or subsection

  Scenario: Launch BBC website & verify SubMenus in More Menu link
    Given User launches the BBC Website
    When User have clicked on More Link
    Then Verify whether sub Menu links displayed are not broken