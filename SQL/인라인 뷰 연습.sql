select *
    from (select rownum as rn, e.* 
            from (select * from emp order by ename) e
        )
    where rn between 10 and 15
