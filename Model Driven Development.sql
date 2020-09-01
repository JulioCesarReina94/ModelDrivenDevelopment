-- 
-- Uncomment me if you want :)
-- CREATE DATABASE Model Driven Development;

CREATE TABLE Miembro
(
    idMiembro Integer NOT NULL,
    fechaInicio String NOT NULL
);

CREATE TABLE Persona
(
    tipoIdentificacion String NOT NULL,
    NroIdentifiacion Integer NOT NULL,
    nombre String NOT NULL,
    apellido String NOT NULL,
    sexo String NOT NULL,
    nroTelefono Integer NOT NULL,
    fechaNacimiento String NOT NULL,
    direccion String NOT NULL,
    correo String NOT NULL
);

CREATE TABLE Cargo
(
    idCargo Integer NOT NULL,
    nombreCargo String NOT NULL
);

CREATE TABLE Pago
(
    NumeroPago String NOT NULL,
    fechaPago String NOT NULL,
    valor Integer NOT NULL,
    estado String NOT NULL
);

CREATE TABLE Empleado
(

);

CREATE TABLE Solicitud
(
    NroSolicitud Integer NOT NULL,
    estado String NOT NULL,
    fechaRegistro String NOT NULL,
    fechaAprobacion String NOT NULL
);

CREATE TABLE Club
(
    Nit String NOT NULL,
    Nombre String NOT NULL,
    TarifaAnual Integer NOT NULL,
    Total Cupos Integer NOT NULL
);

