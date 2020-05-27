use somali_cinema
go
delete
from actor_role
go
insert into actor_role
values ('101', '主演'),
       ('102', '导演'),
       ('103', '服装'),
       ('104', '道具'),
       ('105', '摄影'),
       ('106', '剪辑'),
       ('107', '特效'),
       ('108', '编剧')
go
select *
from actor_role
go