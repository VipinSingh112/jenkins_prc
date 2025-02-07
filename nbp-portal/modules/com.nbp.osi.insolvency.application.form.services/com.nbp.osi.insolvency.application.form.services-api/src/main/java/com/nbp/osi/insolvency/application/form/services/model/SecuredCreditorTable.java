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
 * The table class for the &quot;nbp_osi_liability_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SecuredCreditor
 * @generated
 */
public class SecuredCreditorTable extends BaseTable<SecuredCreditorTable> {

	public static final SecuredCreditorTable INSTANCE =
		new SecuredCreditorTable();

	public final Column<SecuredCreditorTable, Long> securedCreditorId =
		createColumn(
			"securedCreditorId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SecuredCreditorTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SecuredCreditorTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SecuredCreditorTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SecuredCreditorTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SecuredCreditorTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SecuredCreditorTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SecuredCreditorTable, String> securedCreditorName =
		createColumn(
			"securedCreditorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SecuredCreditorTable, String> securedCreditorAsset =
		createColumn(
			"securedCreditorAsset", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SecuredCreditorTable, String> securedCreditorLiability =
		createColumn(
			"securedCreditorLiability", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SecuredCreditorTable, String> securedCreditorPayment =
		createColumn(
			"securedCreditorPayment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SecuredCreditorTable, String> securedCreditorCounter =
		createColumn(
			"securedCreditorCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SecuredCreditorTable, Date> securedCreditorDate =
		createColumn(
			"securedCreditorDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SecuredCreditorTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private SecuredCreditorTable() {
		super("nbp_osi_liability_detail", SecuredCreditorTable::new);
	}

}