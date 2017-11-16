This repository shows defect in DevToolsDataSourceAutoConfiguration
```sh
 mvn spring-boot:run
```

Result: exception with

> java.lang.IllegalArgumentException: Invalid boolean value [${name}]

However application pass smoothly if
- devtools are not attached
- DevToolsDataSourceAutoConfiguration is excluded
