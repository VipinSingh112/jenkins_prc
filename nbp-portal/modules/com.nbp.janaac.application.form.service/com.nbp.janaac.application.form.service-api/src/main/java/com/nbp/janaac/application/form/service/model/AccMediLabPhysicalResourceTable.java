/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_acc_medi_physical&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabPhysicalResource
 * @generated
 */
public class AccMediLabPhysicalResourceTable
	extends BaseTable<AccMediLabPhysicalResourceTable> {

	public static final AccMediLabPhysicalResourceTable INSTANCE =
		new AccMediLabPhysicalResourceTable();

	public final Column<AccMediLabPhysicalResourceTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, Long>
		accMediLabPhysicalResourceId = createColumn(
			"accMediLabPhysicalResourceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccMediLabPhysicalResourceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, String>
		laboratoryfacilities = createColumn(
			"laboratoryfacilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, String>
		safetyFeatures = createColumn(
			"safetyFeatures", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, String>
		specialEnvironment = createColumn(
			"specialEnvironment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, String>
		monitoringActivities = createColumn(
			"monitoringActivities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, String>
		securityArrangements = createColumn(
			"securityArrangements", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, String>
		laboratoryDocumented = createColumn(
			"laboratoryDocumented", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabPhysicalResourceTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccMediLabPhysicalResourceTable() {
		super(
			"nbp_janaac_acc_medi_physical",
			AccMediLabPhysicalResourceTable::new);
	}

}