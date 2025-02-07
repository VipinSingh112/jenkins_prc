create index IX_FF04B11C on nbp_osi_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_6B09380B on nbp_osi_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_53979130 on nbp_osi_app_stages (osiApplicationId);
create index IX_70BBC6FD on nbp_osi_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create unique index IX_6B5F612C on nbp_osi_app_stages (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A08199EC on nbp_osi_application_permit (caseId[$COLUMN_LENGTH:75$]);

create index IX_34BF07C4 on nbp_osi_desk_verification (osiApplicationId);

create index IX_86937B4E on osi_application_inspec (caseId[$COLUMN_LENGTH:75$]);
create index IX_E4895A69 on osi_application_inspec (osiApplicationId);
create index IX_7511D534 on osi_application_inspec (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_83C9BF4B on osi_application_inspec (status[$COLUMN_LENGTH:75$], osiApplicationId, slotBookedByUser);