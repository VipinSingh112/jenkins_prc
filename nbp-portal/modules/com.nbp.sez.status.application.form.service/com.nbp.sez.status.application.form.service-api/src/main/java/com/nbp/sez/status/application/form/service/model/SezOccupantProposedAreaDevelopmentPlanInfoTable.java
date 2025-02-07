/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_occ_prop_area_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantProposedAreaDevelopmentPlanInfo
 * @generated
 */
public class SezOccupantProposedAreaDevelopmentPlanInfoTable
	extends BaseTable<SezOccupantProposedAreaDevelopmentPlanInfoTable> {

	public static final SezOccupantProposedAreaDevelopmentPlanInfoTable
		INSTANCE = new SezOccupantProposedAreaDevelopmentPlanInfoTable();

	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, Long>
		sezOccPropAreaId = createColumn(
			"sezOccPropAreaId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, String>
		occProcessingArea = createColumn(
			"occProcessingArea", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, String>
		occNonProcessingArea = createColumn(
			"occNonProcessingArea", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, String>
		occOfficeRequirement = createColumn(
			"occOfficeRequirement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, String>
		occFactoryRequirement = createColumn(
			"occFactoryRequirement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, String>
		otherBuildUpRequirement = createColumn(
			"otherBuildUpRequirement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, String>
		occOtherAreaReqName = createColumn(
			"occOtherAreaReqName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, String>
		occOtherAreaRequirement = createColumn(
			"occOtherAreaRequirement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantProposedAreaDevelopmentPlanInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupantProposedAreaDevelopmentPlanInfoTable() {
		super(
			"nbp_sez_occ_prop_area_info",
			SezOccupantProposedAreaDevelopmentPlanInfoTable::new);
	}

}