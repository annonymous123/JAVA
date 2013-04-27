This example shows how to Shift Control from Asterisk to your JAVA Application.

Downaload Asterisk-Java from here 
https://nexus.reucon.com/content/repositories/opensource/org/asteriskjava/asterisk-java/1.0.0-m2/

If you are already using Maven for development that means to you that you no longer have to download Asterisk-Java in order to use it. You can just declare a dependency and Maven automatically downloads it from central.
<dependency>
  <groupId>org.asteriskjava</groupId>
  <artifactId>asterisk-java</artifactId>
  <version>1.0.0-m2</version>
</dependency>
