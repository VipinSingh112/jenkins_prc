create index IX_CA9932A on nbp_delineation_area (miningLeaseApplicationId);

create index IX_661E23A4 on nbp_exclusive_form_five (miningLeaseApplicationId);

create index IX_E89FFC17 on nbp_mining_app_payment (miningLeaseApplicationId);

create index IX_E4DE588D on nbp_mining_applications (applicationNumber[$COLUMN_LENGTH:75$], prospRightsNum[$COLUMN_LENGTH:75$]);
create index IX_A10EF554 on nbp_mining_applications (caseId[$COLUMN_LENGTH:500$]);
create index IX_A2B200E6 on nbp_mining_applications (entityId[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:500$]);
create index IX_F00B92AD on nbp_mining_applications (entityId[$COLUMN_LENGTH:75$], status);
create index IX_E9E69455 on nbp_mining_applications (status, userId);
create index IX_A860452 on nbp_mining_applications (typeOfApplicant[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);

create index IX_45B8D9E7 on nbp_mining_current_stage (miningLeaseApplicationId);
create unique index IX_D0276C68 on nbp_mining_current_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_59BBB1C0 on nbp_mining_pro_license_add (miningLeaseApplicationId);

create index IX_7343B555 on nbp_mining_prospect_license (miningLeaseApplicationId);

create index IX_9464C119 on nbp_mining_prospect_rights (miningLeaseApplicationId);

create index IX_EF66BB4E on nbp_mining_renew_licence (miningLeaseApplicationId);