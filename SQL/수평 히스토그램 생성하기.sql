--���� ������׷� �����ϱ�
set linesize 10000
select deptno,
        lpad('*', count(*), '*') as cnt -- �� �μ��� �ο������ *�� ���
    from emp
 group by deptno
    