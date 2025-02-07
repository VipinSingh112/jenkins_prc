create index IX_85F2D44B on nbp_jadsc_appli_final_deter (Outcome[$COLUMN_LENGTH:75$]);
create index IX_1F4B3196 on nbp_jadsc_appli_final_deter (caseId[$COLUMN_LENGTH:75$]);

create index IX_8FC17118 on nbp_jadsc_appli_initi_inves (caseId[$COLUMN_LENGTH:75$]);
create index IX_ACD26529 on nbp_jadsc_appli_initi_inves (outcome[$COLUMN_LENGTH:75$]);

create index IX_9C78C3A1 on nbp_jadsc_appli_preli_deter (Outcome[$COLUMN_LENGTH:75$]);
create index IX_73EFF80 on nbp_jadsc_appli_preli_deter (caseId[$COLUMN_LENGTH:75$]);

create index IX_7983FCC on nbp_jadsc_appli_review_veri (caseId[$COLUMN_LENGTH:75$]);
create index IX_CA4A40A2 on nbp_jadsc_appli_review_veri (versionOfApplication[$COLUMN_LENGTH:75$]);

create index IX_1ADF1D74 on nbp_jadsc_application_pre (caseId[$COLUMN_LENGTH:75$]);
create index IX_856A444D on nbp_jadsc_application_pre (outcome[$COLUMN_LENGTH:75$]);

create index IX_2DB7156 on nbp_jadsc_application_stage (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_60A85811 on nbp_jadsc_application_stage (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_E2D89D52 on nbp_jadsc_application_stage (jadscApplicationId);
create index IX_18E18E29 on nbp_jadsc_application_stage (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_F421D566 on nbp_jadsc_application_stage (uuid_[$COLUMN_LENGTH:75$], groupId);