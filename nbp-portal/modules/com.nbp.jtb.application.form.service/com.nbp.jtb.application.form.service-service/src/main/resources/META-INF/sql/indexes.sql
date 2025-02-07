create index IX_35CF9E19 on nbp_jtb_acco_gen_dec (jtbApplicationId);
create unique index IX_85E602C8 on nbp_jtb_acco_gen_dec (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_67631746 on nbp_jtb_acco_home_stay_lic (jtbApplicationId);
create unique index IX_B26FE335 on nbp_jtb_acco_home_stay_lic (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_87D6BAD7 on nbp_jtb_acco_licence (jtbApplicationId);
create unique index IX_4BE93706 on nbp_jtb_acco_licence (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6A4E3419 on nbp_jtb_acco_non_hotel_gen (jtbApplicationId);
create unique index IX_D51218C8 on nbp_jtb_acco_non_hotel_gen (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6CCA904F on nbp_jtb_acco_non_hotel_lic (jtbApplicationId);
create unique index IX_DC440A7E on nbp_jtb_acco_non_hotel_lic (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_4D7BC276 on nbp_jtb_applications (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_F2A5E8F2 on nbp_jtb_applications (caseId[$COLUMN_LENGTH:500$]);
create index IX_E778CAC0 on nbp_jtb_applications (jtbTransactionTypeVal[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);
create index IX_34E89076 on nbp_jtb_applications (status, typeOfApplication[$COLUMN_LENGTH:75$]);
create index IX_BD1709F3 on nbp_jtb_applications (status, userId);
create unique index IX_C7A0AE49 on nbp_jtb_applications (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_F0B0AD06 on nbp_jtb_attract_detail (jtbApplicationId);

create index IX_AE5997F8 on nbp_jtb_attract_gen_dec (jtbApplicationId);

create index IX_35E44465 on nbp_jtb_bike_rental (jtbApplicationId);

create index IX_55BC2731 on nbp_jtb_branch_detail (jtbApplicationId);

create index IX_46B39B97 on nbp_jtb_car_rent_condition (jtbApplicationId);

create index IX_F870C98D on nbp_jtb_car_rent_licence (jtbApplicationId);

create index IX_1B8173B8 on nbp_jtb_car_rental_licence (jtbApplicationId);

create index IX_177AD3C4 on nbp_jtb_contract_carriage (jtbApplicationId);

create index IX_DE33FB46 on nbp_jtb_craft_applicant (jtbApplicationId);

create index IX_105E36A4 on nbp_jtb_craft_employee (jtbApplicationId);

create index IX_339A59B0 on nbp_jtb_craft_trader_permit (jtbApplicationId);

create index IX_49A45D5B on nbp_jtb_current_stage (jtbApplicationId);

create index IX_5FE9B14B on nbp_jtb_domestic_service (jtbApplicationId);

create index IX_573D42FC on nbp_jtb_domestic_tour (jtbApplicationId);

create index IX_18541A8C on nbp_jtb_list_driver (jtbApplicationId);

create index IX_B4EBF33D on nbp_jtb_list_value_regst (jtbApplicationId);

create index IX_A181D78B on nbp_jtb_non_hotel_req_lic (jtbApplicationId);

create index IX_8749C029 on nbp_jtb_payment (jtbApplicationId);

create index IX_96280799 on nbp_jtb_place_interest (jtbApplicationId);

create index IX_2255D2EF on nbp_jtb_tarvel_agency (jtbApplicationId);

create index IX_688A63CB on nbp_jtb_travel_halt_app (jtbApplicationId);

create index IX_80D8AB0D on nbp_jtb_water_employee (jtbApplicationId);

create index IX_7FDED263 on nbp_jtb_water_general (jtbApplicationId);

create index IX_9C7C0D7E on nbp_jtb_water_required (jtbApplicationId);

create index IX_F65AB034 on nbp_jtb_water_sport_operate (jtbApplicationId);