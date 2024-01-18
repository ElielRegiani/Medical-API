ALTER TABLE medicos ADD COLUMN ativo boolean NOT NULL DEFAULT true;
update medicos set ativo = true;
