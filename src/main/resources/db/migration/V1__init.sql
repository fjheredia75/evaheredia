CREATE TABLE IF NOT EXISTS asistente(
  id SERIAL,
  nombres VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  institucion VARCHAR(100) NOT NULL,
  cargo VARCHAR(55),
  PRIMARY KEY(id),
  UNIQUE(email)
);