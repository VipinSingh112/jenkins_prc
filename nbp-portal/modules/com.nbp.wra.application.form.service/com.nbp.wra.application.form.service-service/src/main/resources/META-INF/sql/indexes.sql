create index IX_D7F31B7D on nbp_renew_abstract_lic (wraApplicationId);

create index IX_3C58228E on nbp_wra_abstract_info (wraApplicationId);

create index IX_F02D0A4B on nbp_wra_app_payment (wraApplicationId);

create index IX_C6F7BCAF on nbp_wra_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_FAC01859 on nbp_wra_application (caseId[$COLUMN_LENGTH:75$]);
create index IX_800AE1AB on nbp_wra_application (entityId, caseId[$COLUMN_LENGTH:75$]);
create index IX_CD647372 on nbp_wra_application (entityId, status);
create index IX_431AE25A on nbp_wra_application (status, userId);
create index IX_B370E97B on nbp_wra_application (typeOfTransaction[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);

create unique index IX_A3F02318 on nbp_wra_current_stage (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_7255CC1B on nbp_wra_current_stage (wraApplicationId);

create index IX_F306C97E on nbp_wra_drill_well_info (wraApplicationId);

create index IX_B33529CD on nbp_wra_lic_well_drill_info (wraApplicationId);

create index IX_83945F2F on nbp_wra_renew_abstract (wraApplicationId);

create index IX_9BBF3C6A on nbp_wra_req_irrigation (wraApplicationId);