--상하_하위 관계4
select ltrim(
        sys_connect_by_path(ename, '-->'),
        '-->') leaf_branch_root
    from emp
    where level = 3
    start with ename = 'MILLER'
connect by prior mgr = empno