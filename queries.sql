## Part 1: Test it with SQL
SELECT *
FROM techjobs.job;

## Part 2: Test it with SQL
SELECT name
FROM techJobs.employer
WHERE location = "St. Louis City.";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT name, description
FROM skill
INNER JOIN job_skills ON job_skills.skills_id = skill.id
WHERE jobs_id IS NOT NULL
ORDER BY skill.name DESC;