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
 * The table class for the &quot;nbp_sez_dev_Pro_develop_plan&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevPropDevelopmentPlan
 * @generated
 */
public class SezDevPropDevelopmentPlanTable
	extends BaseTable<SezDevPropDevelopmentPlanTable> {

	public static final SezDevPropDevelopmentPlanTable INSTANCE =
		new SezDevPropDevelopmentPlanTable();

	public final Column<SezDevPropDevelopmentPlanTable, Long>
		sezDevPropDevelopmentPlanId = createColumn(
			"sezDevPropDevelopmentPlanId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevPropDevelopmentPlanTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		existingBuilding = createColumn(
			"existingBuilding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		existingBuildingForBusiDetail = createColumn(
			"existingBuildingForBusiDetail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		activitiesForSingleEntity = createColumn(
			"activitiesForSingleEntity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> volume =
		createColumn(
			"volume", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> folio =
		createColumn("folio", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> buildingNum =
		createColumn(
			"buildingNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> townCity =
		createColumn(
			"townCity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> zipCode =
		createColumn(
			"zipCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		zoningClassification = createColumn(
			"zoningClassification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> landUse =
		createColumn(
			"landUse", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		sezAreaHectares = createColumn(
			"sezAreaHectares", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> sezAreaAcres =
		createColumn(
			"sezAreaAcres", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		customsHectares = createColumn(
			"customsHectares", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> customsAcres =
		createColumn(
			"customsAcres", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> topography =
		createColumn(
			"topography", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		northBoundaries = createColumn(
			"northBoundaries", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> eastBoundaries =
		createColumn(
			"eastBoundaries", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> westBoundaries =
		createColumn(
			"westBoundaries", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		southBoundaries = createColumn(
			"southBoundaries", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		customLandMeasurement = createColumn(
			"customLandMeasurement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> customPercent =
		createColumn(
			"customPercent", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		commonLandMeasurement = createColumn(
			"commonLandMeasurement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> commonPercent =
		createColumn(
			"commonPercent", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		bufferLandMeasurement = createColumn(
			"bufferLandMeasurement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> bufferPercent =
		createColumn(
			"bufferPercent", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		zoneLandMeasurement = createColumn(
			"zoneLandMeasurement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> zonePercent =
		createColumn(
			"zonePercent", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		ResidentialLandMeasurement = createColumn(
			"ResidentialLandMeasurement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		ResidentialPercent = createColumn(
			"ResidentialPercent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		totalLandMeasurement = createColumn(
			"totalLandMeasurement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> totalPercent =
		createColumn(
			"totalPercent", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		industrialProcess = createColumn(
			"industrialProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		drinkingPurpose = createColumn(
			"drinkingPurpose", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> otherSpecify =
		createColumn(
			"otherSpecify", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		totalRequirement = createColumn(
			"totalRequirement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		quantumAndNature = createColumn(
			"quantumAndNature", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		specifyWhetherOwn = createColumn(
			"specifyWhetherOwn", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String> reqOfPower =
		createColumn(
			"reqOfPower", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		mainRoadRowWidth = createColumn(
			"mainRoadRowWidth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		mainRoadTypeOfPavement = createColumn(
			"mainRoadTypeOfPavement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		secondRowWidhth = createColumn(
			"secondRowWidhth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		secondTypeOfPavement = createColumn(
			"secondTypeOfPavement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		tertiaryRowWidhth = createColumn(
			"tertiaryRowWidhth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		tertiaryTypeOfPavement = createColumn(
			"tertiaryTypeOfPavement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		waterInstallationReq = createColumn(
			"waterInstallationReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		powerInstallationReq = createColumn(
			"powerInstallationReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		teleComInstallationReq = createColumn(
			"teleComInstallationReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		cctvInstallationReq = createColumn(
			"cctvInstallationReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		securityInterconnection = createColumn(
			"securityInterconnection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, String>
		fireFightingInstallationReq = createColumn(
			"fireFightingInstallationReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevPropDevelopmentPlanTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevPropDevelopmentPlanTable() {
		super(
			"nbp_sez_dev_Pro_develop_plan",
			SezDevPropDevelopmentPlanTable::new);
	}

}