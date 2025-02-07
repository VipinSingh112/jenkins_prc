create index IX_2D633A9B on nbp_health_desk_verifica (healthCareApplicationId);

create index IX_EEADF30E on nbp_healthcare_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_5055B959 on nbp_healthcare_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_D06FCF57 on nbp_healthcare_app_stages (healthApplicationId);
create index IX_32B71AEF on nbp_healthcare_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create unique index IX_F3DEC71E on nbp_healthcare_app_stages (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_3122EFEB on nbp_healthcare_duediligence (caseId[$COLUMN_LENGTH:75$], nameofAgency[$COLUMN_LENGTH:75$]);

create index IX_AE91F74F on nbp_healthcare_permit (caseId[$COLUMN_LENGTH:75$]);