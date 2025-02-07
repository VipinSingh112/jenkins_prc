/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_factories_cert_regis&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesCerticateOfRegis
 * @generated
 */
public class FactoriesCerticateOfRegisTable
	extends BaseTable<FactoriesCerticateOfRegisTable> {

	public static final FactoriesCerticateOfRegisTable INSTANCE =
		new FactoriesCerticateOfRegisTable();

	public final Column<FactoriesCerticateOfRegisTable, Long>
		factoriesCerticateOfRegisId = createColumn(
			"factoriesCerticateOfRegisId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FactoriesCerticateOfRegisTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, String>
		nameOfEstablishment = createColumn(
			"nameOfEstablishment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, String>
		procuctCatAndName = createColumn(
			"procuctCatAndName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, Date>
		certificateIssueDate = createColumn(
			"certificateIssueDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, Date> dateOfExpiration =
		createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, String> registration =
		createColumn(
			"registration", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesCerticateOfRegisTable, Long> docFileEntry =
		createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FactoriesCerticateOfRegisTable() {
		super("nbp_factories_cert_regis", FactoriesCerticateOfRegisTable::new);
	}

}