package Steps;

import gherkin.lexer.Is;
import io.restassured.http.ContentType;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

public class BDDStyleMethod {
    public static void SimpleGETEmp(String id){
        given().contentType(ContentType.JSON).
                when().get(String.format("http://localhost:8085/employees/%s",id)).
                then().body("firstName", is ("Senthil"));

    }
    public static void performPOSTwithbodyparameter(){
        HashMap<String,String> postContent = new HashMap<String, String>();
        postContent.put("id","5");
        postContent.put("firstName","nikhil");
        postContent.put("lastName","sen");
        postContent.put("email","niksen@gmail.com");

        given()
                .contentType(ContentType.JSON).
        with()
                .body(postContent).
        when()
                .post("http://localhost:8085/employees").
         then()
                .body("firstName", is("nikhil"));

    }
    public static void deleteoperation(String id){

        given()
                .when ()
                .contentType (ContentType.JSON)
                .delete (String.format("http://localhost:8085/employees/%s",id));

    }

    }



