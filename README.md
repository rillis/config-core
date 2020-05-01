# Config API  

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.rillis/configcore/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.rillis/configcore)

```xml
<dependency>
  <groupId>com.github.rillis</groupId>
  <artifactId>configcore</artifactId>
  <version>2.0.1</version>
</dependency>
```

## Docs

**Constructors:**  
```java
Config(String folder, String archive) -> %APPDATA%\folder\archive  
Config(String archive) -> %APPDATA%\ConfigCore\archive  
```
  
**Methods:**  
```java
get(String key) : Object  
set(String key, Object value) : void  
getKeys() : Iterator<String>  
getKeyCont() : int  
has(String key) : boolean  
remove(String key) : void
```