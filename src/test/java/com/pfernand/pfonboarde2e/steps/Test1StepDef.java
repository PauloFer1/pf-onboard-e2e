package com.pfernand.pfonboarde2e.steps;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.io.IOException;
import java.util.List;

public class Test1StepDef extends BaseStepDef {

    private static final String PRE_PATH = "/scripts/";
    private static final String EXTENSION = ".sql";

    @When("^The following data is generated$")
    public void doSomething(DataTable dataTable) throws IOException {
        final List<String> scripts = dataTable.asList();
        for (final String script : scripts) {
            runSqlScript(PRE_PATH + script + EXTENSION);
        }
        System.out.print("Data: " + scripts + " generated");
    }
}
