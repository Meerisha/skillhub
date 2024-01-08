 
TDD & BDD - development concepts
--------------------------------------------------------------------------------------
TDD Cycle
Test Driven Development LifeCycle 	-> 	for developers only
--------------------------------------------------------------------------------------
	1. Write a failing test.
	2. Make the test pass.
	3. Refactor.
--------------------------------------------------------------------------------------
	* First, you write an example of what the code should do, in the form of a failing test.
	* Next, write just enough code to make the test work.
	* Finally, review what you have done to see if you can tidy up the code or improve the design.
--------------------------------------------------------------------------------------

Meeting of 3 amigos is aimed to understand a certain requirement, write user stories (=feature files) based on it and to write an acceptance criateria together to eliminate misunderstanding:
	* PO
	* BA
	* devs
Acceptance criteria - the set of conditions which enables to mark user story to be done.

--------------------------------------------------------------------------------------

BDD 

Instead of complex scenario it decides how software should behave. We decide what the trigger of certain functionality is. 
First, you write acceptance test, so in both: BDD & TDD, test comes first
Cucumber is just a one layer on top of all tools (JUnit, Maven). 
Cucumber actually does nothing: 
	* it doesn't verify, assert (as JUnit, TestNG)
	* it doesn't start webdriver
	* it doesn't take screenshots
It is not substitute of tools we covered before. It is a bridge between technical and non-technical sides of development, it helps to such team-members as PO and BA to be involved into testing stage.
Cucumber is a testing tool that helps all non-technical parties to understand what is being tested.
Cucumber uses syntax language called Gherkin.
Cucumber makes our framework scalable as it can handle more that 1000 test cases easily.

Feature file - scenario that is written using Gherkin language.
Step definition - Cucumber generates it for us, we don't generate them by ourselves, we just copy and paste it and give some body but we don't declare methods by ourselves.  Each scanario meets a certain method in Java
1 test = one functionality = one feature of application
--------------------------------------------------------------------------------------

POM.XML 	--> Maruf's configuration

!!! We replaced testNG dependency by JUnit
	Added 3 additional dependencies for Cucumber
		* cucumber-java 3.0.2
		* cucumber-junit 3.0.2
		* cucumber-core 3.0.2
	Others: 
		- selenium-java 3.13.0
		- webdrivermanager 3.0.0
	Property compiler 1.8

4. Create "configuration.properties" file (that usually holds frequintly changing properties as browser name, url (envirounments)).

5. Create 4 packages under test folder
	1. pages
	2. step_definitions
	3. runners
	4. utilities

6. Pages - as usual - locators
   Utilities - custom methods

7. Under "src/test/resources" create "com.prestashop.features" folder.
	Create a feature file there. ("anyName.feature")
	!!! If you cannot see green icon, configure a plugin
	 	* RC on the feature file. --> open with --> Other
		* select option Editor. (with the green icon)
		* select option use for all .feature files
		* click ok

7. Create a class under runners package
	@RunWith(Cucumber.class)					<-- comes from JUnit
	@CucumberOptions(							<-- comes from Cucumber
		tags = "@...",
		features = path_for_features",
		glue = "path_for_step_definitions",
		dryRun = f/t
		)

8. Create a class under step_definitions
_______________________________________________

_______________________________________________

Creating of "Run Configuration"
(to be able to execute a runner file easily)
	* click "Run_Button" -> Run_Configurations -> JUnit -> "runner_file_name" -> Rename a runner (optional) -> Apply -> Close.
	* click "Run_Button" -> Organize_Favorites -> Select "you_just_created" -> Ok.


1. Create feature file 	<-- Gherkin language
	! Try to use "temp" tag while you are working on development of some particular scenario-feature
2. Configure runner file
		@RunWith(Cucumber.class)
		@CucumberOptions(
				tags = "@temp",
				features = "src/test/resources/com/prestashop/features",
				glue = "com/prestashop/step_definitions",
				dryRun = true)
		public class CukesRunner {}
3. Then run it to generate step definitions.














#center_column a.product-name[title='Printed Summer Dress']

to generate xpath dynamically by yourself:
public WebElement item(String item) {
		String css = "#center_column a.product-name[title='"+item+"']";
		return Driver.getDriver().findElement(By.cssSelector(css));
	}
	/*
	 * takes a name of a product, builds a css based on the name
	 * and locates the product with the new css
	 * and returns it
	 * @param product name
	 */





======================================================================================

Cucumber Esen

Final Framework:
Java + Selenium + TestNG + Cucumber + Maven + POM + Extent Report.

Third party tools: Jenkins, Git.


1. Create a Maven Project
2. Download Cucumber plugin
	Help -> Eclipse MarketPlace -> Search Find: cucumber -> select "Option Cucumber plugin" -> Install.
	??? So after this, Eclipse is able to acknowledge cucumber syntax, to read feature files
3. Configure a "pom.xml".
4. Configure "Configuration.properties" file under your project (browserType=chrome)
5. Create a "features" folder under "src/test/resources"; 
	Create a "*.feature" file under "features" folder.
6. Create 5 packages under test folder
	1. pages
	2. steps (step_definitions)
	3. runners
	4. utilities (4 classes)
	5. pages

7. RUNNERS -> "CukesRunner" class.
	Then run it.
	So you will have a ready template of step classes
8. STEPS -> "featureName_steps"



CUCUMBER RUNNER CLASS

Runner class is the configuration class which controls the flow of the framework. Including connecting the feature files (scenarios) to steps definition code. Also it will generate certain types of reports which come fromCucumber library. It will help us to specify which group of scripts we want to run.



CUCUMBER HOOKS

Concept to control the status of the scenarious. Can be also used to configure each scenarios in Cucumber. It will help us to generate proper report.

Cucumber + JUnit 	==> 	@Test == Scenario (@Given + @When + @Then)

(Scenario sc) as an argument of setUp/closeUp method of Hooks class
	sc.isFailed()
	sc.write("...");

Background: is a keyword that can have Gerkhin steps which will be applied to each scenario within the feature file.


ESEN'S EXAMPLE FROM JP MORGAN

#1 -> HOOKS 

There is one functionality. If I go to that functionality, if I attach a picture and then this specific picture will be moved to database after 15 minutes.
How do I automate it?
I go application, attach any kind of picture, image and submit that. And in 15 minutes, I need to go to database and make sure that it has been already moved to db. So this is a scenario.
So check this. In this case I take a time stamp (epoch) when it was submitted and store it somewhere. Then right before launching any kind of scenario, program check the time: if 15 minutes is already passed or no. 
If 15 min passed: go to db, finish scenario. If no, keep executing following scenarios.
	System.currentTimeMillis();		--> returns a string with current time (always unique)

#2 -> BACKGROUND

I have about 100 feauture files and approximately 250-300 scenarios within the 100 feauture files. Whenever I need to write some feature file I have in average 7-8 step to do 1 scenario and actually I have to do only 2 or 3 steps and all the time other 4 or 5 steps (as go to application, navigate to somewhere, click to here, send somedata to some specific module) they are repeatable so I don't have to write new code over and over. I just combine them under Background. 



# Mac => cmd+shift+F



CUCUMBER MAPPING

Java maps store values with the unique key. Whenever values neede we can fetch data using its unique key.

	> Cucumber allows us to use Java map concept to drive test data from feature files.
	> Only 2 columns are required to work with Map in Cucumber scenarios.
	> First column: is key for the map.
	> In step definitions we can get datat using the same key that was declared in feature file.

!!! 	- Do we use them a lot?
		- No!

1. Feature file.
	Then user completes all info:
	| anyKey | anyValue |
2. Run it to Generate a template for steps file.
3. Steps file.
	* (DataTable dataTable)  -->  (Map <String, String> anyMap)
	* anyMap.get("anyKey")



BEANS (POJO), MODEL CLASSES
		POJO - Plain Old Java Object
1. Paste "DataTableConfigure.java" class under steps package
2. Feature file:
	| elementA | elementB | elementC |
	|  valueA1 |  valueB1 |  valueC1 |
	|  valueA2 |  valueB2 |  valueC2 |
3. Run it to Generate a template for steps file.
4. Steps file.
	* (DataTable dataTable)  -->  (List <User> users)
	* users.get(0).getElementA();
User - class under "models" package
elementA - private property of User class
getElementA() - of User class (getters / setters)



CUCUMBER OUTLINE

1. Feature file:
	Feature: 
	Scenario Outline: 	<-- Scenario
		Given ...
		When ... "<headerA>"...
		Then ...
	Examples:
		| headerA | headerB | headerC |
		| valueA1 | valueB1 | valueC1 |
		| valueA2 | valueB2 | valueC2 |
2. Run it to Generate a template for steps file.













































------------------------------------------------------------------------------------

"*.FEATURE" file 

		Feature: Google Search
		Scenario: Search result verification on Google
		Given user goes to google.com
		When user searches for apple
		Then user should see apple related result

------------------------------------------------------------------------------------

POM.XML

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.cybertek</groupId>
  <artifactId>esen_cucumber</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  
  	<properties>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target>
	</properties>
	
	
	<dependencies>
	
		<dependency>
		    <groupId>junit</groupId>
		    <artifactId>junit</artifactId>
		    <version>4.12</version>
		    <scope>test</scope>
		</dependency>		
		
		<dependency>
		    <groupId>io.cucumber</groupId>
		    <artifactId>cucumber-junit</artifactId>
		    <version>3.0.2</version>
		    <scope>test</scope>
		</dependency>
			
		<dependency>
		    <groupId>io.cucumber</groupId>
		    <artifactId>cucumber-java</artifactId>
		    <version>3.0.2</version>
		</dependency>
		
		 <dependency>
		    <groupId>org.seleniumhq.selenium</groupId>
		    <artifactId>selenium-java</artifactId>
		    <version>3.13.0</version>
		</dependency>
		
		<dependency>
		    <groupId>io.github.bonigarcia</groupId>
		    <artifactId>webdrivermanager</artifactId>
		    <version>3.0.0</version>
		</dependency>
		
		<dependency>
		    <groupId>org.apache.poi</groupId>
		    <artifactId>poi-ooxml</artifactId>
		    <version>3.17</version>
		</dependency>

	</dependencies>
</project>

------------------------------------------------------------------------------------

RUNNERS -> "CukesRunner" class.

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = {"html:target/cucumber"},
	features = "spath for folder of your features",
	glue = "path for steps",
	tags = "@...",
	dryRun = t/f
	)
public class CukesRunner {}

plugin 	-> for reports
tags 	-> to tag features by giving unique id (value) for special scenarios or features
			({"@tag1", "@tag2"} - for multiple tags)

------------------------------------------------------------------------------------

STEPS -> "FeatureName_steps"

public class FeatureName_steps{
	//Template from console after running 
	@Given
	@When
	@Then
}

------------------------------------------------------------------------------------

PAGES 

	public class className_Page{
		private WebDriver driver;
		public className_Page() {
			driver = Driver.getDriver();
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="we1ID")									
		public WebElement we1;
		@FindBy(anyLoc="...")								
		public List<WebElement> anyName;
		public returnType methodName(){}				
	}

! Don't forget to create an instance of class in your steps file.

------------------------------------------------------------------------------------

HOOKS under STEPS package

	@After
	public void closeUp(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			scenario.write("THIS SCENARIO IS FAILED :(((");
		}
		Driver.closeDriver();
	}


















