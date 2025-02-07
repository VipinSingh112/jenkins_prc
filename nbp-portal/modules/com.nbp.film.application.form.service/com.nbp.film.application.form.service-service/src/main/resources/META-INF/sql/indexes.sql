create index IX_F9C7A124 on nbp_film_additional_equip_list (filmApplicationId);

create index IX_487E71EB on nbp_film_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_16D6509D on nbp_film_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_43A6969E on nbp_film_application (status, userId);
create unique index IX_4E303AF4 on nbp_film_application (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_228EAAB2 on nbp_film_application_payment (filmApplicationId);

create index IX_D9C907E9 on nbp_film_company_details (filmApplicationId);

create index IX_C172D6EA on nbp_film_equipment_list (filmApplicationId);

create index IX_78225836 on nbp_film_other_details (filmApplicationId);

create index IX_5A5368FD on nbp_film_production_details (filmApplicationId);

create index IX_DDF462B on nbp_film_stage (filmApplicationId);

create index IX_AF812981 on nbp_other_details (filmApplicationId[$COLUMN_LENGTH:75$]);