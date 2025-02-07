create index IX_7F922CC9 on nbp_fire_app_payment (fireBrigadeApplicationId);

create index IX_CF3868C1 on nbp_fire_app_stage (fireBrigadeApplicationId);

create index IX_984F3779 on nbp_fire_brigade_application (applicationNumber[$COLUMN_LENGTH:75$], typeOfTransaction[$COLUMN_LENGTH:75$]);
create index IX_15906C44 on nbp_fire_brigade_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_2ABF8BD6 on nbp_fire_brigade_application (entityId[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:500$]);
create index IX_78191D9D on nbp_fire_brigade_application (entityId[$COLUMN_LENGTH:75$], status);
create index IX_D8BA1B45 on nbp_fire_brigade_application (status, userId);
create unique index IX_E343BF9B on nbp_fire_brigade_application (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C7A95656 on nbp_fire_certi_purpose_info (fireBrigadeApplicationId);

create index IX_73C5BDC7 on nbp_fire_hazar_sub_info (fireBrigadeApplicationId);

create index IX_472F50C9 on nbp_fire_mul_floor_info (fireBrigadeApplicationId);

create index IX_C2A85C2D on nbp_fire_operator_detail (fireBrigadeApplicationId);

create index IX_BFF70726 on nbp_fire_permises_info (fireBrigadeApplicationId);

create index IX_D863C7E on nbp_fire_pro_equipment_info (fireBrigadeApplicationId);

create index IX_798F7CC2 on nbp_fire_signature_info (fireBrigadeApplicationId);