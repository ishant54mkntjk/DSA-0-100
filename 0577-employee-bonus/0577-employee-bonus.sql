# Write your MySQL query statement below
select e.name, b.bonus
From employee e
Left Join bonus b
ON e.empId =b.empId
Where b.bonus<1000 OR b.bonus is null;