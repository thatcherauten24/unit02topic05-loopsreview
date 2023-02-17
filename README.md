1. `formGradeString`

Take as input an array of integers, representing percent grades. Return a string containing letter grades corresponding to the percent grades in the array. Use the grading scale where 90-100 corresponds to "A", 80-89 to "B", 70-79 to "C", 60-69 to "D", and 0-59 to "F". Use an enhanced for loop.

input | output 
---|---
[62, 79, 99, 50] | "DCAF"

2. `valedictorianName`
Take as input two arrays: `studentNames` is an array of strings containing student names. `studentGrades` is an array of doubles containing GPAs corresponding to the student names (the first GPA in the array corresponds to the first name in the other array and so on). Return a string containing the name of the student with the highest GPA. Assume there are no duplicate GPAs, so there is never a tie.

`studentNames` | `studentGrades` | return value
---|---|---
["emily", "albert", "sophie", "phillip", "ophelia"] | [0.223, 3.538, 3.237, 1.437, 1.162] | albert


---

NB: the following exercises are definitely beyond the scope of the AP test. Only attempt them if you are up to date with all prior work.

---

3. `longestPlateau` (+)

Given an array of integers, find the length and location of the longest sequence of repeated values for which the values just before the sequence and just after the sequence are smaller. Return an array of 2 integers: the length, and index of the start of this sequence, respectively.

`input` | `output`
---|---
[0, 3, 1, 1, 1, 0, 2, 2, 1, 1] | [2, 6]
[0, 1, 1, 1, 1, 0, 3, 3, 2, 2] | [4, 1]

4. `rumors` (+)

Take an integer `n`, the number of people Alice invites to her party. One of the people at Alice's party is Bob. Bob starts a rumor about Alice by telling it to one of the other guests. A person hearing this rumor for the first time will immediately tell it to one other guest, chosen uniformly at random from all the people at the party except Alice and the person from whom they heard it. If a person (including Bob) hears the rumor for a second time, he or she will not propagate it further. 

Write a simulation that estimates the probability that everyone at the party will hear the rumor before it stops propagating. Also calculate an estimate of the expected number of people to hear the rumor.

5. `birthdayProblem` (+)

Suppose that people enter an empty room until a pair of people share a birthday. On average, how many people will have to enter before there is a match? Write code to estimate the value of this quantity and print a summary of the findings. Ignore leap years, and assume birthdays to be uniform random integers between 0 and 364
