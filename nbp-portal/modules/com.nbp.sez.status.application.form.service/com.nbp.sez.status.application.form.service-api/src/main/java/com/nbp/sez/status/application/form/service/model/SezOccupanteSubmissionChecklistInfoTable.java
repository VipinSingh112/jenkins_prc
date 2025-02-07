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
 * The table class for the &quot;nbp_sez_occ_sub_check_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupanteSubmissionChecklistInfo
 * @generated
 */
public class SezOccupanteSubmissionChecklistInfoTable
	extends BaseTable<SezOccupanteSubmissionChecklistInfoTable> {

	public static final SezOccupanteSubmissionChecklistInfoTable INSTANCE =
		new SezOccupanteSubmissionChecklistInfoTable();

	public final Column<SezOccupanteSubmissionChecklistInfoTable, Long>
		sezOccCheckSubmitId = createColumn(
			"sezOccCheckSubmitId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, String>
		occNameReq = createColumn(
			"occNameReq", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, String>
		occDateReq = createColumn(
			"occDateReq", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, String>
		occGeneral = createColumn(
			"occGeneral", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, String>
		occComInfoRequest = createColumn(
			"occComInfoRequest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, String>
		occSwanStateRequest = createColumn(
			"occSwanStateRequest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, String>
		occSelectedRequest = createColumn(
			"occSelectedRequest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, String>
		occSelectedFacilityRequest = createColumn(
			"occSelectedFacilityRequest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, String>
		occSelectedApprovals = createColumn(
			"occSelectedApprovals", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, String>
		occSelectedSecurityRequest = createColumn(
			"occSelectedSecurityRequest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, String>
		occSelectedSDetailedBussiness = createColumn(
			"occSelectedSDetailedBussiness", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, String>
		occPaidShareCapProof = createColumn(
			"occPaidShareCapProof", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupanteSubmissionChecklistInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupanteSubmissionChecklistInfoTable() {
		super(
			"nbp_sez_occ_sub_check_info",
			SezOccupanteSubmissionChecklistInfoTable::new);
	}

}