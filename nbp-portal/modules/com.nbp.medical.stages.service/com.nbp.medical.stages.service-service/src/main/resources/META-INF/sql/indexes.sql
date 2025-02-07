create index IX_8EA3345B on nbp_medical_app_stage (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_7A7C462C on nbp_medical_app_stage (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_DB911623 on nbp_medical_app_stage (medicalApplicationId);
create index IX_4E685204 on nbp_medical_app_stage (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_7912426B on nbp_medical_app_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_23CB486A on nbp_medical_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_F9B790F9 on nbp_medical_inspection (medicalApplicationId);
create index IX_EFA8C650 on nbp_medical_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_BEB3B2DB on nbp_medical_inspection (status[$COLUMN_LENGTH:75$], medicalApplicationId, slotBookedByUser);

create index IX_39A8F570 on nbp_medical_licence_issu (caseId[$COLUMN_LENGTH:75$]);

create index IX_BBC8F93B on nbp_medical_payment_confirm (caseId[$COLUMN_LENGTH:75$]);

create index IX_B62D99AB on nbp_mining_licence_issu (caseId[$COLUMN_LENGTH:75$]);