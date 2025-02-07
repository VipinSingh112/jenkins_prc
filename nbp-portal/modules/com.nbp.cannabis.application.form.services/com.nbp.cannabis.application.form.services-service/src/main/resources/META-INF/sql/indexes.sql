create index IX_8674AF37 on nbp_cannabis_app_payment (cannabisApplicationId);

create index IX_C195EA2D on nbp_cannabis_applications (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_AF776D9B on nbp_cannabis_applications (caseId[$COLUMN_LENGTH:500$]);
create index IX_98C9DF39 on nbp_cannabis_applications (requestType[$COLUMN_LENGTH:75$], expiredLicenseAppNo[$COLUMN_LENGTH:75$]);
create index IX_5727FAAD on nbp_cannabis_applications (status, licenseCategory[$COLUMN_LENGTH:75$]);
create index IX_D10067F3 on nbp_cannabis_applications (status, licenseSubCategory[$COLUMN_LENGTH:75$]);
create index IX_48BBB037 on nbp_cannabis_applications (status, requestType[$COLUMN_LENGTH:75$]);
create index IX_4351D59C on nbp_cannabis_applications (status, userId);
create index IX_9E5018B6 on nbp_cannabis_applications (userId);
create unique index IX_4DDB79F2 on nbp_cannabis_applications (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_150450BC on nbp_cannabis_caa (cannabisApplicationId);
create unique index IX_FB55E8C on nbp_cannabis_caa (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_21E7BF7 on nbp_cannabis_com_address (companyInformationId, addressType[$COLUMN_LENGTH:75$]);
create unique index IX_DE241E3F on nbp_cannabis_com_address (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D8AA2240 on nbp_cannabis_company_info (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_66D5AD29 on nbp_cannabis_company_info (cannabisApplicationId);
create unique index IX_E1C172BF on nbp_cannabis_company_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8AA6D7BD on nbp_cannabis_cpo (cannabisApplicationId);
create unique index IX_E18246AB on nbp_cannabis_cpo (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_369A0A00 on nbp_cannabis_cso (cannabisApplicationId);

create index IX_70FFAFF6 on nbp_cannabis_dec_own (cannabisApplicationId);
create unique index IX_6D594C92 on nbp_cannabis_dec_own (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D9679708 on nbp_cannabis_fee_master (category[$COLUMN_LENGTH:75$], subCategory[$COLUMN_LENGTH:75$]);

create index IX_ADF9A05C on nbp_cannabis_gd (cannabisApplicationId);
create unique index IX_A90462EC on nbp_cannabis_gd (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E7E80C27 on nbp_cannabis_ind_address (individualInformationId, addressType[$COLUMN_LENGTH:75$]);
create unique index IX_E158DB1D on nbp_cannabis_ind_address (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_2CDE5FA on nbp_cannabis_individaul_info (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_8D9D03E3 on nbp_cannabis_individaul_info (cannabisApplicationId);
create unique index IX_BAD8D945 on nbp_cannabis_individaul_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_35AD282E on nbp_cannabis_occ_license (cannabisApplicationId);
create unique index IX_F41A235A on nbp_cannabis_occ_license (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_EA7A44FB on nbp_cannabis_sofh (cannabisApplicationId);
create unique index IX_A6F8232D on nbp_cannabis_sofh (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C05E1D21 on nbp_cannabis_stage (cannabisApplicationId);
create unique index IX_6A2A89C7 on nbp_cannabis_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_3B89A454 on nbp_cannabis_supp_info (cannabisApplicationId);
create unique index IX_5E0465F4 on nbp_cannabis_supp_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_57B80BBF on nbp_cannabis_supporting_docs (documentTye[$COLUMN_LENGTH:75$], userType[$COLUMN_LENGTH:75$], applicationType[$COLUMN_LENGTH:75$], landType[$COLUMN_LENGTH:75$]);