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
 * The table class for the &quot;nbp_sez_occ_employee_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantEmploymentInfo
 * @generated
 */
public class SezOccupantEmploymentInfoTable
	extends BaseTable<SezOccupantEmploymentInfoTable> {

	public static final SezOccupantEmploymentInfoTable INSTANCE =
		new SezOccupantEmploymentInfoTable();

	public final Column<SezOccupantEmploymentInfoTable, Long> sezOccEmpId =
		createColumn(
			"sezOccEmpId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezOccupantEmploymentInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, String> occLabourYear =
		createColumn(
			"occLabourYear", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, String>
		occLabourDirect = createColumn(
			"occLabourDirect", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, String> occLabourMale =
		createColumn(
			"occLabourMale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, String>
		occLabourFemale = createColumn(
			"occLabourFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, String> occLabourLocal =
		createColumn(
			"occLabourLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, String>
		occLabourForeign = createColumn(
			"occLabourForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, String> occEmpCounter =
		createColumn(
			"occEmpCounter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantEmploymentInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupantEmploymentInfoTable() {
		super("nbp_sez_occ_employee_info", SezOccupantEmploymentInfoTable::new);
	}

}