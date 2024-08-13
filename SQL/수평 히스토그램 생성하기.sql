--수평 히스토그램 생성하기
set linesize 10000
select deptno,
        lpad('*', count(*), '*') as cnt -- 각 부서의 인원수대로 *을 출력
    from emp
 group by deptno
    