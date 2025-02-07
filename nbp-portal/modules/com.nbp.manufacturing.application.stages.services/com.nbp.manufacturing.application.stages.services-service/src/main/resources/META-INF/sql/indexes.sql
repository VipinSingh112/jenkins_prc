create index IX_5A562B4D on nbp_manu_desk_verification (manufacturingApplicationId, status[$COLUMN_LENGTH:75$]);

create index IX_D70D13C3 on nbp_manufacturing_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_DC83F7C4 on nbp_manufacturing_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_B79A39FE on nbp_manufacturing_app_stages (manufacturingApplicationId);
create index IX_2C28C0A4 on nbp_manufacturing_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);

create index IX_B9FDD89 on nbp_manufacturing_inspec (caseId[$COLUMN_LENGTH:75$]);
create index IX_5F5EB88B on nbp_manufacturing_inspec (manufacturingApplicationId);
create index IX_8C61CC6F on nbp_manufacturing_inspec (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_CEEC066D on nbp_manufacturing_inspec (status[$COLUMN_LENGTH:75$], manufacturingApplicationId, slotBookedByUser);

create index IX_E942488D on nbp_manufacturing_permit (PIRPermtNumber[$COLUMN_LENGTH:75$]);
create index IX_6275C984 on nbp_manufacturing_permit (caseId[$COLUMN_LENGTH:75$]);

create index IX_8C4761FA on nbp_manufacturing_rec_jca (caseId[$COLUMN_LENGTH:75$]);