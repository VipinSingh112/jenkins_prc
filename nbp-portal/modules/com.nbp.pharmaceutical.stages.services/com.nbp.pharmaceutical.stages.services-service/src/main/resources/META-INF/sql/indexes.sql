create index IX_8D687243 on nbp_pharma_app_duediligence (agencyName[$COLUMN_LENGTH:75$]);
create index IX_4D5559E2 on nbp_pharma_app_duediligence (caseId[$COLUMN_LENGTH:75$], agencyName[$COLUMN_LENGTH:75$]);
create index IX_F44147FF on nbp_pharma_app_duediligence (pharmaApplicationId);

create index IX_9555A882 on nbp_pharma_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$]);
create index IX_778672E9 on nbp_pharma_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_4F16E1A6 on nbp_pharma_app_stages (pharmaApplicationId);
create index IX_F6A805A0 on nbp_pharma_app_stages (stageName[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_D1E1375F on nbp_pharma_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);

create index IX_5C111C75 on nbp_pharma_comm_decision (caseId[$COLUMN_LENGTH:75$]);
create index IX_406E0CD3 on nbp_pharma_comm_decision (committeeDecision[$COLUMN_LENGTH:75$]);

create index IX_284C2716 on nbp_pharma_desk_verification (pharmaApplicationId);

create index IX_F1CB3F75 on nbp_pharma_full_license (caseId[$COLUMN_LENGTH:75$]);
create index IX_EF27BE04 on nbp_pharma_full_license (licenseNumber[$COLUMN_LENGTH:75$]);

create index IX_B167840D on nbp_pharma_payment_confirm (caseId[$COLUMN_LENGTH:75$]);