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
 * The table class for the &quot;nbp_osi_used_security&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see UsedSecurity
 * @generated
 */
public class UsedSecurityTable extends BaseTable<UsedSecurityTable> {

	public static final UsedSecurityTable INSTANCE = new UsedSecurityTable();

	public final Column<UsedSecurityTable, Long> usedSecurityId = createColumn(
		"usedSecurityId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<UsedSecurityTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, String> assetType = createColumn(
		"assetType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, String> securityHolder =
		createColumn(
			"securityHolder", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, String> securityDetail =
		createColumn(
			"securityDetail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, String> securityValue = createColumn(
		"securityValue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, String> securityLiability =
		createColumn(
			"securityLiability", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, String> securityNetValue =
		createColumn(
			"securityNetValue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, String> securityCounter =
		createColumn(
			"securityCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<UsedSecurityTable, Long> osiInsolvencyId = createColumn(
		"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private UsedSecurityTable() {
		super("nbp_osi_used_security", UsedSecurityTable::new);
	}

}