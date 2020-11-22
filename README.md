# webfluxR2

DB: test

CREATE TABLE `orderheader` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  `quantity` bigint DEFAULT NULL,
  `createdOn` datetime DEFAULT NULL,
  `updatedOn` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12554 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
