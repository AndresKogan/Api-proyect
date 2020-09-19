package ar.steps;

import api.config.EntityConfiguration;
import api.model.Analysis;
import api.model.Categories;
import api.model.Category;
import api.model.Id;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import cucumber.api.java8.En;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.IExpectedExceptionsHolder;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class CatSteps extends PageSteps {

        @When("^realizo una petición '(.*)' a '(.*)' al endpoint de categorias - '(.*)'$")
        public void seEjecutaLaOperation(String operation, String entity, String request)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException {
            EntityConfiguration.valueOf(entity).getEntityService().getMethod(operation.toLowerCase(), String.class).invoke("", request);

        }

        @Then("^obtengo el status code '(.*)'")
            public void obtengoElStatusCodeStatusCode(int expCode){
                int statusCode = APIManager.getLastResponse().getStatusCode();
                Assert.assertEquals(statusCode, expCode );

        };

    @And("los datos son correctos")
    public void losDatosSonCorrectos() {

        Category[] categories = (Category[]) APIManager.getLastResponse().getResponse();

        int size = categories.length;
        Assert.assertEquals(size, 7);

    }

    @When("realizo una petición '(.*)' a '(.*)' al endpoint de id - '(.*)'$")
    public void realizoUnaPeticiónOperationAEntityAlEndpointDeIdRequest(String operation, String entity, String request)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().
                getMethod(operation.toLowerCase(),
                        Id.class).invoke("",
                request);
    }


    @When("realizo una petición '(.*)' a '(.*)' al endpoint de analisis - '(.*)'")
    public void realizoUnaPeticiónOperationAEntityAlEndpointDeAnalisisRequest(String operation, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().
                getMethod(operation.toLowerCase(), Analysis.class)
                .invoke("", request);

    }
}


