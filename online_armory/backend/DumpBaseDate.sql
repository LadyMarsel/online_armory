---------- ITEM FIXES -----------

INSERT INTO `gun_type` VALUES 
    (1,'Canon rayé','A','Arme de Poing','Revolver'),
    (2,'Canon rayé','B','Arme de Poing','Pistolet'),
    (3,'Canon lisse','C','Canon Long','Fusil'),
    (4,'Canon rayé','D','Canon Long','Carabine')
    ;
INSERT INTO `internal_mechanic` VALUES 
    (1,'Mécanisme du MP40','xx','url'),
    (2,'Mécanisme dun revolver','xy','url'),
    (3,'Mécanisme dun pistolet','yy','url'),
    (4,'Mécanisme dun fusil à verrou','yx','url'),
    (5,'Mécanisme dun fusil à pompe','aa','url')
    ;
INSERT INTO `license_type` VALUES 
    (1,'Tir récréatif','Modèle 4'),
    (2,'Tir sportif','Modèle 9 sport'),
    (3,'Chasse','Modèle 9 chasse'),
    (4,'Détention temporaire','Modèle 6'),
    (5,'Armurier','Modèle arumrier'),
    (6,'Collectionneur','Modèle collectionneur')
    ;
INSERT INTO `professionnal_type` VALUES 
    (1,'Place où des armes sont vendues','Armurerie'),
    (2,'Place où se retrouvent les amateurs de tir sportif ou récréatif','Club de Tir'),
    (3,'Place où se retrouve les chasseur','Club de chasse')
    ;
INSERT INTO `rearming_mode` VALUES 
    (1,'xx','Simple Action'),
    (2,'xx','Double Action'),
    (3,'xx','Dual Action'),
    (4,'xx','Safe Action')
    ;

---------- ITEM MODIFIABLES ----------

INSERT INTO `gun` VALUES 
    (1,'xx','Simple Action'),
    (2,'xx','Double Action'),
    (3,'xx','Dual Action'),
    (4,'xx','Safe Action')
    ;
