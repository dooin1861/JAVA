select empno, ename, sal, trunc(sal/21.5, 2) DAY_PAY, round(sal/21.5/8, 1) time_pay
    from emp