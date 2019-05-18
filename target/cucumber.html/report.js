$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BBCHomePage.feature");
formatter.feature({
  "name": "Verify the BBC HomePage Menu Options",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Launch BBC website \u0026 verify all Menu links are not broken",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches the BBC Website",
  "keyword": "Given "
});
formatter.match({
  "location": "BBCHomePageSteps.user_launches_the_BBC_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The WebPage has been loaded compeletly",
  "keyword": "When "
});
formatter.match({
  "location": "BBCHomePageSteps.the_WebPage_has_been_loaded_compeletly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify whether all Main Menu links are not broken and is navigated to corresponding page or subsection",
  "keyword": "Then "
});
formatter.match({
  "location": "BBCHomePageSteps.verify_whether_all_Menu_links_are_not_broken_and_is_navigated_to_corresponding_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Launch BBC website \u0026 verify SubMenus in More Menu link",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches the BBC Website",
  "keyword": "Given "
});
formatter.match({
  "location": "BBCHomePageSteps.user_launches_the_BBC_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have clicked on More Link",
  "keyword": "When "
});
formatter.match({
  "location": "BBCHomePageSteps.user_have_clicked_on_More_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify whether sub Menu links displayed are not broken",
  "keyword": "Then "
});
formatter.match({
  "location": "BBCHomePageSteps.verify_whether_sub_Menu_links_displayed_are_not_broken()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});