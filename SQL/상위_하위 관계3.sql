--상위_하위 관계3
    select ltrim(
                sys_connect_by_path(ename, ' - '),
                ' - ') emp_tree
            from emp
        start with mgr is null -- ename = 'JONES' 이러면 존스만 불러옴
    connect by prior empno = mgr
        order by 1