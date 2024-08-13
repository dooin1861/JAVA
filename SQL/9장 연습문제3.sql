select e.empno, e.ename, e.job, e.deptno, d.dname, d.loc
     from emp e, dept d
    where e.deptno = d.deptno
     and e.deptno = 10
     and job not in (select distinct job
                      from emp
                     where deptno = 30)
  