# Config API  

![Maven](https://img.shields.io/maven-central/v/com.github.rillis/configcore)
![Release](https://img.shields.io/github/v/release/rillis/config-core)
![License](https://img.shields.io/github/license/rillis/config-core)


```xml
<dependency>
  <groupId>com.github.rillis</groupId>
  <artifactId>configcore</artifactId>
  <version>2.0.2</version>
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