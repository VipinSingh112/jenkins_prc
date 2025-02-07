/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_zone_user_under_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneUserUnderInfo
 * @generated
 */
public class SezZoneUserUnderInfoTable
	extends BaseTable<SezZoneUserUnderInfoTable> {

	public static final SezZoneUserUnderInfoTable INSTANCE =
		new SezZoneUserUnderInfoTable();

	public final Column<SezZoneUserUnderInfoTable, Long>
		sezZoneUserUnderInfoId = createColumn(
			"sezZoneUserUnderInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezZoneUserUnderInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, String> declarantTitle =
		createColumn(
			"declarantTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, String> declarantName =
		createColumn(
			"declarantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, String> declarantTeleNum =
		createColumn(
			"declarantTeleNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, String> declarantEmail =
		createColumn(
			"declarantEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, Date>
		applicantSignatureDate = createColumn(
			"applicantSignatureDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, String> publicNotaryName =
		createColumn(
			"publicNotaryName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, Date>
		publicNotarySignatureDate = createColumn(
			"publicNotarySignatureDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneUserUnderInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezZoneUserUnderInfoTable() {
		super("nbp_sez_zone_user_under_info", SezZoneUserUnderInfoTable::new);
	}

}