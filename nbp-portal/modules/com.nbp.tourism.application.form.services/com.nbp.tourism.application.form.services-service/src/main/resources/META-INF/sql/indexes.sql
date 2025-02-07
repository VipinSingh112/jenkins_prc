create index IX_90BA4563 on nbp_pharma_app_payment (tourismApplicationId);

create index IX_B390A8AB on nbp_tourism_app_payment (tourismApplicationId);

create index IX_3C036D8A on nbp_tourism_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_45BA625E on nbp_tourism_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_A181575F on nbp_tourism_application (status, userId);

create index IX_6316CD35 on nbp_tourism_attr_empl (tourismApplicationId);

create index IX_B4B3286C on nbp_tourism_attrac_sign (tourismApplicationId);

create index IX_A3B26BE8 on nbp_tourism_boma_acco_faoo (addressType[$COLUMN_LENGTH:75$], tourismBonaAFId);
create index IX_CDAFAC9F on nbp_tourism_boma_acco_faoo (tourismApplicationId);

create index IX_737C9CC1 on nbp_tourism_bona_acco_gen (tourismApplicationId);

create index IX_B419E4E0 on nbp_tourism_bona_acco_sign (tourismApplicationId);

create index IX_C541D94F on nbp_tourism_bona_aco_asses (tourismApplicationId);

create index IX_416F4D47 on nbp_tourism_bona_af (tourismApplicationId);

create index IX_17798984 on nbp_tourism_bona_attract_ffa (addressType[$COLUMN_LENGTH:75$], tourismBonaAttractFormFirstId);
create index IX_A3CD4FF5 on nbp_tourism_bona_attract_ffa (tourismApplicationId);

create index IX_52782A on nbp_tourism_bona_attraction_ff (tourismApplicationId);

create index IX_B6C66137 on nbp_tourism_bona_attraction_fs (tourismApplicationId);

create index IX_FC140D5F on nbp_tourism_bona_gro_pay (tourismApplicationId);

create index IX_9804F65A on nbp_tourism_bona_gro_sign (tourismApplicationId);

create index IX_8E265389 on nbp_tourism_bona_gro_tcsign (tourismApplicationId);

create index IX_3D0080D4 on nbp_tourism_bona_gro_tranpay (tourismApplicationId);

create index IX_568CFA35 on nbp_tourism_bona_ground_box (tourismApplicationId);

create index IX_5C8F55DE on nbp_tourism_bona_ground_t (tourismApplicationId);

create index IX_3F1AA401 on nbp_tourism_bona_ground_ta (addressType[$COLUMN_LENGTH:500$], tourismBonaGroundTransportId);
create index IX_14CB10B7 on nbp_tourism_bona_ground_ta (tourismApplicationId);

create index IX_2EEE744D on nbp_tourism_bona_ground_tcr (tourismApplicationId);

create index IX_9CE98BFB on nbp_tourism_bona_operator_info (tourismApplicationId);

create index IX_3FC7D132 on nbp_tourism_bona_water_emp (tourismApplicationId);

create index IX_2B6273DD on nbp_tourism_bona_water_sff (tourismApplicationId);

create index IX_BF724CC2 on nbp_tourism_bona_water_sffa (addressType[$COLUMN_LENGTH:75$], tourismBonaWaterSFFirstId);
create index IX_205BB298 on nbp_tourism_bona_water_sffa (tourismApplicationId);

create index IX_849C2107 on nbp_tourism_bona_water_sign (tourismApplicationId);

create index IX_436BAC70 on nbp_tourism_bona_water_ssf (tourismApplicationId);

create index IX_C1C67449 on nbp_tourism_enter_box_add (tourismApplicationId);

create index IX_5230E155 on nbp_tourism_new_accco_aoo (addressType[$COLUMN_LENGTH:75$], tourismNewAccoFormId);
create index IX_4318A813 on nbp_tourism_new_accco_aoo (tourismApplicationId);

create index IX_10CB6254 on nbp_tourism_new_acco_annual (tourismApplicationId);

create index IX_A3D716D3 on nbp_tourism_new_acco_assesm (tourismApplicationId);

create index IX_C031EB2C on nbp_tourism_new_acco_assesment (tourismApplicationId);

create index IX_6186E636 on nbp_tourism_new_acco_employe (tourismApplicationId);

create index IX_F39C223C on nbp_tourism_new_acco_gerner (tourismApplicationId);

create index IX_19252CE7 on nbp_tourism_new_acco_gerneral (tourismApplicationId);

create index IX_3B6F4DA0 on nbp_tourism_new_acco_signinfo (tourismApplicationId);

create index IX_1553C6F6 on nbp_tourism_new_accommodation (tourismApplicationId);

create index IX_D7BAD0AC on nbp_tourism_new_attrac_emp (tourismApplicationId);

create index IX_A0AD819A on nbp_tourism_new_attract_ffaoo (addressType[$COLUMN_LENGTH:75$], tourismNewAttractFormFirstId);
create index IX_E340A427 on nbp_tourism_new_attract_ffaoo (tourismApplicationId);

create index IX_BB5DD93C on nbp_tourism_new_attraction_ff (tourismApplicationId);

create index IX_71D1C249 on nbp_tourism_new_attraction_fs (tourismApplicationId);

create index IX_8BE98263 on nbp_tourism_new_ground_box (tourismApplicationId);

create index IX_DB6F199 on nbp_tourism_new_ground_sign (tourismApplicationId);

create index IX_ED3FB842 on nbp_tourism_new_ground_tarns (tourismApplicationId);

create index IX_F15BAA81 on nbp_tourism_stage (tourismApplicationId);

create index IX_2695DA75 on nbp_tourism_summary_box (tourismApplicationId);