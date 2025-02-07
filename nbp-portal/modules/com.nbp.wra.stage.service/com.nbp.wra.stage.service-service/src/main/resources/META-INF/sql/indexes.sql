create index IX_F27AF660 on nbp_wra_app_duediligence (agencyName[$COLUMN_LENGTH:75$]);
create index IX_956470FF on nbp_wra_app_duediligence (caseId[$COLUMN_LENGTH:75$], agencyName[$COLUMN_LENGTH:75$]);
create index IX_47DDD1B5 on nbp_wra_app_duediligence (wraApplicationId);

create index IX_47F187B2 on nbp_wra_desk_verifi (wraApplicationId);

create index IX_270E0AA1 on nbp_wra_inspec (caseId[$COLUMN_LENGTH:75$]);
create index IX_47BD6187 on nbp_wra_inspec (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_5FF5435D on nbp_wra_inspec (status[$COLUMN_LENGTH:75$], wraApplicationId, slotBookedByUser);
create index IX_81D961FB on nbp_wra_inspec (wraApplicationId);

create index IX_1B6B9CFB on nbp_wra_licence_issu (caseId[$COLUMN_LENGTH:75$]);

create index IX_B6F021D0 on nbp_wra_payment_confirm (caseId[$COLUMN_LENGTH:75$]);

create index IX_68E49747 on nbp_wra_stage_services (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_41BB7EC0 on nbp_wra_stage_services (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_EEA57398 on nbp_wra_stage_services (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_C36EFD57 on nbp_wra_stage_services (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_AD87129A on nbp_wra_stage_services (wraApplicationId);