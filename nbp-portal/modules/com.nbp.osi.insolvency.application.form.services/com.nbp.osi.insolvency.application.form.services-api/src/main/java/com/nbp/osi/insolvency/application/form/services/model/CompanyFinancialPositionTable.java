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
 * The table class for the &quot;nbp_osi_comp_financial_pos&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyFinancialPosition
 * @generated
 */
public class CompanyFinancialPositionTable
	extends BaseTable<CompanyFinancialPositionTable> {

	public static final CompanyFinancialPositionTable INSTANCE =
		new CompanyFinancialPositionTable();

	public final Column<CompanyFinancialPositionTable, Long>
		companyFinancialPositionId = createColumn(
			"companyFinancialPositionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CompanyFinancialPositionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, String> companySecured =
		createColumn(
			"companySecured", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, String>
		companyUnsecured = createColumn(
			"companyUnsecured", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, String> companyAmount =
		createColumn(
			"companyAmount", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, String> companyDeficit =
		createColumn(
			"companyDeficit", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, String> companyNetValue =
		createColumn(
			"companyNetValue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, String>
		companyAssetValue = createColumn(
			"companyAssetValue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, String>
		companyDisposableAsset = createColumn(
			"companyDisposableAsset", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, String> companySurplus =
		createColumn(
			"companySurplus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, String> companySummary =
		createColumn(
			"companySummary", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, String> companyProposal =
		createColumn(
			"companyProposal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, String>
		companyTrusteeResponse = createColumn(
			"companyTrusteeResponse", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyFinancialPositionTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private CompanyFinancialPositionTable() {
		super("nbp_osi_comp_financial_pos", CompanyFinancialPositionTable::new);
	}

}