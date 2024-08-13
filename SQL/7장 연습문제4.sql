select NVL2(comm, 'O', 'X') as exist_comm,
    count(*) as cnt
    from emp
group by nvl2(comm, 'O', 'X')