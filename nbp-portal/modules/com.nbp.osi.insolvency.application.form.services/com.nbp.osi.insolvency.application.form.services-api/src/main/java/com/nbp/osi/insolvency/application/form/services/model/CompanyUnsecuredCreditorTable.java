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
 * The table class for the &quot;nbp_osi_unsecured_cred&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyUnsecuredCreditor
 * @generated
 */
public class CompanyUnsecuredCreditorTable
	extends BaseTable<CompanyUnsecuredCreditorTable> {

	public static final CompanyUnsecuredCreditorTable INSTANCE =
		new CompanyUnsecuredCreditorTable();

	public final Column<CompanyUnsecuredCreditorTable, Long>
		companyUnsecuredCreditorId = createColumn(
			"companyUnsecuredCreditorId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CompanyUnsecuredCreditorTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyUnsecuredCreditorTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyUnsecuredCreditorTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyUnsecuredCreditorTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyUnsecuredCreditorTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanyUnsecuredCreditorTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanyUnsecuredCreditorTable, String>
		unsecuredCreditor = createColumn(
			"unsecuredCreditor", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyUnsecuredCreditorTable, String> unsecuredDebtor =
		createColumn(
			"unsecuredDebtor", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyUnsecuredCreditorTable, String>
		unsecuredPurpose = createColumn(
			"unsecuredPurpose", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyUnsecuredCreditorTable, String>
		unsecuredLiabilty = createColumn(
			"unsecuredLiabilty", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyUnsecuredCreditorTable, String>
		unsecuredCounter = createColumn(
			"unsecuredCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyUnsecuredCreditorTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private CompanyUnsecuredCreditorTable() {
		super("nbp_osi_unsecured_cred", CompanyUnsecuredCreditorTable::new);
	}

}