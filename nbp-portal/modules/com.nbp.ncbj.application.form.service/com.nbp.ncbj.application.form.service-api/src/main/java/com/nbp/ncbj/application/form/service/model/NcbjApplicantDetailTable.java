/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_applicant_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicantDetail
 * @generated
 */
public class NcbjApplicantDetailTable
	extends BaseTable<NcbjApplicantDetailTable> {

	public static final NcbjApplicantDetailTable INSTANCE =
		new NcbjApplicantDetailTable();

	public final Column<NcbjApplicantDetailTable, Long> ncbjApplicantDetailId =
		createColumn(
			"ncbjApplicantDetailId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjApplicantDetailTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicantDetailTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicantDetailTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicantDetailTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicantDetailTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicantDetailTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicantDetailTable, Date> stageOne = createColumn(
		"stageOne", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicantDetailTable, Date> stageTwo = createColumn(
		"stageTwo", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicantDetailTable, Date> surveillanceAudit =
		createColumn(
			"surveillanceAudit", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicantDetailTable, Date> recertificationAudit =
		createColumn(
			"recertificationAudit", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicantDetailTable, Date> preAassessmentAudit =
		createColumn(
			"preAassessmentAudit", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicantDetailTable, Date> anyOtherService =
		createColumn(
			"anyOtherService ", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicantDetailTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjApplicantDetailTable() {
		super("nbp_ncbj_applicant_detail", NcbjApplicantDetailTable::new);
	}

}