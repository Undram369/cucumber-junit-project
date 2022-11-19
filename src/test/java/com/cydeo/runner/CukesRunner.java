package com.cydeo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(   // now we are determining locations
        plugin ={
                "html:target/cucumber-report.html" ,     // // cucumber report
                "rerun:target/rerun.text"
        } ,

        features = "src/test/resources/features" ,
        glue = "com/cydeo/step_definitions" ,    // glue means implementations
        dryRun = false ,      // if it is true just checking feature file and practice
        tags = "@femaleScientist"             // tags part you can change which part you want to run

)
public class CukesRunner {      // this class control all framework

    //  plugin = "html:target/cucumber-report.html"
    // features - copy from content root of the features package
    // glue- step_definitions should be copied from source of the "features" package
    //dryRun- true== when we want to know which steps are missing snippet. Gives us unimplemented ones
    // tags - which scenario to test

}
