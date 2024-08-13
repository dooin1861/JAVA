select job, count(*)
    from emp
group by job
having count(*) >= 3