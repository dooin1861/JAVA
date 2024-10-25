declare
    cursor c1 IS                -- 명시적 커서 선언
        select empno, ename, sal
            from emp;
begin
                        
    for c1_rec in c1 loop
   
    exit when c1%notfound;
    dbms_output.put_line('empno : ' || c1_rec.empno);
    dbms_output.put_line('ename : ' || c1_rec.ename);
    dbms_output.put_line('sal : ' || c1_rec.sal);
    
    end loop;
end;
/