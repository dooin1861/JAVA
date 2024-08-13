delete from chap10hw_emp
    where empno in (select e.empno
                        from chap10hw_emp e, chap10hw_salgrade s
                        where e.sal between s.losal and s.hisal
                            and s.grade = 5)