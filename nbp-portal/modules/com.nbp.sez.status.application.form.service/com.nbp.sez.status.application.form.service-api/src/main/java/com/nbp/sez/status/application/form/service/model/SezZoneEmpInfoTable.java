/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
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
 * @see SezZoneEmpInfo
 * @generated
 */
public class SezZoneEmpInfoTable extends BaseTable<SezZoneEmpInfoTable> {

	public static final SezZoneEmpInfoTable INSTANCE =
		new SezZoneEmpInfoTable();

	public final Column<SezZoneEmpInfoTable, Long> sezZoneEmpInfoId =
		createColumn(
			"sezZoneEmpInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezZoneEmpInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, String> labourRequirementYear =
		createColumn(
			"labourRequirementYear", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, String> labourRequirementDirect =
		createColumn(
			"labourRequirementDirect", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, String> labourRequirementMale =
		createColumn(
			"labourRequirementMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, String> labourRequirementFemale =
		createColumn(
			"labourRequirementFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, String> labourRequirementLocal =
		createColumn(
			"labourRequirementLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, String> labourRequirementForeign =
		createColumn(
			"labourRequirementForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmpInfoTable, Long> sezStatusApplicationId =
		createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezZoneEmpInfoTable() {
		super("nbp_sez_zone_emp_info", SezZoneEmpInfoTable::new);
	}

}