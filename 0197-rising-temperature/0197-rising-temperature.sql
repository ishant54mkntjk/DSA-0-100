# Write your MySQL query statement below
select today.id
from Weather today
Join Weather yesterday
ON datediff(today.recordDate, yesterday.recordDate)=1
Where today.temperature>yesterday.temperature;