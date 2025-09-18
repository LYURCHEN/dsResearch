create table if not exists `order`(
    order_id bigint not null,
    user_id bigint not null,
    order_status int not null ,
    shipping_address varchar(512) not null ,
    total_amount decimal(4,19) not null,
    create_time timestamp not null ,
    modify_time timestamp not null ,
    primary key (order_id),
    foreign key (user_id) references users(id)
)