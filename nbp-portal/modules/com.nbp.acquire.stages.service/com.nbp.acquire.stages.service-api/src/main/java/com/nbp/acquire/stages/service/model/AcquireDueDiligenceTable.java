/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_acquire_duediligence&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDueDiligence
 * @generated
 */
public class AcquireDueDiligenceTable
	extends BaseTable<AcquireDueDiligenceTable> {

	public static final AcquireDueDiligenceTable INSTANCE =
		new AcquireDueDiligenceTable();

	public final Column<AcquireDueDiligenceTable, Long> sampleId = createColumn(
		"sampleId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AcquireDueDiligenceTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, String> siteVisitRequired =
		createColumn(
			"siteVisitRequired", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, Date> preferredSitVisitDate =
		createColumn(
			"preferredSitVisitDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, String>
		agencySubmissionStatus = createColumn(
			"agencySubmissionStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, String> nameOfAgency =
		createColumn(
			"nameOfAgency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, Date> dateSubmittedToAgency =
		createColumn(
			"dateSubmittedToAgency", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, String>
		agencyRecommendations = createColumn(
			"agencyRecommendations", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, Date> dateFeedbackReceived =
		createColumn(
			"dateFeedbackReceived", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AcquireDueDiligenceTable, Long> acquireApplicationId =
		createColumn(
			"acquireApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AcquireDueDiligenceTable() {
		super("nbp_acquire_duediligence", AcquireDueDiligenceTable::new);
	}

}