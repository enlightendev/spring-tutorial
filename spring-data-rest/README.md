## about

This version of the application further reduces the amount of code and greatly
enhances the available functions on the service. The tag service in this version
supports sending HTTP requests to:

   1. List all tags by sending a GET request to /tag 
   2. Add a tag by sending a POST request to /tag with the JSON for a tag
   3. Get a specific tag by sending a GET request to /tag/{tagId}
      (e.g., /tag/1 would return the JSON for the tag with id=1)
   4. Send search requests to our findByXYZ methods to /tag/search/findByXYZ
      (e.g., /tag/search/findByName?title=Foo)

#### what to pay attention to

In this version of the tag service application, we have added Spring Data Rest,
which automatically provides all of the functions describe above for our repository.

1. This version completely eliminates the controller. Instead, we are using
   Spring Data Rest to magically create a controller that allows clients to save,
   findAll, and search for tags. The important configuration parameters to enable
   Spring Data Rest are in Application and TagRepository. 
2. The Application class now extends RepositoryRestMvcConfiguration so that Spring Data
   Rest is automatically enabled.
3. The @RepositoryRestResource annotation on TagRepository tells Spring Data Rest to
   expose the TagRepository through a controller and map it to the 
   "/tag" path.

## tags


## setup 


## running


## testing


## resources

