create index IX_C5205CE6 on nbp_hsra_app_duediligence (agencyName[$COLUMN_LENGTH:75$]);
create index IX_D315F185 on nbp_hsra_app_duediligence (caseId[$COLUMN_LENGTH:75$], agencyName[$COLUMN_LENGTH:75$]);
create index IX_DE1D191F on nbp_hsra_app_duediligence (hsraApplicationId);

create index IX_40CB5719 on nbp_hsra_application_stage (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_E24E6E2E on nbp_hsra_application_stage (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_3DE6910E on nbp_hsra_application_stage (hsraApplicationId);
create index IX_E98A3486 on nbp_hsra_application_stage (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_2FA3A129 on nbp_hsra_application_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_ADECA90E on nbp_hsra_desk_verifi (hsraApplicationId);

create index IX_33CD0CBB on nbp_hsra_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_F350C485 on nbp_hsra_inspection (hsraApplicationId);
create index IX_BD4DA9A1 on nbp_hsra_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_8A6E4A5B on nbp_hsra_inspection (status[$COLUMN_LENGTH:75$], hsraApplicationId, slotBookedByUser);

create index IX_81CF7413 on nbp_hsra_lic_iss (caseId[$COLUMN_LENGTH:75$]);
create index IX_ECBABBA6 on nbp_hsra_lic_iss (licenseNumber[$COLUMN_LENGTH:75$]);

create index IX_847A3F8A on nbp_hsra_payment_confirm (caseId[$COLUMN_LENGTH:75$]);