package me.householdbuddy.app.cucumber.stepdefs;

import me.householdbuddy.app.HouseholdbuddyApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HouseholdbuddyApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
