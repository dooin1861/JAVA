select rownum, e.*
    from (select *
            from emp e
        order by sal desc) e
    where rownum <= 3;  -- �������� ���
    
with e as (select * from emp order by sal desc)
select rownum, e.*
    from e
    where rownum <= 3;  -- WITH�� ���