-- 1. Revising Select Query
-- Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA.

select * from city
where population > 100000
and countrycode = 'USA';

-- 2. Revising Select Query II
-- Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA.

select name from city where countrycode = 'USA' and population > 120000;


-- 3. Select All
-- Query all columns (attributes) for every row in the CITY table.
select * from city;

-- 4. Select by ID
-- Query all columns for a city in CITY with the ID 1661.
select * from city where id = 1661;

-- 5. Japanese Cities' Attributes
-- Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.
select * from city where countrycode = 'JPN';

-- 6. Japanese Cities' Names
-- Query Names of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.
select name from city where countrycode = 'JPN'; 

-- 7. Weather Observation Station 1
-- Query a list of CITY and STATE from the STATION table.
select city, state from station;

-- 8. Weather Observation Station 3
-- Query a list of CITY names from STATION for cities that have an even ID number. 
-- Print the results in any order, but exclude duplicates from the answer.
select distinct city from station where id % 2 = 0;

-- 9. Weather Observation Station 4
-- Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.
select count(city) - count(distinct city) from station;

-- 10. Weather Observation Station 5
-- Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths 
-- (i.e.: number of characters in the name). If there is more than one smallest or largest city, 
-- choose the one that comes first when ordered alphabetically.
select (select city from station where length(city) = (select min(length(city)) from station) order by city limit 1), min(length(city)) from station;
select (select city from station where length(city) = (select max(length(city)) from station) order by city limit 1), max(length(city)) from station;

-- option 
select city, length(city) from station
order by length(city),city asc
limit 1;
select city, length(city) from station
order by length(city) desc
limit 1;

-- 11. Weather Observation Station 6
-- Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. 
-- Your result cannot contain duplicates.
select distinct city from station where city RLIKE '^[aeiuoAEIOU].*';

-- 12. Weather Observation Station 7
-- Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.
select distinct city from station where city RLIKE '.*[aeiou]$';

-- 13. Weather Observation Station 8
-- Query the list of CITY names from STATION which have vowels 
-- (i.e., a, e, i, o, and u) as both their first and last characters. 
-- Your result cannot contain duplicates.
select distinct city from station where city RLIKE '^[aeiouAEIOU].+[aeiou]$';

-- 14. Weather Observation Station 9
-- Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.
select distinct city from station where city RLIKE '^[^aeiouAEIOU].+';

-- 15. Weather Observation Station 10
-- Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates.
select distinct city from station where city RLIKE '.+[^aeiouAEIOU]$';

-- 16. Weather Observation Station 11
-- Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. 
-- Your result cannot contain duplicates.
select distinct city from station where city regexp '(^[^aeiouAEIOU].*|.*[^aeiou]$)';

-- 17. Weather Observation Station 12
-- Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. 
-- Your result cannot contain duplicates.
select distinct city from station where city regexp '(^[^aeiouAEIOU].*[^aeiou]$)';

-- 18. Higher than 75 Marks
-- Query the Name of any student in STUDENTS who scored higher than 75 Marks. 
-- Order your output by the last three characters of each name. 
-- If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.), secondary sort them by ascending ID.
select name from students where marks > 75 order by regexp_substr(name, '[a-z]{3}$'), id;

-- 19. Employee Names
-- Write a query that prints a list of employee names (i.e.: the name attribute) from the Employee table in alphabetical order.
select name from employee order by name;

-- 20. Employee Salaries
-- Write a query that prints a list of employee names(i.e. the name attribute) for employee in Employee having a salary greater than $2000 per month 
-- who have been  employees for less than 10 months. Sort your result by ascending employee_id
select name from employee where salary > 2000 and months < 10 order by employee_id;

-- AGGREGATION
-- 1. Revising Aggregations - The Count Function
-- Query a count of the number of cities in CITY having a Population larger than 100.000.
select count(id) from city where population > 100000;

-- 2. The Sum Function
-- Query the total population of all cities in CITY where District is California.
select sum(population) from city where district = 'California';

-- 3. Averages
-- Query the average population of all cities in CITY where District is California.
select avg(population) from city where district = 'California';

-- 4. Average population
-- Query the average population for all cities in CITY, rounded down to the nearest integer.
select round(avg(population), 0) from city;

-- 5. Japan Population
-- Query the sum of the populations for all Japanese cities in CITY. The COUNTRYCODE for Japan is JPN.
select sum(population) from city where countrycode = 'JPN';

-- 6. Population Density Difference
-- Query the difference between the maximum and minimum populations in CITY.
select max(population) - min(population) from city;

-- 7. The Blunder
-- Samantha was tasked with calculating the average monthly salaries for all employees in the EMPLOYEES table, 
-- but did not realize her keyboard's 0 key was broken until after completing the calculation. 
-- She wants your help finding the difference between her miscalculation (using salaries with any zeros removed), and the actual average salary.

-- Write a query calculating the amount of error (i.e.: actual - miscalculated average monthly salaries), and round it up to the next integer.
select ceil(avg(salary) - avg(replace(salary, 0, ''))) from employees;

-- 8. Top Earners
-- We define an employee's total earnings to be their monthly salary x months worked, 
-- and the maximum total earnings to be the maximum total earnings for any employee in the Employee table. 
-- Write a query to find the maximum total earnings for all employees as well as the total number of employees who have maximum total earnings. 
-- Then print these values as 2 space-separated integers.
select (salary * months) total_earnings, count(*) from employee group by 1 order by total_earnings desc limit 1;
-- note : group by 1 will group the result based on the first column(total_earnings) from the select 7

-- 9. Weather observation Station 2
-- Query the following two values from the STATION table:

-- The sum of all values in LAT_N rounded to a scale of 2 decimal places.
-- The sum of all values in LONG_W rounded to a scale of 2 decimal places.
select round(sum(lat_n), 2), round(sum(long_w), 2) from station;

-- 10. Weather Observation Station 13
-- Query the sum of Northern Latitudes (LAT_N) from STATION having values greater than 38.7880 and less than 137.2345. 
-- Truncate your answer to 4 decimal places.
select truncate(sum(lat_n), 4) from station where lat_n > 38.7880 and lat_n < 137.2345;

-- 11. Weather Observation Station 14
-- Query the greatest value of the Northern Latitudes (LAT_N) from STATION that is less than 137.2345. 
-- Truncate your answer to 4 decimal places.
select truncate(lat_n, 4) from station where lat_n < 137.2345 order by lat_n desc limit 1;

-- 12. Weather Observation Station 15
-- Query the Western Longitude (LONG_W) for the largest Northern Latitude (LAT_N) in STATION that is less than 137.2345. 
-- Round your answer to 4 decimal places.
select round(long_w) from station where lat_n < 137.2345 order by lat_n desc limit 1;

-- 13. Weather Observation Station 16
-- Query the smallest Northern Latitude (LAT_N) from STATION that is greater than 38.7880. Round your answer to 4 decimal places.
select round(lat_n, 4) from station where lat_n > 38.7880 order by lat_n limit 1;

-- 14. Weather Observation Station 17
-- Query the Western Longitude (LONG_W)where the smallest Northern Latitude (LAT_N) in STATION is greater than 38.7880. Round your answer to 4 decimal places.
select round(long_w, 4) from station where lat_n > 38.7880 order by lat_n limit 1;

-- 15. Weather Observation Station 18
-- Consider p1(a,b) and p2(a,b) to be two points on a 2D plane.

--  happens to equal the minimum value in Northern Latitude (LAT_N in STATION).
--  happens to equal the minimum value in Western Longitude (LONG_W in STATION).
--  happens to equal the maximum value in Northern Latitude (LAT_N in STATION).
--  happens to equal the maximum value in Western Longitude (LONG_W in STATION).
-- Query the Manhattan Distance between points p1 and p2 and round it to a scale of  decimal places.
select round(abs(min(lat_n) - max(lat_n)) + abs(min(long_w) - abs(max(long_w))), 4) from station;

-- 16. Weather Observation Station 19
-- Consider p1(a, b) and p2(a, b) to be two points on a 2D plane where (a, b) are the respective minimum and maximum values of Northern Latitude (LAT_N) 
-- and (c, d) are the respective minimum and maximum values of Western Longitude (LONG_W) in STATION.
-- Query the Euclidean Distance between points p1 and p2 and format your answer to display 4 decimal digits.
select format(sqrt(pow((min(lat_n) - max(lat_n)), 2) + pow((min(long_w) - max(long_w)), 2)), 4) from station;

-- 17. Weather Observation Station 20
-- A median is defined as a number separating the higher half of a data set from the lower half. 
-- Query the median of the Northern Latitudes (LAT_N) from STATION and round your answer to 4 decimal places.
Select round(S.LAT_N,4) mediam from station S where (select count(Lat_N) from station where Lat_N < S.LAT_N ) -- lower half
= (select count(Lat_N) from station where Lat_N > S.LAT_N); -- higher half
-- then it will return the exact middle item from the entire list

-- BASIC JOIN

-- 1. Average Population of Each Continent
-- Given the CITY and COUNTRY tables, query the names of all the continents (COUNTRY.Continent) 
-- and their respective average city populations (CITY.Population) rounded down to the nearest integer.

-- Note: CITY.CountryCode and COUNTRY.Code are matching key columns.
select country.continent, floor(avg(city.population)) from city
join country on city.countrycode = country.code
group by country.continent;

-- 2. The Report
-- Ketty gives Eve a task to generate a report containing three columns: Name, Grade and Mark. 
-- Ketty doesn't want the NAMES of those students who received a grade lower than 8. 
-- The report must be in descending order by grade -- i.e. higher grades are entered first. 
--If there is more than one student with the same grade (8-10) assigned to them, order those particular students by their name alphabetically. 
-- Finally, if the grade is lower than 8, use "NULL" as their name and list them by their grades in descending order. 
-- If there is more than one student with the same grade (1-7) assigned to them, order those particular students by their marks in ascending order.

-- Write a query to help Eve.
select if(grade < 8, null, name), grade, marks from students join grades where marks between min_mark and max_mark order by grade desc, name;

-- 3. The Compititors
-- Julia just finished conducting a coding contest, and she needs your help assembling the leaderboard! 
-- Write a query to print the respective hacker_id and name of hackers who achieved full scores for more than one challenge. 
-- Order your output in descending order by the total number of challenges in which the hacker earned a full score. 
-- If more than one hacker received full scores in same number of challenges, then sort them by ascending hacker_id.

select h.hacker_id, name from submissions sub
join hackers h on h.hacker_id = sub.hacker_id
join challenges ch on ch.challenge_id =  sub.challenge_id
join difficulty diff on diff.difficulty_level = ch.difficulty_level
where sub.score = diff.score and ch.difficulty_level = diff.difficulty_level
group by h.hacker_id, name
having count(h.hacker_id) > 1
order by count(h.hacker_id) desc, h.hacker_id asc;

-- 4. Population Census
-- Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Asia'.

-- Note: CITY.CountryCode and COUNTRY.Code are matching key columns.
select sum(ci.population) from city ci
join country co on co.code = ci.countrycode 
where co.continent = 'Asia'

-- 5. African Census
-- Given the CITY and COUNTRY tables, query the names of all cities where the CONTINENT is 'Africa'.

-- Note: CITY.CountryCode and COUNTRY.Code are matching key columns.
select ci.name from city ci
join country co on co.code = ci.countrycode 
where co.continent = 'Africa';

-- 6. Ollivander's Inventory
-- Harry Potter and his friends are at Ollivander's with Ron, finally replacing Charlie's old broken wand.

-- Hermione decides the best way to choose is by determining the minimum number of gold galleons needed to buy each non-evil wand of high power and age. 
-- Write a query to print the id, age, coins_needed, and power of the wands that Ron's interested in, sorted in order of descending power. 
-- If more than one wand has same power, sort the result in order of descending age.
select w.id, wp.age, w.coins_needed, w.power from wands w
join wands_property wp on wp.code = w.code
join ( select wanp.age, min(wan.coins_needed) min_coins, wan.power from wands wan
     join wands_property wanp on wanp.code = wan.code
      where wanp.is_evil = 0
     group by wanp.age,wan.power
     order by wan.power desc, wanp.age desc) 
     jt on wp.age = jt.age and w.coins_needed = jt.min_coins and w.power = jt.power
where wp.is_evil = 0
order by w.power desc, wp.age desc

-- 7. Challenges 
-- Julia asked her students to create some coding challenges. 
-- Write a query to print the hacker_id, name, and the total number of challenges created by each student. 
-- Sort your results by the total number of challenges in descending order. 
-- If more than one student created the same number of challenges, then sort the result by hacker_id. 
-- If more than one student created the same number of challenges and the count is less than the maximum number of challenges created, 
-- then exclude those students from the result.
-- print the needed items
select h.hacker_id, h.name, count(c.hacker_id) challenges_created 
-- from these tables
from hackers h
join challenges c on c.hacker_id = h.hacker_id
-- grouping cause we use aggregation, count()
group by h.hacker_id, h.name
-- use having instead of where is better when we're dealing with groups of data 
having
-- from the highest count(challenges_created)
challenges_created =
(select max(sq.cnt) 
-- need to do this since we need the count for each hacker_id
-- then we get the highest value
from (select count(*) cnt from challenges group by hacker_id) sq)
-- or
or 
-- below highest count which 
challenges_created in
(select sqr.c_count 
from (select count(*) c_count from challenges group by hacker_id) sqr 
group by sqr.c_count 
-- has exactly 1 count
having count(sqr.c_count) = 1)
order by count(c.hacker_id) desc, h.hacker_id

-- 8. Contest Leaderboard
-- The total score of a hacker is the sum of their maximum scores for all of the challenges. 
-- Write a query to print the hacker_id, name, and total score of the hackers ordered by the descending score. 
-- If more than one hacker achieved the same total score, then sort the result by ascending hacker_id. 
-- Exclude all hackers with a total score of 0 from your result.
select h.hacker_id, h.name, sum(max_score.high_score) total_score from hackers h
join (select hacker_id, max(score) high_score from submissions group by hacker_id, challenge_id) max_score
on h.hacker_id = max_score.hacker_id
group by h.hacker_id, h.name
having total_score > 0
order by total_score desc, h.hacker_id

-- Advanced Select

-- 1. Type of Triangle
-- Write a query identifying the type of each record in the TRIANGLES table using its three side lengths. 
-- Output one of the following statements for each record in the table:

-- Equilateral: It's a triangle with  sides of equal length.
-- Isosceles: It's a triangle with  sides of equal length.
-- Scalene: It's a triangle with  sides of differing lengths.
-- Not A Triangle: The given values of A, B, and C don't form a triangle.
select
case
when a + b > c and b + c > a and a + c > b then 
    case
        when a = b and b = c then 'Equilateral'
        when a = b or b = c or a = c then 'Isosceles'
        else 'Scalene'
    end
else 'Not A Triangle'
end
from triangles

-- 2. The PADS
-- Generate the following two result sets:

-- Query an alphabetically ordered list of all names in OCCUPATIONS, immediately followed by the first letter of each profession as a parenthetical (i.e.: enclosed in parentheses). For example: AnActorName(A), ADoctorName(D), AProfessorName(P), and ASingerName(S).
-- Query the number of ocurrences of each occupation in OCCUPATIONS. Sort the occurrences in ascending order, and output them in the following format:

-- There are a total of [occupation_count] [occupation]s.
-- where [occupation_count] is the number of occurrences of an occupation in OCCUPATIONS and [occupation] is the lowercase occupation name. If more than one Occupation has the same [occupation_count], they should be ordered alphabetically.

-- Note: There will be at least two entries in the table for each type of occupation.
select concat(name, '(', left(occupation, 1), ')') from occupations o
order by name;
select concat('There are a total of ', count(occupation), ' ', lcase(occupation), 's.') from occupations
group by occupation
order by count(occupation), occupation;

-- 3. Occupations
-- Pivot the Occupation column in OCCUPATIONS so that each Name is sorted alphabetically and displayed underneath its corresponding Occupation. The output column headers should be Doctor, Professor, Singer, and Actor, respectively.

-- Note: Print NULL when there are no more names corresponding to an occupation.
set @r1=0, @r2=0, @r3=0, @r4=0;

select 
min(Doctor), min(Professor), min(Singer), min(Actor)
from
(
    select 
        case 
            when occupation = 'Doctor' then (@r1:=@r1+1)
            when occupation = 'Professor' then (@r2:=@r2+1)  
            when occupation = 'Singer' then (@r3:=@r3+1)  
            when occupation = 'Actor' then (@r4:=@r4+1)  
        end rn,
        case when occupation = 'Doctor' then name else null end Doctor,
        case when occupation = 'Professor' then name else null end Professor,
        case when occupation = 'Singer' then name else null end Singer,
        case when occupation = 'Actor' then name else null end Actor
    from occupations
    order by name
) pvt
group by rn;
-- NOTE : NO FUCKIN SPACE ARE ALLOWED BETWEEN THOSE @'s

-- ----------------------------------------------- EXPLANATION -----------------------------------------------
-- Let me break it down in steps (answer in MySQL)
-- Step 1:
-- Create a virtual table in your head of the data given to us. It look like this https://imgur.com/u6DEcNQ

SELECT
    case when Occupation='Doctor' then Name end as Doctor,
    case when Occupation='Professor' then Name end as Professor,
    case when Occupation='Singer' then Name end as Singer,
    case when Occupation='Actor' then Name end as Actor
FROM OCCUPATIONS
-- Step 2:
-- Create an index column with respect to occupation as "RowNumber".https://imgur.com/QzVCWFn

-- Notice from the image, under professor column, the first Name is indexed as 1, the next name "Birtney" as 2. That is what I mean by index w.r.t occupation.

-- The below code will only give the "RowNumber" column, to get the result like in image proceed to step 3.

set @r1=0, @r2=0, @r3=0, @r4=0;

SELECT case 
	when Occupation='Doctor' then (@r1:=@r1+1)
        when Occupation='Professor' then (@r2:=@r2+1)
        when Occupation='Singer' then (@r3:=@r3+1)
        when Occupation='Actor' then (@r4:=@r4+1) end as RowNumber

FROM OCCUPATIONS
-- Step 3:
-- Combine the result from step 1 and step 2:

set @r1=0, @r2=0, @r3=0, @r4=0;

SELECT case 
	when Occupation='Doctor' then (@r1:=@r1+1)
        when Occupation='Professor' then (@r2:=@r2+1)
        when Occupation='Singer' then (@r3:=@r3+1)
        when Occupation='Actor' then (@r4:=@r4+1) end as RowNumber,
        case when Occupation='Doctor' then Name end as Doctor,
        case when Occupation='Professor' then Name end as Professor,
        case when Occupation='Singer' then Name end as Singer,
        case when Occupation='Actor' then Name end as Actor

FROM OCCUPATIONS
Step 4:
-- Now, Order_by name then Group_By RowNumber.

-- Using Min/Max, if there is a name, it will return it, if not, return NULL.

set @r1=0, @r2=0, @r3=0, @r4=0;
select min(Doctor), min(Professor), min(Singer), min(Actor)
from(
  select case when Occupation='Doctor' then (@r1:=@r1+1)
            when Occupation='Professor' then (@r2:=@r2+1)
            when Occupation='Singer' then (@r3:=@r3+1)
            when Occupation='Actor' then (@r4:=@r4+1) end as RowNumber,
    case when Occupation='Doctor' then Name end as Doctor,
    case when Occupation='Professor' then Name end as Professor,
    case when Occupation='Singer' then Name end as Singer,
    case when Occupation='Actor' then Name end as Actor
  from OCCUPATIONS
  order by Name
	) temp
group by RowNumber;
-- **EDIT** I can see many asking why MIN or temp?

-- temp - Since I created a temporary table inside the query, I have to give it an alise. It is a good practise.

-- Why MIN in the select statement? Since some of us here may not be fimilar with sql, I'll start with where I left so you get the whole picture.

-- Once you complete step 3, add "ORDER BY Name" (Refer above code on where to add Order by clause). The result will look like this https://imgur.com/aBHUqN6
-- What changed? the names in all four columns are sorted as per alphabetical order.

-- Now, we only want the names and not the NULL values from our virtual table. How can we do that? - There maybe be multiple ways, lets us consider the MIN/MAX (Yes, you can replace MIN with MAX and you will get the same result)

-- Without GROUP BY clause - When a MIN/MAX is used in a Select statement, it will return The "LOWEST" element from each column (which happened to be the first element because we used ORDER BY, if you use MAX, you will get the last element from each column). It will look like this https://imgur.com/XDZzc4Z That means, you will always get a single row from a table.

SET @r1=0,@r2=0,@r3=0,@r4=0;
SELECT MIN(Doctor),MIN(Professor),MIN(Singer),MIN(Actor)

FROM (
SELECT CASE
    WHEN OCCUPATION = 'Doctor' THEN (@r1:=@r1+1)
    WHEN OCCUPATION = 'Professor' THEN (@r2:=@r2+1)
    WHEN OCCUPATION = 'Singer' THEN (@r3:=@r3+1)
    WHEN OCCUPATION = 'Actor' THEN (@r4:=@r4+1) END AS RowNumber,
    CASE WHEN OCCUPATION = 'Doctor' THEN Name END AS Doctor,
    CASE WHEN OCCUPATION = 'Professor' THEN Name END AS Professor,
    CASE WHEN OCCUPATION = 'Singer' THEN Name END AS Singer,
    CASE WHEN OCCUPATION = 'Actor' THEN Name END AS Actor
FROM OCCUPATIONS
ORDER BY Name) as temp;
-- With GROUP BY clause - The result set will have one row for EACH group (which is RowNumber in our case).



-- 4. Binary Tree Nodes
-- You are given a table, BST, containing two columns: N and P, where N represents the value of a node in Binary Tree, and P is the parent of N.
-- column       | Type
-- N            | Integer
-- P            | Integer
-- Write a query to find the node type of Binary Tree ordered by the value of the node. Output one of the following for each node:

-- Root: If node is root node.
-- Leaf: If node is leaf node.
-- Inner: If node is neither root nor leaf node.
select case
    when p is null then concat(N, ' Root')
    when n in (select distinct p from bst) then concat(N, ' Inner')
    else concat(n, ' Leaf') 
    end
from bst
order by n;

-- 5. New Companies
-- Amber's conglomerate corporation just acquired some new companies. Each of the companies follows this hierarchy:
-- Founder
-- Lead Manager
-- Senior Manager
-- Manager
-- Employee

-- Given the table schemas below, write a query to print the company_code, founder name, total number of lead managers, total number of senior managers, total number of managers, and total number of employees. Order your output by ascending company_code.

-- Note:

-- The tables may contain duplicate records.
-- The company_code is string, so the sorting should not be numeric. For example, if the company_codes are C_1, C_2, and C_10, 
-- then the ascending company_codes will be C_1, C_10, and C_2.
select c.company_code, c.founder, 
    count(distinct l.lead_manager_code), count(distinct s.senior_manager_code), 
    count(distinct m.manager_code),count(distinct e.employee_code) 
from Company c, Lead_Manager l, Senior_Manager s, Manager m, Employee e 
where c.company_code = l.company_code 
    and l.lead_manager_code=s.lead_manager_code 
    and s.senior_manager_code=m.senior_manager_code 
    and m.manager_code=e.manager_code 
group by c.company_code order by c.company_code;
