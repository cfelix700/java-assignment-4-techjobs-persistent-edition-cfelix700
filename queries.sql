-- Part 1: Test it with SQL
CREATE TABLE job (
    id SERIAL PRIMARY KEY,
    employer VARCHAR(100),
    name: VARCHAR(100) NOT NULL
    skills: VARCHAR(100) NOT NULL
);

-- Part 2: Test it with SQL
SELECT name FROM employer WHERE location = "St. Louis City";

-- Part 3: Test it with SQL

DROP TABLE
JOB;


-- Part 4: Test it with SQL
SELECT *
FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;
