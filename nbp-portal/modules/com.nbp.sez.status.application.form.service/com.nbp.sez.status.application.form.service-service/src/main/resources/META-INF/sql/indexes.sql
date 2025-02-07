create index IX_BCA99E31 on nbp_sez_app_stage (sezStatusApplicationId);
create unique index IX_F3771242 on nbp_sez_app_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9D19F763 on nbp_sez_consultancy_service (doYouWant[$COLUMN_LENGTH:75$]);

create index IX_B941BDC2 on nbp_sez_dev_Inves_and_financ (sezStatusApplicationId);

create index IX_43342C on nbp_sez_dev_Pro_develop_plan (sezStatusApplicationId);

create index IX_E88B00BC on nbp_sez_dev_corp_bus_add (sezStatusApplicationId);

create index IX_4616CB69 on nbp_sez_dev_details (sezStatusApplicationId);

create index IX_82679B06 on nbp_sez_dev_disast_manag_add (sezStatusApplicationId);

create index IX_F762166A on nbp_sez_dev_disaster_manage (sezStatusApplicationId);

create index IX_63580B73 on nbp_sez_dev_emp_define_occ_add (sezStatusApplicationId);

create index IX_88E1D8FA on nbp_sez_dev_emp_safety_add (sezStatusApplicationId);

create index IX_11504933 on nbp_sez_dev_emploment_info (sezStatusApplicationId);

create index IX_2B05B65E on nbp_sez_dev_gen_busi_info_add (sezStatusApplicationId);

create index IX_C6425E45 on nbp_sez_dev_gen_business_info (sezStatusApplicationId);

create index IX_16CCB68D on nbp_sez_dev_please_state_add (sezStatusApplicationId);

create index IX_96686D0E on nbp_sez_dev_prop_project_add (sezStatusApplicationId);

create index IX_3F1E096F on nbp_sez_dev_proposed_project (sezStatusApplicationId);

create index IX_BE501E7 on nbp_sez_dev_share_com_dire_add (sezStatusApplicationId);

create index IX_47FFFD7D on nbp_sez_dev_share_director_add (sezStatusApplicationId);

create index IX_2C22C29F on nbp_sez_dev_share_pricipal_add (sezStatusApplicationId);

create index IX_7F171570 on nbp_sez_dev_shareholding_info (sezStatusApplicationId);

create index IX_788B24E on nbp_sez_dev_sub_checklist (sezStatusApplicationId);

create index IX_6C747B03 on nbp_sez_dev_undertaking (sezStatusApplicationId);

create index IX_29F576D4 on nbp_sez_occ_dev_under_info (sezStatusApplicationId);

create index IX_525A72B7 on nbp_sez_occ_dir_part_spon (sezStatusApplicationId);

create index IX_BE7EBC80 on nbp_sez_occ_employee_info (sezStatusApplicationId);

create index IX_5BC94A63 on nbp_sez_occ_exist_prop_info (sezStatusApplicationId);

create index IX_5B798D30 on nbp_sez_occ_gen_buss_address (addresstype[$COLUMN_LENGTH:75$], sezOccGenBussId);
create index IX_F42C84F2 on nbp_sez_occ_gen_buss_address (sezStatusApplicationId, addresstype[$COLUMN_LENGTH:75$]);

create index IX_DEDF021F on nbp_sez_occ_gen_bussiness (sezStatusApplicationId);

create index IX_C4EBA082 on nbp_sez_occ_invest_fina_info (sezStatusApplicationId);

create index IX_19BEDC4C on nbp_sez_occ_location_add (sezStatusApplicationId);

create index IX_8EF499D8 on nbp_sez_occ_location_add_box (sezStatusApplicationId);

create index IX_1D93B848 on nbp_sez_occ_prin_offic_add (sezStatusApplicationId);

create index IX_6E467D18 on nbp_sez_occ_princ_dir_info (sezStatusApplicationId);

create index IX_2F63F9B9 on nbp_sez_occ_prop_area_info (sezStatusApplicationId);

create index IX_8D5E6F on nbp_sez_occ_share_hold_info (sezStatusApplicationId);

create index IX_2CE9E359 on nbp_sez_occ_sub_check_info (sezStatusApplicationId);

create index IX_4E0F398A on nbp_sez_occ_user_under_info (sezStatusApplicationId);

create index IX_20D39FA0 on nbp_sez_status_app_payment (sezStatusApplicationId);

create index IX_37E192A6 on nbp_sez_status_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_97C056C2 on nbp_sez_status_application (caseId[$COLUMN_LENGTH:75$]);
create index IX_5222F0D4 on nbp_sez_status_application (entityId[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_13F667E6 on nbp_sez_status_application (status, doYouWantTo[$COLUMN_LENGTH:75$]);
create index IX_14C78D1B on nbp_sez_status_application (status, entityId[$COLUMN_LENGTH:75$]);
create index IX_430EA7C3 on nbp_sez_status_application (status, userId);
create index IX_857FE764 on nbp_sez_status_application (typeOfTransaction[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);

create index IX_F6A64205 on nbp_sez_status_work_home (sezStatusApplicationId);

create index IX_23490846 on nbp_sez_status_work_home_loc (sezStatusApplicationId);

create index IX_710129E3 on nbp_sez_zone_dev_under_info (sezStatusApplicationId);

create index IX_3AFC8AC9 on nbp_sez_zone_emp_info (sezStatusApplicationId);

create index IX_D00F4828 on nbp_sez_zone_financial_info (sezStatusApplicationId);

create index IX_901EB6D0 on nbp_sez_zone_gen_business_info (sezStatusApplicationId);

create index IX_A8970B79 on nbp_sez_zone_gen_buss_address (addresstype[$COLUMN_LENGTH:75$], sezZoneGeneralBusinessInfoId);
create index IX_8B707203 on nbp_sez_zone_gen_buss_address (sezStatusApplicationId, addresstype[$COLUMN_LENGTH:75$]);

create index IX_FEEA071B on nbp_sez_zone_location_add (sezStatusApplicationId);

create index IX_5BDBE470 on nbp_sez_zone_pro_proj_info (sezStatusApplicationId);

create index IX_73F59668 on nbp_sez_zone_sub_check_info (sezStatusApplicationId);

create index IX_E879E85B on nbp_sez_zone_user_under_info (sezStatusApplicationId);