
When you attend a Coding Dojo is good to prepare your IDE or prefered environment for running test.

You may download from this repo empty runnable projects in different languages.
They only contain an empty test, and in some case an example.

You can import them in your favorite IDE or running them in your command line. But do it in advance of the event to save time.

Suggested reading about naming conventions in testing (Java oriented but may inspire you in other languages):

https://codurance.com/2014/12/13/naming-test-classes-and-methods/

You can download this katainception projects ready to import doing:

$ git clone https://github.com/franferri/codingdojo-katas.git

You can import your project in your prefered IDE or running them from the console.

Running in the console katainception-java, jdk and maven needed
* mvn clean package -t katainception-java

Running in the console katainception-python, python needed

$ cd katainception-python
Running a single test module:
$ python -m unittest test.test_antigravity
Running a single test case:
$ python -m unittest test.test_antigravity.GravityTestCase
Running a single test method:
$ python -m unittest test.test_antigravity.GravityTestCase.test_method
Running all the tests
$ python -m unittest discover

Running in the console Kotlin