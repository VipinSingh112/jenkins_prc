create index IX_937FBAF6 on FarmerApplication (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_B778296F on FarmerApplication (caseld[$COLUMN_LENGTH:75$]);
create index IX_3C9E173 on FarmerApplication (status, userId);
create index IX_A640EB8D on FarmerApplication (userId);

create index IX_C69C78F on farmer_Stakeholder_info (farmerApplicationId);

create index IX_488E7CA6 on farmer_crop (farmerApplicationId);

create index IX_43830A24 on farmer_crop_practice (farmerApplicationId);

create index IX_DCBA6484 on farmer_livestock (farmerApplicationId);

create index IX_4C7B1C06 on farmer_livestock_practice (farmerApplicationId);

create index IX_C391ECA5 on farmer_profile (farmerApplicationId);

create index IX_C03249C1 on farmer_property (farmerApplicationId);

create index IX_159EFE43 on farmer_stakeholder_address (addressType[$COLUMN_LENGTH:75$], farmerStakeholderInfoId);
create index IX_76C059B3 on farmer_stakeholder_address (farmerApplicationId);
create index IX_1CD87AD7 on farmer_stakeholder_address (farmerStakeholderInfoId);

create index IX_BA68D4AC on nbp_farmer_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_E27E0579 on nbp_farmer_application (caseld[$COLUMN_LENGTH:500$]);
create index IX_52F63518 on nbp_farmer_application (expiredLicenseappNumber[$COLUMN_LENGTH:75$], requestType[$COLUMN_LENGTH:75$]);
create index IX_F3E0137D on nbp_farmer_application (status, userId);
create index IX_D146C797 on nbp_farmer_application (userId);

create index IX_FAE0112D on nbp_farmer_stage (farmerApplicationId);
create index IX_E7662CFF on nbp_farmer_stage (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A243E741 on nbp_farmer_stage (uuid_[$COLUMN_LENGTH:75$], groupId);