ALTER TABLE pacientes ADD COLUMN ativo boolean NOT NULL DEFAULT true;
update pacientes set ativo = true;