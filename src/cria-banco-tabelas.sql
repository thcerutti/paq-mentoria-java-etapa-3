CREATE DATABASE `paq-etapa-3` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `etapas` (
  `id` int NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `educandos` (
  `id` int NOT NULL,
  `nome_completo` varchar(255) DEFAULT NULL,
  `etapa_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_educandos_1_idx` (`etapa_id`),
  CONSTRAINT `fk_educandos_1` FOREIGN KEY (`etapa_id`) REFERENCES `etapas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
