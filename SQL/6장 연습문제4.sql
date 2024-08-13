select empno, ename, mgr, 
    case when mgr is null then '0000'
    when substr(mgr, 1, 2) = '75' then '5555'
    when substr(mgr, 1, 2) = '76' then '6666'
    when substr(mgr, 1, 2) = '77' then '7777'
    when substr(mgr, 1, 2) = '78' then '8888'
    
    else to_char(mgr)
    end chg_mgr
from emp