/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2012                    */
/* Created on:     2020/5/24 0:23:34                            */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('actor') and o.name = 'FK_ACTOR_ACTOR_ARE_CITY')
alter table actor
   drop constraint FK_ACTOR_ACTOR_ARE_CITY
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('actor') and o.name = 'FK_ACTOR_USER_ACTO_USER')
alter table actor
   drop constraint FK_ACTOR_USER_ACTO_USER
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('actor_occupational') and o.name = 'FK_ACTOR_OC_ACTOR_OCC_ACTOR')
alter table actor_occupational
   drop constraint FK_ACTOR_OC_ACTOR_OCC_ACTOR
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('actor_occupational') and o.name = 'FK_ACTOR_OC_ACTOR_OCC_OCCUPATI')
alter table actor_occupational
   drop constraint FK_ACTOR_OC_ACTOR_OCC_OCCUPATI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('area_address') and o.name = 'FK_AREA_ADD_COUNTRY_A_COUNTRY')
alter table area_address
   drop constraint FK_AREA_ADD_COUNTRY_A_COUNTRY
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('area_film_release') and o.name = 'FK_AREA_FIL_AREA_FILM_MOVIE')
alter table area_film_release
   drop constraint FK_AREA_FIL_AREA_FILM_MOVIE
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('area_film_release') and o.name = 'FK_AREA_FIL_AREA_FILM_WORLD_CO')
alter table area_film_release
   drop constraint FK_AREA_FIL_AREA_FILM_WORLD_CO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('city') and o.name = 'FK_CITY_ACTOR_ARE_ACTOR')
alter table city
   drop constraint FK_CITY_ACTOR_ARE_ACTOR
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('city') and o.name = 'FK_CITY_PROVINCE__PROVINCE')
alter table city
   drop constraint FK_CITY_PROVINCE__PROVINCE
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('country') and o.name = 'FK_COUNTRY_CITY_COUN_CITY')
alter table country
   drop constraint FK_COUNTRY_CITY_COUN_CITY
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('field') and o.name = 'FK_FIELD_MOVIE_FIE_MOVIE')
alter table field
   drop constraint FK_FIELD_MOVIE_FIE_MOVIE
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('field_seat') and o.name = 'FK_FIELD_SE_FIELD_SEA_SEAT')
alter table field_seat
   drop constraint FK_FIELD_SE_FIELD_SEA_SEAT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('field_seat') and o.name = 'FK_FIELD_SE_FIELD_SEA_FIELD')
alter table field_seat
   drop constraint FK_FIELD_SE_FIELD_SEA_FIELD
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('field_seat') and o.name = 'FK_FIELD_SE_FIELD_SEA_ORDER')
alter table field_seat
   drop constraint FK_FIELD_SE_FIELD_SEA_ORDER
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('movie_actor_table') and o.name = 'FK_MOVIE_AC_MOVIE_ACT_MOVIE')
alter table movie_actor_table
   drop constraint FK_MOVIE_AC_MOVIE_ACT_MOVIE
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('movie_actor_table') and o.name = 'FK_MOVIE_AC_MOVIE_ACT_ACTOR')
alter table movie_actor_table
   drop constraint FK_MOVIE_AC_MOVIE_ACT_ACTOR
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('movie_actor_table') and o.name = 'FK_MOVIE_AC_MOVIE_ACT_MOVIE_RO')
alter table movie_actor_table
   drop constraint FK_MOVIE_AC_MOVIE_ACT_MOVIE_RO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('movie_type') and o.name = 'FK_MOVIE_TY_MOVIE_TYP_MOVIE')
alter table movie_type
   drop constraint FK_MOVIE_TY_MOVIE_TYP_MOVIE
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('movie_type') and o.name = 'FK_MOVIE_TY_MOVIE_TYP_TYPE')
alter table movie_type
   drop constraint FK_MOVIE_TY_MOVIE_TYP_TYPE
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"order"') and o.name = 'FK_ORDER_ORDER_PAY_PAY')
alter table "order"
   drop constraint FK_ORDER_ORDER_PAY_PAY
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"order"') and o.name = 'FK_ORDER_ORDER_STU_STUDIO_C')
alter table "order"
   drop constraint FK_ORDER_ORDER_STU_STUDIO_C
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"order"') and o.name = 'FK_ORDER_USER_ORDE_USER')
alter table "order"
   drop constraint FK_ORDER_USER_ORDE_USER
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('order_preferential') and o.name = 'FK_ORDER_PR_ORDER_PRE_ORDER')
alter table order_preferential
   drop constraint FK_ORDER_PR_ORDER_PRE_ORDER
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('order_preferential') and o.name = 'FK_ORDER_PR_ORDER_PRE_PREFEREN')
alter table order_preferential
   drop constraint FK_ORDER_PR_ORDER_PRE_PREFEREN
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('pay') and o.name = 'FK_PAY_ORDER_PAY_ORDER')
alter table pay
   drop constraint FK_PAY_ORDER_PAY_ORDER
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('pay') and o.name = 'FK_PAY_PAY_PAY_A_PAY_ACCO')
alter table pay
   drop constraint FK_PAY_PAY_PAY_A_PAY_ACCO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('pay_account') and o.name = 'FK_PAY_ACCO_PAY_PAY_A_PAY')
alter table pay_account
   drop constraint FK_PAY_ACCO_PAY_PAY_A_PAY
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('pay_account') and o.name = 'FK_PAY_ACCO_PREFERENT_PREFEREN')
alter table pay_account
   drop constraint FK_PAY_ACCO_PREFERENT_PREFEREN
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('pay_account') and o.name = 'FK_PAY_ACCO_USER_PAY__USER')
alter table pay_account
   drop constraint FK_PAY_ACCO_USER_PAY__USER
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('province') and o.name = 'FK_PROVINCE_COUNTRY_P_WORLD_CO')
alter table province
   drop constraint FK_PROVINCE_COUNTRY_P_WORLD_CO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('screening_room') and o.name = 'FK_SCREENIN_FIELD_SCR_FIELD')
alter table screening_room
   drop constraint FK_SCREENIN_FIELD_SCR_FIELD
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('screening_room') and o.name = 'FK_SCREENIN_THEATER_S_THEATER')
alter table screening_room
   drop constraint FK_SCREENIN_THEATER_S_THEATER
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('seat') and o.name = 'FK_SEAT_SCREENING_SCREENIN')
alter table seat
   drop constraint FK_SEAT_SCREENING_SCREENIN
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('studio_card') and o.name = 'FK_STUDIO_C_ORDER_STU_ORDER')
alter table studio_card
   drop constraint FK_STUDIO_C_ORDER_STU_ORDER
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('theater') and o.name = 'FK_THEATER_THEATER_A_AREA_ADD')
alter table theater
   drop constraint FK_THEATER_THEATER_A_AREA_ADD
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('theater') and o.name = 'FK_THEATER_THEATER_P_PERSON')
alter table theater
   drop constraint FK_THEATER_THEATER_P_PERSON
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"user"') and o.name = 'FK_USER_PERSON_US_PERSON')
alter table "user"
   drop constraint FK_USER_PERSON_US_PERSON
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('user_studio_card') and o.name = 'FK_USER_STU_USER_STUD_USER')
alter table user_studio_card
   drop constraint FK_USER_STU_USER_STUD_USER
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('user_studio_card') and o.name = 'FK_USER_STU_USER_STUD_STUDIO_C')
alter table user_studio_card
   drop constraint FK_USER_STU_USER_STUD_STUDIO_C
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('actor')
            and   name  = 'Inheritance_1_FK'
            and   indid > 0
            and   indid < 255)
   drop index actor.Inheritance_1_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('actor')
            and   name  = 'actor_area_FK'
            and   indid > 0
            and   indid < 255)
   drop index actor.actor_area_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('actor')
            and   type = 'U')
   drop table actor
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('actor_occupational')
            and   name  = 'actor_occupational2_FK'
            and   indid > 0
            and   indid < 255)
   drop index actor_occupational.actor_occupational2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('actor_occupational')
            and   name  = 'actor_occupational_FK'
            and   indid > 0
            and   indid < 255)
   drop index actor_occupational.actor_occupational_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('actor_occupational')
            and   type = 'U')
   drop table actor_occupational
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('area_address')
            and   name  = 'country_address_FK'
            and   indid > 0
            and   indid < 255)
   drop index area_address.country_address_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('area_address')
            and   type = 'U')
   drop table area_address
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('area_film_release')
            and   name  = 'area_film_release2_FK'
            and   indid > 0
            and   indid < 255)
   drop index area_film_release.area_film_release2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('area_film_release')
            and   name  = 'area_film_release_FK'
            and   indid > 0
            and   indid < 255)
   drop index area_film_release.area_film_release_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('area_film_release')
            and   type = 'U')
   drop table area_film_release
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('city')
            and   name  = 'province_city_FK'
            and   indid > 0
            and   indid < 255)
   drop index city.province_city_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('city')
            and   name  = 'actor_area2_FK'
            and   indid > 0
            and   indid < 255)
   drop index city.actor_area2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('city')
            and   type = 'U')
   drop table city
go

if exists (select 1
            from  sysobjects
           where  id = object_id('contact')
            and   type = 'U')
   drop table contact
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('country')
            and   name  = 'city_country_FK'
            and   indid > 0
            and   indid < 255)
   drop index country.city_country_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('country')
            and   type = 'U')
   drop table country
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('field')
            and   name  = 'movie_field_FK'
            and   indid > 0
            and   indid < 255)
   drop index field.movie_field_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('field')
            and   type = 'U')
   drop table field
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('field_seat')
            and   name  = 'field_seat3_FK'
            and   indid > 0
            and   indid < 255)
   drop index field_seat.field_seat3_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('field_seat')
            and   name  = 'field_seat2_FK'
            and   indid > 0
            and   indid < 255)
   drop index field_seat.field_seat2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('field_seat')
            and   name  = 'field_seat_FK'
            and   indid > 0
            and   indid < 255)
   drop index field_seat.field_seat_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('field_seat')
            and   type = 'U')
   drop table field_seat
go

if exists (select 1
            from  sysobjects
           where  id = object_id('movie')
            and   type = 'U')
   drop table movie
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('movie_actor_table')
            and   name  = 'movie_actor_table3_FK'
            and   indid > 0
            and   indid < 255)
   drop index movie_actor_table.movie_actor_table3_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('movie_actor_table')
            and   name  = 'movie_actor_table2_FK'
            and   indid > 0
            and   indid < 255)
   drop index movie_actor_table.movie_actor_table2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('movie_actor_table')
            and   name  = 'movie_actor_table_FK'
            and   indid > 0
            and   indid < 255)
   drop index movie_actor_table.movie_actor_table_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('movie_actor_table')
            and   type = 'U')
   drop table movie_actor_table
go

if exists (select 1
            from  sysobjects
           where  id = object_id('movie_role')
            and   type = 'U')
   drop table movie_role
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('movie_type')
            and   name  = 'movie_type2_FK'
            and   indid > 0
            and   indid < 255)
   drop index movie_type.movie_type2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('movie_type')
            and   name  = 'movie_type_FK'
            and   indid > 0
            and   indid < 255)
   drop index movie_type.movie_type_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('movie_type')
            and   type = 'U')
   drop table movie_type
go

if exists (select 1
            from  sysobjects
           where  id = object_id('occupational')
            and   type = 'U')
   drop table occupational
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"order"')
            and   name  = 'order_studio_card2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "order".order_studio_card2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"order"')
            and   name  = 'user_orders_FK'
            and   indid > 0
            and   indid < 255)
   drop index "order".user_orders_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"order"')
            and   name  = 'order_pay_FK'
            and   indid > 0
            and   indid < 255)
   drop index "order".order_pay_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"order"')
            and   type = 'U')
   drop table "order"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('order_preferential')
            and   name  = 'order_preferential2_FK'
            and   indid > 0
            and   indid < 255)
   drop index order_preferential.order_preferential2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('order_preferential')
            and   name  = 'order_preferential_FK'
            and   indid > 0
            and   indid < 255)
   drop index order_preferential.order_preferential_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('order_preferential')
            and   type = 'U')
   drop table order_preferential
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('pay')
            and   name  = 'pay_pay_account_FK'
            and   indid > 0
            and   indid < 255)
   drop index pay.pay_pay_account_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('pay')
            and   name  = 'order_pay2_FK'
            and   indid > 0
            and   indid < 255)
   drop index pay.order_pay2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('pay')
            and   type = 'U')
   drop table pay
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('pay_account')
            and   name  = 'user_pay_account_FK'
            and   indid > 0
            and   indid < 255)
   drop index pay_account.user_pay_account_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('pay_account')
            and   name  = 'pay_pay_account2_FK'
            and   indid > 0
            and   indid < 255)
   drop index pay_account.pay_pay_account2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('pay_account')
            and   name  = 'preferential_pay_account_FK'
            and   indid > 0
            and   indid < 255)
   drop index pay_account.preferential_pay_account_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('pay_account')
            and   type = 'U')
   drop table pay_account
go

if exists (select 1
            from  sysobjects
           where  id = object_id('person')
            and   type = 'U')
   drop table person
go

if exists (select 1
            from  sysobjects
           where  id = object_id('preferential')
            and   type = 'U')
   drop table preferential
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('province')
            and   name  = 'country_province_FK'
            and   indid > 0
            and   indid < 255)
   drop index province.country_province_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('province')
            and   type = 'U')
   drop table province
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('screening_room')
            and   name  = 'field_screening_room_FK'
            and   indid > 0
            and   indid < 255)
   drop index screening_room.field_screening_room_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('screening_room')
            and   name  = 'theater_screening_room_FK'
            and   indid > 0
            and   indid < 255)
   drop index screening_room.theater_screening_room_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('screening_room')
            and   type = 'U')
   drop table screening_room
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('seat')
            and   name  = 'screening_room_seat_FK'
            and   indid > 0
            and   indid < 255)
   drop index seat.screening_room_seat_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('seat')
            and   type = 'U')
   drop table seat
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('studio_card')
            and   name  = 'order_studio_card_FK'
            and   indid > 0
            and   indid < 255)
   drop index studio_card.order_studio_card_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('studio_card')
            and   type = 'U')
   drop table studio_card
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('theater')
            and   name  = 'theater_area_address_FK'
            and   indid > 0
            and   indid < 255)
   drop index theater.theater_area_address_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('theater')
            and   name  = 'theater_person_FK'
            and   indid > 0
            and   indid < 255)
   drop index theater.theater_person_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('theater')
            and   type = 'U')
   drop table theater
go

if exists (select 1
            from  sysobjects
           where  id = object_id('type')
            and   type = 'U')
   drop table type
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"user"')
            and   name  = 'Inheritance_2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "user".Inheritance_2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"user"')
            and   type = 'U')
   drop table "user"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('user_studio_card')
            and   name  = 'user_studio_card2_FK'
            and   indid > 0
            and   indid < 255)
   drop index user_studio_card.user_studio_card2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('user_studio_card')
            and   name  = 'user_studio_card_FK'
            and   indid > 0
            and   indid < 255)
   drop index user_studio_card.user_studio_card_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('user_studio_card')
            and   type = 'U')
   drop table user_studio_card
go

if exists (select 1
            from  sysobjects
           where  id = object_id('world_country')
            and   type = 'U')
   drop table world_country
go

/*==============================================================*/
/* Table: actor                                                 */
/*==============================================================*/
create table actor (
   actor_id             char(10)             not null,
   city_id              char(12)             null,
   user_id              char(10)             null,
   actor_english_name   varchar(20)          null,
   actor_introduction   varchar(100)         null,
   constraint PK_ACTOR primary key nonclustered (actor_id)
)
go

/*==============================================================*/
/* Index: actor_area_FK                                         */
/*==============================================================*/
create index actor_area_FK on actor (
city_id ASC
)
go

/*==============================================================*/
/* Index: Inheritance_1_FK                                      */
/*==============================================================*/
create index Inheritance_1_FK on actor (
user_id ASC
)
go

/*==============================================================*/
/* Table: actor_occupational                                    */
/*==============================================================*/
create table actor_occupational (
   actor_id             char(10)             not null,
   occupational_id      char(10)             not null,
   constraint PK_ACTOR_OCCUPATIONAL primary key (actor_id, occupational_id)
)
go

/*==============================================================*/
/* Index: actor_occupational_FK                                 */
/*==============================================================*/
create index actor_occupational_FK on actor_occupational (
actor_id ASC
)
go

/*==============================================================*/
/* Index: actor_occupational2_FK                                */
/*==============================================================*/
create index actor_occupational2_FK on actor_occupational (
occupational_id ASC
)
go

/*==============================================================*/
/* Table: area_address                                          */
/*==============================================================*/
create table area_address (
   area_address_id      char(15)             not null,
   country_id           char(12)             null,
   area_address_name    varchar(30)          null,
   area_address_english_name varchar(60)          null,
   constraint PK_AREA_ADDRESS primary key nonclustered (area_address_id)
)
go

/*==============================================================*/
/* Index: country_address_FK                                    */
/*==============================================================*/
create index country_address_FK on area_address (
country_id ASC
)
go

/*==============================================================*/
/* Table: area_film_release                                     */
/*==============================================================*/
create table area_film_release (
   movie_id             char(10)             not null,
   world_country_id     char(10)             not null,
   constraint PK_AREA_FILM_RELEASE primary key (movie_id, world_country_id)
)
go

/*==============================================================*/
/* Index: area_film_release_FK                                  */
/*==============================================================*/
create index area_film_release_FK on area_film_release (
movie_id ASC
)
go

/*==============================================================*/
/* Index: area_film_release2_FK                                 */
/*==============================================================*/
create index area_film_release2_FK on area_film_release (
world_country_id ASC
)
go

/*==============================================================*/
/* Table: city                                                  */
/*==============================================================*/
create table city (
   city_id              char(12)             not null,
   province_id          char(3)             null,
   city_name            varchar(50)          null,
   city_english_name    varchar(20)          null,
   constraint PK_CITY primary key nonclustered (city_id)
)
go



/*==============================================================*/
/* Index: province_city_FK                                      */
/*==============================================================*/
create index province_city_FK on city (
province_id ASC
)
go

/*==============================================================*/
/* Table: contact                                               */
/*==============================================================*/
create table contact (
   concat_id            char(10)             not null,
   concat_number        numeric(11)          null,
   constraint PK_CONTACT primary key nonclustered (concat_id)
)
go

/*==============================================================*/
/* Table: country                                               */
/*==============================================================*/
create table country (
   country_id           char(12)             not null,
   city_id              char(12)             null,
   country_name         varchar(50)          null,
   country_english_name varchar(20)          null,
   constraint PK_COUNTRY primary key nonclustered (country_id)
)
go

/*==============================================================*/
/* Index: city_country_FK                                       */
/*==============================================================*/
create index city_country_FK on country (
city_id ASC
)
go

/*==============================================================*/
/* Table: field                                                 */
/*==============================================================*/
create table field (
   field_id             char(10)             not null,
   movie_id             char(10)             null,
   field_start_data_time datetime             null,
   field_end_data_time  datetime             null,
   constraint PK_FIELD primary key nonclustered (field_id)
)
go

/*==============================================================*/
/* Index: movie_field_FK                                        */
/*==============================================================*/
create index movie_field_FK on field (
movie_id ASC
)
go

/*==============================================================*/
/* Table: field_seat                                            */
/*==============================================================*/
create table field_seat (
   seat_id              char(10)             not null,
   field_id             char(10)             not null,
   order_id             char(10)             not null,
   field_seat_stat      int                  not null,
   constraint PK_FIELD_SEAT primary key (seat_id, field_id, order_id)
)
go

/*==============================================================*/
/* Index: field_seat_FK                                         */
/*==============================================================*/
create index field_seat_FK on field_seat (
seat_id ASC
)
go

/*==============================================================*/
/* Index: field_seat2_FK                                        */
/*==============================================================*/
create index field_seat2_FK on field_seat (
field_id ASC
)
go

/*==============================================================*/
/* Index: field_seat3_FK                                        */
/*==============================================================*/
create index field_seat3_FK on field_seat (
order_id ASC
)
go

/*==============================================================*/
/* Table: movie                                                 */
/*==============================================================*/
create table movie (
   movie_id             char(10)             not null,
   movie_name           varchar(10)          null,
   movie_english_name   varchar(20)          null,
   movie_publishing_data datetime             null,
   movie_introduction   varchar(100)         null,
   movie_source_address varchar(50)          null,
   movie_poster_address varchar(50)          null,
   movie_duration_playback datetime             null,
   movie_score          float                null,
   constraint PK_MOVIE primary key nonclustered (movie_id)
)
go

/*==============================================================*/
/* Table: movie_actor_table                                     */
/*==============================================================*/
create table movie_actor_table (
   movie_id             char(10)             not null,
   actor_id             char(10)             not null,
   movie_role_id        char(10)             not null,
   movie_actor_table_id char(10)             null,
   constraint PK_MOVIE_ACTOR_TABLE primary key (movie_id, actor_id, movie_role_id)
)
go

/*==============================================================*/
/* Index: movie_actor_table_FK                                  */
/*==============================================================*/
create index movie_actor_table_FK on movie_actor_table (
movie_id ASC
)
go

/*==============================================================*/
/* Index: movie_actor_table2_FK                                 */
/*==============================================================*/
create index movie_actor_table2_FK on movie_actor_table (
actor_id ASC
)
go

/*==============================================================*/
/* Index: movie_actor_table3_FK                                 */
/*==============================================================*/
create index movie_actor_table3_FK on movie_actor_table (
movie_role_id ASC
)
go

/*==============================================================*/
/* Table: movie_role                                            */
/*==============================================================*/
create table movie_role (
   movie_role_id        char(10)             not null,
   movie_role_name      varchar(10)          null,
   constraint PK_MOVIE_ROLE primary key nonclustered (movie_role_id)
)
go

/*==============================================================*/
/* Table: movie_type                                            */
/*==============================================================*/
create table movie_type (
   movie_id             char(10)             not null,
   type_id              char(10)             not null,
   constraint PK_MOVIE_TYPE primary key (movie_id, type_id)
)
go

/*==============================================================*/
/* Index: movie_type_FK                                         */
/*==============================================================*/
create index movie_type_FK on movie_type (
movie_id ASC
)
go

/*==============================================================*/
/* Index: movie_type2_FK                                        */
/*==============================================================*/
create index movie_type2_FK on movie_type (
type_id ASC
)
go

/*==============================================================*/
/* Table: occupational                                          */
/*==============================================================*/
create table occupational (
   occupational_id      char(10)             not null,
   occupational_name    varchar(10)          null,
   constraint PK_OCCUPATIONAL primary key nonclustered (occupational_id)
)
go

/*==============================================================*/
/* Table: "order"                                               */
/*==============================================================*/
create table "order" (
   order_id             char(10)             not null,
   pay_id               char(10)             null,
   studio_card_id       char(10)             null,
   user_id              char(10)             null,
   order_name           varchar(50)          null,
   order_time           datetime             null,
   order_paid           datetime             null,
   order_pay_state      int                  null,
   order_limit_time     datetime             null,
   order_get_ticket_code numeric(8)           null,
   order_ticket_state   bit                  null,
   constraint PK_ORDER primary key nonclustered (order_id)
)
go

/*==============================================================*/
/* Index: order_pay_FK                                          */
/*==============================================================*/
create index order_pay_FK on "order" (
pay_id ASC
)
go

/*==============================================================*/
/* Index: user_orders_FK                                        */
/*==============================================================*/
create index user_orders_FK on "order" (
user_id ASC
)
go

/*==============================================================*/
/* Index: order_studio_card2_FK                                 */
/*==============================================================*/
create index order_studio_card2_FK on "order" (
studio_card_id ASC
)
go

/*==============================================================*/
/* Table: order_preferential                                    */
/*==============================================================*/
create table order_preferential (
   order_id             char(10)             not null,
   preferential_id      char(10)             not null,
   constraint PK_ORDER_PREFERENTIAL primary key (order_id, preferential_id)
)
go

/*==============================================================*/
/* Index: order_preferential_FK                                 */
/*==============================================================*/
create index order_preferential_FK on order_preferential (
order_id ASC
)
go

/*==============================================================*/
/* Index: order_preferential2_FK                                */
/*==============================================================*/
create index order_preferential2_FK on order_preferential (
preferential_id ASC
)
go

/*==============================================================*/
/* Table: pay                                                   */
/*==============================================================*/
create table pay (
   pay_id               char(10)             not null,
   pay_account_id       char(10)             null,
   order_id             char(10)             null,
   pay_money_number  decimal(8,2)         null,
   constraint PK_PAY primary key nonclustered (pay_id)
)
go

/*==============================================================*/
/* Index: order_pay2_FK                                         */
/*==============================================================*/
create index order_pay2_FK on pay (
order_id ASC
)
go

/*==============================================================*/
/* Index: pay_pay_account_FK                                    */
/*==============================================================*/
create index pay_pay_account_FK on pay (
pay_account_id ASC
)
go

/*==============================================================*/
/* Table: pay_account                                           */
/*==============================================================*/
create table pay_account (
   pay_account_id       char(10)             not null,
   pay_id               char(10)             null,
   user_id              char(10)             null,
   preferential_id      char(10)             null,
   pay_account_name     varchar(10)          null,
   pay_account_number   varchar(20)          null,
   constraint PK_PAY_ACCOUNT primary key nonclustered (pay_account_id)
)
go

/*==============================================================*/
/* Index: preferential_pay_account_FK                           */
/*==============================================================*/
create index preferential_pay_account_FK on pay_account (
preferential_id ASC
)
go

/*==============================================================*/
/* Index: pay_pay_account2_FK                                   */
/*==============================================================*/
create index pay_pay_account2_FK on pay_account (
pay_id ASC
)
go

/*==============================================================*/
/* Index: user_pay_account_FK                                   */
/*==============================================================*/
create index user_pay_account_FK on pay_account (
user_id ASC
)
go

/*==============================================================*/
/* Table: person                                                */
/*==============================================================*/
create table person (
   person_id            char(10)             not null,
   person_name          varchar(10)          null,
   constraint PK_PERSON primary key nonclustered (person_id)
)
go

/*==============================================================*/
/* Table: preferential                                          */
/*==============================================================*/
create table preferential (
   preferential_id      char(10)             not null,
   preferential_name    varchar(10)          null,
   preferential_introduction varchar(100)         null,
   preferential_only    bit                  null,
   preferential_power   decimal(10,2)        null,
   preferential_start_data_time datetime             null,
   preferential_end_data_time datetime             null,
   constraint PK_PREFERENTIAL primary key nonclustered (preferential_id)
)
go

/*==============================================================*/
/* Table: province                                              */
/*==============================================================*/
create table province (
   province_id          char(3)             not null,
   world_country_id     char(10)             null,
   province_name        varchar(20)          null,
   province_english_name varchar(20)          null,
   constraint PK_PROVINCE primary key nonclustered (province_id)
)
go

/*==============================================================*/
/* Index: country_province_FK                                   */
/*==============================================================*/
create index country_province_FK on province (
world_country_id ASC
)
go

/*==============================================================*/
/* Table: screening_room                                        */
/*==============================================================*/
create table screening_room (
   screening_room_id    char(10)             not null,
   field_id             char(10)             null,
   theater_id           char(10)             null,
   screening_room_name  varchar(10)          null,
   screening_room_capacity int                  null,
   constraint PK_SCREENING_ROOM primary key nonclustered (screening_room_id)
)
go

/*==============================================================*/
/* Index: theater_screening_room_FK                             */
/*==============================================================*/
create index theater_screening_room_FK on screening_room (
theater_id ASC
)
go

/*==============================================================*/
/* Index: field_screening_room_FK                               */
/*==============================================================*/
create index field_screening_room_FK on screening_room (
field_id ASC
)
go

/*==============================================================*/
/* Table: seat                                                  */
/*==============================================================*/
create table seat (
   seat_id              char(10)             not null,
   screening_room_id    char(10)             null,
   seat_x               int                  null,
   seat_y               int                  null,
   seat_is_it           int                  null,
   constraint PK_SEAT primary key nonclustered (seat_id)
)
go

/*==============================================================*/
/* Index: screening_room_seat_FK                                */
/*==============================================================*/
create index screening_room_seat_FK on seat (
screening_room_id ASC
)
go

/*==============================================================*/
/* Table: studio_card                                           */
/*==============================================================*/
create table studio_card (
   studio_card_id       char(10)             not null,
   order_id             char(10)             null,
   studio_card_name     varchar(10)          null,
   studio_card_start_data_time datetime             null,
   studio_card_last_time datetime             null,
   studio_card_sell_money money                null,
   studio_card_introduced varchar(100)         null,
   constraint PK_STUDIO_CARD primary key nonclustered (studio_card_id)
)
go

/*==============================================================*/
/* Index: order_studio_card_FK                                  */
/*==============================================================*/
create index order_studio_card_FK on studio_card (
order_id ASC
)
go

/*==============================================================*/
/* Table: theater                                               */
/*==============================================================*/
create table theater (
   theater_id           char(10)             not null,
   person_id            char(10)             null,
   area_address_id      char(15)             null,
   theater_name         varchar(20)          null,
   theater_introduced   varchar(100)         null,
   constraint PK_THEATER primary key nonclustered (theater_id)
)
go

/*==============================================================*/
/* Index: theater_person_FK                                     */
/*==============================================================*/
create index theater_person_FK on theater (
person_id ASC
)
go

/*==============================================================*/
/* Index: theater_area_address_FK                               */
/*==============================================================*/
create index theater_area_address_FK on theater (
area_address_id ASC
)
go

/*==============================================================*/
/* Table: type                                                  */
/*==============================================================*/
create table type (
   type_id              char(10)             not null,
   type_name            varchar(20)          null,
   constraint PK_TYPE primary key nonclustered (type_id)
)
go

/*==============================================================*/
/* Table: "user"                                                */
/*==============================================================*/
create table "user" (
   user_id              char(10)             not null,
   person_id            char(10)             not null,
   user_sex             bit                  null,
   user_birthday        datetime             null,
   user_passwd          varchar(10)          null,
   user_info            varchar(30)          null,
   constraint PK_USER primary key nonclustered (user_id)
)
go

/*==============================================================*/
/* Index: Inheritance_2_FK                                      */
/*==============================================================*/
create index Inheritance_2_FK on "user" (
person_id ASC
)
go

/*==============================================================*/
/* Table: user_studio_card                                      */
/*==============================================================*/
create table user_studio_card (
   user_id              char(10)             not null,
   studio_card_id       char(10)             not null,
   constraint PK_USER_STUDIO_CARD primary key (user_id, studio_card_id)
)
go

/*==============================================================*/
/* Index: user_studio_card_FK                                   */
/*==============================================================*/
create index user_studio_card_FK on user_studio_card (
user_id ASC
)
go

/*==============================================================*/
/* Index: user_studio_card2_FK                                  */
/*==============================================================*/
create index user_studio_card2_FK on user_studio_card (
studio_card_id ASC
)
go

/*==============================================================*/
/* Table: world_country                                         */
/*==============================================================*/
create table world_country (
   world_country_id     char(10)             not null,
   world_country_name   varchar(10)          null,
   world_country_english_name varchar(20)          null,
   constraint PK_WORLD_COUNTRY primary key nonclustered (world_country_id)
)
go


alter table actor
   add constraint FK_ACTOR_USER_ACTO_USER foreign key (user_id)
      references "user" (user_id)
go

alter table actor_occupational
   add constraint FK_ACTOR_OC_ACTOR_OCC_ACTOR foreign key (actor_id)
      references actor (actor_id)
go

alter table actor_occupational
   add constraint FK_ACTOR_OC_ACTOR_OCC_OCCUPATI foreign key (occupational_id)
      references occupational (occupational_id)
go

alter table area_address
   add constraint FK_AREA_ADD_COUNTRY_A_COUNTRY foreign key (country_id)
      references country (country_id)
go

alter table area_film_release
   add constraint FK_AREA_FIL_AREA_FILM_MOVIE foreign key (movie_id)
      references movie (movie_id)
go

alter table area_film_release
   add constraint FK_AREA_FIL_AREA_FILM_WORLD_CO foreign key (world_country_id)
      references world_country (world_country_id)
go


alter table city
   add constraint FK_CITY_PROVINCE__PROVINCE foreign key (province_id)
      references province (province_id)
go

alter table country
   add constraint FK_COUNTRY_CITY_COUN_CITY foreign key (city_id)
      references city (city_id)
go

alter table field
   add constraint FK_FIELD_MOVIE_FIE_MOVIE foreign key (movie_id)
      references movie (movie_id)
go

alter table field_seat
   add constraint FK_FIELD_SE_FIELD_SEA_SEAT foreign key (seat_id)
      references seat (seat_id)
go

alter table field_seat
   add constraint FK_FIELD_SE_FIELD_SEA_FIELD foreign key (field_id)
      references field (field_id)
go

alter table field_seat
   add constraint FK_FIELD_SE_FIELD_SEA_ORDER foreign key (order_id)
      references "order" (order_id)
go

alter table movie_actor_table
   add constraint FK_MOVIE_AC_MOVIE_ACT_MOVIE foreign key (movie_id)
      references movie (movie_id)
go

alter table movie_actor_table
   add constraint FK_MOVIE_AC_MOVIE_ACT_ACTOR foreign key (actor_id)
      references actor (actor_id)
go

alter table movie_actor_table
   add constraint FK_MOVIE_AC_MOVIE_ACT_MOVIE_RO foreign key (movie_role_id)
      references movie_role (movie_role_id)
go

alter table movie_type
   add constraint FK_MOVIE_TY_MOVIE_TYP_MOVIE foreign key (movie_id)
      references movie (movie_id)
go

alter table movie_type
   add constraint FK_MOVIE_TY_MOVIE_TYP_TYPE foreign key (type_id)
      references type (type_id)
go

alter table "order"
   add constraint FK_ORDER_ORDER_PAY_PAY foreign key (pay_id)
      references pay (pay_id)
go

alter table "order"
   add constraint FK_ORDER_ORDER_STU_STUDIO_C foreign key (studio_card_id)
      references studio_card (studio_card_id)
go

alter table "order"
   add constraint FK_ORDER_USER_ORDE_USER foreign key (user_id)
      references "user" (user_id)
go

alter table order_preferential
   add constraint FK_ORDER_PR_ORDER_PRE_ORDER foreign key (order_id)
      references "order" (order_id)
go

alter table order_preferential
   add constraint FK_ORDER_PR_ORDER_PRE_PREFEREN foreign key (preferential_id)
      references preferential (preferential_id)
go

alter table pay
   add constraint FK_PAY_ORDER_PAY_ORDER foreign key (order_id)
      references "order" (order_id)
go

alter table pay
   add constraint FK_PAY_PAY_PAY_A_PAY_ACCO foreign key (pay_account_id)
      references pay_account (pay_account_id)
go

alter table pay_account
   add constraint FK_PAY_ACCO_PAY_PAY_A_PAY foreign key (pay_id)
      references pay (pay_id)
go

alter table pay_account
   add constraint FK_PAY_ACCO_PREFERENT_PREFEREN foreign key (preferential_id)
      references preferential (preferential_id)
go

alter table pay_account
   add constraint FK_PAY_ACCO_USER_PAY__USER foreign key (user_id)
      references "user" (user_id)
go

alter table province
   add constraint FK_PROVINCE_COUNTRY_P_WORLD_CO foreign key (world_country_id)
      references world_country (world_country_id)
go

alter table screening_room
   add constraint FK_SCREENIN_FIELD_SCR_FIELD foreign key (field_id)
      references field (field_id)
go

alter table screening_room
   add constraint FK_SCREENIN_THEATER_S_THEATER foreign key (theater_id)
      references theater (theater_id)
go

alter table seat
   add constraint FK_SEAT_SCREENING_SCREENIN foreign key (screening_room_id)
      references screening_room (screening_room_id)
go

alter table studio_card
   add constraint FK_STUDIO_C_ORDER_STU_ORDER foreign key (order_id)
      references "order" (order_id)
go

alter table theater
   add constraint FK_THEATER_THEATER_A_AREA_ADD foreign key (area_address_id)
      references area_address (area_address_id)
go

alter table theater
   add constraint FK_THEATER_THEATER_P_PERSON foreign key (person_id)
      references person (person_id)
go

alter table "user"
   add constraint FK_USER_PERSON_US_PERSON foreign key (person_id)
      references person (person_id)
go

alter table user_studio_card
   add constraint FK_USER_STU_USER_STUD_USER foreign key (user_id)
      references "user" (user_id)
go

alter table user_studio_card
   add constraint FK_USER_STU_USER_STUD_STUDIO_C foreign key (studio_card_id)
      references studio_card (studio_card_id)
go

