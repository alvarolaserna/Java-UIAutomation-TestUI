package stepDefinitions;

import cucumber.api.java.Before;
import io.netty.handler.logging.LogLevel;
import testUI.Configuration;

import static testUI.UIOpen.open;

public class Hooks {
    @Before
    public void before(){
        Configuration.testUILogLevel = LogLevel.DEBUG;
        Configuration.automationType = Configuration.DESKTOP_PLATFORM;
        Configuration.useAllure = true;
        open("https://google.com");
    }
}
