# Santa's List API

An application to demo the use of git-bisect in identifying and fixing bugs.

The application itself is a Spring Boot application that serves Santa's naughty
& nice list as JSON API.

## Running the App

    $ ./gradlew bootRun
    
### Get the lists

    $ curl 'http://localhost:8080/santa/list/nice'
    $ curl 'http://localhost:8080/santa/list/naughty'
    
### Add to the lists

    $ curl -X POST 'http://localhost:8080/santa/list/nice'\
      -H "Content-Type: application/json"\
      -d '{"name":"Tommy","age":8}'
      
    $ curl -X POST 'http://localhost:8080/santa/list/naughty'\
      -H "Content-Type: application/json"\
      -d '{"name":"Jimmy","age":8}'
      
      
## Demo with Git-Bisect

This repository was used for a demo at the Denver Java User Group December 2018
Lightning Talks meetup. View the slides
[here](DJUG_Git-Bisect-2018-Lightning-Talk.pdf).

1. Check out `v1.0`.
2. Run the application, and notice that the nice list is bug-free.
3. Check out `v1.1` (or `master`).
4. Notice that the nice list is broken (the Grinch has taken over the list).
5. Run `git bisect start`.
6. Run `git bisecd bad` to mark `v1.1` as broken.
7. Run `git bisect good v1.0` to mark `v1.0` as working.
8. Continue with `git bisect good` or `git bisect bad` after testing each
   commit.
9. When you're finished, do `git bisect reset`.

