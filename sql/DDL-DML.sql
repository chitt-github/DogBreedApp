create table dog_details (
    image_id        tinyint(3)  not null default '0',
	image_name      varchar(50) not null default '',
	breedType	    varchar(25) not null default '',
    favoriteCount   tinyint(2)  not null default '0',
	otherInfo       varchar(250) not null default '',
	url	    		varchar(200) not null default '',
	PRIMARY KEY (`image_id`)
);


INSERT INTO DOG_DETAILS VALUES (1,'AffenpinscherAugi.JPG','Affenpinscher',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (2,'American_water_spaniel.jpg','Affenpinscher',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (3,'NorfolkTerrierinde.jpg','Affenpinscher',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (4,'PapillonFrisbee.jpg','Affenpinscher',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (5,'PapillonFrisbee.jpg','Affenpinscher',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (101,'Brittany_02625.jpg','JackRussell',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (102,'Labrador_retriever.jpg','JackRussell',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (103,'RebelTerrierPurebred.jpg','JackRussell',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (104,'RebelTerrierPurebred.jpg','JackRussell',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (201,'Curly-coated_retriever.jpg','Labrador',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (202,'Labrador_retriever.jpg','Labrador',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (203,'Labrador_retriever_06455.jpg','Labrador',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (204,'Rocket-sitting-primary.jpeg','Labrador',0,'shortly comming more details', 'click the url');
INSERT INTO DOG_DETAILS VALUES (205,'sample_dog_output.png','Labrador',0,'shortly comming more details', 'click the url');