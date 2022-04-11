package api.service.reqresin;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class Reqresin {


    private static final String REQRESIN_BASEURL = "https://reqres.in";


    public void getListUser() {

        SerenityRest.given()
                .queryParam("page", "2")
                .get(REQRESIN_BASEURL + "/api/users");
    }

    public void postlogin() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "eve.holt@reqres.in");
        bodyJson.put("password", "cityslicka");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/login");
    }

    public void postunsuccesslogin() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "eve.holt@reqres.in");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/login");
    }


    public void putUpdate() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("name", "morpheus");
        bodyJson.put("job", "zion resident");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .put(REQRESIN_BASEURL + "/api/users/2");

    }

    public void deleteUser() {
        SerenityRest.delete(REQRESIN_BASEURL + "/api/users/2");
    }

    public void postregister() {
        JSONObject bodyJson = new JSONObject();
        bodyJson.put("email", "eve.holt@reqres.in");
        bodyJson.put("password", "pistol");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/register");
    }

    public void postunsuccessregister() {
        JSONObject bodyJson = new JSONObject();
        bodyJson.put("email", "sydney@fife");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/register");
    }

    public void postcreate() {
        JSONObject bodyJson = new JSONObject();
        bodyJson.put("name", "morpheus");
        bodyJson.put("job", "leader");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/users");
    }


}
