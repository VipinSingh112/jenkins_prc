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
 * The table class for the &quot;nbp_sez_dev_sub_checklist&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see sezSubmissionChecklist
 * @generated
 */
public class sezSubmissionChecklistTable
	extends BaseTable<sezSubmissionChecklistTable> {

	public static final sezSubmissionChecklistTable INSTANCE =
		new sezSubmissionChecklistTable();

	public final Column<sezSubmissionChecklistTable, Long>
		sezSubmissionChecklistId = createColumn(
			"sezSubmissionChecklistId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<sezSubmissionChecklistTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String> selectedGeneral =
		createColumn(
			"selectedGeneral", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String>
		selectedComInfoReq = createColumn(
			"selectedComInfoReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String> paidShareCapProof =
		createColumn(
			"paidShareCapProof", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String>
		selectedSwornStateReq = createColumn(
			"selectedSwornStateReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String>
		selectedLandOccuReq = createColumn(
			"selectedLandOccuReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String>
		selectedSafetyHealthReq = createColumn(
			"selectedSafetyHealthReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String>
		selectedLandDevlopmentReq = createColumn(
			"selectedLandDevlopmentReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String>
		selectedTechInfoReq = createColumn(
			"selectedTechInfoReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String>
		selectedSezPreliminaryReq = createColumn(
			"selectedSezPreliminaryReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String>
		selectedSezDevDetailReq = createColumn(
			"selectedSezDevDetailReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String>
		selectedApprovalReq = createColumn(
			"selectedApprovalReq", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, String> nameReq =
		createColumn(
			"nameReq", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, Date> dateReq =
		createColumn(
			"dateReq", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<sezSubmissionChecklistTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private sezSubmissionChecklistTable() {
		super("nbp_sez_dev_sub_checklist", sezSubmissionChecklistTable::new);
	}

}