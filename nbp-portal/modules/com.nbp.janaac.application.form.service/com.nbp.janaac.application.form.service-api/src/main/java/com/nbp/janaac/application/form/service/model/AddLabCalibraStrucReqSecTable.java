/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_add_lab_carStrucSec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabCalibraStrucReqSec
 * @generated
 */
public class AddLabCalibraStrucReqSecTable
	extends BaseTable<AddLabCalibraStrucReqSecTable> {

	public static final AddLabCalibraStrucReqSecTable INSTANCE =
		new AddLabCalibraStrucReqSecTable();

	public final Column<AddLabCalibraStrucReqSecTable, Long>
		addLabCalibraStrucReqSecId = createColumn(
			"addLabCalibraStrucReqSecId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddLabCalibraStrucReqSecTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, String> number =
		createColumn(
			"number_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, String>
		measuredQuantity = createColumn(
			"measuredQuantity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, String> calibrationItem =
		createColumn(
			"calibrationItem", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, String> range =
		createColumn(
			"range_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, String>
		measurementProcedure = createColumn(
			"measurementProcedure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, String> calibration =
		createColumn(
			"calibration", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, String> remarks =
		createColumn(
			"remarks", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddLabCalibraStrucReqSecTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddLabCalibraStrucReqSecTable() {
		super(
			"nbp_janaac_add_lab_carStrucSec",
			AddLabCalibraStrucReqSecTable::new);
	}

}