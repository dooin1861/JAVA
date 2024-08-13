--������ ��� �� ������ �Ұ� ����ϱ�
select grouping(job), grouping(deptno), deptno,
        job,
        case grouping(deptno)||grouping(job)
            when '00' then 'TOTAL BY DEPT AND JOB'
            when '10' then 'TOTAL BY JOB'
            when '01' then 'TOTAL BY DEPT'
            when '11' then 'GRAND TOTALFOR TABLE'
        end category,
        sum(sal) sal
    from emp
group by cube(deptno, job)
order by grouping(job), grouping(deptno)