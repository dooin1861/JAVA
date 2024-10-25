declare
    v_num number := 0;
    v_sum number := 0;
begin
    loop
        v_num := v_num + 1;
        v_sum := v_sum + v_num;
        exit when v_num >= 10;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE ('1~10까지의 합 : ' || V_sum);
end;
/  -- 16장 연습문제