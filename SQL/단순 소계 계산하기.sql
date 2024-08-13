--단순 소계 계산하기
select case grouping(job)
                when 0 then job -- 0이면 job 출력
                else 'TOTAL'    -- 아니면 total
            end job,
            sum(sal) sal
        from emp
    group by rollup(job)