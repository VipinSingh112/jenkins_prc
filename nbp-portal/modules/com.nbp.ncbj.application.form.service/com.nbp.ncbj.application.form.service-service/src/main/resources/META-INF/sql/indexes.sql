create index IX_9C645871 on nbp_ncbj_additional_loc (ncbjApplicationId);

create index IX_6411E70F on nbp_ncbj_app_payment (ncbjApplicationId);

create index IX_C2AC82EB on nbp_ncbj_applicant_detail (ncbjApplicationId);

create index IX_706AF1D2 on nbp_ncbj_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_55DABB16 on nbp_ncbj_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_A8F97817 on nbp_ncbj_application (status, userId);
create index IX_1EB53CE4 on nbp_ncbj_application (typeOfServices[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);
create unique index IX_B3831C6D on nbp_ncbj_application (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_EDF2C0C7 on nbp_ncbj_business_detail (ncbjApplicationId);

create index IX_B332FAA5 on nbp_ncbj_business_detail_add (ncbjApplicationId);

create index IX_94492A55 on nbp_ncbj_company_det_gen (ncbjApplicationId);

create index IX_C7C3AE26 on nbp_ncbj_company_detail (ncbjApplicationId);

create index IX_36002084 on nbp_ncbj_company_detail_add (ncbjApplicationId);

create index IX_9708A27F on nbp_ncbj_current_stage (ncbjApplicationId);
create unique index IX_C803D95 on nbp_ncbj_current_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7C0631D9 on nbp_ncbj_new_company (ncbjApplicationId);

create index IX_B122A380 on nbp_ncbj_num_of_emp (ncbjApplicationId);

create index IX_BDC13C26 on nbp_ncbj_number_effective_add (ncbjApplicationId);

create index IX_F8E3C88D on nbp_ncbj_org_detail (ncbjApplicationId);

create index IX_1B017C3A on nbp_ncbj_organization_detail (ncbjApplicationId);

create index IX_2491B525 on nbp_ncbj_premises_location (ncbjApplicationId);

create index IX_A0611632 on nbp_ncbj_product_service (ncbjApplicationId);

create index IX_E9E9C48E on nbp_ncbj_section_detail (ncbjApplicationId);

create index IX_E54C9C99 on nbp_ncbj_section_four (ncbjApplicationId);

create index IX_A035656B on nbp_ncbj_section_one (ncbjApplicationId);

create index IX_848AAD49 on nbp_ncbj_section_one_add (ncbjApplicationId);

create index IX_38F05EF3 on nbp_ncbj_section_three (ncbjApplicationId);

create index IX_6934DD45 on nbp_ncbj_section_two (ncbjApplicationId);

create index IX_9B0B7EBB on nbp_ncbj_specific_activity (ncbjApplicationId);