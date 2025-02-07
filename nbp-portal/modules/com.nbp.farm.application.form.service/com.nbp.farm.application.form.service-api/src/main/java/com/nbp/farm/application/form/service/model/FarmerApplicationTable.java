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
 * The table class for the &quot;nbp_farmer_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerApplication
 * @generated
 */
public class FarmerApplicationTable extends BaseTable<FarmerApplicationTable> {

	public static final FarmerApplicationTable INSTANCE =
		new FarmerApplicationTable();

	public final Column<FarmerApplicationTable, Long> farmerApplicationId =
		createColumn(
			"farmerApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FarmerApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, String> requestType =
		createColumn(
			"requestType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, String> perishLocal =
		createColumn(
			"perishLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, String> farmType = createColumn(
		"farmType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, String> farmParishLocal =
		createColumn(
			"farmParishLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, String> entityId = createColumn(
		"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, String>
		expiredLicenseappNumber = createColumn(
			"expiredLicenseappNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, String> caseld = createColumn(
		"caseld", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, String> icmDocumentsPath =
		createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, Long> PdfFileEntryId =
		createColumn(
			"PdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private FarmerApplicationTable() {
		super("nbp_farmer_application", FarmerApplicationTable::new);
	}

}