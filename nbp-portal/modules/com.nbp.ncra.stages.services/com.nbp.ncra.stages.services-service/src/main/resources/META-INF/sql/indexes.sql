create index IX_131ECBCB on nbp_certificate_of_verifi (caseId[$COLUMN_LENGTH:75$]);

create index IX_8CD5ECD1 on nbp_ncra_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_C8204345 on nbp_ncra_inspection (ncraApplicationId);
create index IX_2D5813B7 on nbp_ncra_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_8E864F1B on nbp_ncra_inspection (status[$COLUMN_LENGTH:75$], ncraApplicationId, slotBookedByUser);

create index IX_1A5CDA51 on nbp_ncra_stage_appli (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_558EBDF6 on nbp_ncra_stage_appli (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_532E1E4E on nbp_ncra_stage_appli (stageName[$COLUMN_LENGTH:75$]);
create index IX_2118A5B5 on nbp_ncra_stage_appli (stageStatus[$COLUMN_LENGTH:75$]);
create unique index IX_42529461 on nbp_ncra_stage_appli (uuid_[$COLUMN_LENGTH:75$], groupId);