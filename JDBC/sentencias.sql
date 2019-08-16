/* SENTENCIAS INSERT */
INSERT INTO persona(nombre, apellido) VALUES('Juan', 'Perez');
INSERT INTO persona(nombre, apellido) VALUES('Karla', 'Esparza');
INSERT INTO persona(nombre, apellido) VALUES('Eduardo', 'Alvarez');
/* SENTENCIAS SELECTORS */
SELECT * FROM persona;
/* SENTENCIAS UPDATE */
UPDATE persona SET nombre = 'Juanito' WHERE idpersona = 1;
/* SENTENCIAS DELETE */
DELETE FROM persona WHERE idpersona = 3;