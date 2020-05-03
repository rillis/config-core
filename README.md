# Config API  

![Maven](https://img.shields.io/maven-central/v/com.github.rillis/configcore)
![License](https://img.shields.io/github/license/rillis/config-core)


```xml
<dependency>
  <groupId>com.github.rillis</groupId>
  <artifactId>configcore</artifactId>
  <version>2.1.2</version>
</dependency>
```

## Docs

**Constructors:**  
```java
Config(String folder, String archive) -> %APPDATA%\folder\archive  
Config(String archive) -> %APPDATA%\ConfigCore\archive
Config(File archive) -> Any path. 
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