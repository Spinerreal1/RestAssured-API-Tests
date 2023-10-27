package tests;

import model.UserData;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;

import static io.restassured.RestAssured.given;

public class TestFirst {

    private final static String URL = "https://reqres.in/";
    @Test
    @DisplayName("Аватары содержат айди пользователей")
    public void checkAvatarAndIdTest(){
        List<UserData> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL+"api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        users.forEach(x-> Assertions.assertTrue(x.getAvatar().contains(x.getId().toString())));
    }
}
