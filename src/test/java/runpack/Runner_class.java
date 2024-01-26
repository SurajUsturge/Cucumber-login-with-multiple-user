package runpack;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="feature/Login.feature",glue="stepdefination")
public class Runner_class 
{
	
}
