# Pull base image 
From tomcat:8-jre8 

# Maintainer 
MAINTAINER Aditya K "adishar21@gmail.com" 

ADD **/*.war /usr/local/tomcat/webapps
 
EXPOSE 8080
 
CMD ["catalina.sh", "run"]
