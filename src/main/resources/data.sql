INSERT IGNORE INTO tb_roda(id, nama) VALUES (1, 'Bridgestone'), (2, 'Michelin'),(3, 'Achilles'),(4, 'Dunlop');

INSERT IGNORE INTO merek_mobil(id, nama) VALUES (1, 'Toyota'), (2, 'Honda'),(3, 'Mazda'),(4, 'BMW');

INSERT IGNORE INTO mobil(dtype,id,model,tahun_buat,harga,kecepatan,warna,merek_mobil_id,roda_id) VALUES ('Porche',1, 'Avanza','2019',193575000,240,'Hitam',1,1);
INSERT IGNORE INTO mobil(dtype,id,model,tahun_buat,harga,kecepatan,warna,merek_mobil_id,roda_id) VALUES ('Porche',2, 'Yaris','2019',153575000,240,'Merah',2,2);