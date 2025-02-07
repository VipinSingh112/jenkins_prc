/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_business_detail_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjBusinessDetailAdd
 * @generated
 */
public class NcbjBusinessDetailAddTable
	extends BaseTable<NcbjBusinessDetailAddTable> {

	public static final NcbjBusinessDetailAddTable INSTANCE =
		new NcbjBusinessDetailAddTable();

	public final Column<NcbjBusinessDetailAddTable, Long>
		ncbjBusinessDetailAddId = createColumn(
			"ncbjBusinessDetailAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjBusinessDetailAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, String>
		numberAndTimeOfShift = createColumn(
			"numberAndTimeOfShift", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, String> typeOfProduct =
		createColumn(
			"typeOfProduct", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, String> businessAddress =
		createColumn(
			"businessAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, String> headOffices =
		createColumn(
			"headOffices", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, String>
		noOfFullTimeEmployees = createColumn(
			"noOfFullTimeEmployees", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, String>
		noOfPartTimeEmployees = createColumn(
			"noOfPartTimeEmployees", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, String> noOfContractors =
		createColumn(
			"noOfContractors", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, String>
		noOfContractedWorkers = createColumn(
			"noOfContractedWorkers", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailAddTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjBusinessDetailAddTable() {
		super("nbp_ncbj_business_detail_add", NcbjBusinessDetailAddTable::new);
	}

}