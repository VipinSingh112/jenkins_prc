/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_specific_require&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SpecificReqPropLicActivity
 * @generated
 */
public class SpecificReqPropLicActivityTable
	extends BaseTable<SpecificReqPropLicActivityTable> {

	public static final SpecificReqPropLicActivityTable INSTANCE =
		new SpecificReqPropLicActivityTable();

	public final Column<SpecificReqPropLicActivityTable, Long>
		specificReqPropLicActivityId = createColumn(
			"specificReqPropLicActivityId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SpecificReqPropLicActivityTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		adminTreatment = createColumn(
			"adminTreatment", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		qualityProgramme = createColumn(
			"qualityProgramme", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		instructionsCaregivers = createColumn(
			"instructionsCaregivers", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		instructionsPatients = createColumn(
			"instructionsPatients", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		patientsRelease = createColumn(
			"patientsRelease", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		treatmentRooms = createColumn(
			"treatmentRooms", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		medicalEmergencies = createColumn(
			"medicalEmergencies", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		nuclearMedicine = createColumn(
			"nuclearMedicine", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		diagnosticStudies = createColumn(
			"diagnosticStudies", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		biomedicalResearch = createColumn(
			"biomedicalResearch", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		researchReview = createColumn(
			"researchReview", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		emergencyOperating = createColumn(
			"emergencyOperating", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		certificatePackages = createColumn(
			"certificatePackages", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		exposureDevices = createColumn(
			"exposureDevices", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		equipmentSafety = createColumn(
			"equipmentSafety", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String> transportPlan =
		createColumn(
			"transportPlan", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		animalsTreatment = createColumn(
			"animalsTreatment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String> animalHousing =
		createColumn(
			"animalHousing", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String> disposalWaste =
		createColumn(
			"disposalWaste", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		monitoringAnimalHousing = createColumn(
			"monitoringAnimalHousing", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		releaseAnimals = createColumn(
			"releaseAnimals", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String> proceduresApp =
		createColumn(
			"proceduresApp", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String> disposalsApp =
		createColumn(
			"disposalsApp", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		monitoringMaterialNu = createColumn(
			"monitoringMaterialNu", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		handlingProcedures = createColumn(
			"handlingProcedures", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String> hoppersEntry =
		createColumn(
			"hoppersEntry", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		operatingConditions = createColumn(
			"operatingConditions", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String> insertionType =
		createColumn(
			"insertionType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		installationFixed = createColumn(
			"installationFixed", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		transportPlanGauge = createColumn(
			"transportPlanGauge", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		emergencyAddition = createColumn(
			"emergencyAddition", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		nuclearEnviroment = createColumn(
			"nuclearEnviroment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String> fishingTool =
		createColumn(
			"fishingTool", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String> sealedSources =
		createColumn(
			"sealedSources", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		abandonmentZone = createColumn(
			"abandonmentZone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String> servicingCopy =
		createColumn(
			"servicingCopy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, String>
		manufacturingDevelopment = createColumn(
			"manufacturingDevelopment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SpecificReqPropLicActivityTable, Long>
		hsraApplicationId = createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private SpecificReqPropLicActivityTable() {
		super(
			"nbp_hsra_specific_require", SpecificReqPropLicActivityTable::new);
	}

}