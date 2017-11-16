
### Easy start

When you attend a Coding Dojo is good to prepare your IDE or prefered environment for writing and running tests.

If you don't know how to start you may want download from this repo, it contains a few projects with an empty test and an example that ment to be run after you import them in your IDE or from the console, so you can check your gear before we start. Do this in advance of the event to save time.

You can clone this repository, import your prefered tecnology project in your prefered IDE or running them from the console.

    $ git clone https://github.com/franferri/codingdojo-katas.git

#### Java example (maven needed)
    $ cd katainception-java
    $ mvn clean test

#### Python example

    $ cd katainception-python
    Running a single test module: $ python -m unittest test.module
    Running a single test case: $ python -m unittest test.module.test_case
    Running a single test method: $ python -m unittest test.module.test_case.test_method
    Running all the tests: $ python -m unittest discover

#### Kotlin example

	$ cd katainception-python
	whatever

### Suggested readings

**Creating your first test**
![Test in 5 steps](https://github.com/franferri/codingdojo-katas/blob/master/images/test_in_5_steps.jpg)
Suggested reading: https://codurance.com/2014/12/13/naming-test-classes-and-methods/

**Use TDD**
* You must write a failing test before you write any production code.
* You must not write more of a test than is sufficient to fail, or fail to compile.
* You must not write more production code than is sufficient to make the currently failing test pass.
* You should follow the circle Red - Green - Refactoring:
  * Red - Create a failing test
  * Green - Write enough code to make the test pass
  * Refactor - Clean up your code and your tests (don't forget that your tests are code too)
![Red Green Refactor](https://github.com/franferri/codingdojo-katas/blob/master/images/red_green_refactor.jpg)
Suggested reading: http://blog.cleancoder.com/uncle-bob/2014/12/17/TheCyclesOfTDD.html

**Happy growing :D**
