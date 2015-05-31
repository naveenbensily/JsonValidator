# JsonValidator
Demo to show how to Validate Json

This guide walks you through the process of Validating Json when calling a POST RestController 

Some of the important points here are . 
Use of  @Valid annotation http://docs.oracle.com/javaee/7/api/index.html?javax/validation/Valid.html .

Domain Class where the constraints are set against the member variables . Below the year value must be equal or greater than 2015 

@XmlRootElement(name = "customer")
public class Customer {

    @XmlElement
    @Min(2015)
    private int year;
    …..
}

Now Lets run this program and post some Data.

To Run , you can use the spring boot maven plugin .  
 mvn clean package spring-boot:run

If all goes well your application hitting the below service should return true  http://localhost:8095/JsonValidator/isServiceRunning

Now Lets Test the validation by posting some json data . We will be using Curl 

>curl -H "Content-Type: application/json" -X POST -d '{"firstName":"Booch","lastName":"B","id":5,"year":200}' http://localhost:8095/JsonValidator/postJson

You should get a validation message .

{"timestamp":1433032022582,"status":400,"error":"Bad Request","exception":"org.springframework.web.bind.MethodArgumentNotValidException","message":"Validation failed for argument at index 0 in method: public void com.demo.jsonvalidator.controller.JsonValidatorController.jsonValidation(com.demo.jsonvalidator.model.Customer), with 1 error(s): [Field error in object 'customer' on field 'year': rejected value [200]; codes [Min.customer.year,Min.year,Min.int,Min]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [customer.year,year]; arguments []; default message [year],2000]; default message [must be greater than or equal to 2000]] ","path":"/JsonValidator/postJson"}



