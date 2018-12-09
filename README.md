# Santa App

An application to demo the use of git-bisect in identifying and fixing bugs.

It serves Santa's naughty & nice list as JSON.

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
      