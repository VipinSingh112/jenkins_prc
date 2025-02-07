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
 * The table class for the &quot;nbp_sez_zone_emp_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmployInfo
 * @generated
 */
public class SezZoneEmployInfoTable extends BaseTable<SezZoneEmployInfoTable> {

	public static final SezZoneEmployInfoTable INSTANCE =
		new SezZoneEmployInfoTable();

	public final Column<SezZoneEmployInfoTable, Long> sezZoneEmpInfoId =
		createColumn(
			"sezZoneEmpInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezZoneEmployInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, String> labourRequirementYear =
		createColumn(
			"labourRequirementYear", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, String>
		labourRequirementDirect = createColumn(
			"labourRequirementDirect", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, String> labourRequirementMale =
		createColumn(
			"labourRequirementMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, String>
		labourRequirementFemale = createColumn(
			"labourRequirementFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, String> labourRequirementLocal =
		createColumn(
			"labourRequirementLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, String>
		labourRequirementForeign = createColumn(
			"labourRequirementForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmployInfoTable, Long> sezStatusApplicationId =
		createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezZoneEmployInfoTable() {
		super("nbp_sez_zone_emp_info", SezZoneEmployInfoTable::new);
	}

}