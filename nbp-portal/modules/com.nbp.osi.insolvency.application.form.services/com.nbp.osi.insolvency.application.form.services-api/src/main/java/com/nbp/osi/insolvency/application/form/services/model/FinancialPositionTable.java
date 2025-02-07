/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_financial_position&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FinancialPosition
 * @generated
 */
public class FinancialPositionTable extends BaseTable<FinancialPositionTable> {

	public static final FinancialPositionTable INSTANCE =
		new FinancialPositionTable();

	public final Column<FinancialPositionTable, Long> financialPositionId =
		createColumn(
			"financialPositionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FinancialPositionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, String> securedLiabilities =
		createColumn(
			"securedLiabilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, String> unsecuredLiabilities =
		createColumn(
			"unsecuredLiabilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, String> amountLiabilities =
		createColumn(
			"amountLiabilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, String> deficitLiabilities =
		createColumn(
			"deficitLiabilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, String> assestsUsedAsSecurity =
		createColumn(
			"assestsUsedAsSecurity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, String>
		assestsNotUsedAsSecurity = createColumn(
			"assestsNotUsedAsSecurity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, String> assestsDisposable =
		createColumn(
			"assestsDisposable", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, String> assestsSurplus =
		createColumn(
			"assestsSurplus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, String> assestsSummary =
		createColumn(
			"assestsSummary", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, String> assestsProposal =
		createColumn(
			"assestsProposal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, String> assestsTrusteeResponse =
		createColumn(
			"assestsTrusteeResponse", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FinancialPositionTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FinancialPositionTable() {
		super("nbp_osi_financial_position", FinancialPositionTable::new);
	}

}