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
 * The table class for the &quot;nbp_hsra_safety_prog&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyProgram
 * @generated
 */
public class RadiationSafetyProgramTable
	extends BaseTable<RadiationSafetyProgramTable> {

	public static final RadiationSafetyProgramTable INSTANCE =
		new RadiationSafetyProgramTable();

	public final Column<RadiationSafetyProgramTable, Long>
		radiationSafetyProgramId = createColumn(
			"radiationSafetyProgramId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<RadiationSafetyProgramTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> nuclearRsoName =
		createColumn(
			"nuclearRsoName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> nuclearRsoTitle =
		createColumn(
			"nuclearRsoTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> nuclearRsoTeleNo =
		createColumn(
			"nuclearRsoTeleNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> nuclearRsoExt =
		createColumn(
			"nuclearRsoExt", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> nuclearRsoFax =
		createColumn(
			"nuclearRsoFax", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> nuclearRsoEmail =
		createColumn(
			"nuclearRsoEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> rsoDetails =
		createColumn(
			"rsoDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		qualifiedExpertName = createColumn(
			"qualifiedExpertName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		qualifiedExpertTitle = createColumn(
			"qualifiedExpertTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		qualifiedExpertTele = createColumn(
			"qualifiedExpertTele", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		qualifiedExpertExt = createColumn(
			"qualifiedExpertExt", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		qualifiedExpertFax = createColumn(
			"qualifiedExpertFax", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		qualifiedExpertEmail = createColumn(
			"qualifiedExpertEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		qualifiedExpertRegstNo = createColumn(
			"qualifiedExpertRegstNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, Date> qualifiedExpertDate =
		createColumn(
			"qualifiedExpertDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> qualifiedDetails =
		createColumn(
			"qualifiedDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> applicantName =
		createColumn(
			"applicantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> applicantTitle =
		createColumn(
			"applicantTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		otherLimitationAuth = createColumn(
			"otherLimitationAuth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, Date> otherDate =
		createColumn(
			"otherDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		classifiWorkersList = createColumn(
			"classifiWorkersList", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		respiPleaseSpecify = createColumn(
			"respiPleaseSpecify", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		tongsPleaseSpecify = createColumn(
			"tongsPleaseSpecify", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> scopeOfActivities =
		createColumn(
			"scopeOfActivities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> managementSystem =
		createColumn(
			"managementSystem", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> workerRecordings =
		createColumn(
			"workerRecordings", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> categoriesLicence =
		createColumn(
			"categoriesLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> renewalsSummary =
		createColumn(
			"renewalsSummary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> constraintsLimits =
		createColumn(
			"constraintsLimits", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		equipmentMonitoring = createColumn(
			"equipmentMonitoring", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> areasControl =
		createColumn(
			"areasControl", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		radioactiveSources = createColumn(
			"radioactiveSources", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		radiationiInstruments = createColumn(
			"radiationiInstruments", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> healthWorkers =
		createColumn(
			"healthWorkers", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		investigationLevel = createColumn(
			"investigationLevel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> policyDetails =
		createColumn(
			"policyDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> securityAccess =
		createColumn(
			"securityAccess", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> raditionSources =
		createColumn(
			"raditionSources", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> workerTraining =
		createColumn(
			"workerTraining", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> publicControl =
		createColumn(
			"publicControl", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> managementSources =
		createColumn(
			"managementSources", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		emergencyProcedure = createColumn(
			"emergencyProcedure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> licenceLocation =
		createColumn(
			"licenceLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> achievableProgram =
		createColumn(
			"achievableProgram", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		leakedTestingSources = createColumn(
			"leakedTestingSources", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> transferSources =
		createColumn(
			"transferSources", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> nuclearMaterials =
		createColumn(
			"nuclearMaterials", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		transportPackaging = createColumn(
			"transportPackaging", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> internalReview =
		createColumn(
			"internalReview", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String> sourcesActivities =
		createColumn(
			"sourcesActivities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		individualProtectiveEquipment = createColumn(
			"individualProtectiveEquipment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, String>
		ResProPleaseSpecify = createColumn(
			"ResProPleaseSpecify", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyProgramTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private RadiationSafetyProgramTable() {
		super("nbp_hsra_safety_prog", RadiationSafetyProgramTable::new);
	}

}