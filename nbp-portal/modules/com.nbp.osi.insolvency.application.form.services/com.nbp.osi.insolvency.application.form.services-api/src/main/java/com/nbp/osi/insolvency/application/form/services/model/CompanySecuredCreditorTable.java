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
 * The table class for the &quot;nbp_osi_secured_creditor&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CompanySecuredCreditor
 * @generated
 */
public class CompanySecuredCreditorTable
	extends BaseTable<CompanySecuredCreditorTable> {

	public static final CompanySecuredCreditorTable INSTANCE =
		new CompanySecuredCreditorTable();

	public final Column<CompanySecuredCreditorTable, Long>
		companySecuredCreditorId = createColumn(
			"companySecuredCreditorId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CompanySecuredCreditorTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanySecuredCreditorTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanySecuredCreditorTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanySecuredCreditorTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanySecuredCreditorTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanySecuredCreditorTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanySecuredCreditorTable, String> securedCreditor =
		createColumn(
			"securedCreditor", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanySecuredCreditorTable, String> securedSecurity =
		createColumn(
			"securedSecurity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanySecuredCreditorTable, String> securedPurpose =
		createColumn(
			"securedPurpose", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanySecuredCreditorTable, String> securedLiabilty =
		createColumn(
			"securedLiabilty", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanySecuredCreditorTable, String> comSecurityValue =
		createColumn(
			"comSecurityValue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanySecuredCreditorTable, String>
		comSecurityCounter = createColumn(
			"comSecurityCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanySecuredCreditorTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private CompanySecuredCreditorTable() {
		super("nbp_osi_secured_creditor", CompanySecuredCreditorTable::new);
	}

}