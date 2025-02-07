create index IX_7A0CAE0F on nbp_hsra_alter_rso_one_add (hsraApplicationId);

create index IX_E02C3172 on nbp_hsra_alternate_rso_add (hsraApplicationId);

create index IX_6A64CF46 on nbp_hsra_appli_current_stage (hsraApplicationId);

create index IX_BE21E4F8 on nbp_hsra_appli_payment (hsraApplicationId);

create index IX_8F9C413B on nbp_hsra_applicant (hsraApplicationId);
create unique index IX_3436A81C on nbp_hsra_applicant (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_85DD99B5 on nbp_hsra_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_B2222313 on nbp_hsra_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_2124BE5 on nbp_hsra_application (entityId[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:500$]);
create index IX_4F6BDDAC on nbp_hsra_application (entityId[$COLUMN_LENGTH:75$], status);
create index IX_DE8B9314 on nbp_hsra_application (status, userId);
create index IX_EC450251 on nbp_hsra_application (typeOfApplicant[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);
create unique index IX_E915376A on nbp_hsra_application (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C2C491F5 on nbp_hsra_broker_declare (hsraApplicationId);

create index IX_B1B1B1A9 on nbp_hsra_broker_employee (hsraApplicationId);

create index IX_D740B9CA on nbp_hsra_broker_proficiency (hsraApplicationId);

create index IX_9EC32B4A on nbp_hsra_broker_regst (hsraApplicationId);

create index IX_F7D1EB0D on nbp_hsra_det_business (hsraApplicationId);

create index IX_2DA546E5 on nbp_hsra_detail_applicant (hsraApplicationId);

create index IX_EFB4998D on nbp_hsra_equipment_add (hsraApplicationId);

create index IX_AF8A872E on nbp_hsra_fitprop_business (hsraApplicationId);

create index IX_E48BDBBE on nbp_hsra_fitprop_declare (hsraApplicationId);

create index IX_D016BEBF on nbp_hsra_fitprop_financial (hsraApplicationId);

create index IX_391E30AE on nbp_hsra_fitprop_personal (hsraApplicationId);

create index IX_2FD8D806 on nbp_hsra_low_risk_safety (hsraApplicationId);

create index IX_F6B2EC79 on nbp_hsra_medical_pract_add (hsraApplicationId);

create index IX_88FD0AF1 on nbp_hsra_medical_practitioner (hsraApplicationId);
create unique index IX_BC732A26 on nbp_hsra_medical_practitioner (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_65109039 on nbp_hsra_noti_detail_source (hsraApplicationId);

create index IX_3A6B9001 on nbp_hsra_noti_gen_equip (hsraApplicationId);

create index IX_25412F40 on nbp_hsra_noti_legal_info (hsraApplicationId);

create index IX_1514AC75 on nbp_hsra_noti_radionuclide (hsraApplicationId);

create index IX_DB6C8AE9 on nbp_hsra_purpose_regst (hsraApplicationId);

create index IX_5DDA72E1 on nbp_hsra_quali_expert_one_add (hsraApplicationId);

create index IX_D062A6CA on nbp_hsra_qualified_expert_add (hsraApplicationId);

create index IX_4C8D6E7B on nbp_hsra_quality_applicant (hsraApplicationId);

create index IX_D99D7993 on nbp_hsra_quality_declare (hsraApplicationId);

create index IX_75F5BDCB on nbp_hsra_quality_employee (hsraApplicationId);

create index IX_80470AC4 on nbp_hsra_quality_proficient (hsraApplicationId);

create index IX_B0A1172D on nbp_hsra_rad_declaration (hsraApplicationId);

create index IX_F3C019DB on nbp_hsra_rad_section_one (hsraApplicationId);

create index IX_DDCD6306 on nbp_hsra_radiation_dev (hsraApplicationId);

create index IX_F386A403 on nbp_hsra_radiation_device_add (hsraApplicationId);

create index IX_50201D58 on nbp_hsra_radionuclide_add (hsraApplicationId);

create index IX_18DA6836 on nbp_hsra_safety_prog (hsraApplicationId);

create index IX_46153A5F on nbp_hsra_sealed_source (hsraApplicationId);

create index IX_62CA2706 on nbp_hsra_source_detail_add (hsraApplicationId);

create index IX_7B576AA1 on nbp_hsra_specific_require (hsraApplicationId);

create index IX_1B41F70B on nbp_hsra_unsealed_sources (hsraApplicationId);