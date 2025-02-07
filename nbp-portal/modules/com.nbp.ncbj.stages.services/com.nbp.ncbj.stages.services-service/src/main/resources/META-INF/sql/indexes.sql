create index IX_D6AE88AD on nbp_ncbj_app_stage (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_43FA711A on nbp_ncbj_app_stage (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_86B17457 on nbp_ncbj_app_stage (ncbjApplicationId);
create index IX_3864AE72 on nbp_ncbj_app_stage (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_26247ABD on nbp_ncbj_app_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_47B9C339 on nbp_ncbj_board_decision (caseId[$COLUMN_LENGTH:75$]);
create index IX_1104438F on nbp_ncbj_board_decision (committeeDecision[$COLUMN_LENGTH:75$]);

create index IX_3AAFF825 on nbp_ncbj_corrective_act (caseId[$COLUMN_LENGTH:75$]);

create index IX_A46FE858 on nbp_ncbj_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_463C8A25 on nbp_ncbj_inspection (ncbjApplicationId);
create index IX_E4DD983E on nbp_ncbj_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_7D3FB4FB on nbp_ncbj_inspection (status[$COLUMN_LENGTH:75$], ncbjApplicationId, slotBookedByUser);

create index IX_44F4DA2F on nbp_ncbj_licence_certificate (caseId[$COLUMN_LENGTH:75$]);

create index IX_EA511E0D on nbp_ncbj_payment_confirm (caseId[$COLUMN_LENGTH:75$]);