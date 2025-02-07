create index IX_CF252A8E on OGT_STAGE_OgtApplicationStage (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$]);
create index IX_6D37A704 on OGT_STAGE_OgtApplicationStage (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$]);
create index IX_55E9A00F on OGT_STAGE_OgtApplicationStage (ogtApplicationId);
create index IX_D68B250D on OGT_STAGE_OgtApplicationStage (stageName[$COLUMN_LENGTH:75$]);
create index IX_F08EC680 on OGT_STAGE_OgtApplicationStage (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D416ED02 on OGT_STAGE_OgtApplicationStage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A4A2CB96 on nbp_ogt_application_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_89F2E5D1 on nbp_ogt_application_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_D39249B3 on nbp_ogt_application_stages (ogtApplicationId);
create index IX_4DAE4BE9 on nbp_ogt_application_stages (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_AA65AFA6 on nbp_ogt_application_stages (uuid_[$COLUMN_LENGTH:75$], groupId);