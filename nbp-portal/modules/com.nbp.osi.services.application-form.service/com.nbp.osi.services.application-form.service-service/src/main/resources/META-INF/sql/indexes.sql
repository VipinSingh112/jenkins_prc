create index IX_8B190B5 on nbp_osi_services_appli_info (osiServicesApplicationId);
create unique index IX_3B612BAF on nbp_osi_services_appli_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_581DC97 on nbp_osi_services_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_684AD971 on nbp_osi_services_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_694924C3 on nbp_osi_services_application (entityId, caseId[$COLUMN_LENGTH:500$]);
create index IX_B6A2B68A on nbp_osi_services_application (entityId, status);
create index IX_4BF0B72 on nbp_osi_services_application (status, userId);
create index IX_22AFE93 on nbp_osi_services_application (typeOfTransaction[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);
create unique index IX_F48AFC8 on nbp_osi_services_application (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_F5F36EF0 on nbp_osi_services_assignm_det (osiServicesApplicationId);
create unique index IX_4BDD87AA on nbp_osi_services_assignm_det (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7D694007 on nbp_osi_services_benef_cred (osiServicesApplicationId);
create unique index IX_6DFA7981 on nbp_osi_services_benef_cred (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E98AD50B on nbp_osi_services_fee_payment (osiServicesApplicationId);

create index IX_23B9E2E5 on nbp_osi_services_inso_per (osiServicesApplicationId);
create unique index IX_191179DF on nbp_osi_services_inso_per (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_CE1C733C on nbp_osi_services_stage (osiServicesApplicationId);

create index IX_D023325 on nbp_osi_services_sup_doc_ind (osiServicesApplicationId);

create index IX_8A4DC62A on nbp_osi_services_tru_brak_add (osiServicesApplicationId);
create unique index IX_6E6BF64 on nbp_osi_services_tru_brak_add (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_4B162344 on nbp_osi_services_trus_co_info (osiServicesApplicationId);
create unique index IX_9531D4FE on nbp_osi_services_trus_co_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C27FDD3C on nbp_osi_services_trus_com_sign (osiServicesApplicationId);

create index IX_93F4E3A7 on nbp_osi_services_trus_in_decl (osiServicesApplicationId);
create unique index IX_80702521 on nbp_osi_services_trus_in_decl (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8DC8EDF7 on nbp_osi_services_trus_in_gen (osiServicesApplicationId);
create unique index IX_818DD371 on nbp_osi_services_trus_in_gen (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_3298B42D on nbp_osi_services_trus_in_lic (osiServicesApplicationId);
create unique index IX_88BFC527 on nbp_osi_services_trus_in_lic (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_CB9B4ECC on nbp_osi_services_trus_in_qual (osiServicesApplicationId);
create unique index IX_4F864A86 on nbp_osi_services_trus_in_qual (uuid_[$COLUMN_LENGTH:75$], groupId);