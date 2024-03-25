select max(num) num from (
select num, count(*) rc from mynumbers
group by num
)
where rc=1