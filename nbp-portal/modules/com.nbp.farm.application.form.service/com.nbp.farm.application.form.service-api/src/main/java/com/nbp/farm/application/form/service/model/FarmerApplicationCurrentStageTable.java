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

package com.nbp.farm.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_farmer_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerApplicationCurrentStage
 * @generated
 */
public class FarmerApplicationCurrentStageTable
	extends BaseTable<FarmerApplicationCurrentStageTable> {

	public static final FarmerApplicationCurrentStageTable INSTANCE =
		new FarmerApplicationCurrentStageTable();

	public final Column<FarmerApplicationCurrentStageTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationCurrentStageTable, Long>
		farmerCurrentStageId = createColumn(
			"farmerCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FarmerApplicationCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationCurrentStageTable, String>
		currentStage = createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationCurrentStageTable, String>
		lastFormStage = createColumn(
			"lastFormStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationCurrentStageTable, Long>
		farmerApplicationId = createColumn(
			"farmerApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FarmerApplicationCurrentStageTable() {
		super("nbp_farmer_stage", FarmerApplicationCurrentStageTable::new);
	}

}