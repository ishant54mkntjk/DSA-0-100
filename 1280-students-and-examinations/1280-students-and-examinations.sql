# Write your MySQL query statement below
-- select s.student_id, s.student_name, sb.subject_name, Count(sb.subject_name) AS attended_exams
-- from students s
-- left Join Examinations e
-- ON s.student_id = e.student_id
-- Join Subjects sb
-- ON e.subject_name=sb.subject_name
-- Group By s.student_id, s.student_name, sb.subject_name
-- Order By s.student_id AND sb.subject_name;


select s.student_id, s.student_name, sb.subject_name, Count(e.subject_name) AS attended_exams
from students s
cross Join Subjects sb
left Join Examinations e
ON s.student_id = e.student_id AND sb.subject_name=e.subject_name
Group By s.student_id, s.student_name, sb.subject_name
Order By s.student_id, sb.subject_name;
