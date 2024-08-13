SELECT D.DEPTNO, D.DNAME,
       E.EMPNO, E.ENAME, E.MGR, E.SAL, E.DEPTNO AS DEPTNO1,
       S.LOSAL, S.HISAL, S.GRADE,
       E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME
    FROM EMP E right outer join DEPT D on (E.DEPTNO = D.DEPTNO)
               left outer join SALGRADE S on (E.SAL BETWEEN S.LOSAL AND S.HISAL)
               left outer join emp e2 on (E.MGR = E2.EMPNO)
    ORDER BY D.DEPTNO, E.EMPNO