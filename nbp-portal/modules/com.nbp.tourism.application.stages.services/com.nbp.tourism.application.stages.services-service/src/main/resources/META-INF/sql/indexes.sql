create index IX_E73D6D36 on nbp_tourism_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_89AD0831 on nbp_tourism_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_9D73D17 on nbp_tourism_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_A3C5B8E4 on nbp_tourism_app_stages (tourismApplicationId);
create unique index IX_F8B79146 on nbp_tourism_app_stages (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_2C05BEF0 on nbp_tourism_desk_verifica (tourismApplicationId);

create index IX_6B66C997 on nbp_tourism_payment_con (caseId[$COLUMN_LENGTH:75$]);

create index IX_5BEABD77 on nbp_tourism_permit (caseId[$COLUMN_LENGTH:75$]);