REST DEMO WITH DOCKER
-----------------------------------------------------------------------------

Rest API that runs on port 5000 and contains just two simple endpoints:

http://localhost:5000/hello

http://localhost:5000/hello-to-you/{name}

-----------------------------------------------------------------------------


After packaging the Java application as a Jar file, the Docker image is built and run with these commands:

```

docker build -t running-rest-demo-with-docker:0.0.1 .

docker run -d -p 5000:5000 running-rest-demo-with-docker:0.0.1

```

-----------------------------------------------------------------------------