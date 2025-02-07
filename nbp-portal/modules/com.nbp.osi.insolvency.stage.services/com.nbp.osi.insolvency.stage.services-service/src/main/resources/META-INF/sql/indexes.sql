create index IX_6AF2C594 on nbp_osi_inso_data_verification (caseId[$COLUMN_LENGTH:75$]);

create index IX_5CDFAC14 on nbp_osi_inso_desk_verification (osiInsolvencyId);

create index IX_406C70CD on nbp_osi_inso_payment_con (caseId[$COLUMN_LENGTH:75$]);

create index IX_E9B9B69F on nbp_osi_insol_issu_of_report (caseId[$COLUMN_LENGTH:75$]);

create index IX_BAF6C2F7 on nbp_osi_insolvency_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_9F4FC110 on nbp_osi_insolvency_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_B9785C89 on nbp_osi_insolvency_app_stages (osiInsolvencyId);
create index IX_CCFEE3D8 on nbp_osi_insolvency_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create unique index IX_C32E8907 on nbp_osi_insolvency_app_stages (uuid_[$COLUMN_LENGTH:75$], groupId);