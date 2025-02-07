create index IX_5083035B on nbp_fire_brigade_app_stage (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_4667D72C on nbp_fire_brigade_app_stage (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_6F652304 on nbp_fire_brigade_app_stage (stageName[$COLUMN_LENGTH:75$]);
create index IX_BA154EB on nbp_fire_brigade_app_stage (stageStatus[$COLUMN_LENGTH:75$]);
create unique index IX_3A70116B on nbp_fire_brigade_app_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E4DE3BCB on nbp_fire_brigade_certificate (caseId[$COLUMN_LENGTH:75$]);

create index IX_4FC8596A on nbp_fire_brigade_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_38354D0C on nbp_fire_brigade_inspection (fireBrigadeApplicationId);
create index IX_5A04D750 on nbp_fire_brigade_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_542D4D2E on nbp_fire_brigade_inspection (status[$COLUMN_LENGTH:75$], fireBrigadeApplicationId, slotBookedByUser);

create index IX_45CA8E33 on nbp_fire_brigade_payment_conf (caseId[$COLUMN_LENGTH:75$]);

create index IX_286298D9 on nbp_fire_payment_confirmation (caseId[$COLUMN_LENGTH:75$]);