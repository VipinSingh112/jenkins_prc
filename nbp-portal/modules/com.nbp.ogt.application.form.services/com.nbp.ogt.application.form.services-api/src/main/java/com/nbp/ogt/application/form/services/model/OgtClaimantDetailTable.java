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
 * The table class for the &quot;nbp_ogt_claimant_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimantDetail
 * @generated
 */
public class OgtClaimantDetailTable extends BaseTable<OgtClaimantDetailTable> {

	public static final OgtClaimantDetailTable INSTANCE =
		new OgtClaimantDetailTable();

	public final Column<OgtClaimantDetailTable, Long> ogtClaimantDetailId =
		createColumn(
			"ogtClaimantDetailId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OgtClaimantDetailTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, String> claimantName =
		createColumn(
			"claimantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, String> claimantFirstName =
		createColumn(
			"claimantFirstName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, String> claimantLastName =
		createColumn(
			"claimantLastName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, String> claimantCompanyName =
		createColumn(
			"claimantCompanyName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, String> claimantAddress =
		createColumn(
			"claimantAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, String> claimantEmailAddr =
		createColumn(
			"claimantEmailAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, String> claimantTeleNum =
		createColumn(
			"claimantTeleNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, String> claimantFaxNo =
		createColumn(
			"claimantFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, Date> claimantDate =
		createColumn(
			"claimantDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, String> claimantTrn =
		createColumn(
			"claimantTrn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, String> claimantRelative =
		createColumn(
			"claimantRelative", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtClaimantDetailTable, Long> ogtApplicationId =
		createColumn(
			"ogtApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OgtClaimantDetailTable() {
		super("nbp_ogt_claimant_detail", OgtClaimantDetailTable::new);
	}

}