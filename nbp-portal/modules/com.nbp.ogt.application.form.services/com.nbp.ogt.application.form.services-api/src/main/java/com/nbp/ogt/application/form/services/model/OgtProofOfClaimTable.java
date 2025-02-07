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
 * The table class for the &quot;nbp_ogt_proof_of_claim&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OgtProofOfClaim
 * @generated
 */
public class OgtProofOfClaimTable extends BaseTable<OgtProofOfClaimTable> {

	public static final OgtProofOfClaimTable INSTANCE =
		new OgtProofOfClaimTable();

	public final Column<OgtProofOfClaimTable, Long> ogtProofOfClaimId =
		createColumn(
			"ogtProofOfClaimId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OgtProofOfClaimTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimProofMatter =
		createColumn(
			"claimProofMatter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimDebtorName =
		createColumn(
			"claimDebtorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimantName =
		createColumn(
			"claimantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimSentAddress =
		createColumn(
			"claimSentAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimSentPhoneNum =
		createColumn(
			"claimSentPhoneNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimSentFaxNo =
		createColumn(
			"claimSentFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimSentEmailAddr =
		createColumn(
			"claimSentEmailAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimCompName =
		createColumn(
			"claimCompName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimCertifyCheck =
		createColumn(
			"claimCertifyCheck", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimCompPosition =
		createColumn(
			"claimCompPosition", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimName = createColumn(
		"claimName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimByCredDebtor =
		createColumn(
			"claimByCredDebtor", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, Date> claimDateAppli =
		createColumn(
			"claimDateAppli", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimByDebtTotalVal =
		createColumn(
			"claimByDebtTotalVal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimByDebtStatement =
		createColumn(
			"claimByDebtStatement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimCategory =
		createColumn(
			"claimCategory", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimUnsecured =
		createColumn(
			"claimUnsecured", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimRegardingAmt =
		createColumn(
			"claimRegardingAmt", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> indicateCategoryOne =
		createColumn(
			"indicateCategoryOne", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> indicateCategoryTwo =
		createColumn(
			"indicateCategoryTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> indicateCategoryThree =
		createColumn(
			"indicateCategoryThree", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> indicateCategoryFour =
		createColumn(
			"indicateCategoryFour", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> otherPleaseSpecify =
		createColumn(
			"otherPleaseSpecify", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimSecured =
		createColumn(
			"claimSecured", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimSecuredOne =
		createColumn(
			"claimSecuredOne", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> claimDesc = createColumn(
		"claimDesc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> aboveNamedCreditor =
		createColumn(
			"aboveNamedCreditor", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> paymentDetailDesc =
		createColumn(
			"paymentDetailDesc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, String> inCaseOfBankruptcy =
		createColumn(
			"inCaseOfBankruptcy", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtProofOfClaimTable, Long> ogtApplicationId =
		createColumn(
			"ogtApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OgtProofOfClaimTable() {
		super("nbp_ogt_proof_of_claim", OgtProofOfClaimTable::new);
	}

}