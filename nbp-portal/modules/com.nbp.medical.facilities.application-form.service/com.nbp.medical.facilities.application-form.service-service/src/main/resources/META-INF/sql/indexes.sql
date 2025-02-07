create index IX_A9DAA7FB on nbp_medical_app_payment (medicalFacilitiesAppId);

create index IX_30163C44 on nbp_medical_appli_info (medicalFacilitiesAppId);
create unique index IX_A64F447C on nbp_medical_appli_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E206D428 on nbp_medical_company_detail (medicalFacilitiesAppId);
create unique index IX_B6380060 on nbp_medical_company_detail (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BF76BF0B on nbp_medical_current_stage (medicalFacilitiesAppId);
create unique index IX_1EC67E43 on nbp_medical_current_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BACF8DEF on nbp_medical_facilities_app (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_979E8F19 on nbp_medical_facilities_app (caseId[$COLUMN_LENGTH:500$]);
create index IX_EF3E43C4 on nbp_medical_facilities_app (expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);
create index IX_E076991A on nbp_medical_facilities_app (status, userId);
create unique index IX_EB003D70 on nbp_medical_facilities_app (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_34A4D661 on nbp_medical_home_info (medicalFacilitiesAppId);
create unique index IX_95144B99 on nbp_medical_home_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6FED7926 on nbp_medical_maternity_home (medicalFacilitiesAppId);
create unique index IX_29DA835E on nbp_medical_maternity_home (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D791526E on nbp_medical_no_of_patient (medicalFacilitiesAppId);
create unique index IX_397024A6 on nbp_medical_no_of_patient (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7164D1C8 on nbp_medical_nurse_detail (medicalFacilitiesAppId);
create unique index IX_F7BD9E00 on nbp_medical_nurse_detail (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E3EC84A5 on nbp_medical_nurse_info (medicalFacilitiesAppId);
create unique index IX_B0807DDD on nbp_medical_nurse_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_56AF138E on nbp_medical_nursing_staff (medicalFacilitiesAppId);
create unique index IX_A7105C6 on nbp_medical_nursing_staff (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7DA51C3 on nbp_medical_sign_info (medicalFacilitiesAppId);
create unique index IX_C36448FB on nbp_medical_sign_info (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_39879356 on nbp_medical_staff_premises (medicalFacilitiesAppId);