# graphql-springboot
simple graphql sample application using graphiql and GraphQLResolvers

Steps to execute this application locally
------------------------------------------
1. Download application from https://github.com/jamesalumkal/graphql-springboot to your local folder
2. Unzip the graphql-springboot-master.zip and move the graphql-springboot-master to your local development folder
3. change directory to graphql-springboot-master
4. $ mvn clean install (if build success, move to next step)
5. $ java -jar target/gqltest-spring-boot-0.0.1-SNAPSHOT.jar
6. Open a browser and invoke: http://localhost:8080/myapp/graphiql
- what you see here is the graphiql UI
- on the right hand side, use the Documentation explorer to understand the defined schema and query supported
7. Execute a sample query from the left pane:

{
  getPerson(personInputquery:{pid:"P100"})
  {
    pid
    name
    age
    address {
      aptNumber
      street1
      street2
      city
      state
      country
    }
  }
}

You should see the response as below.

{
  "data": {
    "getPerson": {
      "pid": "P100",
      "name": "James",
      "age": 21,
      "address": {
        "aptNumber": 1,
        "street1": "Mission St",
        "street2": null,
        "city": "San Francisco",
        "state": "CA",
        "country": "USA"
      }
    }
  }
}

Now you can play around with modifying the Schema. The response will be based on what you ask in your schema. Cool eh...?

How to invoke the service from a postman (restful service client)?

POST /gqlpath/graphql HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Cache-Control: no-cache

{"query":"{\n  getPerson(personInputquery:{pid:\"P100\"})\n  {\n    pid\n    name\n    age\n    address {\n      aptNumber\n      street1\n      street2\n      city\n      state\n      country\n    }\n  }\n}","variables":null,"operationName":null}

You should get response as below:

{
    "data": {
        "getPerson": {
            "pid": "P100",
            "name": "James",
            "age": 21,
            "address": {
                "aptNumber": 1,
                "street1": "Mission St",
                "street2": null,
                "city": "San Francisco",
                "state": "CA",
                "country": "USA"
            }
        }
    }
}