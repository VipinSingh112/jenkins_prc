create index IX_E2ACB711 on nbp_quarry_app_stag (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_48895936 on nbp_quarry_app_stag (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_A8E8C334 on nbp_quarry_app_stag (quarryApplicationId);
create index IX_CE55C98E on nbp_quarry_app_stag (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_E173F121 on nbp_quarry_app_stag (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E3923A54 on nbp_quarry_comm_decision (caseId[$COLUMN_LENGTH:75$]);
create index IX_81C7DD94 on nbp_quarry_comm_decision (committeeDecision[$COLUMN_LENGTH:75$]);

create index IX_574D88D9 on nbp_quarry_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_B87FAE85 on nbp_quarry_inspection (quarryApplicationId);
create index IX_E69727BF on nbp_quarry_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_8D9BA3DB on nbp_quarry_inspection (status[$COLUMN_LENGTH:75$], quarryApplicationId, slotBookedByUser);

create index IX_7A6D3ACE on nbp_quarry_licence_certificate (caseId[$COLUMN_LENGTH:75$]);

create index IX_5D18A62C on nbp_quarry_payment_confirm (caseId[$COLUMN_LENGTH:75$]);