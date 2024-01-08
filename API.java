
API:

	1. Application without UI (User Interface).
	2. Application Programming Interface (API) is a small piece of code that enables different applications and services to communicate and share information with each other. 
	3. API is also called Web Service.

---------------------------------------------------------------------------------------------

Types of API:

1. SOAP (Simple Object Access Protocol):
    * for communication between applications
	* is a format for sending messages is based on "XML" (only just like html works with text)
	* communicates via internet
    * SOAP is platform independent

2. REST (Representational State of Transfer):
    * lightweight option for developing web services using the HTTP protocol.
	* allows different messaging formats- 'JSON'(key/value) and also 'XML'
	* is purely http protocol- so we can hit the link on the browser and see the results.
    * It can structure data into XML or any other machine readable format, but usually JSON
    * Rest is very data driven, compared to SOAP, which is strongly function driven.

---------------------------------------------------------------------------------------------

What is an API Testing?:

	-> API testing is totally different from UI testing as it concentrates not on the look but on the business logic layer of the software architecture.

	-> In API testing we use software to send requests to the API, get output and note down the systems response.

	-> API testing is getting more popular as it can be tested without UI - in early stages and this is the main advantages. Because if we define a defect earlier, less expenses will be needed to fix it.

---------------------------------------------------------------------------------------------

Types of (HTTP) requests:

	• GET – retrieves the data from a specified source
	• POST - sends (creates) new data
	• PUT - updates already existing information
	• DELETE - removes data 

---------------------------------------------------------------------------------------------

Swagger - tool to build API documentation

---------------------------------------------------------------------------------------------

Status code:

• 200 -> Success
	200: ok
	201: created

• 400 -> Client side error
	400: bad request
	401: unauthorized
	403: forbidden
	404: not found
	409: conflict

• 500 -> Server / APIs error
	500: internal server error
	503: service unavailable
	501: not implemented
	504: gateway timeout
	599: network timeout
	502: bad gateway
	
1** Informational
3** Redirection

---------------------------------------------------------------------------------------------

ECLIPSE

Add RestAssured dependency into "pom.xml";
import static io.restassured.RestAssured.*;

---------------------------------------------------------------------------------------------

String baseurl = "http://107.22.155.148:1000/ords/hr";

when().get(baseurl+"/employees")
	.then().statusCode(200);	

when().get(baseurl+"/countries")
	.body().prettyPrint();

given().accept(ContentType.JSON).
	when().get(baseurl+"/countries")
	.then().statusCode(200);

Response response = when().get(baseurl+"/employees/1234");
assertEquals(response.statusCode(), 404);
assertTrue(response.asString().contains("Not Found"));
response.prettyPrint();

given().accept(ContentType.JSON).
	when().get(baseurl+"/employees/110")
	.then().statusCode(200).and().contentType(ContentType.JSON);

given().accept(ContentType.JSON).
		when().get(baseurl+"/employees/110").
		then().statusCode(200).and().contentType(ContentType.JSON)
		.and().body("first_name", Matchers.equalTo("John"));

given().accept(ContentType.JSON)
		.when().get(baseurl+"/employees/150")
		.then().statusCode(200)
		.and().contentType(ContentType.JSON)
		.and().body("last_name",Matchers.equalTo("Tucker"))
		.and().body("job_id",Matchers.equalTo("SA_REP"));

given().accept(ContentType.JSON)
		.when().get(baseurl+"/regions")
		.then().assertThat().statusCode(200)
		.and().assertThat().contentType(ContentType.JSON)
		.and().assertThat().body("items.region_id", Matchers.hasSize(4))
		.and().assertThat().body("items.region_name", Matchers.hasItem("Europe"))
		.and().body("items.region_name", Matchers.hasItems("Americas","Middle East and Africa"));	

---------------------------------------------------------------------------------------------

Query parameter is not a part of URL

{{url}}/employees/?limit=100
		  ?: means end of url
	 till ?: whole url
	after ?: request / query parameter in key-value format

.and().params("limit",100)

---------------------------

Path Parameter is a part of URL and followed by the end of full resource url:

{{url}}/employees/{id}
{{url}}/employees/:id
{{url}}/employees/id

.and().pathParam("paramName", 110)

---------------------------------------------------------------------------------------------
		
given().accept(ContentType.JSON).and().params("limit",100)
	.when().get(baseurl+"/employees/")
	.then().assertThat().statusCode(200).and()
						.contentType(ContentType.JSON).and()
						.body("items.employee_id", Matchers.hasSize(100));

given().accept(ContentType.JSON).and()
		  .pathParam("paramName", 110)
		  .when().get(baseurl+"/employees/{paramName}").then()
		  .statusCode(200).and().assertThat().contentType(ContentType.JSON)
		  .and().body("first_name", Matchers.equalTo("John"),"email",Matchers.equalTo("JCHEN"));

