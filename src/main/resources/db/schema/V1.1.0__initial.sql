create table bms_core.bus (
    id varchar(36) primary key
);

create table bms_core.passenger (
    id varchar(36) primary key,
    name varchar(50)
);

create table bms_core.seat (
    id varchar(36) primary key,
    number varchar(50),
    passenger_fk varchar (36) foreign key references bms.passenger,
    bus_fk varchar (36) foreign key references bms.bus
);