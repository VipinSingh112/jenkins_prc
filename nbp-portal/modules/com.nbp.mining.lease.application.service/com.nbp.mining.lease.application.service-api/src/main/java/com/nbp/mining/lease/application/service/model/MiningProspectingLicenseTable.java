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
 * The table class for the &quot;nbp_mining_prospect_license&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicense
 * @generated
 */
public class MiningProspectingLicenseTable
	extends BaseTable<MiningProspectingLicenseTable> {

	public static final MiningProspectingLicenseTable INSTANCE =
		new MiningProspectingLicenseTable();

	public final Column<MiningProspectingLicenseTable, Long>
		miningProspectingLicenseId = createColumn(
			"miningProspectingLicenseId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiningProspectingLicenseTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String> nameOfApplicant =
		createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String> trnNumber =
		createColumn(
			"trnNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		nationalityOfApplicant = createColumn(
			"nationalityOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		addressInJamaica = createColumn(
			"addressInJamaica", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String> telephoneNumber =
		createColumn(
			"telephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String> emailAddress =
		createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		numberOfApplicant = createColumn(
			"numberOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String> nameOfTheAgent =
		createColumn(
			"nameOfTheAgent", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		numberOfThisProspecting = createColumn(
			"numberOfThisProspecting", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		prospectingRight = createColumn(
			"prospectingRight", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String> licence =
		createColumn(
			"licence", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		stateTheNearestLandmark = createColumn(
			"stateTheNearestLandmark", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String> approximateArea =
		createColumn(
			"approximateArea", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		mineralForWhichApplicant = createColumn(
			"mineralForWhichApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String> copyOfArticle =
		createColumn(
			"copyOfArticle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, Date>
		dateUponTheLocation = createColumn(
			"dateUponTheLocation", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		proslicenceFeeCheck = createColumn(
			"proslicenceFeeCheck", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, Date> dateSurrender =
		createColumn(
			"dateSurrender", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		areaOfApproximately = createColumn(
			"areaOfApproximately", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String> locationBeacon =
		createColumn(
			"locationBeacon", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		intersectionCoordinates = createColumn(
			"intersectionCoordinates", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		northTopographical = createColumn(
			"northTopographical", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		eastTopographical = createColumn(
			"eastTopographical", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		firstCornerOfNorth = createColumn(
			"firstCornerOfNorth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		firstCornerOfEast = createColumn(
			"firstCornerOfEast", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		firstCornerApproximateMeter = createColumn(
			"firstCornerApproximateMeter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		firstCornerApproximateDegree = createColumn(
			"firstCornerApproximateDegree", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		secondCornerOfNorth = createColumn(
			"secondCornerOfNorth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		secondCornerOfEast = createColumn(
			"secondCornerOfEast", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		secondCornerApproximateMeter = createColumn(
			"secondCornerApproximateMeter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		secondCornerApproximateDegree = createColumn(
			"secondCornerApproximateDegree", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		thirdCornerOfNorth = createColumn(
			"thirdCornerOfNorth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		thirdCornerOfEast = createColumn(
			"thirdCornerOfEast", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		thirdCornerApproximateMeter = createColumn(
			"thirdCornerApproximateMeter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		thirdCornerApproximateDegree = createColumn(
			"thirdCornerApproximateDegree", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		fourthCornerOfNorth = createColumn(
			"fourthCornerOfNorth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		fourthCornerOfEast = createColumn(
			"fourthCornerOfEast", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		fourthCornerApproximateMeter = createColumn(
			"fourthCornerApproximateMeter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		fourthCornerApproximateDegree = createColumn(
			"fourthCornerApproximateDegree", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		fifthCornerOfNorth = createColumn(
			"fifthCornerOfNorth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		fifthCornerOfEast = createColumn(
			"fifthCornerOfEast", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		fifthCornerApproximateMeter = createColumn(
			"fifthCornerApproximateMeter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, String>
		fifthCornerApproximateDegree = createColumn(
			"fifthCornerApproximateDegree", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseTable, Long>
		miningLeaseApplicationId = createColumn(
			"miningLeaseApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MiningProspectingLicenseTable() {
		super(
			"nbp_mining_prospect_license", MiningProspectingLicenseTable::new);
	}

}