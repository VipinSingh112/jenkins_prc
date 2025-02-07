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
 * The table class for the &quot;farmer_livestock&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerLivestock
 * @generated
 */
public class FarmerLivestockTable extends BaseTable<FarmerLivestockTable> {

	public static final FarmerLivestockTable INSTANCE =
		new FarmerLivestockTable();

	public final Column<FarmerLivestockTable, Long> farmerLiveStockId =
		createColumn(
			"farmerLiveStockId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<FarmerLivestockTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, String> livestockBreed =
		createColumn(
			"livestockBreed", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, String> stageOflife =
		createColumn(
			"stageOflife", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, String> count = createColumn(
		"count", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, String> colonies = createColumn(
		"colonies", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, String> capacity = createColumn(
		"capacity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, String> majorMarket =
		createColumn(
			"majorMarket", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, String> majorMarketSold =
		createColumn(
			"majorMarketSold", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, String> minorMarket =
		createColumn(
			"minorMarket", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, String> minorMarketSold =
		createColumn(
			"minorMarketSold", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, String> remarks = createColumn(
		"remarks", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, String> livestockCounter =
		createColumn(
			"livestockCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerLivestockTable, Long> farmerApplicationId =
		createColumn(
			"farmerApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FarmerLivestockTable() {
		super("farmer_livestock", FarmerLivestockTable::new);
	}

}