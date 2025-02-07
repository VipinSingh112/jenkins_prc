create index IX_EEFB7973 on nbp_osi_affiliation (osiApplicationId);

create index IX_564FF1C8 on nbp_osi_applicant_details (osiApplicationId);
create unique index IX_D16707C4 on nbp_osi_applicant_details (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_74D4DA70 on nbp_osi_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_33DF48D9 on nbp_osi_application (applicationStatus);
create index IX_DF68B23D on nbp_osi_application (applicationType[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);
create index IX_26CC0938 on nbp_osi_application (caseId[$COLUMN_LENGTH:75$]);
create index IX_74259AFF on nbp_osi_application (status);
create index IX_326E4B5F on nbp_osi_application (userId, applicationStatus);
create index IX_EA1EF039 on nbp_osi_application (userId, status);

create index IX_B7C72AAE on nbp_osi_counselling (osiApplicationId);

create index IX_B8C6227B on nbp_osi_current_stage (osiApplicationId);

create index IX_DAA0656E on nbp_osi_education_details (osiApplicationId);
create unique index IX_826C2CEA on nbp_osi_education_details (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_B4B01710 on nbp_osi_official_use (osiApplicationId);