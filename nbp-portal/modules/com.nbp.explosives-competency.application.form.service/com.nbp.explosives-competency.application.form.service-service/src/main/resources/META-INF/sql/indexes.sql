create index IX_C49D1B0D on nbp_blaster_competency (explosivesApplicationId);

create index IX_383E5DDE on nbp_explosive_payment (explosivesApplicationId);

create index IX_BBEE99C1 on nbp_explosives_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_1F30B287 on nbp_explosives_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_C69D6E88 on nbp_explosives_application (status, userId);
create index IX_DD4484A9 on nbp_explosives_application (typeOfTransaction[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);
create unique index IX_D12712DE on nbp_explosives_application (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7FB6CB97 on nbp_explosives_stage (explosivesApplicationId);

create index IX_3BEFAD94 on nbp_pyrotechnic_competency (explosivesApplicationId);