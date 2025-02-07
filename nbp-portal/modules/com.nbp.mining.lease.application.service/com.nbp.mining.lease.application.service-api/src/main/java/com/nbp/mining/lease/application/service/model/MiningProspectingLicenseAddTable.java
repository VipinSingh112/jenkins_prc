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
 * The table class for the &quot;nbp_mining_pro_license_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicenseAdd
 * @generated
 */
public class MiningProspectingLicenseAddTable
	extends BaseTable<MiningProspectingLicenseAddTable> {

	public static final MiningProspectingLicenseAddTable INSTANCE =
		new MiningProspectingLicenseAddTable();

	public final Column<MiningProspectingLicenseAddTable, Long>
		miningProspectingLicenseAddId = createColumn(
			"miningProspectingLicenseAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiningProspectingLicenseAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseAddTable, String> name =
		createColumn("name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseAddTable, String> nationality =
		createColumn(
			"nationality", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseAddTable, String>
		directorsOfCompany = createColumn(
			"directorsOfCompany", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningProspectingLicenseAddTable, Long>
		miningLeaseApplicationId = createColumn(
			"miningLeaseApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MiningProspectingLicenseAddTable() {
		super(
			"nbp_mining_pro_license_add",
			MiningProspectingLicenseAddTable::new);
	}

}