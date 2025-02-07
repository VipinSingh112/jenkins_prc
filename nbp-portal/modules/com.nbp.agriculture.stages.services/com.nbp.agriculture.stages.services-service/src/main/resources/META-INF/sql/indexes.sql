create index IX_A0782B16 on nbp_agri_desk_verification (agricultureApplicationId);

create index IX_8414D8D8 on nbp_agriculture_app_stages (agricultureApplicationId);
create index IX_E2D81429 on nbp_agriculture_app_stages (caseId[$COLUMN_LENGTH:75$]);
create index IX_4A874092 on nbp_agriculture_app_stages (stageName[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_861B8451 on nbp_agriculture_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);

create index IX_4A1CE7D3 on nbp_agriculture_inspection (agriApplicationId);
create index IX_E4F8334A on nbp_agriculture_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_54F91529 on nbp_agriculture_inspection (status[$COLUMN_LENGTH:75$], agriApplicationId, slotBookedByUser);
create index IX_E2CD130 on nbp_agriculture_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);

create index IX_DC6B65B1 on nbp_agriculture_permit (caseId[$COLUMN_LENGTH:75$]);
create index IX_B459F9A on nbp_agriculture_permit (pirPermtNumber[$COLUMN_LENGTH:75$]);