create index IX_78FF1300 on nbp_mining_app_stage (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_F5391CA7 on nbp_mining_app_stage (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_B13B9631 on nbp_mining_app_stage (miningApplicationId);
create index IX_CAECF63F on nbp_mining_app_stage (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_6E820B10 on nbp_mining_app_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A078386F on nbp_mining_cert_issue (caseId[$COLUMN_LENGTH:75$]);
create index IX_11E9D820 on nbp_mining_cert_issue (certificateNumber[$COLUMN_LENGTH:75$]);
create unique index IX_71E30C6 on nbp_mining_cert_issue (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_FE0AC0E2 on nbp_mining_desk_verifi (miningApplicationId);

create index IX_66BBC9DE on nbp_mining_due_dili (caseId[$COLUMN_LENGTH:75$]);
create unique index IX_E6ECE335 on nbp_mining_due_dili (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_337D818B on nbp_mining_mini_dec (caseId[$COLUMN_LENGTH:75$]);
create unique index IX_80469DE2 on nbp_mining_mini_dec (uuid_[$COLUMN_LENGTH:75$], groupId);