create index IX_66E99683 on nbp_acquie_execution (caseId[$COLUMN_LENGTH:75$]);

create index IX_F7D80A9D on nbp_acquire_advertising (caseId[$COLUMN_LENGTH:75$]);

create index IX_A2D0F24E on nbp_acquire_app_stages (acquireApplicationId);
create index IX_4C64356B on nbp_acquire_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_59514F1C on nbp_acquire_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_87F00A4C on nbp_acquire_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);

create index IX_6984A9E4 on nbp_acquire_desk_verification (acquireApplicationId);

create index IX_5CC34987 on nbp_acquire_draft_agree (caseId[$COLUMN_LENGTH:75$]);

create index IX_455DA3F7 on nbp_acquire_duediligence (acquireApplicationId);
create index IX_FD2DBB68 on nbp_acquire_duediligence (caseId[$COLUMN_LENGTH:75$], nameOfAgency[$COLUMN_LENGTH:75$]);

create index IX_F89F6F0D on nbp_acquire_evaluation (caseId[$COLUMN_LENGTH:75$]);

create index IX_4DC5C7CD on nbp_acquire_executed_agree (caseId[$COLUMN_LENGTH:75$]);

create index IX_41BF4340 on nbp_acquire_payment_confirm (caseId[$COLUMN_LENGTH:75$]);

create index IX_33021087 on nbp_acquire_tendering (caseId[$COLUMN_LENGTH:75$]);

create index IX_8BABBE3A on nbp_acquire_valuation (caseId[$COLUMN_LENGTH:75$]);