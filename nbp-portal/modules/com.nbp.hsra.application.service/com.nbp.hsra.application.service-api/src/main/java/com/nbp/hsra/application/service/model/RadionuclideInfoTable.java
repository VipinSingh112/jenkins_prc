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
 * The table class for the &quot;nbp_hsra_noti_radionuclide&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideInfo
 * @generated
 */
public class RadionuclideInfoTable extends BaseTable<RadionuclideInfoTable> {

	public static final RadionuclideInfoTable INSTANCE =
		new RadionuclideInfoTable();

	public final Column<RadionuclideInfoTable, Long> radionuclideInfoId =
		createColumn(
			"radionuclideInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<RadionuclideInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, String> radionuclideDetails =
		createColumn(
			"radionuclideDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, String> activityDetails =
		createColumn(
			"activityDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, String> activityDetailBq =
		createColumn(
			"activityDetailBq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, Date> activityDate =
		createColumn(
			"activityDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, String> chemicalDetailsForm =
		createColumn(
			"chemicalDetailsForm", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, String> serialNo = createColumn(
		"serialNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, String> sealedSource =
		createColumn(
			"sealedSource", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, String> manufacturerDetails =
		createColumn(
			"manufacturerDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, String> modelNo = createColumn(
		"modelNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, String> identificationNo =
		createColumn(
			"identificationNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, String> statusDetails =
		createColumn(
			"statusDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadionuclideInfoTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private RadionuclideInfoTable() {
		super("nbp_hsra_noti_radionuclide", RadionuclideInfoTable::new);
	}

}