//Given a table salary, such as the one below, that has m=male and f=female values. Swap all f and m values (i.e., change all f values to m and vice versa) with a single update query and no intermediate temp table.
update salary
set sex = (case when sex = 'f' then 'm' else 'f' end)

update salary
set sex = CHAR(ASCII('f')^ASCII('m')^ASCII(sex))
