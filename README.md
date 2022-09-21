# API1

## OpenAPI 3.0 Generated JAX-RS Example

This project contains generated code from an OpenAPI 3 definition. The project embeds a Jetty server so it can run stand alone. The generated code is fairly common JAX-RS annotated and should run within existing projects

### How to build

To build this project:

> mvn clean install

### How to run

To run the application:

> mvn exec:java

### Generated code

Typically as an API is iterated on, the code is regenerated to stay in sync with the API definition. However, once a developer starts adding their own code to the stub implementation class(es), they wont want to overwrite those file(s). To avoid this, when unzipping the generated archive file, avoid overwriting the stub implementation files.

There are primarily two pieces to the generated code. The interface class(es), which includes all the JAX-RS annotations except the @Path annotation, and the stub implementation class(es) which will implement the appropriate interface and provide the @Path annotation.

The interface classes reside in the `com/<project>/api` directory. Each `*Resource.java` file contains the interface for all operations belonging to a unique base path. A unique base path is one which has the same base name with any number of additional path after it. For example, /pets, /pets/{id}, /pets/{id}/items would all be under the unique path named "pets". The interface class would be PetsResource.java. In it would be all the operations under all child paths of the unique path "pets" as individual methods. NOTE: It's important to understand that method names utilize the operationId value. OperationId, while optional, when provided must be globally unique within the API definition. Each method will have any number of JAX-RS annotations associated with it to identify the various media types the operation supports, parameters (head, query, path and cookie), as well as the method of the operation (GET, PUT, POST, DELETE, PATCH).

The implementation classes reside in the `com/<project>/impl` directory. Like the generated interface class(es), there is one for each unique base path. Each class will be stubbed out. It will have the @Path set for the unique base path, and will contains stubbed method implementations for all operations. Each will return the default or first response type specified in corresponding API definition with other response type options commented out. Each class will also provide access to the servletConfig, servletContext, servletRequest, servletResponse and uriInfo objects.

### Why an interface?

A couple of reasons. First, our stub implementation of the interface may not work for developers who have existing projects already, or prefer to provide their own implementation... thus only needing to implement the interface and do as they please with their implementation.

As well, the generated interface changes with the API definition. Thus, when implementing the interface, the implementation wont compile.. or result in IDE details indicating a problem.. alerting the developer to changes that have been updated with the API definition changes. This ensures as the API is iterated on, implementation code has to be updated to stay in sync with the API definition and generated interface(s).

### What isn't supported at this time...

Currently, the generated code supports all paths, operations and utilizes the JAX-RS annotations to pull out the various parameter types. It does not directly pull out any request body (e.g. for a Post), but the implementation class(es) have the servletRequest object available to directly access any aspect of the request object.

Support for OpenAPI 3 types other than string, boolean, integer and number are not fully supported. For example, a query parameter can be defined as a reference to a component.. which would result in a class matching the signature of the properties of the component. This is not yet supported but is planned. Numbers can specify formats.. int32 results in an int, int64 results in a long. A float32 is a float, and a float64 becomes a double.

Components are partially supported in that POJOs are generated for components, but nested components are not yet supported. Arrays of types are not yet supported.



