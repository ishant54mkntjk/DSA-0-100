# Write your MySQL query statement below
select v.customer_id, COUNT(v.visit_id) AS count_no_trans
from Transactions t
Right Join Visits v
ON t.visit_id =v.visit_id
WHERE t.transaction_id IS NULL
Group By v.customer_id;