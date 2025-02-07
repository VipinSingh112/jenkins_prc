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
 * The table class for the &quot;nbp_sez_zone_sub_check_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneSubCheckInfo
 * @generated
 */
public class SezZoneSubCheckInfoTable
	extends BaseTable<SezZoneSubCheckInfoTable> {

	public static final SezZoneSubCheckInfoTable INSTANCE =
		new SezZoneSubCheckInfoTable();

	public final Column<SezZoneSubCheckInfoTable, Long> sezZoneSubCheckInfoId =
		createColumn(
			"sezZoneSubCheckInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezZoneSubCheckInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, String> generalRequirement =
		createColumn(
			"generalRequirement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, String> companyInformation =
		createColumn(
			"companyInformation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, String> swornState =
		createColumn(
			"swornState", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, String> occupancyRequirement =
		createColumn(
			"occupancyRequirement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, String> approvals =
		createColumn(
			"approvals", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, String> signatureName =
		createColumn(
			"signatureName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, Date> signatureDate =
		createColumn(
			"signatureDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneSubCheckInfoTable, Long> sezStatusApplicationId =
		createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezZoneSubCheckInfoTable() {
		super("nbp_sez_zone_sub_check_info", SezZoneSubCheckInfoTable::new);
	}

}