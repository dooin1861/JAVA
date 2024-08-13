select empno, ename, hiredate, 
       to_char(next_day(add_months(hiredate, 3), '¿ù'), 'YYYY-MM-DD') as R_JOB, nvl(to_char(comm), 'N/A') as comm
    from emp