use franciscoa_versionador;

drop table if exists log_entrada;
create table log_entrada(
	ip varchar(15) primary key, -- INET_ATON(dir-ip-octetos)
    usuario varchar(30),
    pc varchar(30),
    fecha date
    );
    
drop table if exists logs;
create table logs(
	usuario varchar(30),
    fecha date,
    accion varchar(20)
    );
    
drop table if exists transacciones;
create table transacciones(
	id_transaccion int primary key,
    usuario varchar(30),
    fecha date,
    comentario varchar(250)
    );
    
drop table if exists versiones;
create table versiones(
	id_version int primary key,
    id_transaccion int,
    id_archivo int,
    usuario varchar(30),
    fecha date,
    tipo varchar(20),
    foreign key (id_transaccion) references transacciones(id_transaccion) 
    );
    
drop table if exists proyectos_det;
create table proyectos_det(
	id_proyecto int,
    id_archivo int,
    archivo varchar(40),
    usuario varchar(30),
    destino varchar(30)
    );
    
drop table if exists proyectos_cab;
create table proyectos_cab(
	id_proyecto int,
    nombre varchar(30),
    descripcion varchar(100),
    carpeta_base varchar(20),
    activo varchar(10),
    creado_usuario varchar(30),
    creado_dia date
    );
    
drop table if exists archivos_vinculados;
create table archivos_vinculados(
	id_proyecto int,
    id_archivo int
    );