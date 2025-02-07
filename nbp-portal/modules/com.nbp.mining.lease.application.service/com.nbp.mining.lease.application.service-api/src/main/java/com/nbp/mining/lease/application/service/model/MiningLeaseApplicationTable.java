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
 * The table class for the &quot;nbp_mining_applications&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiningLeaseApplication
 * @generated
 */
public class MiningLeaseApplicationTable
	extends BaseTable<MiningLeaseApplicationTable> {

	public static final MiningLeaseApplicationTable INSTANCE =
		new MiningLeaseApplicationTable();

	public final Column<MiningLeaseApplicationTable, Long>
		miningLeaseApplicationId = createColumn(
			"miningLeaseApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiningLeaseApplicationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String> entityId =
		createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String> typeOfApplicant =
		createColumn(
			"typeOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String>
		prospectingRightNumber = createColumn(
			"prospectingRightNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String>
		typeOfProspectingLicence = createColumn(
			"typeOfProspectingLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String> typeOfTransaction =
		createColumn(
			"typeOfTransaction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String>
		areaDelinationTotalApprox = createColumn(
			"areaDelinationTotalApprox", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String>
		licenceExclusiveSpecial = createColumn(
			"licenceExclusiveSpecial", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String>
		miningMineralsTypeVal = createColumn(
			"miningMineralsTypeVal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String> otherMineralBox =
		createColumn(
			"otherMineralBox", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String> areaDelination =
		createColumn(
			"areaDelination", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, Integer> status =
		createColumn(
			"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String> prospRightsNum =
		createColumn(
			"prospRightsNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String> prospLicenseNum =
		createColumn(
			"prospLicenseNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String>
		expiredLicenseAppNumber = createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String> icmDocumentsPath =
		createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningLeaseApplicationTable, String>
		appCurrentStageName = createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private MiningLeaseApplicationTable() {
		super("nbp_mining_applications", MiningLeaseApplicationTable::new);
	}

}