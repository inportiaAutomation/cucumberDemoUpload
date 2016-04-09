package com.inportia.cucumberSetup;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions
( 
	features = "Features",
	glue = "com/inportia/stepDefinitions",
	tags = "~@skip"
)

public class App 
{
    
}
