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
 * The table class for the &quot;farmer_crop_practice&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCropPractice
 * @generated
 */
public class FarmerCropPracticeTable
	extends BaseTable<FarmerCropPracticeTable> {

	public static final FarmerCropPracticeTable INSTANCE =
		new FarmerCropPracticeTable();

	public final Column<FarmerCropPracticeTable, Long> farmerCropPracticeId =
		createColumn(
			"farmerCropPracticeId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FarmerCropPracticeTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, String> crop1landPrepration =
		createColumn(
			"crop1landPrepration", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, String> crop1CropCare =
		createColumn(
			"crop1CropCare", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, String> crop1water =
		createColumn(
			"crop1water", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, String> crop1postHarvest =
		createColumn(
			"crop1postHarvest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, String> crop02 = createColumn(
		"crop02", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, String> crop03 = createColumn(
		"crop03", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, String> cropPracticeCounter =
		createColumn(
			"cropPracticeCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerCropPracticeTable, Long> farmerApplicationId =
		createColumn(
			"farmerApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FarmerCropPracticeTable() {
		super("farmer_crop_practice", FarmerCropPracticeTable::new);
	}

}