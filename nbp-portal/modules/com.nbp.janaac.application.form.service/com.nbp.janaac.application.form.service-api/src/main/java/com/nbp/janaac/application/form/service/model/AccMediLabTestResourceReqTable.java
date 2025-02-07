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
 * The table class for the &quot;nbp_janaac_acc_med_test_reso&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestResourceReq
 * @generated
 */
public class AccMediLabTestResourceReqTable
	extends BaseTable<AccMediLabTestResourceReqTable> {

	public static final AccMediLabTestResourceReqTable INSTANCE =
		new AccMediLabTestResourceReqTable();

	public final Column<AccMediLabTestResourceReqTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, Long>
		accMediLabTestResourceReqId = createColumn(
			"accMediLabTestResourceReqId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccMediLabTestResourceReqTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, String> testExternal =
		createColumn(
			"testExternal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, String> testCompetence =
		createColumn(
			"testCompetence", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, String>
		testLabFacilities = createColumn(
			"testLabFacilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, String>
		testLabContracted = createColumn(
			"testLabContracted", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, String>
		testLabFacilityEnv = createColumn(
			"testLabFacilityEnv", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, String> testSpecialEnv =
		createColumn(
			"testSpecialEnv", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, String>
		testMonitoringAct = createColumn(
			"testMonitoringAct", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, String>
		testLabRelatedEquip = createColumn(
			"testLabRelatedEquip", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, String>
		testSecurityArrange = createColumn(
			"testSecurityArrange", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestResourceReqTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccMediLabTestResourceReqTable() {
		super(
			"nbp_janaac_acc_med_test_reso",
			AccMediLabTestResourceReqTable::new);
	}

}