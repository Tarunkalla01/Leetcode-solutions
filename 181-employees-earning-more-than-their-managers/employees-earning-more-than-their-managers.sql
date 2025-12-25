select e.name as employee
from employee as e join employee as m
where e.managerId = m.id and e.salary>m.salary
