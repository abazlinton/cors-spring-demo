If you comment out this annotation (so Spring ignores the file)
```java
// configurations/CustomRouteCORSConfig.java 
@Configuration
``` 
Then in an new Chrome tab Console. 
```js
fetch('http://localhost:8080/persons/custom')

// Access to fetch at 'http://localhost:8080/persons/custom' from 
// origin 'chrome-search://local-ntp' 
// has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header 
// is present on the requested resource

```
👆CORS error 

SDR routes will still work. E.g.

```js
fetch('http://localhost:8080/persons/custom').then(res => res.json()).then(console.log)

// {_embedded: {…}, _links: {…}, page: {…}}
```
