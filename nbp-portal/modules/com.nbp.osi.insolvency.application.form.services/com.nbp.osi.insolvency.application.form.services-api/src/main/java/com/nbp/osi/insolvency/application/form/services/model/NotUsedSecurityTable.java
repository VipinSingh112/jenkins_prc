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
 * The table class for the &quot;nbp_not_used_security&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NotUsedSecurity
 * @generated
 */
public class NotUsedSecurityTable extends BaseTable<NotUsedSecurityTable> {

	public static final NotUsedSecurityTable INSTANCE =
		new NotUsedSecurityTable();

	public final Column<NotUsedSecurityTable, Long> notUsedSecurityId =
		createColumn(
			"notUsedSecurityId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<NotUsedSecurityTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NotUsedSecurityTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NotUsedSecurityTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NotUsedSecurityTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NotUsedSecurityTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NotUsedSecurityTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NotUsedSecurityTable, String> realProperty =
		createColumn(
			"realProperty", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NotUsedSecurityTable, String> notUsedLocation =
		createColumn(
			"notUsedLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NotUsedSecurityTable, String> notUsedDescription =
		createColumn(
			"notUsedDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NotUsedSecurityTable, String> notUsedCounter =
		createColumn(
			"notUsedCounter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NotUsedSecurityTable, String> notUsedValue =
		createColumn(
			"notUsedValue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NotUsedSecurityTable, String> notNetValue =
		createColumn(
			"notNetValue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NotUsedSecurityTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NotUsedSecurityTable() {
		super("nbp_not_used_security", NotUsedSecurityTable::new);
	}

}