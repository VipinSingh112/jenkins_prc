create index IX_C7B7E4AC on nbp_comapny_director_info (CreativeApplicationId);

create index IX_1E7BDB12 on nbp_creactive_company_dia (CreativeApplicationId);

create index IX_188042A0 on nbp_creative_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_262FDF08 on nbp_creative_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_D82C8A09 on nbp_creative_application (status, userId);
create unique index IX_E2B62E5F on nbp_creative_application (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_157CC26C on nbp_creative_com_appli_info (CreativeApplicationId);

create index IX_67D12E19 on nbp_creative_com_detail_addres (addressType[$COLUMN_LENGTH:75$], creativeCompanyDetailsId);

create index IX_490FDF5C on nbp_creative_com_eco_effect (CreativeApplicationId);

create index IX_A34B1D46 on nbp_creative_company_detail (CreativeApplicationId);

create index IX_9055469A on nbp_creative_company_gen_info (CreativeApplicationId);

create index IX_48EDFD47 on nbp_creative_contact_box (CreativeApplicationId);

create index IX_B0766FFB on nbp_creative_current_stage (CreativeApplicationId);

create index IX_2CC15561 on nbp_creative_director_box (CreativeApplicationId);

create index IX_11C201B8 on nbp_creative_economic_effect (CreativeApplicationId);

create index IX_56E8820D on nbp_creative_ida (CreativeApplicationId);

create index IX_E2D07919 on nbp_creative_indi_general_info (CreativeApplicationId);

create index IX_BB4AAE5C on nbp_creative_individual_detail (CreativeApplicationId);

create index IX_C55C61E0 on nbp_creative_social_box (CreativeApplicationId);