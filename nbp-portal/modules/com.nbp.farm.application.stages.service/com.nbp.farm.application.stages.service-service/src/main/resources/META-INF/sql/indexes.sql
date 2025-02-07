create index IX_717FBEA5 on nbp_farm_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_28CF4622 on nbp_farm_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_F02492C6 on nbp_farm_app_stages (farmApplicationId);
create index IX_9B9D6D86 on nbp_farm_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_1C2A5973 on nbp_farm_app_stages (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E750A0B5 on nbp_farm_app_stages (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5A561B2B on nbp_farm_desk_verifica (farmerApplicationId);

create index IX_C195267F on nbp_farm_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_DAF16505 on nbp_farm_inspection (farmApplicationId);
create index IX_3651BF65 on nbp_farm_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_BC80605F on nbp_farm_inspection (status[$COLUMN_LENGTH:75$], farmApplicationId);
create index IX_AAA72C23 on nbp_farm_inspection (status[$COLUMN_LENGTH:75$], slotBookedByUser, farmApplicationId);

create index IX_41843B66 on nbp_farm_permit (caseId[$COLUMN_LENGTH:75$]);