package com.cucumber.automation.cucumber.steps;

import com.cucumber.automation.AutomationApplication;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = AutomationApplication.class,
        webEnvironment = WebEnvironment.DEFINED_PORT)
@Ignore
public class StartupDef extends BaseDef {

}
