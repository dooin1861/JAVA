delete from dept_accidents
where deptno = (
select deptno from dept_accidents
    group by deptno
    having count(*) >= 3)