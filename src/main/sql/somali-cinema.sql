/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2012                    */
/* Created on:     2020/5/26 14:55:15                           */
/*==============================================================*/

use somali_cinema
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('actor') and o.name = 'FK_ACTOR_ACTOR_HOM_CITY')
alter table actor
    drop constraint FK_ACTOR_ACTOR_HOM_CITY
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('cinema') and o.name = 'FK_CINEMA_COMPANY_C_COMPANY')
alter table cinema
    drop constraint FK_CINEMA_COMPANY_C_COMPANY
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('cinema') and o.name = 'FK_CINEMA_COUNTRY_C_COUNTRY')
alter table cinema
    drop constraint FK_CINEMA_COUNTRY_C_COUNTRY
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
           where r.fkeyid = object_id('field') and o.name = 'FK_FIELD_SCREENING_SCREENIN')
alter table field
    drop constraint FK_FIELD_SCREENING_SCREENIN
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('movie') and o.name = 'FK_MOVIE_MOVIE_LOC_CITY')
alter table movie
    drop constraint FK_MOVIE_MOVIE_LOC_CITY
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('movie') and o.name = 'FK_MOVIE_MOVIES_TY_MOVIE_TY')
alter table movie
    drop constraint FK_MOVIE_MOVIES_TY_MOVIE_TY
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('movie_actors') and o.name = 'FK_MOVIE_AC_ACTOR_MOV_ACTOR')
alter table movie_actors
    drop constraint FK_MOVIE_AC_ACTOR_MOV_ACTOR
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('movie_actors') and o.name = 'FK_MOVIE_AC_ACTOR_ROL_ACTOR_RO')
alter table movie_actors
    drop constraint FK_MOVIE_AC_ACTOR_ROL_ACTOR_RO
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('movie_actors') and o.name = 'FK_MOVIE_AC_MOVIE_MOV_MOVIE')
alter table movie_actors
    drop constraint FK_MOVIE_AC_MOVIE_MOV_MOVIE
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('picture') and o.name = 'FK_PICTURE_ACTOR_PIC_ACTOR')
alter table picture
    drop constraint FK_PICTURE_ACTOR_PIC_ACTOR
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('picture') and o.name = 'FK_PICTURE_MOVIE_PIC_MOVIE')
alter table picture
    drop constraint FK_PICTURE_MOVIE_PIC_MOVIE
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('province') and o.name = 'FK_PROVINCE_WORLD_COU_WORLD_CO')
alter table province
    drop constraint FK_PROVINCE_WORLD_COU_WORLD_CO
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('screening_room') and o.name = 'FK_SCREENIN_CINEMA_SC_CINEMA')
alter table screening_room
    drop constraint FK_SCREENIN_CINEMA_SC_CINEMA
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('seat') and o.name = 'FK_SEAT_SCREENING_SCREENIN')
alter table seat
    drop constraint FK_SEAT_SCREENING_SCREENIN
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('ticket') and o.name = 'FK_TICKET_FIELD_TIC_FIELD')
alter table ticket
    drop constraint FK_TICKET_FIELD_TIC_FIELD
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('ticket') and o.name = 'FK_TICKET_MOVIE_TIC_MOVIE')
alter table ticket
    drop constraint FK_TICKET_MOVIE_TIC_MOVIE
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('ticket') and o.name = 'FK_TICKET_ORDER_TIC_ORDER')
alter table ticket
    drop constraint FK_TICKET_ORDER_TIC_ORDER
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('ticket') and o.name = 'FK_TICKET_SEAT_TICK_SEAT')
alter table ticket
    drop constraint FK_TICKET_SEAT_TICK_SEAT
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('ticket') and o.name = 'FK_TICKET_TICKET_WA_WATCHED')
alter table ticket
    drop constraint FK_TICKET_TICKET_WA_WATCHED
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('"user"') and o.name = 'FK_USER_USER_CITY_CITY')
alter table "user"
    drop constraint FK_USER_USER_CITY_CITY
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('"user"') and o.name = 'FK_USER_USER_STAT_STATE_LI')
alter table "user"
    drop constraint FK_USER_USER_STAT_STATE_LI
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('user_fun') and o.name = 'FK_USER_FUN_RELATIONS_USER')
alter table user_fun
    drop constraint FK_USER_FUN_RELATIONS_USER
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('user_fun') and o.name = 'FK_USER_FUN_RELATIONS_FUN')
alter table user_fun
    drop constraint FK_USER_FUN_RELATIONS_FUN
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('want_watch') and o.name = 'FK_WANT_WAT_USER_WANT_USER')
alter table want_watch
    drop constraint FK_WANT_WAT_USER_WANT_USER
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('want_watch') and o.name = 'FK_WANT_WAT_WANT_WATC_MOVIE')
alter table want_watch
    drop constraint FK_WANT_WAT_WANT_WATC_MOVIE
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('watched') and o.name = 'FK_WATCHED_MOVIE_WAT_MOVIE')
alter table watched
    drop constraint FK_WATCHED_MOVIE_WAT_MOVIE
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('watched') and o.name = 'FK_WATCHED_TICKET_WA_TICKET')
alter table watched
    drop constraint FK_WATCHED_TICKET_WA_TICKET
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('watched') and o.name = 'FK_WATCHED_USER_WATC_USER')
alter table watched
    drop constraint FK_WATCHED_USER_WATC_USER
go

if exists (select 1
           from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
           where r.fkeyid = object_id('world_country') and o.name = 'FK_WORLD_CO_CHAU_COUN_CHAU')
alter table world_country
    drop constraint FK_WORLD_CO_CHAU_COUN_CHAU
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
           from  sysobjects
           where  id = object_id('actor_role')
             and   type = 'U')
    drop table actor_role
go

if exists (select 1
           from  sysobjects
           where  id = object_id('area_address')
             and   type = 'U')
    drop table area_address
go

if exists (select 1
           from  sysobjects
           where  id = object_id('chau')
             and   type = 'U')
    drop table chau
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('cinema')
             and   name  = 'company_cinema_FK'
             and   indid > 0
             and   indid < 255)
    drop index cinema.company_cinema_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('cinema')
             and   name  = 'country_cinema_FK'
             and   indid > 0
             and   indid < 255)
    drop index cinema.country_cinema_FK
go

if exists (select 1
           from  sysobjects
           where  id = object_id('cinema')
             and   type = 'U')
    drop table cinema
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
           from  sysobjects
           where  id = object_id('city')
             and   type = 'U')
    drop table city
go

if exists (select 1
           from  sysobjects
           where  id = object_id('company')
             and   type = 'U')
    drop table company
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
             and   name  = 'screening_room_field_FK'
             and   indid > 0
             and   indid < 255)
    drop index field.screening_room_field_FK
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
           from  sysobjects
           where  id = object_id('fun')
             and   type = 'U')
    drop table fun
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('movie')
             and   name  = 'movie_location_FK'
             and   indid > 0
             and   indid < 255)
    drop index movie.movie_location_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('movie')
             and   name  = 'movies_type_FK'
             and   indid > 0
             and   indid < 255)
    drop index movie.movies_type_FK
go

if exists (select 1
           from  sysobjects
           where  id = object_id('movie')
             and   type = 'U')
    drop table movie
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('movie_actors')
             and   name  = 'actor_role_movie_actors_FK'
             and   indid > 0
             and   indid < 255)
    drop index movie_actors.actor_role_movie_actors_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('movie_actors')
             and   name  = 'movie_movie_actors_FK'
             and   indid > 0
             and   indid < 255)
    drop index movie_actors.movie_movie_actors_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('movie_actors')
             and   name  = 'actor_movie_actors_FK'
             and   indid > 0
             and   indid < 255)
    drop index movie_actors.actor_movie_actors_FK
go

if exists (select 1
           from  sysobjects
           where  id = object_id('movie_actors')
             and   type = 'U')
    drop table movie_actors
go

if exists (select 1
           from  sysobjects
           where  id = object_id('movie_role')
             and   type = 'U')
    drop table movie_role
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
           from  sysobjects
           where  id = object_id('"order"')
             and   type = 'U')
    drop table "order"
go

if exists (select 1
           from  sysobjects
           where  id = object_id('pay')
             and   type = 'U')
    drop table pay
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
           from  sysindexes
           where  id    = object_id('picture')
             and   name  = 'movie_picture_FK'
             and   indid > 0
             and   indid < 255)
    drop index picture.movie_picture_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('picture')
             and   name  = 'actor_picture_FK'
             and   indid > 0
             and   indid < 255)
    drop index picture.actor_picture_FK
go

if exists (select 1
           from  sysobjects
           where  id = object_id('picture')
             and   type = 'U')
    drop table picture
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
           from  sysobjects
           where  id = object_id('regional')
             and   type = 'U')
    drop table regional
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('screening_room')
             and   name  = 'cinema_screening_roo,_FK'
             and   indid > 0
             and   indid < 255)
    drop index screening_room.cinema_screening_room_FK
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
           from  sysobjects
           where  id = object_id('state_life')
             and   type = 'U')
    drop table state_life
go

if exists (select 1
           from  sysobjects
           where  id = object_id('studio_card')
             and   type = 'U')
    drop table studio_card
go

if exists (select 1
           from  sysobjects
           where  id = object_id('theater')
             and   type = 'U')
    drop table theater
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('ticket')
             and   name  = 'ticket_watch_FK'
             and   indid > 0
             and   indid < 255)
    drop index ticket.ticket_watch_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('ticket')
             and   name  = 'field_ticket_FK'
             and   indid > 0
             and   indid < 255)
    drop index ticket.field_ticket_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('ticket')
             and   name  = 'seat_ticket_FK'
             and   indid > 0
             and   indid < 255)
    drop index ticket.seat_ticket_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('ticket')
             and   name  = 'order_ticket_FK'
             and   indid > 0
             and   indid < 255)
    drop index ticket.order_ticket_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('ticket')
             and   name  = 'movie_ticket_FK'
             and   indid > 0
             and   indid < 255)
    drop index ticket.movie_ticket_FK
go

if exists (select 1
           from  sysobjects
           where  id = object_id('ticket')
             and   type = 'U')
    drop table ticket
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
             and   name  = 'user_state_life_FK'
             and   indid > 0
             and   indid < 255)
    drop index "user".user_state_life_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('"user"')
             and   name  = 'user_city_FK'
             and   indid > 0
             and   indid < 255)
    drop index "user".user_city_FK
go

if exists (select 1
           from  sysobjects
           where  id = object_id('"user"')
             and   type = 'U')
    drop table "user"
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('user_fun')
             and   name  = 'user_fun2_FK'
             and   indid > 0
             and   indid < 255)
    drop index user_fun.user_fun2_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('user_fun')
             and   name  = 'user_fun_FK'
             and   indid > 0
             and   indid < 255)
    drop index user_fun.user_fun_FK
go

if exists (select 1
           from  sysobjects
           where  id = object_id('user_fun')
             and   type = 'U')
    drop table user_fun
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('want_watch')
             and   name  = 'want_watch_movie_FK'
             and   indid > 0
             and   indid < 255)
    drop index want_watch.want_watch_movie_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('want_watch')
             and   name  = 'user_want_watch_FK'
             and   indid > 0
             and   indid < 255)
    drop index want_watch.user_want_watch_FK
go

if exists (select 1
           from  sysobjects
           where  id = object_id('want_watch')
             and   type = 'U')
    drop table want_watch
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('watched')
             and   name  = 'ticket_watch2_FK'
             and   indid > 0
             and   indid < 255)
    drop index watched.ticket_watch2_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('watched')
             and   name  = 'user_watched_FK'
             and   indid > 0
             and   indid < 255)
    drop index watched.user_watched_FK
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('watched')
             and   name  = 'movie_watched_FK'
             and   indid > 0
             and   indid < 255)
    drop index watched.movie_watched_FK
go

if exists (select 1
           from  sysobjects
           where  id = object_id('watched')
             and   type = 'U')
    drop table watched
go

if exists (select 1
           from  sysindexes
           where  id    = object_id('world_country')
             and   name  = 'chau_country_FK'
             and   indid > 0
             and   indid < 255)
    drop index world_country.chau_country_FK
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
                       actor_introduction   varchar(100)         null,
                       actor_name           varchar(10)          null,
                       actor_sex            bit                  null,
                       actor_birthday       datetime             null,
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
/* Table: actor_role                                            */
/*==============================================================*/
create table actor_role (
                            actor_role_id        char(3)              not null,
                            actor_role_name      varchar(20)          null,
                            constraint PK_ACTOR_ROLE primary key nonclustered (actor_role_id)
)
go

/*==============================================================*/
/* Table: area_address                                          */
/*==============================================================*/
create table area_address (
                              area_address_id      char(15)             not null,
                              area_address_name    varchar(30)          null,
                              area_address_english_name varchar(60)          null,
                              constraint PK_AREA_ADDRESS primary key nonclustered (area_address_id)
)
go

/*==============================================================*/
/* Table: chau                                                  */
/*==============================================================*/
create table chau (
                      chau_id              char(10)             not null,
                      chau_name            varchar(20)          null,
                      constraint PK_CHAU primary key nonclustered (chau_id)
)
go

/*==============================================================*/
/* Table: cinema                                                */
/*==============================================================*/
create table cinema (
                        cinema_id            char(16)             not null,
                        company_id           char(10)             null,
                        country_id           char(12)             null,
                        cinema_name          varchar(50)          null,
                        cinema_address       varchar(50)          null,
                        cinema_telphone      varchar(13)          null,
                        constraint PK_CINEMA primary key nonclustered (cinema_id)
)
go

/*==============================================================*/
/* Index: country_cinema_FK                                     */
/*==============================================================*/
create index country_cinema_FK on cinema (
                                          country_id ASC
    )
go

/*==============================================================*/
/* Index: company_cinema_FK                                     */
/*==============================================================*/
create index company_cinema_FK on cinema (
                                          company_id ASC
    )
go

/*==============================================================*/
/* Table: city                                                  */
/*==============================================================*/
create table city (
                      city_id              char(12)             not null,
                      province_id          char(3)              null,
                      city_name            varchar(50)          null,
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
/* Table: company                                               */
/*==============================================================*/
create table company (
                         company_id           char(10)             not null,
                         company_name         varchar(30)          null,
                         constraint PK_COMPANY primary key nonclustered (company_id)
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
                       screening_room_id    char(10)             null,
                       movie_id             char(10)             null,
                       field_start_data_time datetime             null,
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
/* Index: screening_room_field_FK                               */
/*==============================================================*/
create index screening_room_field_FK on field (
                                               screening_room_id ASC
    )
go

/*==============================================================*/
/* Table: fun                                                   */
/*==============================================================*/
create table fun (
                     fun_id               char(10)             not null,
                     fun_name             varchar(10)          null,
                     constraint PK_FUN primary key nonclustered (fun_id)
)
go

/*==============================================================*/
/* Table: movie                                                 */
/*==============================================================*/
create table movie (
                       movie_id             char(10)             not null,
                       movie_type_id        char(10)             null,
                       city_id              char(12)             null,
                       movie_name           varchar(10)          null,
                       movie_publishing_data datetime             null,
                       movie_introduction   varchar(100)         null,
                       movie_source_address varchar(50)          null,
                       movie_poster_address varchar(50)          null,
                       movie_duration_playback datetime             null,
                       movie_last_time      datetime             null,
                       constraint PK_MOVIE primary key nonclustered (movie_id)
)
go

/*==============================================================*/
/* Index: movies_type_FK                                        */
/*==============================================================*/
create index movies_type_FK on movie (
                                      movie_type_id ASC
    )
go

/*==============================================================*/
/* Index: movie_location_FK                                     */
/*==============================================================*/
create index movie_location_FK on movie (
                                         city_id ASC
    )
go

/*==============================================================*/
/* Table: movie_actors                                          */
/*==============================================================*/
create table movie_actors (
                              movie_actors_id      char(10)             not null,
                              actor_id             char(10)             null,
                              movie_id             char(10)             null,
                              actor_role_id        char(3)              null,
                              constraint PK_MOVIE_ACTORS primary key nonclustered (movie_actors_id)
)
go

/*==============================================================*/
/* Index: actor_movie_actors_FK                                 */
/*==============================================================*/
create index actor_movie_actors_FK on movie_actors (
                                                    actor_id ASC
    )
go

/*==============================================================*/
/* Index: movie_movie_actors_FK                                 */
/*==============================================================*/
create index movie_movie_actors_FK on movie_actors (
                                                    movie_id ASC
    )
go

/*==============================================================*/
/* Index: actor_role_movie_actors_FK                            */
/*==============================================================*/
create index actor_role_movie_actors_FK on movie_actors (
                                                         actor_role_id ASC
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
                            movie_type_id        char(10)             not null,
                            movie_type_name      varchar(20)          null,
                            constraint PK_MOVIE_TYPE primary key (movie_type_id)
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
                         order_time           datetime             null,
                         order_pay_time       datetime             null,
                         order_limit_time     datetime             null,
                         order_money          money                null,
                         constraint PK_ORDER primary key nonclustered (order_id)
)
go

/*==============================================================*/
/* Table: pay                                                   */
/*==============================================================*/
create table pay (
                     pay_id               char(10)             not null,
                     "pay_money+_number"  decimal(8,2)         null,
                     constraint PK_PAY primary key nonclustered (pay_id)
)
go

/*==============================================================*/
/* Table: pay_account                                           */
/*==============================================================*/
create table pay_account (
                             pay_account_id       char(10)             not null,
                             pay_account_name     varchar(10)          null,
                             pay_account_number   varchar(20)          null,
                             constraint PK_PAY_ACCOUNT primary key nonclustered (pay_account_id)
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
/* Table: picture                                               */
/*==============================================================*/
create table picture (
                         pricture_id          char(10)             not null,
                         movie_id             char(10)             null,
                         actor_id             char(10)             null,
                         picture_name         varchar(20)          null,
                         pricture_address     varchar(50)          null,
                         constraint PK_PICTURE primary key nonclustered (pricture_id)
)
go

/*==============================================================*/
/* Index: actor_picture_FK                                      */
/*==============================================================*/
create index actor_picture_FK on picture (
                                          actor_id ASC
    )
go

/*==============================================================*/
/* Index: movie_picture_FK                                      */
/*==============================================================*/
create index movie_picture_FK on picture (
                                          movie_id ASC
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
                          province_id          char(3)              not null,
                          world_country_id     char(10)             null,
                          province_name        varchar(50)          null,
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
/* Table: regional                                              */
/*==============================================================*/
create table regional (
                          regional_id          char(5)              null,
                          regoional_name       varchar(20)          null
)
go

/*==============================================================*/
/* Table: screening_room                                        */
/*==============================================================*/
create table screening_room (
                                screening_room_id    char(10)             not null,
                                cinema_id            char(16)             null,
                                screening_room_name  varchar(10)          null,
                                screening_room_capacity int                  null,
                                constraint PK_SCREENING_ROOM primary key nonclustered (screening_room_id)
)
go

/*==============================================================*/
/* Index: cinema_screening_roo,_FK                              */
/*==============================================================*/
create index cinema_screening_room_FK on screening_room (
                                                         cinema_id ASC
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
                      seat_state           int                  null,
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
/* Table: state_life                                            */
/*==============================================================*/
create table state_life (
                            state_life_id        char(10)             not null,
                            state_life_name      varchar(10)          null,
                            constraint PK_STATE_LIFE primary key nonclustered (state_life_id)
)
go

/*==============================================================*/
/* Table: studio_card                                           */
/*==============================================================*/
create table studio_card (
                             studio_card_id       char(10)             not null,
                             studio_card_name     varchar(10)          null,
                             studio_card_start_data_time datetime             null,
                             studio_card_last_time datetime             null,
                             studio_card_sell_money money                null,
                             studio_card_introduced varchar(100)         null,
                             constraint PK_STUDIO_CARD primary key nonclustered (studio_card_id)
)
go

/*==============================================================*/
/* Table: theater                                               */
/*==============================================================*/
create table theater (
                         theater_id           char(10)             not null,
                         theater_name         varchar(20)          null,
                         theater_introduced   varchar(100)         null,
                         constraint PK_THEATER primary key nonclustered (theater_id)
)
go

/*==============================================================*/
/* Table: ticket                                                */
/*==============================================================*/
create table ticket (
                        ticket_id     char(16) not null,
                        order_id      char(10) null,
                        movie_id      char(10) null,
                        watched_id    char(10) null,
                        seat_id       char(10) null,
                        field_id      char(10) null,
                        ticket_monoey money    not null,
                        constraint PK_TICKET primary key nonclustered (ticket_id)
)
go

/*==============================================================*/
/* Index: movie_ticket_FK                                       */
/*==============================================================*/
create index movie_ticket_FK on ticket (
                                        movie_id ASC
    )
go

/*==============================================================*/
/* Index: order_ticket_FK                                       */
/*==============================================================*/
create index order_ticket_FK on ticket (
                                        order_id ASC
    )
go

/*==============================================================*/
/* Index: seat_ticket_FK                                        */
/*==============================================================*/
create index seat_ticket_FK on ticket (
                                       seat_id ASC
    )
go

/*==============================================================*/
/* Index: field_ticket_FK                                       */
/*==============================================================*/
create index field_ticket_FK on ticket (
                                        field_id ASC
    )
go

/*==============================================================*/
/* Index: ticket_watch_FK                                       */
/*==============================================================*/
create index ticket_watch_FK on ticket (
                                        watched_id ASC
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
                        user_id                    char(10)    not null,
                        city_id                    char(12)    null,
                        state_life_id              char(10)    null,
                        user_name                  varchar(20) null,
                        user_sex                   bit         null,
                        user_birthday              datetime    null,
                        user_password              char(32)    null,
                        user_telphone              char(11)    null,
                        user_picture_address       varchar(50) null,
                        user_create_time           datetime    null,
                        user_last_load_time        datetime    null,
                        user_is_delete             bit         null,
                        user_is_load               bit         null,
                        user_personality_signature varchar(30) null,
                        constraint PK_USER primary key nonclustered (user_id)
)
go

/*==============================================================*/
/* Index: user_city_FK                                          */
/*==============================================================*/
create index user_city_FK on "user" (
                                     city_id ASC
    )
go

/*==============================================================*/
/* Index: user_state_life_FK                                    */
/*==============================================================*/
create index user_state_life_FK on "user" (
                                           state_life_id ASC
    )
go

/*==============================================================*/
/* Table: user_fun                                              */
/*==============================================================*/
create table user_fun (
                          user_fun_id          char(10)             not null,
                          user_id              char(10)             not null,
                          fun_id               char(10)             not null,
                          constraint PK_USER_FUN primary key (user_fun_id, user_id, fun_id)
)
go

/*==============================================================*/
/* Index: user_fun_FK                                           */
/*==============================================================*/
create index user_fun_FK on user_fun (
                                      user_id ASC
    )
go

/*==============================================================*/
/* Index: user_fun2_FK                                          */
/*==============================================================*/
create index user_fun2_FK on user_fun (
                                       fun_id ASC
    )
go

/*==============================================================*/
/* Table: want_watch                                            */
/*==============================================================*/
create table want_watch (
                            want_watch_id        char(10)             not null,
                            movie_id             char(10)             null,
                            user_id              char(10)             null,
                            sure_want_watch_time datetime             null,
                            constraint PK_WANT_WATCH primary key nonclustered (want_watch_id)
)
go

/*==============================================================*/
/* Index: user_want_watch_FK                                    */
/*==============================================================*/
create index user_want_watch_FK on want_watch (
                                               user_id ASC
    )
go

/*==============================================================*/
/* Index: want_watch_movie_FK                                   */
/*==============================================================*/
create index want_watch_movie_FK on want_watch (
                                                movie_id ASC
    )
go

/*==============================================================*/
/* Table: watched                                               */
/*==============================================================*/
create table watched (
                         watched_id           char(10)             not null,
                         movie_id             char(10)             null,
                         user_id              char(10)             null,
                         ticket_id            char(16)             null,
                         movie_score          float                null,
                         movie_evalution      varchar(60)          null,
                         constraint PK_WATCHED primary key nonclustered (watched_id)
)
go

/*==============================================================*/
/* Index: movie_watched_FK                                      */
/*==============================================================*/
create index movie_watched_FK on watched (
                                          movie_id ASC
    )
go

/*==============================================================*/
/* Index: user_watched_FK                                       */
/*==============================================================*/
create index user_watched_FK on watched (
                                         user_id ASC
    )
go

/*==============================================================*/
/* Index: ticket_watch2_FK                                      */
/*==============================================================*/
create index ticket_watch2_FK on watched (
                                          ticket_id ASC
    )
go

/*==============================================================*/
/* Table: world_country                                         */
/*==============================================================*/
create table world_country (
                               world_country_id     char(10)             not null,
                               chau_id              char(10)             null,
                               world_country_name   varchar(10)          null,
                               constraint PK_WORLD_COUNTRY primary key nonclustered (world_country_id)
)
go

/*==============================================================*/
/* Index: chau_country_FK                                       */
/*==============================================================*/
create index chau_country_FK on world_country (
                                               chau_id ASC
    )
go

alter table actor
    add constraint FK_ACTOR_ACTOR_HOM_CITY foreign key (city_id)
        references city (city_id)
go

alter table cinema
    add constraint FK_CINEMA_COMPANY_C_COMPANY foreign key (company_id)
        references company (company_id)
go

alter table cinema
    add constraint FK_CINEMA_COUNTRY_C_COUNTRY foreign key (country_id)
        references country (country_id)
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

alter table field
    add constraint FK_FIELD_SCREENING_SCREENIN foreign key (screening_room_id)
        references screening_room (screening_room_id)
go

alter table movie
    add constraint FK_MOVIE_MOVIE_LOC_CITY foreign key (city_id)
        references city (city_id)
go

alter table movie
    add constraint FK_MOVIE_MOVIES_TY_MOVIE_TY foreign key (movie_type_id)
        references movie_type (movie_type_id)
go

alter table movie_actors
    add constraint FK_MOVIE_AC_ACTOR_MOV_ACTOR foreign key (actor_id)
        references actor (actor_id)
go

alter table movie_actors
    add constraint FK_MOVIE_AC_ACTOR_ROL_ACTOR_RO foreign key (actor_role_id)
        references actor_role (actor_role_id)
go

alter table movie_actors
    add constraint FK_MOVIE_AC_MOVIE_MOV_MOVIE foreign key (movie_id)
        references movie (movie_id)
go

alter table picture
    add constraint FK_PICTURE_ACTOR_PIC_ACTOR foreign key (actor_id)
        references actor (actor_id)
go

alter table picture
    add constraint FK_PICTURE_MOVIE_PIC_MOVIE foreign key (movie_id)
        references movie (movie_id)
go

alter table province
    add constraint FK_PROVINCE_WORLD_COU_WORLD_CO foreign key (world_country_id)
        references world_country (world_country_id)
go

alter table screening_room
    add constraint FK_SCREENIN_CINEMA_SC_CINEMA foreign key (cinema_id)
        references cinema (cinema_id)
go

alter table seat
    add constraint FK_SEAT_SCREENING_SCREENIN foreign key (screening_room_id)
        references screening_room (screening_room_id)
go

alter table ticket
    add constraint FK_TICKET_FIELD_TIC_FIELD foreign key (field_id)
        references field (field_id)
go

alter table ticket
    add constraint FK_TICKET_MOVIE_TIC_MOVIE foreign key (movie_id)
        references movie (movie_id)
go

alter table ticket
    add constraint FK_TICKET_ORDER_TIC_ORDER foreign key (order_id)
        references "order" (order_id)
go

alter table ticket
    add constraint FK_TICKET_SEAT_TICK_SEAT foreign key (seat_id)
        references seat (seat_id)
go

alter table ticket
    add constraint FK_TICKET_TICKET_WA_WATCHED foreign key (watched_id)
        references watched (watched_id)
go

alter table "user"
    add constraint FK_USER_USER_CITY_CITY foreign key (city_id)
        references city (city_id)
go

alter table "user"
    add constraint FK_USER_USER_STAT_STATE_LI foreign key (state_life_id)
        references state_life (state_life_id)
go

alter table user_fun
    add constraint FK_USER_FUN_RELATIONS_USER foreign key (user_id)
        references "user" (user_id)
go

alter table user_fun
    add constraint FK_USER_FUN_RELATIONS_FUN foreign key (fun_id)
        references fun (fun_id)
go

alter table want_watch
    add constraint FK_WANT_WAT_USER_WANT_USER foreign key (user_id)
        references "user" (user_id)
go

alter table want_watch
    add constraint FK_WANT_WAT_WANT_WATC_MOVIE foreign key (movie_id)
        references movie (movie_id)
go

alter table watched
    add constraint FK_WATCHED_MOVIE_WAT_MOVIE foreign key (movie_id)
        references movie (movie_id)
go

alter table watched
    add constraint FK_WATCHED_TICKET_WA_TICKET foreign key (ticket_id)
        references ticket (ticket_id)
go

alter table watched
    add constraint FK_WATCHED_USER_WATC_USER foreign key (user_id)
        references "user" (user_id)
go

alter table world_country
    add constraint FK_WORLD_CO_CHAU_COUN_CHAU foreign key (chau_id)
        references chau (chau_id)
go

alter table [user]
    ADD CONSTRAINT user_picture_address_default DEFAULT ('/img/photo.jpg') for user_picture_address
go

alter table regional
    alter column regional_id char(10) not null
go
alter table regional
    add constraint regional_PK primary key nonclustered (regional_id)
go

alter table field
    add [money] money
go