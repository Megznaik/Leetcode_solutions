select round(count(a.player_id)/(select count(distinct player_id) from Activity),2)as fraction from Activity a
JOIN (select player_id, min(event_date) as firstDay from Activity
group by player_id) first_login ON 
a.player_id=first_login.player_id 
where datediff(a.event_date,first_login.firstDay)=1