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
 * The table class for the &quot;nbp_sez_occ_dev_under_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupanteDeveloperUndertakingInfo
 * @generated
 */
public class SezOccupanteDeveloperUndertakingInfoTable
	extends BaseTable<SezOccupanteDeveloperUndertakingInfoTable> {

	public static final SezOccupanteDeveloperUndertakingInfoTable INSTANCE =
		new SezOccupanteDeveloperUndertakingInfoTable();

	public final Column<SezOccupanteDeveloperUndertakingInfoTable, Long>
		sezOccDevUnderId = createColumn(
			"sezOccDevUnderId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, String>
		occUndertakingDevName = createColumn(
			"occUndertakingDevName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, String>
		occUndertakingApprLetter = createColumn(
			"occUndertakingApprLetter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, Date>
		occUndertakingDate = createColumn(
			"occUndertakingDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, String>
		occUndertakingAgreeNum = createColumn(
			"occUndertakingAgreeNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, Date>
		occUndertakingAgreeDate = createColumn(
			"occUndertakingAgreeDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, String>
		occUndertakingControlNum = createColumn(
			"occUndertakingControlNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, String>
		occDevApplicantTitle = createColumn(
			"occDevApplicantTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, String>
		occDevApplicantName = createColumn(
			"occDevApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, String>
		occDevApplicantTele = createColumn(
			"occDevApplicantTele", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, String>
		occDevApplicantEmail = createColumn(
			"occDevApplicantEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, Date>
		occDevApplicantSignDate = createColumn(
			"occDevApplicantSignDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, String>
		occDevPublicNotaryName = createColumn(
			"occDevPublicNotaryName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, Date>
		occDevPublicNotarySignDate = createColumn(
			"occDevPublicNotarySignDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteDeveloperUndertakingInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupanteDeveloperUndertakingInfoTable() {
		super(
			"nbp_sez_occ_dev_under_info",
			SezOccupanteDeveloperUndertakingInfoTable::new);
	}

}