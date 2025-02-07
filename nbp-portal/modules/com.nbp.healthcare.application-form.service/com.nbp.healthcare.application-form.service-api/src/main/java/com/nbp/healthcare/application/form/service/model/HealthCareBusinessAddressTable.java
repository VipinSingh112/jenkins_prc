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
 * The table class for the &quot;nbp_healthcare_bussiness_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBusinessAddress
 * @generated
 */
public class HealthCareBusinessAddressTable
	extends BaseTable<HealthCareBusinessAddressTable> {

	public static final HealthCareBusinessAddressTable INSTANCE =
		new HealthCareBusinessAddressTable();

	public final Column<HealthCareBusinessAddressTable, Long>
		healthCareBusinessAddressId = createColumn(
			"healthCareBusinessAddressId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<HealthCareBusinessAddressTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareBusinessAddressTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareBusinessAddressTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareBusinessAddressTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareBusinessAddressTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareBusinessAddressTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareBusinessAddressTable, String>
		bussinessAddress = createColumn(
			"bussinessAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareBusinessAddressTable, Long>
		healthCareApplicationId = createColumn(
			"healthCareApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareBusinessAddressTable, Long>
		healthCareBussinessInfoId = createColumn(
			"healthCareBussinessInfoId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private HealthCareBusinessAddressTable() {
		super(
			"nbp_healthcare_bussiness_add",
			HealthCareBusinessAddressTable::new);
	}

}