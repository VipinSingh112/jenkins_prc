create index IX_1C595BCB on nbp_factories_app_payment (factoriesApplicationId);

create index IX_6F49CC6D on nbp_factories_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_35A735B on nbp_factories_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_8DB31B5C on nbp_factories_application (status, userId);
create index IX_C6896B7D on nbp_factories_application (typeOfTransaction[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);

create index IX_5893C91B on nbp_factories_current_stage (factoriesApplicationId);
create unique index IX_A95E239A on nbp_factories_current_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BE57531A on nbp_factories_pro_food_act (factoriesApplicationId);

create index IX_6963FEE6 on nbp_factories_product_det (factoriesApplicationId);

create index IX_EDBD6D5B on nbp_factories_stand_act_info (factoriesApplicationId);