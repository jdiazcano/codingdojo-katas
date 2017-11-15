
## Easy start

When you attend a Coding Dojo is good to prepare your IDE or prefered environment for writing and running tests.

If you don't know how to start you may want download from this repo, it contains a few projects with an empty test and an example that ment to be run after you import them in your IDE or from the console, so you can check your gear before we start. Do this in advance of the event to save time.

You can clone this repository, import your prefered tecnology project in your prefered IDE or running them from the console.

    $ git clone https://github.com/franferri/codingdojo-katas.git

### Java example (maven needed)
    $ cd katainception-python
    $ mvn clean package -t katainception-java

### Python example

    $ cd katainception-python

**Running a single test module:**

    $ python -m unittest test.test_antigravity

**Running a single test case**

    $ python -m unittest test.test_antigravity.GravityTestCase

**Running a single test method**

    $ python -m unittest test.test_antigravity.GravityTestCase.test_method

**Running all the tests**

    $ python -m unittest discover

### Kotlin example

	$ whatever

## Suggested readings

*TDD*
* You must write a failing test before you write any production code.
* You must not write more of a test than is sufficient to fail, or fail to compile.
* You must not write more production code than is sufficient to make the currently failing test pass.
* You should follow the circle Red - Green - Refactoring:
** Red - Create a failing test
** Green - Write enough code to make the test pass
** Refactor - Clean up your code and your tests (don't forget that your tests are code too)
* http://blog.cleancoder.com/uncle-bob/2014/12/17/TheCyclesOfTDD.html

*Naming your tests*
* https://codurance.com/2014/12/13/naming-test-classes-and-methods/

Happy growing :D 
