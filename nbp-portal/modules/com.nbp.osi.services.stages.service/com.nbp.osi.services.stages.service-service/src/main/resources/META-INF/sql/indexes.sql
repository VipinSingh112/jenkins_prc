create index IX_138E8B80 on nbp_osi_service_report (caseId[$COLUMN_LENGTH:75$]);

create index IX_5034B0C3 on nbp_osi_services_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_EFFC7AC4 on nbp_osi_services_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_1FC0590D on nbp_osi_services_app_stages (osiServciesApplicationId);
create index IX_132CE49C on nbp_osi_services_app_stages (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_35B98ED3 on nbp_osi_services_app_stages (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_CABBE79B on nbp_osi_services_certi_of_issu (caseId[$COLUMN_LENGTH:75$]);

create index IX_295E19D1 on nbp_osi_services_recommen (caseId[$COLUMN_LENGTH:75$]);