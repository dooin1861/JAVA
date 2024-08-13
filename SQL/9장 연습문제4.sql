select e.empno, e.ename, e.sal, s.grade
    from emp e, salgrade s
    where e.sal between s.losal and s.hisal
     and sal > (select max(sal)
                 from emp
                where job = 'SALESMAN');