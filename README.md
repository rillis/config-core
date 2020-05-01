# Config API

Download: [click here](https://github.com/rillis/ConfigCore/releases/latest)

## Docs

**Constructors:**  
```java
Config(String folder, String archive) -> %APPDATA%\folder\archive  
Config(String archive) -> %APPDATA%\Rillis\archive  
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