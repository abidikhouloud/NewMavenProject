                  How to create a Java project with Maven
	  
Tools used :
Maven 3.0.5
Eclipse 4.2
JDK 6

How to install Maven on Windows:
Make sure JDK is installed, and “JAVA_HOME” variable is added as Windows environment variable
Download Apache Maven: apache-maven-3.2.2-bin.zip.
Add M2_HOME and MAVEN_HOME
Add To PATH: %M2_HOME%\bin

create a Java project:
use this command:mvn archetype:generate -DgroupId={project-packaging}
   -DartifactId={project-name}
   -DarchetypeArtifactId=maven-archetype-quickstart
   -DinteractiveMode=false
   
update your pom.xml

<dependency>
	<groupId>junit</groupId>
	<artifactId>junit</artifactId>
	<version>4.11</version>
	<scope>test</scope>
</dependency>

<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-compiler-plugin</artifactId>
	<version>2.3.2</version>
	<configuration>
		<source>1.6</source>
		<target>1.6</target>
	</configuration>
</plugin>


 To Run the App:
 mvn package

