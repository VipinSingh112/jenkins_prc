create index IX_D449C24B on nbp_insolv_com_security_tot (osiInsolvencyId);

create index IX_10DD8341 on nbp_not_used_security (osiInsolvencyId);

create index IX_B18DD863 on nbp_osi_assessment_detail (osiInsolvencyId);

create index IX_C96F06C9 on nbp_osi_comp_financial_pos (osiInsolvencyId);

create index IX_A028651 on nbp_osi_company_details (osiInsolvencyId);

create index IX_DB6F3F5B on nbp_osi_company_secretary (osiInsolvencyId);

create index IX_1E72E25B on nbp_osi_directors_form (osiInsolvencyId);

create index IX_B33C3378 on nbp_osi_financial_position (osiInsolvencyId);

create index IX_706FE360 on nbp_osi_grand_total (osiInsolvencyId);

create index IX_C819E3CA on nbp_osi_insolv_application (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_5F0F541E on nbp_osi_insolv_application (caseId[$COLUMN_LENGTH:500$]);
create index IX_3ED44E7F on nbp_osi_insolv_application (status, applicantStatus[$COLUMN_LENGTH:75$]);
create index IX_C6A8891F on nbp_osi_insolv_application (status, userId);

create index IX_F20C2BB3 on nbp_osi_insolv_current_stage (osiInsolvencyId);

create index IX_4ADDB4E5 on nbp_osi_insolv_payment (osiInsolvencyId);

create index IX_FF997A14 on nbp_osi_insolv_tot_assets (osiInsolvencyId);

create index IX_13A0BC79 on nbp_osi_insolv_tot_expense (osiInsolvencyId);

create index IX_C1F31197 on nbp_osi_insolv_tot_liablity (osiInsolvencyId);

create index IX_C2E28AC4 on nbp_osi_insolv_total_liab (osiInsolvencyId);

create index IX_AB52418 on nbp_osi_insolvecy_app_payment (osiInsolvencyId);

create index IX_4E3A473B on nbp_osi_insolvecy_asses_sign (osiInsolvencyId);

create index IX_6B173BBC on nbp_osi_insolvecy_det_asset (osiInsolvencyId);

create index IX_12C33A14 on nbp_osi_liability_detail (osiInsolvencyId);

create index IX_534D4EEB on nbp_osi_monthly_expense (osiInsolvencyId);

create index IX_1449B57C on nbp_osi_monthly_income (osiInsolvencyId);

create index IX_82276BB on nbp_osi_not_used_security (osiInsolvencyId);

create index IX_40B62C88 on nbp_osi_preferred_detail (osiInsolvencyId);

create index IX_70BB6929 on nbp_osi_secured_creditor (osiInsolvencyId);

create index IX_D56FE926 on nbp_osi_shareholder (osiInsolvencyId);

create index IX_4327163A on nbp_osi_subject_data (osiInsolvencyId);

create index IX_1EFB73F4 on nbp_osi_total_indi_assets (osiInsolvencyId);

create index IX_57A156B4 on nbp_osi_unsec_creditor (osiInsolvencyId);

create index IX_EA0E473E on nbp_osi_unsecured_cred (osiInsolvencyId);

create index IX_FB8471AC on nbp_osi_used_as_security (osiInsolvencyId);

create index IX_80224D4F on nbp_osi_used_security (osiInsolvencyId);

create index IX_160287D0 on nbp_osi_ver_company (osiInsolvencyId);

create index IX_73557EBA on nbp_osi_ver_request_detail (osiInsolvencyId);