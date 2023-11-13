--Part 1
/*
id:int
employer:varchar(255)
name:varchar(255)
skills:varchar(255)
*/
--Part 2
select name from employer where location = "St. Louis City";
--Part 3
drop table job;
--Part 4
SELECT * FROM skill
 LEFT JOIN job_skills ON skill.id = job_skills.skills_id
 where job_skills.jobs_id IS NOT NULL
 ORDER BY name ASC;