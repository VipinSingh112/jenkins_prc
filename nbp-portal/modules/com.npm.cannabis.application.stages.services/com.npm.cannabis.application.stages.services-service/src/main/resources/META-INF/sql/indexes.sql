create index IX_465E2FF on nbp_cannabis_app_duediligence (cannabisApplicationId);
create index IX_770C17F6 on nbp_cannabis_app_duediligence (caseId[$COLUMN_LENGTH:75$], agencyName[$COLUMN_LENGTH:75$]);
create index IX_7630AE19 on nbp_cannabis_app_duediligence (status[$COLUMN_LENGTH:75$]);

create index IX_96162FE6 on nbp_cannabis_app_stages (cannabisApplicationId);
create index IX_212E3855 on nbp_cannabis_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_81D4E4B4 on nbp_cannabis_app_stages (stageName[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_CC986A73 on nbp_cannabis_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);

create index IX_BEB23F68 on nbp_cannabis_comm_decision (caseId[$COLUMN_LENGTH:75$], committeeDecision[$COLUMN_LENGTH:75$]);
create index IX_CBBEF4E7 on nbp_cannabis_comm_decision (committeeDecision[$COLUMN_LENGTH:75$]);

create index IX_353CEE1B on nbp_cannabis_con_license (cannabisApplicationId);
create index IX_23C6BCB6 on nbp_cannabis_con_license (caseId[$COLUMN_LENGTH:75$]);

create index IX_3FA06B53 on nbp_cannabis_desk_veri (cannabisApplicationId);

create index IX_66B97A30 on nbp_cannabis_desk_verifi (cannabisApplicationId);

create index IX_CDA1CAA5 on nbp_cannabis_inspection (cannabisApplicationId);
create index IX_40F99D6C on nbp_cannabis_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_DFF2C7B on nbp_cannabis_inspection (status[$COLUMN_LENGTH:75$], cannabisApplicationId, slotBookedByUser);
create index IX_E03AF952 on nbp_cannabis_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);

create index IX_174AF47E on nbp_cannabis_license (cannabisApplicationId);
create index IX_A2371CB3 on nbp_cannabis_license (caseId[$COLUMN_LENGTH:75$]);
create index IX_8CA21F06 on nbp_cannabis_license (licenseNumber[$COLUMN_LENGTH:75$]);

create index IX_1E332797 on nbp_cannabis_license_payment (cannabisApplicationId);
create index IX_E5AC3ABA on nbp_cannabis_license_payment (caseId[$COLUMN_LENGTH:75$]);

create index IX_BAB17579 on nbp_cannabis_payment_confirm (caseId[$COLUMN_LENGTH:75$]);

create index IX_41B78FC5 on nbp_cannabis_pre_conditions (cannabisApplicationId);
create index IX_193843BF on nbp_cannabis_pre_conditions (caseId[$COLUMN_LENGTH:75$], licenseType[$COLUMN_LENGTH:75$]);
create index IX_E83B0B1F on nbp_cannabis_pre_conditions (status[$COLUMN_LENGTH:75$], cannabisApplicationId);
create index IX_379AB832 on nbp_cannabis_pre_conditions (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);