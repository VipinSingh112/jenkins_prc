create index IX_3CC51698 on nbp_jadsc_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_57653941 on nbp_jadsc_application (breachOfConfidentiality[$COLUMN_LENGTH:1000$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);
create index IX_25A7D610 on nbp_jadsc_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_BDA626A2 on nbp_jadsc_application (entityId[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:500$]);
create index IX_AFFB869 on nbp_jadsc_application (entityId[$COLUMN_LENGTH:75$], status);
create index IX_19E0F911 on nbp_jadsc_application (status, userId);
create unique index IX_246A9D67 on nbp_jadsc_application (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_155435B1 on nbp_jadsc_certif_servic (jadscApplicationId);
create unique index IX_87BE7545 on nbp_jadsc_certif_servic (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_AA07FB93 on nbp_jadsc_certif_servic_add (jadscApplicationId);
create unique index IX_6747C27 on nbp_jadsc_certif_servic_add (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_ED40547A on nbp_jadsc_certif_verasity (jadscApplicationId);
create unique index IX_B613608E on nbp_jadsc_certif_verasity (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E759894B on nbp_jadsc_checklist_add (jadscApplicationId);
create unique index IX_B661A5DF on nbp_jadsc_checklist_add (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D109BB54 on nbp_jadsc_checklist_info (jadscApplicationId);
create unique index IX_58064468 on nbp_jadsc_checklist_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_676B37B on nbp_jadsc_current_stage (jadscApplicationId);
create unique index IX_E18B680F on nbp_jadsc_current_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BE1949AB on nbp_jadsc_info_request (jadscApplicationId);
create unique index IX_38D0963F on nbp_jadsc_info_request (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7056B913 on nbp_jadsc_notic_of_appr_info (jadscApplicationId);
create unique index IX_30BDF9A7 on nbp_jadsc_notic_of_appr_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A9295AC3 on nbp_jadsc_oath_request (jadscApplicationId);
create unique index IX_BE04F357 on nbp_jadsc_oath_request (uuid_[$COLUMN_LENGTH:75$], groupId);