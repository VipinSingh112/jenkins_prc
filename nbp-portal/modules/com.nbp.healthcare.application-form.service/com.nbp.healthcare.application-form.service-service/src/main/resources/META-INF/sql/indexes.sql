create index IX_DBF8980F on nbp_health_equip_heading_list (healthcareDescription[$COLUMN_LENGTH:1000$]);

create index IX_6AF8BC8F on nbp_healthcare_app_payment (healthCareApplicationId);

create index IX_DFBFC6F5 on nbp_healthcare_applicant (healthCareApplicationId);

create index IX_5BA85353 on nbp_healthcare_applicant_add (healthCareApplicationId);

create index IX_426BF762 on nbp_healthcare_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_38458F86 on nbp_healthcare_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_B40DC87 on nbp_healthcare_application (status, userId);

create index IX_44F1E6EA on nbp_healthcare_bussiness (healthCareApplicationId);

create index IX_9A2F70C8 on nbp_healthcare_bussiness_add (healthCareApplicationId);

create index IX_67A02DFB on nbp_healthcare_description (healthCareApplicationId);

create index IX_F2C9575A on nbp_healthcare_equipment_info (healthCareApplicationId);

create index IX_EC2C24F9 on nbp_healthcare_stage (healthCareApplicationId);