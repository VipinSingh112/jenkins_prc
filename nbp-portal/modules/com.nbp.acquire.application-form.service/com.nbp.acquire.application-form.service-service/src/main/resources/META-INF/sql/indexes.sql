create index IX_BE951D3F on nbp_acquire_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_BDB971C9 on nbp_acquire_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_A59BCBCA on nbp_acquire_application (status, userId);
create unique index IX_B0257020 on nbp_acquire_application (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A5CC5025 on nbp_acquire_details (acquireApplicationId);

create index IX_A53FFFC5 on nbp_acquire_document_list (documentType[$COLUMN_LENGTH:75$]);

create index IX_8B282D29 on nbp_acquire_land_details (acquireApplicationId);

create index IX_22B306A3 on nbp_acquire_land_employment (acquireApplicationId);

create index IX_B520041D on nbp_acquire_land_prop_details (acquireApplicationId);

create index IX_30CC46FD on nbp_acquire_payment_plan (acquireApplicationId);

create index IX_53C65EA1 on nbp_acquire_prop_details (acquireApplicationId);

create index IX_CF9CC1E1 on nbp_acquire_stage (acquireApplicationId);