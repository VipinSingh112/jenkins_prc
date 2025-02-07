create index IX_7548C744 on nbp_ncra_applicant_details (ncraApplicationId);

create index IX_B7D908CB on nbp_ncra_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_7A3545BD on nbp_ncra_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_4E01A20F on nbp_ncra_application (entityId[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:500$]);
create index IX_9B5B33D6 on nbp_ncra_application (entityId[$COLUMN_LENGTH:75$], status);
create index IX_C78ED784 on nbp_ncra_application (status);
create index IX_D619D7BE on nbp_ncra_application (userId, status);

create index IX_28F286E8 on nbp_ncra_applications (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_757D77C0 on nbp_ncra_applications (caseId[$COLUMN_LENGTH:500$]);
create index IX_38E16C52 on nbp_ncra_applications (entityId[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:500$]);
create index IX_863AFE19 on nbp_ncra_applications (entityId[$COLUMN_LENGTH:75$], status);
create index IX_BD91EAC1 on nbp_ncra_applications (status, userId);
create index IX_83B0E162 on nbp_ncra_applications (typeOfTransaction[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);

create index IX_D7C9F271 on nbp_ncra_current_stage (ncraApplicationId);

create index IX_D6BEBC5E on nbp_ncra_current_stages (ncraApplicationId);

create index IX_838255FC on nbp_ncra_fee_payment (ncraApplicationId);

create index IX_FFFAB1F on nbp_ncra_veri_weigh_date (ncraApplicationId);

create index IX_32A42772 on nbp_ncra_verify_weigh_info (ncraApplicationId);