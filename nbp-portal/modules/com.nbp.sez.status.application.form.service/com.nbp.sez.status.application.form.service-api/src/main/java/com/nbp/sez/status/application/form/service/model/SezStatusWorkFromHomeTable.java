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
 * The table class for the &quot;nbp_sez_status_work_home&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWorkFromHome
 * @generated
 */
public class SezStatusWorkFromHomeTable
	extends BaseTable<SezStatusWorkFromHomeTable> {

	public static final SezStatusWorkFromHomeTable INSTANCE =
		new SezStatusWorkFromHomeTable();

	public final Column<SezStatusWorkFromHomeTable, Long>
		sezStatusWorkFromHomeId = createColumn(
			"sezStatusWorkFromHomeId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezStatusWorkFromHomeTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusWorkFromHomeTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusWorkFromHomeTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusWorkFromHomeTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWorkFromHomeTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusWorkFromHomeTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusWorkFromHomeTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWorkFromHomeTable, String> contactPersonName =
		createColumn(
			"contactPersonName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusWorkFromHomeTable, String> contactPersonEmail =
		createColumn(
			"contactPersonEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusWorkFromHomeTable, String> controlNumber =
		createColumn(
			"controlNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWorkFromHomeTable, String>
		workerUtilizingIncentive = createColumn(
			"workerUtilizingIncentive", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusWorkFromHomeTable, String>
		workerUtilizingIncentiveMonth = createColumn(
			"workerUtilizingIncentiveMonth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusWorkFromHomeTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezStatusWorkFromHomeTable() {
		super("nbp_sez_status_work_home", SezStatusWorkFromHomeTable::new);
	}

}