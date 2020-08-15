FROM tomcat:8-jre8

COPY target/producer-1.0.war /usr/local/tomcat/webapps/producer.war
COPY tomcat-users.xml $CATALINA_HOME/conf/
COPY context.xml $CATALINA_HOME/webapps/manager/META-INF
