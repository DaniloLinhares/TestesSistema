package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

	// Run the scenarios specified by tags
	tags = {"@cadusuario"},

	// Define the features files location
	features = {"src/test/resources/features"},

	// Define the steps files location
	glue = {"stepDefinitions"},

	// Plugins
	plugin = {"pretty"},
	// plugin = {"html:target/reports/simple-html-report", "json:target/reports/json-report.json"},
	// plugin = {"de.monochromata.cucumber.report.PrettyReports:target/reports"},

	// Check whether all feature file steps have corresponding step definitions
	// dryRun=true,

	// Skip undefined steps from execution
	strict = true,

	// Readable format of the console output from Cucumber
	//monochrome = true,

	// Code snippets will be created using camelcase
	snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class RunCucumber {
}







