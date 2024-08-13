select e.job, e.empno, e.ename, e.sal, e.deptno,
        d.deptno, d.dname
    from emp e, dept d
    where e.deptno = d.deptno
    and job = (select job
                    from emp
                where ename = 'ALLEN');