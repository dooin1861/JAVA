--�ܼ� �Ұ� ����ϱ�
select case grouping(job)
                when 0 then job -- 0�̸� job ���
                else 'TOTAL'    -- �ƴϸ� total
            end job,
            sum(sal) sal
        from emp
    group by rollup(job)