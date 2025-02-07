create index IX_3755DE8F on nbp_pharma_app_payment (pharmaApplicationId);

create index IX_5C75CBD2 on nbp_pharma_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_44240A13 on nbp_pharma_application (caseld[$COLUMN_LENGTH:500$]);
create index IX_123C6A1C on nbp_pharma_application (requesttype[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);
create index IX_926CDE17 on nbp_pharma_application (status, userId);

create index IX_F21410DF on nbp_pharma_cancel (pharmaApplicationId);

create index IX_49DCFDFF on nbp_pharma_current_stage (pharmaApplicationId);

create index IX_B4F04324 on nbp_pharma_doc_list (pharmaAppType[$COLUMN_LENGTH:75$]);

create index IX_12CCA48A on nbp_pharma_drug_Info (pharmaApplicationId);

create index IX_267FDCE8 on nbp_pharma_manufacturer (pharmaApplicationId);

create index IX_E1E64F55 on nbp_pharma_medical_device (pharmaApplicationId);

create index IX_442A4E68 on nbp_pharma_recall (pharmaApplicationId);

create index IX_ED698011 on nbp_pharma_sub_categories (pharmaSubCategory[$COLUMN_LENGTH:75$]);