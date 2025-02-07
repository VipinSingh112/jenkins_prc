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
 * The table class for the &quot;nbp_mining_renew_licence&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiningRenewalLicence
 * @generated
 */
public class MiningRenewalLicenceTable
	extends BaseTable<MiningRenewalLicenceTable> {

	public static final MiningRenewalLicenceTable INSTANCE =
		new MiningRenewalLicenceTable();

	public final Column<MiningRenewalLicenceTable, Long>
		miningRenewalLicenceId = createColumn(
			"miningRenewalLicenceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiningRenewalLicenceTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, String> renewApplicantName =
		createColumn(
			"renewApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, String> renewTrnNum =
		createColumn(
			"renewTrnNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, String>
		renewApplicantLicNum = createColumn(
			"renewApplicantLicNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, String> stateWhetherRenewIs =
		createColumn(
			"stateWhetherRenewIs", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, String> renewTelephone =
		createColumn(
			"renewTelephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, String> renewEmailAddr =
		createColumn(
			"renewEmailAddr", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, String>
		renewNumOfApplicantLease = createColumn(
			"renewNumOfApplicantLease", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, String>
		renApplicantDesireToMine = createColumn(
			"renApplicantDesireToMine", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, String> renewTermDesired =
		createColumn(
			"renewTermDesired", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, String> renewFeeCheck =
		createColumn(
			"renewFeeCheck", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, Date> renewDate =
		createColumn(
			"renewDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningRenewalLicenceTable, Long>
		miningLeaseApplicationId = createColumn(
			"miningLeaseApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MiningRenewalLicenceTable() {
		super("nbp_mining_renew_licence", MiningRenewalLicenceTable::new);
	}

}