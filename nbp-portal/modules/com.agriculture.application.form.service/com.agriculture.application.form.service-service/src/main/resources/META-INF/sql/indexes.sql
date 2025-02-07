create index IX_1C48EEB6 on agriculture_apiculture (agricultureApplicationId);

create index IX_28E60BA1 on agriculture_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_866DACA7 on agriculture_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_DF3AF52B on agriculture_application (expiredLicenseAppNo[$COLUMN_LENGTH:75$], requestType[$COLUMN_LENGTH:75$]);
create index IX_8ECE48A8 on agriculture_application (status, userId);

create index IX_8DF6FF3F on agriculture_aqaculture (agricultureApplicationId);

create index IX_F72A296 on agriculture_building (agricultureApplicationId);

create index IX_3185FF72 on agriculture_crop (agricultureApplicationId);

create index IX_ECB7C818 on agriculture_farm (agricultureApplicationId);

create index IX_4FDD6E45 on agriculture_farmer (agricultureApplicationId);

create index IX_F7B7DF06 on agriculture_forestry (agricultureApplicationId);

create index IX_BE302BB0 on agriculture_livestock (agricultureApplicationId);

create index IX_83710E41 on agriculture_ornamental (agricultureApplicationId);

create index IX_2A04612B on agriculture_poultry (agricultureApplicationId);

create index IX_A490E641 on nbp_agriculture_stage (agricultureApplicationId);