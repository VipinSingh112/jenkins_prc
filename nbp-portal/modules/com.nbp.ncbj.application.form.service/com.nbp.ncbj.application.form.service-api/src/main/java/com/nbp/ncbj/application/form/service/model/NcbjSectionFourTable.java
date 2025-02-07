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
 * The table class for the &quot;nbp_ncbj_section_four&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionFour
 * @generated
 */
public class NcbjSectionFourTable extends BaseTable<NcbjSectionFourTable> {

	public static final NcbjSectionFourTable INSTANCE =
		new NcbjSectionFourTable();

	public final Column<NcbjSectionFourTable, Long> ncbjSectionFourId =
		createColumn(
			"ncbjSectionFourId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<NcbjSectionFourTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, String> consultService =
		createColumn(
			"consultService", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, String> consultTelephone =
		createColumn(
			"consultTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, String> consultEmail =
		createColumn(
			"consultEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, Date> consultStageOne =
		createColumn(
			"consultStageOne", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, Date> consultStageTwo =
		createColumn(
			"consultStageTwo", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, Date> consultSurveillanceAudit =
		createColumn(
			"consultSurveillanceAudit", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, Date>
		consultRecertificationAudit = createColumn(
			"consultRecertificationAudit", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, Date> consultPreassessmentAudit =
		createColumn(
			"consultPreassessmentAudit", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, Date> consultOtherService =
		createColumn(
			"consultOtherService", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, String> consultName =
		createColumn(
			"consultName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, String> consultPosition =
		createColumn(
			"consultPosition", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, Date> consultDate = createColumn(
		"consultDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionFourTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjSectionFourTable() {
		super("nbp_ncbj_section_four", NcbjSectionFourTable::new);
	}

}