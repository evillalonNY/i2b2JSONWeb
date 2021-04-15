Columbia University DBMI  

City of New York, NY   

Elena Villalon   


Creates the Servlet that converts the request_xml file to a json file which can run the i2b2 query in OHDSI/ATLAS using the circe software. 


i2b2JsonServlet contains the src code and the library with the jar files to generate the Servlet war file to be deployed in wildfly/deployments.   


JSONTransformer is the plugin to add to the i2b2 webclient to run the Sertvlet.It takes a query from the query window and generates the json file that can be copy in ohdsi/Atlas.    

