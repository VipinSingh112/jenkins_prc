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

package com.nbp.farm.application.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_farm_inspection&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FarmInspection
 * @generated
 */
public class FarmInspectionTable extends BaseTable<FarmInspectionTable> {

	public static final FarmInspectionTable INSTANCE =
		new FarmInspectionTable();

	public final Column<FarmInspectionTable, Long> farmInspectionId =
		createColumn(
			"farmInspectionId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<FarmInspectionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, Date> inspectionDate =
		createColumn(
			"inspectionDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, String> insectionDateRange =
		createColumn(
			"insectionDateRange", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, String> invities = createColumn(
		"invities", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, String> location = createColumn(
		"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, String> updatedBySource =
		createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, Long> farmApplicationId =
		createColumn(
			"farmApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmInspectionTable, Long> slotBookedByUser =
		createColumn(
			"slotBookedByUser", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FarmInspectionTable() {
		super("nbp_farm_inspection", FarmInspectionTable::new);
	}

}