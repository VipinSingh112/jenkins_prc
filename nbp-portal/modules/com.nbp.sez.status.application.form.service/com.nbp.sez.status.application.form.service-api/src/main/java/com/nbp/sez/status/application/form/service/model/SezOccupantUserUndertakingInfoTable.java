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
 * The table class for the &quot;nbp_sez_occ_user_under_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantUserUndertakingInfo
 * @generated
 */
public class SezOccupantUserUndertakingInfoTable
	extends BaseTable<SezOccupantUserUndertakingInfoTable> {

	public static final SezOccupantUserUndertakingInfoTable INSTANCE =
		new SezOccupantUserUndertakingInfoTable();

	public final Column<SezOccupantUserUndertakingInfoTable, Long>
		sezOccUserunderId = createColumn(
			"sezOccUserunderId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezOccupantUserUndertakingInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, String>
		occApplicantTitle = createColumn(
			"occApplicantTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, String>
		occApplicantName = createColumn(
			"occApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, String>
		occApplicantTeleNum = createColumn(
			"occApplicantTeleNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, String>
		occApplicantEmail = createColumn(
			"occApplicantEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, Date>
		occApplicantSignDate = createColumn(
			"occApplicantSignDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, String>
		occPublicNotaryName = createColumn(
			"occPublicNotaryName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, Date>
		occPublicNotarySignDate = createColumn(
			"occPublicNotarySignDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantUserUndertakingInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupantUserUndertakingInfoTable() {
		super(
			"nbp_sez_occ_user_under_info",
			SezOccupantUserUndertakingInfoTable::new);
	}

}