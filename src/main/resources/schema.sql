-- use residuocreativo;

-- drop database residuocreativo;

/*insert ignore into regiones (nombre) values
("Region de Tarapaca"),
("Region de Antofagasta"),
("Region de Atacama"),
("Region de Coquimbo"),
("Region de Valparaiso"),
("Region del Libertador General Bernardo O'Higgins"),
("Region del Maule"),
("Region del Biobío"),
("Region de la Araucania"),
("Region de los Lagos"),
("Region Aysén del General Carlos Ibáñez del Campo"),
("Region de Magallanes y Antártica Chilena"),
("Region Metropolitana de Santiago"),
("Region de los Ríos"),
("Region de Arica y Parinacota");*/

/*insert ignore into comunas (nombre, id_region) values
('Colina',13),
('Lampa',13),
('Tiltil',13),
('Pirque',13),
('Puente Alto',13),
('San José de Maipo',13),
('Buín',13),
('Calera de Tango',13),
('Paine',13),
('San Bernardo',13),
('Alhué',13),
('Curacaví',13),
('María Pinto',13),
('Melipilla',13),
('San Pedro',13),
('Cerrillos',13),
('Cerro Navia',13),
('Conchalí',13),
('El Bosque',13),
('Estación Central',13),
('Huechuraba',13),
('Independencia',13),
('La Cisterna',13),
('La Florida',13),
('La Granja',13),
('La Pintana',13),
('La Reina',13),
('Las Condes',13),
('Lo Barnechea',13),
('Lo Espejo',13),
('Lo Prado',13),
('Macul',13),
('Maipú',13),
('Ñuñoa',13),
('Pedro Aguirre Cerda',13),
('Peñalolén',13),
('Providencia',13),
('Pudahuel',13),
('Quilicura',13),
('Quinta Normal',13),
('Recoleta',13),
('Renca',13),
('San Joaquín',13),
('San Miguel',13),
('San Ramón',13),
('Santiago',13),
('Vitacura',13),
('El Monte',13),
('Isla de Maipo',13),
('Padre Hurtado',13),
('Peñaflor',13),
('Talagante',13);*/

/*INSERT INTO tiendas (descripcion,direccion,facebook,fecha_creacion,instagram,nombre,telefono,id_comuna) values
('Articulos de decoracion y cuidado de material reciclado. Agrupacion artesanos creadores de nunoa.','direccion 1','@amistar_cl','2024-06-24 19:43:47.714359','@amistar_cl','Ecoasis',12345678,34),
('Vitrales, decoupage,jabones naturales. Artesanas creadoras de nunoa','direccion 2','@cg_cosmeticanatural','2024-06-24 19:45:55.935837','@cg_cosmeticanatural','cosmeticanatural',12345678,34),
('Elaboracion de accesorios con textiles reciclados mezclillas y textiles en general. Agrupacion Kaizen','direccion 3','@ecoasis.recicla','2024-06-24 19:49:10.420073','@ecoasis.recicla','Ecoasis',12345678,34);*/

/*INSERT IGNORE INTO categorias (nombre) values
("Decoracion"),("Vitral"),("Decoupage"),("Jabon"),("Textil");*/

/*insert ignore into pagos (tipo_de_pago) values
("Debito"), ("Credito"),("Transferencia"),("Mercado Pago");*/

/*insert into pagos_disponible (id_pago,id_tienda) values
(3,1),(1,2),(2,2),(3,2),(4,2),(2,3),(3,3),(4,3);*/

/*INSERT IGNORE INTO productos (nombre, imagen, descripcion, stock, precio, id_categoria ,id_tienda) VALUES
("productoDecoracion1","imagenDecoracion1","descripcion para el producto decoracion 1",5,5000,1,1),
("productoDecoracion2","imagenDecoracion2","descripcion para el producto decoracion 2",8,2000,1,1),
("productoVitral1","imagenVitral1","descripcion para el producto vitral 1",2,10000,2,2),
("productoVitral","imagenvVitral2","descripcion para el producto vitral 4",10,1500,2,2),
("productoDecoupage1","imagenDecoupage1","descripcion para el producto Decoupage 1",5,5500,3,2),
("productoDecoupage2","imagenDecoupage2","descripcion para el producto Decoupage 2",3,3200,3,2),
("productoJabon1","imagenJabon1","descipcion para el Jabon 1",10,1200,4,2),
("productoJabon2","imagenJabon2","descripcion para el Jabon 2",12,1800,4,2),
("productoTextil1","imagenTextil1","descripcion para el textil 1",5,7000,5,3),
("productoTextil2","imagenTextil2","descripcion para el textil 2",3,9000,5,3);*/