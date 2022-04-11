package api.stepdef.reqresin;

import api.service.reqresin.Reqresin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;



public class ReqresinStepDef {

    Reqresin reqresin = new Reqresin();

    @And("user send GET Users request to reqresin")
    public void userSendGETUsersRequestToReqresin() { reqresin.getListUser();
    }

    @Then("response status code should be {int}")
    public void responseStatusCodeValidation(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @Then("^response path \"([^\"]*)\" should contain Int value \"(^\"]*)\"$")
    public void responseDataValidationInt(String path, int value) {
        restAssuredThat(response -> response.body(path, equalTo(value)));
    }

    @Then("response path \"([^\"]*)\" should contain String value \"(^\"]*)\"$")
    public void responseDataValidationString(String path, int value) {
        restAssuredThat(response -> response.body(path, equalTo(value)));
    }

    @And("response structure should match json schema {string}")
    public void responseStructureShouldMatchJsonSchema(String schema) {
        String path = String.format("schema/%s", schema);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }

    @And("user send POST success login request to reqresin")
    public void userSendPOSTLoginRequestToReqresin() { reqresin.postlogin();
    }

    @And("user send POST unsuccess login request to reqresin")
    public void userSendPOSTUnsuccessLoginRequestToReqresin() { reqresin.postunsuccesslogin();
    }

    @And("user send PUT Update request to reqresin")
    public void userSendPUTUpdateRequestToReqresin() { reqresin.putUpdate();
    }

    @And("user send DELETE Users request to reqresin")
    public void userSendDELETEUsersRequestToReqresin() { reqresin.deleteUser();
    }

    @And("user send POST success register request to reqresin")
    public void userSendPOSTRegisterRequestToReqresin() { reqresin.postregister();
    }

    @And("user send POST unsuccess register request to reqresin")
    public void userSendPOSTUnsuccessRegisterRequestToReqresin() { reqresin.postunsuccessregister();
    }

    @And("user send POST success create users request to reqresin")
    public void userSendPOSTUsersRequestToReqresin() { reqresin.postcreate();
    }
}
