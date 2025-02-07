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
 * The table class for the &quot;nbp_sez_dev_proposed_project&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevProposedProject
 * @generated
 */
public class SezDevProposedProjectTable
	extends BaseTable<SezDevProposedProjectTable> {

	public static final SezDevProposedProjectTable INSTANCE =
		new SezDevProposedProjectTable();

	public final Column<SezDevProposedProjectTable, Long>
		sezDevProposedProjectId = createColumn(
			"sezDevProposedProjectId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevProposedProjectTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> previouslyFreeZone =
		createColumn(
			"previouslyFreeZone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String>
		curentlyOperatingZone = createColumn(
			"curentlyOperatingZone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String>
		businessConductedZone = createColumn(
			"businessConductedZone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> locally =
		createColumn(
			"locally", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> overseas =
		createColumn(
			"overseas", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> proposedName =
		createColumn(
			"proposedName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String>
		specialEconomicZone = createColumn(
			"specialEconomicZone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> pleaseDescribe =
		createColumn(
			"pleaseDescribe", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> seaPortKm =
		createColumn(
			"seaPortKm", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> seaPortMi =
		createColumn(
			"seaPortMi", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> airportKm =
		createColumn(
			"airportKm", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> airportMi =
		createColumn(
			"airportMi", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> roadKm =
		createColumn(
			"roadKm", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> roadMi =
		createColumn(
			"roadMi", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> railKm =
		createColumn(
			"railKm", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> railMi =
		createColumn(
			"railMi", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> customProcessingKm =
		createColumn(
			"customProcessingKm", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> customProcessingMi =
		createColumn(
			"customProcessingMi", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String>
		indicateTheLandMeasurement = createColumn(
			"indicateTheLandMeasurement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> building =
		createColumn(
			"building", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> landArea =
		createColumn(
			"landArea", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> ownerShip =
		createColumn(
			"ownerShip", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> otherPleaseSpecify =
		createColumn(
			"otherPleaseSpecify", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> landOwnerName =
		createColumn(
			"landOwnerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String>
		lnadOwnerAddressOne = createColumn(
			"lnadOwnerAddressOne", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String>
		lnadOwnerAddressTwo = createColumn(
			"lnadOwnerAddressTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> lnadOwnerTenure =
		createColumn(
			"lnadOwnerTenure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> stepToAcquireLand =
		createColumn(
			"stepToAcquireLand", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String>
		stateWheatherTheProposedArea = createColumn(
			"stateWheatherTheProposedArea", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String>
		applicantPreviously = createColumn(
			"applicantPreviously", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, String> pleaseProvideBrief =
		createColumn(
			"pleaseProvideBrief", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevProposedProjectTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevProposedProjectTable() {
		super("nbp_sez_dev_proposed_project", SezDevProposedProjectTable::new);
	}

}