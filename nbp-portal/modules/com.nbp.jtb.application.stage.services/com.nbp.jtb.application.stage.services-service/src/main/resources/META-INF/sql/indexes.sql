create index IX_17D72E22 on nbp_jtb_app_stage (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_BE22A2C5 on nbp_jtb_app_stage (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_1BC61303 on nbp_jtb_app_stage (jtbApplicationId);
create index IX_1C83E9DD on nbp_jtb_app_stage (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_61E8AA32 on nbp_jtb_app_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A0F7CFE4 on nbp_jtb_board_decision (caseId[$COLUMN_LENGTH:75$]);
create index IX_9C702E04 on nbp_jtb_board_decision (committeeDecision[$COLUMN_LENGTH:75$]);

create index IX_8E842D72 on nbp_jtb_desk_verifi (jtbApplicationId);

create index IX_536D0283 on nbp_jtb_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_F29285AB on nbp_jtb_inspection (jtbApplicationId);
create index IX_219F5769 on nbp_jtb_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_A028D90D on nbp_jtb_inspection (status[$COLUMN_LENGTH:75$], jtbApplicationId, slotBookedByUser);

create index IX_A06B0064 on nbp_jtb_licence_certificate (caseId[$COLUMN_LENGTH:75$]);

create index IX_B8D4A6C2 on nbp_jtb_payment_confirm (caseId[$COLUMN_LENGTH:75$]);