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
 * The table class for the &quot;farmer_livestock_practice&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerlivestockPractice
 * @generated
 */
public class FarmerlivestockPracticeTable
	extends BaseTable<FarmerlivestockPracticeTable> {

	public static final FarmerlivestockPracticeTable INSTANCE =
		new FarmerlivestockPracticeTable();

	public final Column<FarmerlivestockPracticeTable, Long>
		farmerLivestockPracticeId = createColumn(
			"farmerLivestockPracticeId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FarmerlivestockPracticeTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, String> husbandry =
		createColumn(
			"husbandry", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, String> liveStockCare =
		createColumn(
			"liveStockCare", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, String> nutrient =
		createColumn(
			"nutrient", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, String> water =
		createColumn("water", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, String> postHarvest =
		createColumn(
			"postHarvest", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, String> remarks =
		createColumn(
			"remarks", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, String>
		livestockPracticeCounter = createColumn(
			"livestockPracticeCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerlivestockPracticeTable, Long>
		farmerApplicationId = createColumn(
			"farmerApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FarmerlivestockPracticeTable() {
		super("farmer_livestock_practice", FarmerlivestockPracticeTable::new);
	}

}