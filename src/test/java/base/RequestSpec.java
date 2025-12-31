/*
package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

    public static RequestSpecification getSpec() {
        return new RequestSpecBuilder()
                .setBaseUri("https://automationexercise.com")
                .addHeader("Content-Type", "application/json")
                .build();
    }
}
*//*

package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

    private static RequestSpecification req;

    public static RequestSpecification getRequestSpec() {
        if (req == null) {
            req = new RequestSpecBuilder()
                    .setBaseUri(ConfigReader.get("base.uri"))
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .build();
        }
        return req;
    }
}
*/
package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

    private static RequestSpecification requestSpec;

    public static RequestSpecification getRequestSpec() {
        if (requestSpec == null) {
            requestSpec = new RequestSpecBuilder()
                    .setBaseUri(ConfigReader.get("base.uri"))
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .build();
        }
        return requestSpec;
    }
}
