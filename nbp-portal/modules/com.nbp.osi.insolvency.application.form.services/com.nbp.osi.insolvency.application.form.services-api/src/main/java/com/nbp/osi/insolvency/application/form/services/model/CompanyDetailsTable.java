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
 * The table class for the &quot;nbp_osi_company_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyDetails
 * @generated
 */
public class CompanyDetailsTable extends BaseTable<CompanyDetailsTable> {

	public static final CompanyDetailsTable INSTANCE =
		new CompanyDetailsTable();

	public final Column<CompanyDetailsTable, Long> companyDetailsId =
		createColumn(
			"companyDetailsId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CompanyDetailsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, Date> companyDate = createColumn(
		"companyDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, String> companyName = createColumn(
		"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, String> companyAddress =
		createColumn(
			"companyAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, String> companyEmail =
		createColumn(
			"companyEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, String> companyTelNum =
		createColumn(
			"companyTelNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, String> companyTrn = createColumn(
		"companyTrn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, Date> companyDateInco =
		createColumn(
			"companyDateInco", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, String> companyTypeOfCo =
		createColumn(
			"companyTypeOfCo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, String> companyCore = createColumn(
		"companyCore", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, String> companyEmployees =
		createColumn(
			"companyEmployees", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, Date> companyLastReturn =
		createColumn(
			"companyLastReturn", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, String> companyTurnover =
		createColumn(
			"companyTurnover", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, String> companyShares =
		createColumn(
			"companyShares", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyDetailsTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private CompanyDetailsTable() {
		super("nbp_osi_company_details", CompanyDetailsTable::new);
	}

}