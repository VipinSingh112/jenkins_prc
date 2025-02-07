create index IX_1C3C48F on nbp_janaac_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_EB93CE78 on nbp_janaac_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_8145E606 on nbp_janaac_app_stages (janaacApplicationId);
create index IX_5AF38950 on nbp_janaac_app_stages (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_E7A1BA9F on nbp_janaac_app_stages (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_F8BA96D3 on nbp_janaac_committee_decision (caseId[$COLUMN_LENGTH:75$]);

create index IX_1EABCA69 on nbp_janaac_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_EC272485 on nbp_janaac_inspection (janaacApplicationId);
create index IX_36A2D94F on nbp_janaac_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_C3629DB on nbp_janaac_inspection (status[$COLUMN_LENGTH:75$], janaacApplicationId, slotBookedByUser);

create index IX_55A28C37 on nbp_janaac_payment_verifi (caseId[$COLUMN_LENGTH:75$]);

create index IX_2C3A6A29 on nbp_janaac_report (caseId[$COLUMN_LENGTH:75$]);