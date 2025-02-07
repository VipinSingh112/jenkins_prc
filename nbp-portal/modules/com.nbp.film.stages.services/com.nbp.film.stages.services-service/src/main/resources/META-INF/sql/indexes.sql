create index IX_7EF7E817 on nbp_film_app_stages (caseId[$COLUMN_LENGTH:75$], stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_C928FF0 on nbp_film_app_stages (caseId[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);
create index IX_F8BFD506 on nbp_film_app_stages (filmApplicationId);
create index IX_9E8728F8 on nbp_film_app_stages (stageName[$COLUMN_LENGTH:75$], stageStatus[$COLUMN_LENGTH:75$]);

create index IX_7468A9EE on nbp_film_desk_verification (filmApplicationId, status[$COLUMN_LENGTH:75$]);

create index IX_1B712276 on nbp_film_full_registration (caseId[$COLUMN_LENGTH:75$]);
create index IX_D8752C2D on nbp_film_full_registration (registrationNumber[$COLUMN_LENGTH:75$]);

create index IX_F0E89814 on nbp_film_payment_confirm (caseId[$COLUMN_LENGTH:75$]);

create index IX_3DBB7E60 on nbp_film_register (caseId[$COLUMN_LENGTH:75$]);