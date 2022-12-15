DROP TABLE IF EXISTS materias01;
create table materias01(
matricula VARCHAR(10), 
nombre VARCHAR(50), 
profesor VARCHAR(50),  
creditos INT, 
calificacion INT,
PRIMARY KEY (matricula));