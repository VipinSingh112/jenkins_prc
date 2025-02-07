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
 * The table class for the &quot;farmer_Stakeholder_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderInfo
 * @generated
 */
public class FarmerStakeholderInfoTable
	extends BaseTable<FarmerStakeholderInfoTable> {

	public static final FarmerStakeholderInfoTable INSTANCE =
		new FarmerStakeholderInfoTable();

	public final Column<FarmerStakeholderInfoTable, Long>
		farmerStakeholderInfoId = createColumn(
			"farmerStakeholderInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FarmerStakeholderInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> firstName =
		createColumn(
			"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> middleName =
		createColumn(
			"middleName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> lastName =
		createColumn(
			"lastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> alias =
		createColumn(
			"alias_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String>
		residentialStreetName = createColumn(
			"residentialStreetName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String>
		residentialDistrict = createColumn(
			"residentialDistrict", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String>
		residentialPostOffice = createColumn(
			"residentialPostOffice", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> residentialParish =
		createColumn(
			"residentialParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String>
		residentialtelephoneNumber = createColumn(
			"residentialtelephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> businessStreetName =
		createColumn(
			"businessStreetName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> businessDistrict =
		createColumn(
			"businessDistrict", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> businessPostOffice =
		createColumn(
			"businessPostOffice", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> businessParish =
		createColumn(
			"businessParish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String>
		businessTelephoneNumber = createColumn(
			"businessTelephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> identificationType =
		createColumn(
			"identificationType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String>
		identificationNumber = createColumn(
			"identificationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> gender =
		createColumn(
			"gender", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, Date> dateOfBirth =
		createColumn(
			"dateOfBirth", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String>
		taxpayerRegistrationNumber = createColumn(
			"taxpayerRegistrationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> cellPhone =
		createColumn(
			"cellPhone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> fax = createColumn(
		"fax", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, String> emailAddress =
		createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerStakeholderInfoTable, Long> farmerApplicationId =
		createColumn(
			"farmerApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FarmerStakeholderInfoTable() {
		super("farmer_Stakeholder_info", FarmerStakeholderInfoTable::new);
	}

}