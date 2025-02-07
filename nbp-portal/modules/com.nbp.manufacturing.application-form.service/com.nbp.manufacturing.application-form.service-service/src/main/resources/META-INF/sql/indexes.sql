create index IX_EC6D7290 on ManuAdditionalCompanyInfo (manufacturingApplicationId);

create index IX_E1DE537 on ManuCompanyInfo (manufacturingApplicationId);

create index IX_ADD071FA on ManuEquipment (manufacturingApplicationId);

create index IX_E2E17480 on ManuExportData (manufacturingApplicationId);

create index IX_D67D44AB on ManuInternationalCertificate (manufacturingApplicationId);

create index IX_F83C9C73 on PackagingProcess (manufacturingApplicationId);

create index IX_21BE98BD on ProductionProcess (manufacturingApplicationId);

create index IX_C35BF63D on ProductiveInputsForm (manufacturingApplicationId);

create index IX_B05CD753 on nbp_manu_com_Info_Address (manuCompanyInfoId);
create index IX_46AFEA69 on nbp_manu_com_Info_Address (manufacturingApplicationId);

create index IX_96090CE9 on nbp_manu_equipment_Add (manuEquipmentId);
create index IX_8C7DA2F6 on nbp_manu_equipment_Add (manufacturingApplicationId);

create index IX_772660DA on nbp_manu_inter_certificate (manufacturingApplicationId);

create index IX_5DFA2AC0 on nbp_manu_pro_input_add (manufacturingApplicationId);
create index IX_9F2268C4 on nbp_manu_pro_input_add (productiveInputsFormId);

create index IX_9D777D29 on nbp_manu_productive_Inputsform (manufacturingApplicationId);

create index IX_492DA526 on nbp_manufacture_add_comp_info (manufacturingApplicationId);

create index IX_9F88E934 on nbp_manufacture_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_378D8CF4 on nbp_manufacture_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_BCF68687 on nbp_manufacture_application (licenseRequest[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);
create index IX_2AA38BF5 on nbp_manufacture_application (status, userId);

create index IX_4A0B6FB8 on nbp_manufacture_company_info (manufacturingApplicationId);

create index IX_FC01A7F4 on nbp_manufacture_equipment (manufacturingApplicationId);

create index IX_A9C22DBB on nbp_manufacture_export_data (manufacturingApplicationId);

create index IX_8860DB97 on nbp_manufacture_packaging_pro (manufacturingApplicationId);

create index IX_6422282F on nbp_manufacture_production_pro (manufacturingApplicationId);

create index IX_8B60B8E4 on nbp_manufacture_stage (manufacturingApplicationId);