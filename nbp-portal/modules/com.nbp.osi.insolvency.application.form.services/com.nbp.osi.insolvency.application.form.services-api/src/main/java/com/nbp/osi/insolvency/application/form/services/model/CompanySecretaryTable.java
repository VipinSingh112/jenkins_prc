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
 * The table class for the &quot;nbp_osi_company_secretary&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CompanySecretary
 * @generated
 */
public class CompanySecretaryTable extends BaseTable<CompanySecretaryTable> {

	public static final CompanySecretaryTable INSTANCE =
		new CompanySecretaryTable();

	public final Column<CompanySecretaryTable, Long> companySecretaryId =
		createColumn(
			"companySecretaryId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CompanySecretaryTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanySecretaryTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanySecretaryTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanySecretaryTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanySecretaryTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanySecretaryTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanySecretaryTable, String> secretaryName =
		createColumn(
			"secretaryName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanySecretaryTable, Date> secretaryDate =
		createColumn(
			"secretaryDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanySecretaryTable, String> secretaryOccupation =
		createColumn(
			"secretaryOccupation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanySecretaryTable, String> secretaryContactNum =
		createColumn(
			"secretaryContactNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanySecretaryTable, String> secretaryAddress =
		createColumn(
			"secretaryAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanySecretaryTable, String> secretaryCounter =
		createColumn(
			"secretaryCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanySecretaryTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private CompanySecretaryTable() {
		super("nbp_osi_company_secretary", CompanySecretaryTable::new);
	}

}