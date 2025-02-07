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
 * The table class for the &quot;farmer_profile&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerProfile
 * @generated
 */
public class FarmerProfileTable extends BaseTable<FarmerProfileTable> {

	public static final FarmerProfileTable INSTANCE = new FarmerProfileTable();

	public final Column<FarmerProfileTable, Long> farmerProfileId =
		createColumn(
			"farmerProfileId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<FarmerProfileTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> respondent = createColumn(
		"respondent", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> manager = createColumn(
		"manager", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> liveOnFarm = createColumn(
		"liveOnFarm", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> livelihood = createColumn(
		"livelihood", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> educationLevel =
		createColumn(
			"educationLevel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> mainOccupation =
		createColumn(
			"mainOccupation", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> agriiInstitution =
		createColumn(
			"agriiInstitution", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> qualification =
		createColumn(
			"qualification", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> agriTraining = createColumn(
		"agriTraining", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> trainingMethod =
		createColumn(
			"trainingMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> mainAgriActivity =
		createColumn(
			"mainAgriActivity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> neareshPoliceStation =
		createColumn(
			"neareshPoliceStation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> jasBranchGroup =
		createColumn(
			"jasBranchGroup", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> holdingStartYear =
		createColumn(
			"holdingStartYear", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> farmerType = createColumn(
		"farmerType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> remarks = createColumn(
		"remarks", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, String> mainInformationSources =
		createColumn(
			"mainInformationSources", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerProfileTable, Long> farmerApplicationId =
		createColumn(
			"farmerApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FarmerProfileTable() {
		super("farmer_profile", FarmerProfileTable::new);
	}

}