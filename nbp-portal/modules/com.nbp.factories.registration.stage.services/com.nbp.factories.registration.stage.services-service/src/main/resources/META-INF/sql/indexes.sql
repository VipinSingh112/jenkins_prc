create index IX_70728F32 on nbp_factories_app_stage (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_42D94BB5 on nbp_factories_app_stage (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_C62FA8C3 on nbp_factories_app_stage (factoriesApplicationId);
create index IX_3ADBFECD on nbp_factories_app_stage (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_35082B42 on nbp_factories_app_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8EAB7A22 on nbp_factories_cert_regis (caseId[$COLUMN_LENGTH:75$]);

create index IX_630BF17A on nbp_factories_comm_decision (caseId[$COLUMN_LENGTH:75$]);
create index IX_EE4452AE on nbp_factories_comm_decision (committeeDecision[$COLUMN_LENGTH:75$]);

create index IX_1DA59373 on nbp_factories_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_1378BD4B on nbp_factories_inspection (factoriesApplicationId);
create index IX_B26FF859 on nbp_factories_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_E906742D on nbp_factories_inspection (status[$COLUMN_LENGTH:75$], factoriesApplicationId, slotBookedByUser);

create index IX_F3627A74 on nbp_factory_payment_confirm (caseId[$COLUMN_LENGTH:75$]);