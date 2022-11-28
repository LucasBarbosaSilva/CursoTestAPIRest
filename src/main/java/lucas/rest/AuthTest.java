package lucas.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.Test;



public class AuthTest {
	@Test
	public void deveAcessarSWAPI() {
		given()
			.log().all()
		.when()
			.get("https://swapi.dev/api/people/1")
		.then()
			.log().all()
			.statusCode(200)
			.body("name", is("Luke Skywalker"))
		;
	}
	
	@Test
	public void deveObterClima() {
		given()
			.log().all()
			.queryParam("q", "Arapiraca,AL,BR")
			.queryParam("appid", "a002f898793c158b2b62e6ed543688ef")
			.queryParam("unit", "metric")
		.when()
			.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
			.log().all()
			.statusCode(200)
			.body("name", is("Arapiraca"))
			.body("coord.lon", is(-36.6611f))
			.body("coord.lat", is(-9.7525f))
		;
	}
}
//a002f898793c158b2b62e6ed543688ef