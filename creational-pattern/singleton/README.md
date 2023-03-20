### UML
<img width="590" alt="image" src="https://user-images.githubusercontent.com/8929789/226412808-d15cedff-110d-4652-97bf-5b8b77a8d722.png">

### Description
Singleton Pattern says that just **_define a class that has only one instance and provides a global point of access to it_**.

In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.

There are two forms of singleton design pattern
1. **Early Instantiation** - The instance of the class is created at the time of declaring the static data member, so instance of the class is created at the time of classloading
2. **Lazy Instantiation** - The instance of the class is crated in synchronized method or synchronized block, so instance of the class is created when required.
