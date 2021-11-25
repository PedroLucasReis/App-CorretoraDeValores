
create table tb_user(
 	nome varchar(255),
 	email varchar(100),
	cpf varchar(100),
	telefone varchar(100),
	data_nasc varchar(100),
	senha varchar (100),
        saldo double,
	constraint pk_user_cpf primary key (cpf)
);

create table tb_empresa(
        id serial,
 	nome varchar(255),
 	valor_atual double,
	constraint pk_empresa_id primary key (id)
);

create table tb_ofertas (
	cpf_user varchar(100),
	id_empresa integer,
	quantidade integer,
	valor double,
	constraint fk_user_cpf foreign key (cpf_user) references tb_user(cpf),
        constraint fk_empresa_id foreign key (id_empresa) references tb_empresa(id)
);

select * from tb_user;