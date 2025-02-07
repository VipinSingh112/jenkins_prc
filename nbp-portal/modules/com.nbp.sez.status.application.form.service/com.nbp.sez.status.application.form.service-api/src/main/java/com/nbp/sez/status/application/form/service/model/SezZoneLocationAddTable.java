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
 * The table class for the &quot;nbp_sez_zone_location_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneLocationAdd
 * @generated
 */
public class SezZoneLocationAddTable
	extends BaseTable<SezZoneLocationAddTable> {

	public static final SezZoneLocationAddTable INSTANCE =
		new SezZoneLocationAddTable();

	public final Column<SezZoneLocationAddTable, Long> sezZoneLocationAddId =
		createColumn(
			"sezZoneLocationAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezZoneLocationAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneLocationAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneLocationAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneLocationAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneLocationAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneLocationAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneLocationAddTable, String> developerLocation =
		createColumn(
			"developerLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneLocationAddTable, String>
		developerLocationDescription = createColumn(
			"developerLocationDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneLocationAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneLocationAddTable, Long> sezStatusApplicationId =
		createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezZoneLocationAddTable() {
		super("nbp_sez_zone_location_add", SezZoneLocationAddTable::new);
	}

}