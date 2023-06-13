# AutomationTask 

Describtion :- 
Four scenarios scripted by Java projramming language using Selenium , Mavem , TestNG and BDD cucumber technique 

First scenario :- Validate the Subscription Packages – Type & Price and Currency for Bahrain 
second scenario :- Validate the Subscription Packages – Type & Price and Currency for Kuwait
Third scenario :- Validate the Subscription Packages – Type & Price and Currency for KSA 
Fourth scenario :-   Ender invalid username while the user logging in and expect to get error message with Arabic language
 
 
 How to run ?
 run through cucumber report -- > TestRunner class in runner Folder 
  ![image](https://github.com/basmahassan2215/AutomationTask/assets/37849380/90e50c3c-fb06-4fcc-838f-1be1f549378c) 
  
  How to run the allure report ?
  open  the Terminal then write "allure.bat serve allure-results" 
  However this report will get the results of the tests in TestBase as its dependencies releated to Allure TestNG not Cucumber 
  as i prefere to run the feature files through Cucumber report 
  
  To run the allure report for cucumber 
  -- add these in the POM.xml file 
   
  <dependencies>
    <dependency>
        <groupId>io.qameta.allure</groupId>
        <artifactId>allure-cucumber4-jvm</artifactId>
        <version>LATEST_VERSION</version>
    </dependency>
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.20</version>
            <configuration>
                <argLine>
                    -javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"
                    -Dcucumber.options="--plugin io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
                </argLine>
            </configuration>
            <dependencies>
                <dependency>
                    <groupId>org.aspectj</groupId>
                    <artifactId>aspectjweaver</artifactId>
                    <version>${aspectj.version}</version>
                </dependency>
            </dependencies>
        </plugin>
    </plugins>
</build> 
  
 
 
 
i coverd another scenario but there is an issue while ruuning it , so i commented the code 
Feature file -- >  VoucherCodeRedeeming.feature. 


also there are regression suite in regressionSuite.xml & testng.xml
