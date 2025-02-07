create index IX_A3008C4D on nbp_entity_info (entityNumber[$COLUMN_LENGTH:75$]);
create unique index IX_7D205683 on nbp_entity_info (uuid_[$COLUMN_LENGTH:75$], groupId);