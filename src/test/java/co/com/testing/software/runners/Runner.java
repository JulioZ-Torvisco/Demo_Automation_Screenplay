package co.com.testing.software.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Buscar_Video.feature",
        glue = "co.com.testing.software.StepDefinition", //ScreenPlay
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags = "@test1"
)

public class Runner {
}
