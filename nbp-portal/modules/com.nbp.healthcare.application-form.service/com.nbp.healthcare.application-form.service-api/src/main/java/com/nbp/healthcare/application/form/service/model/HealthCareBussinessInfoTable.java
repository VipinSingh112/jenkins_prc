/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_healthcare_bussiness&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBussinessInfo
 * @generated
 */
public class HealthCareBussinessInfoTable
	extends BaseTable<HealthCareBussinessInfoTable> {

	public static final HealthCareBussinessInfoTable INSTANCE =
		new HealthCareBussinessInfoTable();

	public final Column<HealthCareBussinessInfoTable, Long>
		healthCareBussinessInfoId = createColumn(
			"healthCareBussinessInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<HealthCareBussinessInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareBussinessInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareBussinessInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareBussinessInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareBussinessInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareBussinessInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareBussinessInfoTable, String> name =
		createColumn("name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareBussinessInfoTable, String> telephoneNumber =
		createColumn(
			"telephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareBussinessInfoTable, String> email =
		createColumn("email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareBussinessInfoTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareBussinessInfoTable, String> companyNumber =
		createColumn(
			"companyNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareBussinessInfoTable, String> trnNumber =
		createColumn(
			"trnNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareBussinessInfoTable, Long>
		healthCareApplicationId = createColumn(
			"healthCareApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private HealthCareBussinessInfoTable() {
		super("nbp_healthcare_bussiness", HealthCareBussinessInfoTable::new);
	}

}