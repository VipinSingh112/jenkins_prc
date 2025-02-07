/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ogt_claim_to_spouse&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToSpouse
 * @generated
 */
public class OgtClaimToSpouseTable extends BaseTable<OgtClaimToSpouseTable> {

	public static final OgtClaimToSpouseTable INSTANCE =
		new OgtClaimToSpouseTable();

	public final Column<OgtClaimToSpouseTable, Long> ogtClaimToSpouseId =
		createColumn(
			"ogtClaimToSpouseId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OgtClaimToSpouseTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, Date> spouseDate = createColumn(
		"spouseDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, String> claimSpouseDesc =
		createColumn(
			"claimSpouseDesc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, String> nameCompletionForm =
		createColumn(
			"nameCompletionForm", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, Date> nameCompletionDate =
		createColumn(
			"nameCompletionDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, String> compPersonAddress =
		createColumn(
			"compPersonAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, String> justicePeaceParish =
		createColumn(
			"justicePeaceParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, String> nameJusticeOfPeace =
		createColumn(
			"nameJusticeOfPeace", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, Date> nameJusticeDate =
		createColumn(
			"nameJusticeDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, String> officialAmtClaim =
		createColumn(
			"officialAmtClaim", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, String> officialSection =
		createColumn(
			"officialSection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, String> officialAmtVoting =
		createColumn(
			"officialAmtVoting", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, Date> officialAmtVotingDate =
		createColumn(
			"officialAmtVotingDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, String> officialPayment =
		createColumn(
			"officialPayment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, Date> officialPaymentDate =
		createColumn(
			"officialPaymentDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimToSpouseTable, Long> ogtApplicationId =
		createColumn(
			"ogtApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OgtClaimToSpouseTable() {
		super("nbp_ogt_claim_to_spouse", OgtClaimToSpouseTable::new);
	}

}