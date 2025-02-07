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
 * The table class for the &quot;farmer_crop&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCrop
 * @generated
 */
public class FarmerCropTable extends BaseTable<FarmerCropTable> {

	public static final FarmerCropTable INSTANCE = new FarmerCropTable();

	public final Column<FarmerCropTable, Long> farmerCropId = createColumn(
		"farmerCropId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<FarmerCropTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> cropAndVariety = createColumn(
		"cropAndVariety", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> area = createColumn(
		"area", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> unit = createColumn(
		"unit", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> cropContent = createColumn(
		"cropContent", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, Date> plantingDate = createColumn(
		"plantingDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> majorMarket = createColumn(
		"majorMarket", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> majorMarketPercentSold =
		createColumn(
			"majorMarketPercentSold", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> minorMarket = createColumn(
		"minorMarket", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> minorMarketPercentSold =
		createColumn(
			"minorMarketPercentSold", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> remarks = createColumn(
		"remarks", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> propertyId02 = createColumn(
		"propertyId02", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> propertyId03 = createColumn(
		"propertyId03", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, String> cropCounter = createColumn(
		"cropCounter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerCropTable, Long> farmerApplicationId =
		createColumn(
			"farmerApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FarmerCropTable() {
		super("farmer_crop", FarmerCropTable::new);
	}

}