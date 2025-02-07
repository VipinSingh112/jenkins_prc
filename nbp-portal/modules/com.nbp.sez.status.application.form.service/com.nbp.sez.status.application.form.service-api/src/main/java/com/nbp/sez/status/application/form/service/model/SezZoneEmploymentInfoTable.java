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
 * The table class for the &quot;nbp_sez_zone_employment_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmploymentInfo
 * @generated
 */
public class SezZoneEmploymentInfoTable
	extends BaseTable<SezZoneEmploymentInfoTable> {

	public static final SezZoneEmploymentInfoTable INSTANCE =
		new SezZoneEmploymentInfoTable();

	public final Column<SezZoneEmploymentInfoTable, Long>
		sezZoneEmploymentInfoId = createColumn(
			"sezZoneEmploymentInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezZoneEmploymentInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, String>
		labourRequirementYear = createColumn(
			"labourRequirementYear", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, String>
		labourRequirementDirect = createColumn(
			"labourRequirementDirect", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, String>
		labourRequirementMale = createColumn(
			"labourRequirementMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, String>
		labourRequirementFemale = createColumn(
			"labourRequirementFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, String>
		labourRequirementLocal = createColumn(
			"labourRequirementLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, String>
		labourRequirementForeign = createColumn(
			"labourRequirementForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneEmploymentInfoTable, String>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private SezZoneEmploymentInfoTable() {
		super("nbp_sez_zone_employment_info", SezZoneEmploymentInfoTable::new);
	}

}