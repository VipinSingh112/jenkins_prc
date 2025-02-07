create index IX_6D65514C on nbp_creative_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_3CCAD5DB on nbp_creative_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_5D92F826 on nbp_creative_app_stages (creativeApplicationId);
create index IX_317972D on nbp_creative_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create unique index IX_A7E6615C on nbp_creative_app_stages (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_B828F2C7 on nbp_creative_desk_veri (creativeApplicationId);

create index IX_3FCD7E26 on nbp_creative_inspection (caseId[$COLUMN_LENGTH:75$]);
create index IX_951E92E5 on nbp_creative_inspection (creativeApplicationId);
create index IX_F6E7800C on nbp_creative_inspection (status[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:75$]);
create index IX_D1C67EBB on nbp_creative_inspection (status[$COLUMN_LENGTH:75$], creativeApplicationId, slotBookedByUser);

create index IX_E3707E8D on nbp_creative_permit (caseId[$COLUMN_LENGTH:75$]);