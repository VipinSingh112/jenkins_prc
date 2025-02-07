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
 * The table class for the &quot;nbp_mining_prospect_rights&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingRights
 * @generated
 */
public class MiningProspectingRightsTable
	extends BaseTable<MiningProspectingRightsTable> {

	public static final MiningProspectingRightsTable INSTANCE =
		new MiningProspectingRightsTable();

	public final Column<MiningProspectingRightsTable, Long>
		prospectingRightsId = createColumn(
			"prospectingRightsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiningProspectingRightsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String> nameOfApplicant =
		createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String> trnNum =
		createColumn(
			"trnNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String>
		nationalityOfApplicant = createColumn(
			"nationalityOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String> ageOfApplicant =
		createColumn(
			"ageOfApplicant", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String> telephoneNum =
		createColumn(
			"telephoneNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String> emailAddr =
		createColumn(
			"emailAddr", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String> addressInJamaica =
		createColumn(
			"addressInJamaica", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String>
		applicantProspectAcc = createColumn(
			"applicantProspectAcc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String> otherPersonName =
		createColumn(
			"otherPersonName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String> otherPersonAddr =
		createColumn(
			"otherPersonAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String> prevApplication =
		createColumn(
			"prevApplication", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String> offenceMiningAct =
		createColumn(
			"offenceMiningAct", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String>
		validProspectRight = createColumn(
			"validProspectRight", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String>
		surrenderProspectRight = createColumn(
			"surrenderProspectRight", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, String>
		prospectRightsFeeCheck = createColumn(
			"prospectRightsFeeCheck", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingRightsTable, Long>
		miningLeaseApplicationId = createColumn(
			"miningLeaseApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MiningProspectingRightsTable() {
		super("nbp_mining_prospect_rights", MiningProspectingRightsTable::new);
	}

}