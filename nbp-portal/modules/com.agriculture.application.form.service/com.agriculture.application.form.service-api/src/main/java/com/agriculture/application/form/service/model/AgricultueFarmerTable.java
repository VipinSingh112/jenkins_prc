/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;agriculture_farmer&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultueFarmer
 * @generated
 */
public class AgricultueFarmerTable extends BaseTable<AgricultueFarmerTable> {

	public static final AgricultueFarmerTable INSTANCE =
		new AgricultueFarmerTable();

	public final Column<AgricultueFarmerTable, Long> agricultueFarmerId =
		createColumn(
			"agricultueFarmerId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgricultueFarmerTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, String> farmerDetail =
		createColumn(
			"farmerDetail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, String> nameOfApplicant =
		createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, String> nameOfFarm =
		createColumn(
			"nameOfFarm", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, String> nameOfProprietor =
		createColumn(
			"nameOfProprietor", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, String> parishAddress =
		createColumn(
			"parishAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, String> localAddress =
		createColumn(
			"localAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, String>
		taxpayerRegistrationNumber = createColumn(
			"taxpayerRegistrationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, String>
		farmerRegistrationNumber = createColumn(
			"farmerRegistrationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, Date> dateOfIncorporation =
		createColumn(
			"dateOfIncorporation", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, String> telephoneNumber =
		createColumn(
			"telephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, String> emailAddress =
		createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultueFarmerTable, Long> agricultureApplicationId =
		createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AgricultueFarmerTable() {
		super("agriculture_farmer", AgricultueFarmerTable::new);
	}

}