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
 * The table class for the &quot;nbp_sez_occ_exist_prop_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantExistingProposedProjectBriefInfo
 * @generated
 */
public class SezOccupantExistingProposedProjectBriefInfoTable
	extends BaseTable<SezOccupantExistingProposedProjectBriefInfoTable> {

	public static final SezOccupantExistingProposedProjectBriefInfoTable
		INSTANCE = new SezOccupantExistingProposedProjectBriefInfoTable();

	public final Column<SezOccupantExistingProposedProjectBriefInfoTable, Long>
		sezOccExistPorpId = createColumn(
			"sezOccExistPorpId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezOccupantExistingProposedProjectBriefInfoTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantExistingProposedProjectBriefInfoTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantExistingProposedProjectBriefInfoTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String> userName =
			createColumn(
				"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantExistingProposedProjectBriefInfoTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantExistingProposedProjectBriefInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occBusinessDesc = createColumn(
				"occBusinessDesc", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occDeniedFreeZoneAppr = createColumn(
				"occDeniedFreeZoneAppr", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column<SezOccupantExistingProposedProjectBriefInfoTable, Date>
		occDeniedFreeZoneApprDate = createColumn(
			"occDeniedFreeZoneApprDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occDeniedFreeZoneApprType = createColumn(
				"occDeniedFreeZoneApprType", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occFreeZoneLocation = createColumn(
				"occFreeZoneLocation", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occSezDevLoc = createColumn(
				"occSezDevLoc", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occSezDevLocDesc = createColumn(
				"occSezDevLocDesc", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occSubConcessionBuilding = createColumn(
				"occSubConcessionBuilding", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occSubConcessionTown = createColumn(
				"occSubConcessionTown", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occSubConcessionParish = createColumn(
				"occSubConcessionParish", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occCompleteSurveyTechDesc = createColumn(
				"occCompleteSurveyTechDesc", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occNorthBoundaries = createColumn(
				"occNorthBoundaries", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occEastBoundaries = createColumn(
				"occEastBoundaries", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occWestBoundaries = createColumn(
				"occWestBoundaries", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occSouthBoundaries = createColumn(
				"occSouthBoundaries", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occOwnership = createColumn(
				"occOwnership", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occLeaseYears = createColumn(
				"occLeaseYears", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String> occVolume =
			createColumn(
				"occVolume", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String> occFolio =
			createColumn(
				"occFolio", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String> occFloorNum =
			createColumn(
				"occFloorNum", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occUndertakenService = createColumn(
				"occUndertakenService", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occUndertakenManufacturing = createColumn(
				"occUndertakenManufacturing", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occSeaPortDistanceKM = createColumn(
				"occSeaPortDistanceKM", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occSeaPortDistanceMI = createColumn(
				"occSeaPortDistanceMI", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occAirportDistanceKM = createColumn(
				"occAirportDistanceKM", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occAirportDistanceMI = createColumn(
				"occAirportDistanceMI", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occRoadDistanceKM = createColumn(
				"occRoadDistanceKM", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occRoadDistanceMI = createColumn(
				"occRoadDistanceMI", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occRailDistanceKM = createColumn(
				"occRailDistanceKM", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occRailDistanceMI = createColumn(
				"occRailDistanceMI", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occCustomDistanceKM = createColumn(
				"occCustomDistanceKM", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<SezOccupantExistingProposedProjectBriefInfoTable, String>
			occCustomDistanceMI = createColumn(
				"occCustomDistanceMI", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column<SezOccupantExistingProposedProjectBriefInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupantExistingProposedProjectBriefInfoTable() {
		super(
			"nbp_sez_occ_exist_prop_info",
			SezOccupantExistingProposedProjectBriefInfoTable::new);
	}

}