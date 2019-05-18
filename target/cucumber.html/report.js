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
formatter.step({
  "name": "User launches the BBC Website",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The WebPage has been loaded compeletly",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify whether all Main Menu links are not broken and is navigated to corresponding page or subsection",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Launch BBC website \u0026 verify SubMenus in More Menu link",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launches the BBC Website",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User have clicked on More Link",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify whether sub Menu links displayed are not broken",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});