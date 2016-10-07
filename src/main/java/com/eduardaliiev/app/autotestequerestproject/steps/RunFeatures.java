package com.eduardaliiev.app.autotestequerestproject.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Eduard Aliiev on 10/7/16;
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/com/eduardaliiev/app/autotestequerestproject/features")
public class RunFeatures {
}
