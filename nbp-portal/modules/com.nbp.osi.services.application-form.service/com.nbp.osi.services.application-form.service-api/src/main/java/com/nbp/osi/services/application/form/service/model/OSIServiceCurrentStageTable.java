/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceCurrentStage
 * @generated
 */
public class OSIServiceCurrentStageTable
	extends BaseTable<OSIServiceCurrentStageTable> {

	public static final OSIServiceCurrentStageTable INSTANCE =
		new OSIServiceCurrentStageTable();

	public final Column<OSIServiceCurrentStageTable, Long> osiCurrentStageId =
		createColumn(
			"osiCurrentStageId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OSIServiceCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServiceCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServiceCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServiceCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServiceCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServiceCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServiceCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServiceCurrentStageTable, String>
		lastFormDetailsStep = createColumn(
			"lastFormDetailsStep", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServiceCurrentStageTable, Long>
		osiServicesApplicationId = createColumn(
			"osiServicesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private OSIServiceCurrentStageTable() {
		super("nbp_osi_services_stage", OSIServiceCurrentStageTable::new);
	}

}