create index IX_1650B61C on nbp_miic_Suspension (miicApplicationId);

create index IX_1D949E25 on nbp_miic_app_stage (miicApplicationId);

create index IX_33ECCEA0 on nbp_miic_applicant_details (miicApplicationId);

create index IX_3A4D51F9 on nbp_miic_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_49D2ED4F on nbp_miic_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_18687B21 on nbp_miic_application (entityId[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:500$]);
create index IX_65C20CE8 on nbp_miic_application (entityId[$COLUMN_LENGTH:75$], status);
create index IX_85DC6150 on nbp_miic_application (status, userId);
create index IX_3FEEFB71 on nbp_miic_application (typeOfTransaction[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);
create unique index IX_906605A6 on nbp_miic_application (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_FA4F8E15 on nbp_miic_safeguard_good (miicApplicationId);

create index IX_687D8E6B on nbp_miic_safeguard_material (miicApplicationId);

create index IX_6B04CA79 on nbp_miic_suspension_of_cet (miicApplicationId);