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
 * The table class for the &quot;nbp_healthcare_description&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDescriptionOfService
 * @generated
 */
public class HealthCareDescriptionOfServiceTable
	extends BaseTable<HealthCareDescriptionOfServiceTable> {

	public static final HealthCareDescriptionOfServiceTable INSTANCE =
		new HealthCareDescriptionOfServiceTable();

	public final Column<HealthCareDescriptionOfServiceTable, Long>
		healthCareDescriptionId = createColumn(
			"healthCareDescriptionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<HealthCareDescriptionOfServiceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareDescriptionOfServiceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareDescriptionOfServiceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareDescriptionOfServiceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareDescriptionOfServiceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareDescriptionOfServiceTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareDescriptionOfServiceTable, String>
		descriptionOfService = createColumn(
			"descriptionOfService", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareDescriptionOfServiceTable, Long>
		healthCareApplicationId = createColumn(
			"healthCareApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private HealthCareDescriptionOfServiceTable() {
		super(
			"nbp_healthcare_description",
			HealthCareDescriptionOfServiceTable::new);
	}

}