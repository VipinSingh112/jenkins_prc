/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_radionuclide_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideAdd
 * @generated
 */
public class RadionuclideAddTable extends BaseTable<RadionuclideAddTable> {

	public static final RadionuclideAddTable INSTANCE =
		new RadionuclideAddTable();

	public final Column<RadionuclideAddTable, Long> radionuclideAddId =
		createColumn(
			"radionuclideAddId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<RadionuclideAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, String> radionuclideDetails =
		createColumn(
			"radionuclideDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, String> activityDetails =
		createColumn(
			"activityDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, Date> activityDate = createColumn(
		"activityDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, String> chemicalDetailsForm =
		createColumn(
			"chemicalDetailsForm", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, String> serialNo = createColumn(
		"serialNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, String> radionuclideLocation =
		createColumn(
			"radionuclideLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadionuclideAddTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private RadionuclideAddTable() {
		super("nbp_hsra_radionuclide_add", RadionuclideAddTable::new);
	}

}