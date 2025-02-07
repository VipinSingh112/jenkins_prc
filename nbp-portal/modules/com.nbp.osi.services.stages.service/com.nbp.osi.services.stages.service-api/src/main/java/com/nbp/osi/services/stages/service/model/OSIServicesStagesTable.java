/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_app_stages&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesStages
 * @generated
 */
public class OSIServicesStagesTable extends BaseTable<OSIServicesStagesTable> {

	public static final OSIServicesStagesTable INSTANCE =
		new OSIServicesStagesTable();

	public final Column<OSIServicesStagesTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, Long> osiServicesStagesId =
		createColumn(
			"osiServicesStagesId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OSIServicesStagesTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, String> stageName =
		createColumn(
			"stageName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, String> duration = createColumn(
		"duration", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, String> stageStatus =
		createColumn(
			"stageStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, Date> stageStartDate =
		createColumn(
			"stageStartDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, Date> stageEndDate =
		createColumn(
			"stageEndDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, Long> osiServciesApplicationId =
		createColumn(
			"osiServciesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServicesStagesTable, String> updatedBySource =
		createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private OSIServicesStagesTable() {
		super("nbp_osi_services_app_stages", OSIServicesStagesTable::new);
	}

}