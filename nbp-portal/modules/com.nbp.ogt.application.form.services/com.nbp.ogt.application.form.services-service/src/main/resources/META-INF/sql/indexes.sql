create index IX_3CA82BA on nbp_ogt_applications (applicationNumber[$COLUMN_LENGTH:75$]);
create index IX_FD8CAB2E on nbp_ogt_applications (caseId[$COLUMN_LENGTH:500$]);
create index IX_C411AE40 on nbp_ogt_applications (entityId[$COLUMN_LENGTH:75$], caseId[$COLUMN_LENGTH:500$]);
create index IX_116B4007 on nbp_ogt_applications (entityId[$COLUMN_LENGTH:75$], status);
create index IX_1E25D02F on nbp_ogt_applications (status, userId);
create index IX_DBE9C3AC on nbp_ogt_applications (typeOfApplicant[$COLUMN_LENGTH:75$], expiredLicenseAppNumber[$COLUMN_LENGTH:75$]);

create index IX_8A2C5A27 on nbp_ogt_claim_property (ogtApplicationId);

create index IX_E95A4639 on nbp_ogt_claim_to_spouse (ogtApplicationId);

create index IX_14377708 on nbp_ogt_claimant_detail (ogtApplicationId);

create index IX_9A6DDBDB on nbp_ogt_current_stage (ogtApplicationId);
create unique index IX_23CFABCE on nbp_ogt_current_stage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_FEE17377 on nbp_ogt_insolvent_person_det (ogtApplicationId);

create index IX_A6657E9E on nbp_ogt_proof_of_claim (ogtApplicationId);

create index IX_DA5C51AB on nbp_ogt_section_b (ogtApplicationId);