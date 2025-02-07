/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_delineation_area&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiningFormFiveDelineation
 * @generated
 */
public class MiningFormFiveDelineationTable
	extends BaseTable<MiningFormFiveDelineationTable> {

	public static final MiningFormFiveDelineationTable INSTANCE =
		new MiningFormFiveDelineationTable();

	public final Column<MiningFormFiveDelineationTable, Long>
		miningFormFiveDelineationId = createColumn(
			"miningFormFiveDelineationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiningFormFiveDelineationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String>
		approximatelyArea = createColumn(
			"approximatelyArea", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> location =
		createColumn(
			"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> coordinates =
		createColumn(
			"coordinates", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> northSide =
		createColumn(
			"northSide", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> eastSide =
		createColumn(
			"eastSide", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> firstNorthSide =
		createColumn(
			"firstNorthSide", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> firstEastSide =
		createColumn(
			"firstEastSide", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String>
		firstLocationGrid = createColumn(
			"firstLocationGrid", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> firstDegrees =
		createColumn(
			"firstDegrees", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String>
		secondNorthSide = createColumn(
			"secondNorthSide", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> secondEastSide =
		createColumn(
			"secondEastSide", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String>
		secondLocationGrid = createColumn(
			"secondLocationGrid", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> secondDegrees =
		createColumn(
			"secondDegrees", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String>
		thirdCoordinates = createColumn(
			"thirdCoordinates", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> thirdNorthSide =
		createColumn(
			"thirdNorthSide", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> thirdEastSide =
		createColumn(
			"thirdEastSide", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> thirdDegrees =
		createColumn(
			"thirdDegrees", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> thirdGridLoc =
		createColumn(
			"thirdGridLoc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> thirdGridL =
		createColumn(
			"thirdGridL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String>
		fourthCoordinates = createColumn(
			"fourthCoordinates", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String>
		fourthNorthSide = createColumn(
			"fourthNorthSide", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> fourthEastSide =
		createColumn(
			"fourthEastSide", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> fourthDegrees =
		createColumn(
			"fourthDegrees", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> fourthGridLoc =
		createColumn(
			"fourthGridLoc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> fourthGridL =
		createColumn(
			"fourthGridL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String>
		fifthCoordinates = createColumn(
			"fifthCoordinates", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> fifthNorthSide =
		createColumn(
			"fifthNorthSide", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> fifthEastSide =
		createColumn(
			"fifthEastSide", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> fifthDegrees =
		createColumn(
			"fifthDegrees", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> fifthGridLoc =
		createColumn(
			"fifthGridLoc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, String> fifthGridL =
		createColumn(
			"fifthGridL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningFormFiveDelineationTable, Long>
		miningLeaseApplicationId = createColumn(
			"miningLeaseApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MiningFormFiveDelineationTable() {
		super("nbp_delineation_area", MiningFormFiveDelineationTable::new);
	}

}