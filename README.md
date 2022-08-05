# Code Sharing Platform


A platform for developers to share codes securely, with restriction on time and number of views.
A project completed as part of requirement for the JetBrains Backend Developer certification.

## Installation

Gradle is used as the build tool.


## Endpoints

```java

@GetMapping("/code/{id}")
// returns code with the specified id as http object

@GetMapping("/code/latest")
// returns 10 most recent codes as http page

@GetMapping(value = "/code/new"
// takes the code input

@GetMapping("/api/code/{id}")
// returns code with the specified id as json object

@GetMapping("/api/code/latest")
// returns 10 most recent codes as json object

@PostMapping("/api/code/new")
// takes the code input as json
```

## Contributing
Pull requests are welcome. 

## License
None