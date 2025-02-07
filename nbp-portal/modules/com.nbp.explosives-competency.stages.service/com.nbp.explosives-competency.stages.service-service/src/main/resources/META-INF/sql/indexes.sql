create index IX_720351FC on nbp_explosive_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_68E6632B on nbp_explosive_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_C51AD730 on nbp_explosive_app_stages (explosiveApplicationId);
create index IX_DD5947DD on nbp_explosive_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create unique index IX_4E7BC20C on nbp_explosive_app_stages (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_58067807 on nbp_explosive_commision_decis (caseId[$COLUMN_LENGTH:75$]);
create unique index IX_309F585E on nbp_explosive_commision_decis (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_74DB6B5 on nbp_explosive_issu_lic (caseId[$COLUMN_LENGTH:75$]);
create unique index IX_24C090C on nbp_explosive_issu_lic (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_11A3D5CF on nbp_explosive_rev_ver (caseId[$COLUMN_LENGTH:75$]);
create unique index IX_AF066E26 on nbp_explosive_rev_ver (uuid_[$COLUMN_LENGTH:75$], groupId);