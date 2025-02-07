create index IX_C94A054C on nbp_quarry__info (quarryApplicationId);

create index IX_30B7D5CF on nbp_quarry_add_director (quarryApplicationId);

create index IX_17EAA91 on nbp_quarry_app_payment (quarryApplicationId);

create index IX_9668BA4E on nbp_quarry_applicant_info (quarryApplicationId);

create index IX_D3DED8D3 on nbp_quarry_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_FEB12AB5 on nbp_quarry_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_A17DB107 on nbp_quarry_application (entityId, caseId[$COLUMN_LENGTH:500$]);
create index IX_EED742CE on nbp_quarry_application (entityId, status);
create index IX_DE71D8B6 on nbp_quarry_application (status, userId);
create index IX_3010FDD7 on nbp_quarry_application (typeOfTransaction[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);
create unique index IX_E8FB7D0C on nbp_quarry_application (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_28220F34 on nbp_quarry_general_info (quarryApplicationId);

create index IX_F1DEAEFC on nbp_quarry_machines_equip (quarryApplicationId[$COLUMN_LENGTH:75$], manchineName[$COLUMN_LENGTH:75$]);
create unique index IX_276B40B9 on nbp_quarry_machines_equip (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E4F883FB on nbp_quarry_machines_equip_mi (quarryApplicationId[$COLUMN_LENGTH:75$], manchineName[$COLUMN_LENGTH:75$]);
create index IX_31217998 on nbp_quarry_machines_equip_mi (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_976B861A on nbp_quarry_machines_equip_mi (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A2087C40 on nbp_quarry_material_List_info (quarryApplicationId, machineName[$COLUMN_LENGTH:75$]);

create index IX_6FE639F3 on nbp_quarry_material_info (quarryApplicationId);

create index IX_A431D0BB on nbp_quarry_stage (quarryApplicationId);

create index IX_99477EB7 on nbp_quarry_transfer_info (quarryApplicationId);