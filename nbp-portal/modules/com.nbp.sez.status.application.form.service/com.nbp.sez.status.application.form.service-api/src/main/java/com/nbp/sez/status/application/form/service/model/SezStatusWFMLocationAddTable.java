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
 * The table class for the &quot;nbp_sez_status_work_home_loc&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFMLocationAdd
 * @generated
 */
public class SezStatusWFMLocationAddTable
	extends BaseTable<SezStatusWFMLocationAddTable> {

	public static final SezStatusWFMLocationAddTable INSTANCE =
		new SezStatusWFMLocationAddTable();

	public final Column<SezStatusWFMLocationAddTable, Long> sezStatusWFHLocId =
		createColumn(
			"sezStatusWFHLocId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezStatusWFMLocationAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFMLocationAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFMLocationAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFMLocationAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFMLocationAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFMLocationAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFMLocationAddTable, String> controlNumber =
		createColumn(
			"controlNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFMLocationAddTable, String> location =
		createColumn(
			"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFMLocationAddTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFMLocationAddTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezStatusWFMLocationAddTable() {
		super(
			"nbp_sez_status_work_home_loc", SezStatusWFMLocationAddTable::new);
	}

}