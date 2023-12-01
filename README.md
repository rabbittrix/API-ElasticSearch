Steps to run this application:

Step 1. Download Elastic search (This is using elasticsearch 8.11.1) from https://www.elastic.co/downloads/elasticsearch
Once download is completed unzip in desired folder.

Step 2. Go to Config folder inside Elasticsearch and edit “elasticsearch.yml” go to line 17 and remove the # (uncomment the line) and edit with following line
cluster.name: api-elasticsearch
Now in the same file go to line 33 and edit the path.data line to following
path.data: <Exact Location of the place where this project is downloaded>
e.g path.data: /Users/ElasticSearch_Java/api_ElasticSearch

Step 3. Now we need to start the elasticsearch engine, for this, go to elasticsearch folder (Unzipped folder in step 1) and run bin/elasticsearch file
Windows: bin\elasticsearch.bat
Macos / Linux : bin/elasticsearch
(Further help on how to run elasticsearch enginer can be found at
https://www.elastic.co/downloads/elasticsearch

Step 4. Now go to the code directory and run following command:
mvn install
Once it runs completely it will create a snapshot in your target file.
go to the target folder and run following command.
java -jar demo-0.0.1-SNAPSHOT.jar

Step 5. Now go onto the Browser and type
http://localhost:8080/swagger-ui.html#/
This will open a Swagger UI where you can search everything. 