# JPA-simple-example


Spring data JPA example using in-memory database (H2), db operations executed using CommandLineRunner. 


Creating DAO services for each entity will lead to repetition of similar methods to insert, update or delete data in the database. 
Spring data JPA facilitates creation of repository interface instead, so that we don't have to implement methods for each entity separately. Spring Boot Autoconfiguration will take care of implementation.
