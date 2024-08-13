-- 최대값 최소값 평균 계산
select avg(sal)
    from (
 select sal, min(sal)over() min_sal, max(sal)over() max_sal
    from emp
        ) x
    where sal not in (min_sal, max_sal)