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
 * The table class for the &quot;nbp_sez_zone_pro_proj_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneProposedProjectInfo
 * @generated
 */
public class SezZoneProposedProjectInfoTable
	extends BaseTable<SezZoneProposedProjectInfoTable> {

	public static final SezZoneProposedProjectInfoTable INSTANCE =
		new SezZoneProposedProjectInfoTable();

	public final Column<SezZoneProposedProjectInfoTable, Long>
		sezZoneProposedProjectInfoId = createColumn(
			"sezZoneProposedProjectInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezZoneProposedProjectInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, String>
		entityDeniedApproval = createColumn(
			"entityDeniedApproval", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, Date>
		deniedApprovalDate = createColumn(
			"deniedApprovalDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, String>
		deniedApprovalProjectType = createColumn(
			"deniedApprovalProjectType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, String>
		freeZoneLocation = createColumn(
			"freeZoneLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, String>
		leasedBuildingNum = createColumn(
			"leasedBuildingNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, String> leasedTown =
		createColumn(
			"leasedTown", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, String> leasedParish =
		createColumn(
			"leasedParish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, String> leaseYears =
		createColumn(
			"leaseYears", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, String> volume =
		createColumn(
			"volume", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, String> folio =
		createColumn("folio", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, String> floorNum =
		createColumn(
			"floorNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneProposedProjectInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezZoneProposedProjectInfoTable() {
		super(
			"nbp_sez_zone_pro_proj_info", SezZoneProposedProjectInfoTable::new);
	}

}