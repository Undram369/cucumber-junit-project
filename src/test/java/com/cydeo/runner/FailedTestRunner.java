package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features="@target/rerun.text" ,  //feature are belongs to src which is part of test
            glue = "com/cydeo/step_definitions"

    )
    public class FailedTestRunner{

    }


// This runner class will be running only failed scenarios