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

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;ManuAdditionalCompanyInfo&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManuAdditionalComapnyInfo
 * @generated
 */
public class ManuAdditionalComapnyInfoTable
	extends BaseTable<ManuAdditionalComapnyInfoTable> {

	public static final ManuAdditionalComapnyInfoTable INSTANCE =
		new ManuAdditionalComapnyInfoTable();

	public final Column<ManuAdditionalComapnyInfoTable, Long>
		manuAdditionalComapnyInfoId = createColumn(
			"manuAdditionalComapnyInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ManuAdditionalComapnyInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, String>
		companyNameRepresentative = createColumn(
			"companyNameRepresentative", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, String>
		companySignatureRepresentative = createColumn(
			"companySignatureRepresentative", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, String> signatureDate =
		createColumn(
			"signatureDate", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, String>
		customBrokerName = createColumn(
			"customBrokerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, String>
		customBrokerAddress = createColumn(
			"customBrokerAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, String>
		telephoneNumber = createColumn(
			"telephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, String> brokerId =
		createColumn(
			"brokerId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalComapnyInfoTable, Long>
		manufacturingApplicationId = createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ManuAdditionalComapnyInfoTable() {
		super("ManuAdditionalCompanyInfo", ManuAdditionalComapnyInfoTable::new);
	}

}