set serveroutput on;
declare
   v_deptno dept.deptno%type;
    cursor c1 (p_deptno dept.deptno%type) is
        select deptno, dname, loc
            from dept
        where deptno = p_deptno;
begin
    v_deptno := &Input_deptno;
    for c1_rec in c1(v_deptno)
        loop
            dbms_output.put_line(v_deptno || '¹ø ºÎ¼­ - deptno : ' || c1_rec.deptno
                                           || ', dname : ' || c1_rec.dname
                                             || ', loc : ' || c1_rec.loc);
        end loop;
end;
/