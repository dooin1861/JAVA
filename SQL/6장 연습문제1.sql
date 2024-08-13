SET LINESIZE 10000
SELECT empno, rpad(substr(empno, 1, 2), 4, '#') AS masking_empno, 
       ename, rpad(substr(ename, 1, 1), LENGTH(ename), '*') AS masking_ename
    FROM emp
    WHERE LENGTH(ename) >= 5
    AND LENGTH(ename) < 6