create index IX_6FFDD2D2 on nbp_sez_payment_confirm (caseId[$COLUMN_LENGTH:75$]);

create index IX_4C6F631E on nbp_sez_pre_approval (caseId[$COLUMN_LENGTH:75$]);

create index IX_C60C852 on nbp_sez_status_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_9938695 on nbp_sez_status_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_ADDB1051 on nbp_sez_status_app_stages (sezStatusApplicationId);
create index IX_3B3851AD on nbp_sez_status_app_stages (stageName[$COLUMN_LENGTH:75$]);
create unique index IX_79CCA462 on nbp_sez_status_app_stages (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_906E0918 on nbp_sez_status_board_deci (caseId[$COLUMN_LENGTH:75$]);
create unique index IX_AD71486F on nbp_sez_status_board_deci (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_86FBF950 on nbp_sez_status_committe_deci (caseId[$COLUMN_LENGTH:75$]);
create unique index IX_5E0780A7 on nbp_sez_status_committe_deci (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_68DB8337 on nbp_sez_status_desk_verificat (sezApplicationId);

create index IX_1E732BB2 on nbp_sez_status_licence_issu (caseId[$COLUMN_LENGTH:75$]);
create unique index IX_AE5F3109 on nbp_sez_status_licence_issu (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_442F6B4E on nbp_sez_status_welcome_pack (caseId[$COLUMN_LENGTH:75$]);
create unique index IX_892014A5 on nbp_sez_status_welcome_pack (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9E0159D8 on nbp_sez_status_wfh_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_47DEACCF on nbp_sez_status_wfh_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_D91087D7 on nbp_sez_status_wfh_app_stages (sezStatusApplicationId);
create index IX_41191867 on nbp_sez_status_wfh_app_stages (stageName[$COLUMN_LENGTH:75$]);