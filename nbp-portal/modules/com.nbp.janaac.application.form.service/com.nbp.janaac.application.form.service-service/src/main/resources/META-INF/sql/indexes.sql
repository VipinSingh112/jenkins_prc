create index IX_5DC9EE40 on nbp_janaac_acc_cer_app_info (janaacApplicationId);
create unique index IX_A0F3F625 on nbp_janaac_acc_cer_app_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7BD72CFE on nbp_janaac_acc_cer_general (janaacApplicationId);
create unique index IX_4EADF8A7 on nbp_janaac_acc_cer_general (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5DECDCDE on nbp_janaac_acc_cer_info (janaacApplicationId);
create unique index IX_9001DCC7 on nbp_janaac_acc_cer_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_378AE187 on nbp_janaac_acc_cer_manage (janaacApplicationId);
create unique index IX_199BD27E on nbp_janaac_acc_cer_manage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_B0A054F4 on nbp_janaac_acc_cer_manage_2 (janaacApplicationId);
create unique index IX_BF3D2EF1 on nbp_janaac_acc_cer_manage_2 (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6DA4A186 on nbp_janaac_acc_cer_personnel (janaacApplicationId);
create unique index IX_EADBCF1F on nbp_janaac_acc_cer_personnel (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_59DD0F24 on nbp_janaac_acc_cer_pro_scope (janaacApplicationId);
create unique index IX_8820D6C1 on nbp_janaac_acc_cer_pro_scope (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_3A1F5152 on nbp_janaac_acc_cer_scope (janaacApplicationId);
create unique index IX_9F8D6FD3 on nbp_janaac_acc_cer_scope (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C8EBE1A7 on nbp_janaac_acc_ins_body_manag (janaacApplicationId);
create unique index IX_61633E5E on nbp_janaac_acc_ins_body_manag (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_1B7204C3 on nbp_janaac_acc_ins_body_org (janaacApplicationId);
create unique index IX_79E299C2 on nbp_janaac_acc_ins_body_org (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C54C9397 on nbp_janaac_acc_ins_body_other (janaacApplicationId);
create unique index IX_1AF7166E on nbp_janaac_acc_ins_body_other (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E10B6759 on nbp_janaac_acc_ins_body_phys (janaacApplicationId);
create unique index IX_BCF716C on nbp_janaac_acc_ins_body_phys (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_77AD4D59 on nbp_janaac_acc_med_activity (janaacApplicationId);
create unique index IX_E515CB6C on nbp_janaac_acc_med_activity (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_F2B32644 on nbp_janaac_acc_med_manage_req (janaacApplicationId);
create unique index IX_FB60CBA1 on nbp_janaac_acc_med_manage_req (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_72D695DB on nbp_janaac_acc_med_other_req (janaacApplicationId);
create unique index IX_9D7DB9AA on nbp_janaac_acc_med_other_req (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_EED4D1CC on nbp_janaac_acc_med_test_desc (janaacApplicationId);
create unique index IX_F9340B19 on nbp_janaac_acc_med_test_desc (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A1441778 on nbp_janaac_acc_med_test_manage (janaacApplicationId);
create unique index IX_4922E9ED on nbp_janaac_acc_med_test_manage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E1566ECE on nbp_janaac_acc_med_test_reso (janaacApplicationId);
create unique index IX_F880D4D7 on nbp_janaac_acc_med_test_reso (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_363BEB08 on nbp_janaac_acc_med_test_struct (janaacApplicationId);
create unique index IX_37591C5D on nbp_janaac_acc_med_test_struct (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_FB3C3FE9 on nbp_janaac_acc_medi_app_info (janaacApplicationId);
create unique index IX_1C7D7EDC on nbp_janaac_acc_medi_app_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6BB64AB9 on nbp_janaac_acc_medi_org (janaacApplicationId);
create unique index IX_F9FBF20C on nbp_janaac_acc_medi_org (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D6517ABE on nbp_janaac_acc_medi_physical (janaacApplicationId);
create unique index IX_44EA12E7 on nbp_janaac_acc_medi_physical (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_72D012D7 on nbp_janaac_acc_third_app_info (janaacApplicationId);
create index IX_A5090DAC on nbp_janaac_acc_third_app_info (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3E910F2E on nbp_janaac_acc_third_app_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C063FBD1 on nbp_janaac_acc_third_appli (janaacApplicationId);
create unique index IX_FF19F1F4 on nbp_janaac_acc_third_appli (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E4DA4C1B on nbp_janaac_acc_third_scope (janaacApplicationId);
create unique index IX_BD111B6A on nbp_janaac_acc_third_scope (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A3BE4D5D on nbp_janaac_add_cer_appli_info (janaacApplicationId);

create index IX_E9E1BEB8 on nbp_janaac_add_cer_per_first (janaacApplicationId);

create index IX_ABBA7BB7 on nbp_janaac_add_cer_per_sec (janaacApplicationId);

create index IX_8711EE21 on nbp_janaac_add_cer_per_third (janaacApplicationId);

create index IX_B61F67F1 on nbp_janaac_add_cer_scope_ser (janaacApplicationId);

create index IX_DB1A5390 on nbp_janaac_add_fda_Appli_info (janaacApplicationId);

create index IX_D0AAA205 on nbp_janaac_add_fda_per_first (janaacApplicationId);

create index IX_FC72D2F7 on nbp_janaac_add_fda_per_four (janaacApplicationId);

create index IX_DA0DCE44 on nbp_janaac_add_fda_per_sec (janaacApplicationId);

create index IX_6DDAD16E on nbp_janaac_add_fda_per_third (janaacApplicationId);

create index IX_C43CE89A on nbp_janaac_add_fda_scop_client (janaacApplicationId);

create index IX_96BEFD7B on nbp_janaac_add_ins_appli_info (janaacApplicationId);

create index IX_F95111F6 on nbp_janaac_add_ins_lab_org (janaacApplicationId);

create index IX_FE521E73 on nbp_janaac_add_ins_org_first (janaacApplicationId);

create index IX_CEA58E32 on nbp_janaac_add_ins_org_sec (janaacApplicationId);

create index IX_9B824DDC on nbp_janaac_add_ins_org_third (janaacApplicationId);

create index IX_C18E9CF6 on nbp_janaac_add_ins_phy_first (janaacApplicationId);

create index IX_20E5D175 on nbp_janaac_add_ins_phy_sec (janaacApplicationId);

create index IX_1B482149 on nbp_janaac_add_lab_aapli_info (janaacApplicationId);

create index IX_C830F3E3 on nbp_janaac_add_lab_carStrucSec (janaacApplicationId);

create index IX_835F8852 on nbp_janaac_add_lab_des_of_act (janaacApplicationId);

create index IX_EE6DB9A8 on nbp_janaac_add_lab_med_dec_sec (janaacApplicationId);

create index IX_2A7B10E3 on nbp_janaac_add_lab_med_or_fir (janaacApplicationId);

create index IX_6DABB661 on nbp_janaac_add_lab_med_or_sec (janaacApplicationId);

create index IX_246C14C9 on nbp_janaac_add_lab_med_phy_sec (janaacApplicationId);

create index IX_C8F70BA on nbp_janaac_add_lab_res_req_fir (janaacApplicationId);

create index IX_4FC01638 on nbp_janaac_add_lab_res_req_sec (janaacApplicationId);

create index IX_5C1CEF86 on nbp_janaac_add_lab_stru_req (janaacApplicationId);

create index IX_C8AEAE78 on nbp_janaac_add_lab_testStr_sec (janaacApplicationId);

create index IX_33F8008B on nbp_janaac_add_medi_phy_first (janaacApplicationId);

create index IX_85B2671 on nbp_janaac_add_out_src_act (janaacApplicationId);

create index IX_CA1B7CBA on nbp_janaac_add_scope_ser_third (janaacApplicationId);

create index IX_DA213D22 on nbp_janaac_appli_current_stage (janaacApplicationId);

create index IX_81F028D4 on nbp_janaac_appli_payment (janaacApplicationId);

create index IX_EC974263 on nbp_janaac_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_231B1B25 on nbp_janaac_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_8FDC5926 on nbp_janaac_application (status, userId);
create unique index IX_9A65FD7C on nbp_janaac_application (uuid_[$COLUMN_LENGTH:75$], groupId);