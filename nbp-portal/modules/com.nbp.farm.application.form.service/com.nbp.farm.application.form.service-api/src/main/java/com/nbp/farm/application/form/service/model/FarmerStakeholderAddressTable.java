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
 * The table class for the &quot;farmer_stakeholder_address&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderAddress
 * @generated
 */
public class FarmerStakeholderAddressTable
	extends BaseTable<FarmerStakeholderAddressTable> {

	public static final FarmerStakeholderAddressTable INSTANCE =
		new FarmerStakeholderAddressTable();

	public final Column<FarmerStakeholderAddressTable, Long>
		farmerStakeholderAddressId = createColumn(
			"farmerStakeholderAddressId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FarmerStakeholderAddressTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, String> addressType =
		createColumn(
			"addressType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, String> streetName =
		createColumn(
			"streetName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, String> district =
		createColumn(
			"district", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, String> postoffice =
		createColumn(
			"postoffice", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, String> telephoneNumber =
		createColumn(
			"telephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, String>
		applicationNumber = createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, Long>
		farmerApplicationId = createColumn(
			"farmerApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, Long>
		stakeholderAddressId = createColumn(
			"stakeholderAddressId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderAddressTable, Long>
		farmerStakeholderInfoId = createColumn(
			"farmerStakeholderInfoId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FarmerStakeholderAddressTable() {
		super("farmer_stakeholder_address", FarmerStakeholderAddressTable::new);
	}

}