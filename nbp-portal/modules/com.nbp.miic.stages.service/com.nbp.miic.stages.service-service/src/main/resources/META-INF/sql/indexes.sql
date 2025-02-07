create index IX_DCA12325 on nbp_miic_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_549FB1A2 on nbp_miic_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_62A622C6 on nbp_miic_app_stages (miicApplicationId);
create index IX_B2FF78FA on nbp_miic_app_stages (stageName[$COLUMN_LENGTH:75$]);
create index IX_169D9DF3 on nbp_miic_app_stages (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D6CB0535 on nbp_miic_app_stages (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5FF8ED38 on nbp_miic_certificate_of_issuan (caseId[$COLUMN_LENGTH:75$]);

create index IX_47F78E52 on nbp_miic_recommen_decision (caseId[$COLUMN_LENGTH:75$]);

create index IX_3F4BCF44 on nbp_miic_stage (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_830762E3 on nbp_miic_stage (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_9A1B3047 on nbp_miic_stage (miicApplicationId);
create index IX_15F6977B on nbp_miic_stage (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_C3B7CF54 on nbp_miic_stage (uuid_[$COLUMN_LENGTH:75$], groupId);