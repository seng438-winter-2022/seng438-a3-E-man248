Course Title: Software Testing, Reliability, and Quality Course Code:
SENG 438 Assignment \#: 3 Student Names: Aashik Ilangovan (30085993)
Emmanuel Omari-Osei (30092729) Gibran Akmal (30094918) Priyanka Gautam
(30091244) Group Number: 31 Submission Date: 4/03/2022

### Manual Data-Flow Coverage Calculations the Two Methods

#### A Detailed Description of the Testing strategy for the New Unit Tests:
The testing strategy we developed for new unit tests consisted of some key points. Our main goal was to maximise our coverage in the following three categories: branch coverage, method coverage, and line coverage (statement coverage). Firstly, branch coverage is dictated mainly by how many paths our test covers for our conditional outcomes (branches). Our strategy for going about this was to target methods and code with many if statements and nested if statements. These pieces of code consisted of many potential branches, so we achieved large branch coverage by writing tests for these sections of code. Secondly, method coverage is determined by the number of methods and functions covered by our test cases. Our decided plan to tackle as many methods as possible in the least amount The tests to write were to target methods that are calling methods within them. This allowed us to be more efficient with our testing strategy, as we only had to write code for certain methods' functionalities. They would automatically test the functionality of methods called within them. This approach allowed us to minimise the number of tests we had to write as we avoided redundant writing tests for methods already being called within other methods. Lastly, line coverage is just the raw code or statements that our test cases cover. These include code within all branches and methods. We immediately saw large percentages of the line coverage in implementing the strategies used for the coverage mentioned above types. However, as much code as we tried to encapsulate with each line of our tests, there were certain methods that we unavoidably had to write extra test cases for to achieve the higher statement coverage.

A high level description of five selected test cases you have designed
using coverage information, and how they have increased code coverage:
Range Method 1

The expandtoInclude method, as shown above is fully covered through our
test cases (as highlighted in green).

    As it can be seen, the method expandToInclude(Range range, double value) from Range class is entirely highlighted in green. This means that this method has been thoroughly tested, and has a 100% test coverage. The test cases for this method were designed to ensure that all logical branches, and all lines of the code in this method were tested. Through these test cases that we designed and executed, we increased our coverage for this method, which consequently increased the coverage for the whole Range class. 
    The first test case, rangeIsNull() is written and designed to test the first if statement in the SUT, which is checking to see whether the argument parameter range = = null. In this test case, the argument parameter range that was passed is null thus, the first logical branch of the if statement is executed. The expandToInclude(Range range, double value) method will return a new Range where the upper bound = value [1.0] (passed in from the argument) and lower bound = value [1.0] (passed in from the argument). 
    The second test case, rangeIsNotNull() is written and designed to test the first if statement in the SUT, which is checking to see whether the argument parameter range = = null. In this test case, the argument parameter range that was passed is not null thus, the second logical branch of the if statement is executed, which means that the else statement is actually responsible for returning an object of Range. The expandToInclude(Range range, double value) method will return the range (passed in from the argument). 
    The third test case, lessThanLower() is written and designed to test the second if statement in the SUT, which is checking to see whether the argument parameter value is less than the argument parameter range's lower bound. In this test case, the value is 0.5 which is lower than the range's lower bound of 1.0. Thus, the first logical branch of the if statement is executed. The expandToInclude(Range range, double value) method will return a new Range where the upper bound = range's upper bound [2.0] and lower bound = value [0.5](passed in from the argument).
    The fourth test case, lessThanLower() is written and designed to test the else if statement in the SUT, which is checking to see whether the argument parameter value is greater than the argument parameter range's upper bound. In this test case, the value is 2.5 which is greater than the range's upper bound of 2.0. Thus, the first logical branch of the if statement is executed. The expandToInclude(Range range, double value) method will return a new Range where the upper bound = value [2.5](passed in from the argument) and the lower bound = range's lower bound [1.0].

-   .-.-.-.-.-.-.-.-.--.-.-.-

Method 2

-.-.-.-.-.-.-.-.-.-.- The expand method, as shown above is fully covered
through our test cases (as highlighted in green).

    As it can be seen, the method expand(Range range, double lowerMargin, double upperMargin) from Range class is entirely highlighted in green. This means that this method has been thoroughly tested, and has a 100% test coverage. The test cases for this method were designed to ensure that all logical branches, and all lines of the code in this method were tested. Through these test cases that we designed and executed, we increased our coverage for this method, which consequently increased the coverage for the whole Range class. 
    The first test case, RangeAppropriateValuesTest() is written and designed to test the first if statement in the SUT, which is checking to see whether the argument parameter range new lower bound is less than the range's new upper bound. In this test case, the argument parameter range that was passed has a new lower bound of -34.0 and a new upper bound of 74.0  thus, the second logical branch of the if statement is executed. The expand(Range range, double lowerMargin, double upperMargin) method will return a new Range where the upper bound =  20 + 9 (length of range) * 6 (upper margin passed in from the argument)  and lower bound = 11 - 9 (length of range) * 5  (lower margin passed in from the argument). 
      The second test case, RangeAppropriateValuesTest() is written and designed to test the first if statement in the SUT, which is checking to see whether the argument parameter range new lower bound is greater than the range's new upper bound. In this test case, the argument parameter range that was passed has a new lower bound of 56.0 and a new upper bound of -16.0  thus, the first logical branch of the if statement is executed because lower is less than upper. The expand(Range range, double lowerMargin, double upperMargin) method will return a new Range where the lower bound = [11 - 9 (length of range) * 5  (lower margin passed in from the argument)] / 2.0 + (-16.0) / 2.0 = 20.0 and the upper bound is 20.0. 

Method 3 (E-man)

      The method shift(Range base, double delta, boolean allowZeroCrossing) and its overloaded function shift(Range base, double delta) from Range class have been completely covered through testing, as visible above. Thus, the methods have 100% test coverage. The test cases for these methods were designed to ensure that all logical branches and all lines of code were tested. These test cases served to increase our test coverage for this method, which consequently increased the coverage for the whole Range class.
      
    The first test case, shiftBaseRangeIsNull() is written and designed to test the functionality of the shift(Range base, double delta) method when the parameter base = = null. In this test case, the parameter base was passed with a null value. The shift(Range base, double delta) method will throw an exception in response to this input. When testing, the test case passed.

    The second test case, shiftNotAllowingZeroCrossingWithDeltaNotEqualZero() is written and designed to test the else branch of the if / else statement in the SUT, which is checking to see whether the parameter allowZeroCrossing = = false. In this test case, the argument parameter allowZeroCrossing of shift(Range base, double delta, boolean allowZeroCrossing) was passed as false. This is done automatically in the overloaded method shift(Range base, double delta), so it is used in this test to increase line coverage. As the method was tested, the else component of the logical branch of the statement was executed. This correctly outputs a new Range object appropriately shifted, meaning the test case passed.

    The third test case, shiftAllowZeroCrossingGivenZero() is written and designed to test the if branch of the if / else statement in the SUT, which is checking to see whether the parameter allowZeroCrossing = = true. In this test case, the argument parameter allowZeroCrossing of shift(Range base, double delta, boolean allowZeroCrossing) was passed as false. Thus, the first logical branch of the if statement is executed. As the method was tested, the if component of the logical branch of the statement was executed. This correctly outputs a new Range object appropriately shifted, meaning the test case passed.

Data Utilities

Method 4 Chosen Test (Gibran's method):
DataUtilitiesCalculateRowTotalTestCols

      As it can be seen, the method calculateRowTotal(Values2D data, int row, int[] validCols) from the DataUtilities class is entirely highlighted in green. This means that this method has been thoroughly tested, and has a 100% test coverage. The test cases for this method were designed to ensure that all logical branches, and all lines of the code in this method were tested. Through these test cases that we designed and executed, we increased our coverage for this method, which consequently increased the coverage for the whole DataUtilities class.

    The first test case, calculateRowTotal_NothingNull() is written and designed to test the first if statement in the SUT, which is checking to see whether the argument parameter data = = null. In this test case, the argument parameter date that was passed is not null thus, the first logical branch of the if statement is executed. Also the number of rows set in the test case are within the valid range that was set by the parameter: "validCols". Therefore this test should return the correct row total of 33.0 according the the assigned values preset for the rows.

    The second test case, calculateRowTotal_NullWithinRange() is written and designed to test another logical branch of the method, in checking what happens when a single row entry is null but the rest are not. In this test, the value at the 1st row and 3rd column is set to null while all the other row values are not null. Also the "validCols" argument passed in is not null and the number of rows set in the setup are within that range. Therefore this tests to see if the null value in that single row/column entry affects the calculation. It is expected that the null value is ignored and the rest of the not null row values are added as normal to return the total of 20.0

    The third test case, calculateRowTotal_NullExact() is written and designed to test the second if statement in the SUT. In this test case the argument "validCols" passed in is exactly equal to the number of columns being set in the @setup section. As well as just like in the previous test case, the final entry in that row is set to null. This should not change much as the method is expected once again to ignore the null entry in the row total calculations and we should be returned the value of 20.0.

-.-.-.-.-.-.-.-.-.-.-

Method 5 (Aashik)

      The method clone(double[][] source) from DataUtilities class is entirely highlighted in green. This means that this method has been thoroughly tested, and has a 100% test coverage. The test cases for this method were designed to ensure that all logical branches, and all lines of the code in this method were tested. Through these test cases that we designed and executed, we increased our coverage for this method, which consequently increased the coverage for the whole DataUtilities class. 
      The first test case, sourceIsNull() is written and designed to test the first if statement in the SUT, which is checking to see if the argument parameter source[i] != null, is null. In this test case, the argument parameter source[i] that was passed is null thus, the if statement is skipped in the for-loop. The clone(double[][] source) method will clone back a double of null.
    The second test case, sourceIsValid() is written and designed to also test the first if statement in the SUT, which is checking to see whether the argument parameter source[i] != null is not null. In this test case, the argument parameter source[i] that was passed is not null thus, the logical branch of the if statement is executed, which means the if statement will follow through. The clone(double[][] source) method will clone back the double that was inputted.
      The third and final test case,sourceElementIsNULL() is written and designed to also test the first if statement in the SUT, which is checking to see whether the argument parameter source[i] != null is not null. In this test case, the argument parameter source[i] that was passed has an element that is null and an element is not not null; we input the following {null, {1,0}} as our input. The logical branch of the if statement is executed, which means the if statement will follow through. The clone(double[][] source) method will clone back the double that was inputted even with part of the input being null.

-.-.-.-.-.-.-.-.-.-.-

A detailed report of the coverage achieved of each class and method (a
screen shot from the code cover results in green and red colour would
suffice)

Range Method Counter \~ 100.0%

Line Counter \~ 93.2%

Branch Counter \~ 90.3%

DataUtilities Method Counter \~ 90.0%

Line Counter \~ 98

A comparison on the advantages and disadvantages of requirements-based
test generation and coverage-based test generation:

       Requirements-based testing is where the test cases are developed by obtaining information from the requirements. Advantages of this testing approach allow the testers to perform both  functional and non functional tests. Attributes such as performance, reliability and usability of the system are tested through this approach. An advantage of this type of testing is that it is easy to validate if the requirements of the system are correct. For example, in assignment 2, when using the black-box approach, we used requirements based testing to write test suites. These test suites were able to test the qualitative aspects of the SUT. It ensured the functionality of the methods was behaving appropriately. Disadvantages of this type of testing is that there are a greater number of unidentified bugs. This is because since you cannot actually see how much of the source code your tests have covered, you cannot know for certain if you have tested for every logical path. Since there are bound to be paths that have not been tested, there could be potential bugs in the code that go undetected which weakens the reliability of the whole SUT. 
       Coverage-based testing is determining how much of the source code is being tested. This type of approach encompasses branch, statement or function coverage. An advantage of this technique is that through this approach, the testers are able to assess if more test cases are needed in their test suite to make sure they reach a certain coverage metric for their SUT. This testing approach also makes the test suite more thorough as the testers can make sure all logical paths of the source code are tested. For example, in this assignment, when using white box approach, we used coverage based testing to write test suites. These test suites were so thorough, that they were able to ensure if the SUT was logically consistent. Since these test cases in the test suite were developed to cover all possible paths that the input could take in the source code, it produced a high coverage which consequently means that the chances of finding unidentified bugs in the code were low. This is one of the biggest benefits of using this technique compared to the other technique. We were able to quantitatively assess our test suites. Disadvantages of this type of testing is that there are several coverage tools that can be utilised to measure coverage. Since different coverage tools can be used, and if the tool is not consistent across the team, then you will not be able to compare the code coverage results. One code coverage's tool's result might be completely different from another code coverage's tool. Lastly, one of the disadvantages of coverage based testing is finding the appropriate coverage tool that suits your specific requirements. For example, in this lab, my group used the coverage tool EclEmma. This coverage tool only had branch, line and method counters whereas the requirements of the assignment required us to find branch, statement and condition coverage. We had to substitute method coverage requirement to condition coverage, as indicated in the lab document. 
       

Pros and cons of the coverage tools tried by your group in this
assignment, in terms of reported measures, integration with the IDE and
other plug-ins, user friendliness, crashes, etc.

      The coverage tool our team used in this lab assessment was EclEmma. This tool coverage now comes built into the new Eclipse IDE configuration upon downloading Eclipse. This made the coverage tool installation very straightforward for our team since we all had up-to-date versions of Eclipse running on our computers, as they were needed for the previous lab assignment.

      With the installation of the software out of the way, our team followed the lab report instructions on setting up coverage tests using EclEmma. This process was also made fairly simple in our group as this application had tools specially made for the Eclipse IDE that made running coverage tests just as easy as running them. Thus, we could conclude that EclEmma was optimally integrated for our IDE (Eclipse).

      Our group faced a challenge with this plug-in when performing condition coverage. EclEmma does not have any direct functionality that allows the condition coverage metric to be reported. Thankfully, it is detailed in the lab report that groups are allowed to report on method coverage instead of condition coverage for using EclEmma. While this allowed our group to carry on with the lab normally, for another testing situation this could pose a major hurdle and might require switching to another coverage algorithm.

      Aside from the absence of condition coverage, the plug-in was user friendly and made it clear which classes we were covering and by how much. This was displayed using visuals of green and red highlights on code that were covered and not covered respectively. Overall, we had a fairly good experience with the EclEmma coverage testing software.

A discussion on how the team work/effort was divided and managed:
Teamwork is a fundamental core part of software testing. In order to go
through the test we read and did the preliminary parts of the test as a
group (the setups in part 1) and proceeded to go through one testing
process in DataUtilities together as well. This was to ensure that
everyone was up to par in the standard, format and overall understanding
of coverage testing and being able to read and interpret code coverage
amounts. From there, we would proceed to have multiple group sessions
where we worked individually on our own tests but configured with each
other whenever needed.

      A lesson learned throughout the entire process was that having more than one pair of eyes on an issue can provide faster and better solutions. For example, as we were first running through a test as a group, all of us had input our knowledge and ideas on how to set up the tests and do the test from previous courses. It provided an efficient process into creating a test for the example method as well as filled any knowledge gaps that we had going into the lab, allowing us to work on our own split individual tests as well. Each person was responsible for writing test cases for at least two methods and documenting their strategy. Furthermore, collaboration on one or two test cases allowed us to formulate the best estimations on how to increase overall coverage through trial and error and input from other team members. That way, when we went to individually work on each of our own tests, we already knew the main things to target to increase each type of coverage and did not have to spend a lot of time experimenting by ourselves.
      
      Teamwork is incredibly important in software development as "teamwork makes the dream work." Learning how to work in a team is imperative for engineers across all disciplines because it introduces them to varying new perspectives that only strengthen the final product. One of the key lessons that we learned about teamwork is that open communication, transparency and hard work are the foundations of any successful group. 

Any difficulties encountered, challenges overcome, and lessons learned
from performing the assignment: There were a few challenges and lessons
that came about while performing through the assignment. The first was
downloading and implementing the coverage tools such as EclEmma and
getting it to work with our individual ide's and computers. Next, came
the testing part, to which we had discovered multiple errors with our
previous tests that we had not yet encountered prior to this assignment.
This caused a significant setback in pacing as we had to fix multiple
errors before even beginning the coverage part of the assignment. After
running our tests, we had discovered our percentages that we had covered
were quite low (\~10%), and so we had to create multiple additional
tests to meet the percentage requirements. It challenged us to test
different methods from both classes and we were able to see certain
strategic similarities among methods in terms of specific things to
target to increase different types of coverage. Overcoming these
challenges furthered our understanding of both unit testing and coverage
testing as a whole. It also increased our efficiency in writing tests
with our goal being to write the least number of tests with the most
amount of coverage. The challenges we overcome the best include some of
other

Comments/feedback on the assignment itself:

Overall, the lab detailed a simple yet insightful experience in coverage
testing. The experience induced a healthy working environment that
explored not only our previous knowledge of the course material but more
importantly our ability to cooperate in group settings. We discovered in
our first run-through of using coverage testing the application produced
minor difficulties across various operating systems which was important
to understand and resolve, as all team members took on a set of test
cases to complete. However, going through the lab we were able to
quickly overcome such difficulties, turning it into a smooth and
informative session. An improvement that could be implemented in the lab
document itself would be the adding of figures in sections 3.2 and 3.3.
Coverage testing also provided a more thorough insight into the
application of these tests in the real world and helped us understand
the magnitude of testing (considering we had to implement many extra
tests in order to fulfil the required coverage percentages) All in all,
we found this lab easy to follow and an excellent introduction to
coverage testing in all aspects.
