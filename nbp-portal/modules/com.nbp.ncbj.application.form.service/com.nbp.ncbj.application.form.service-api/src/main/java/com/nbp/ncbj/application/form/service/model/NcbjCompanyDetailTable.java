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
 * The table class for the &quot;nbp_ncbj_company_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetail
 * @generated
 */
public class NcbjCompanyDetailTable extends BaseTable<NcbjCompanyDetailTable> {

	public static final NcbjCompanyDetailTable INSTANCE =
		new NcbjCompanyDetailTable();

	public final Column<NcbjCompanyDetailTable, Long> ncbjCompanyDetailId =
		createColumn(
			"ncbjCompanyDetailId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjCompanyDetailTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, String>
		companyNameOrHeadOffice = createColumn(
			"companyNameOrHeadOffice", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, String> companyAddress =
		createColumn(
			"companyAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, Date> stageOne = createColumn(
		"stageOne", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, Date> stageTwo = createColumn(
		"stageTwo", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, Date> surveillanceAudit =
		createColumn(
			"surveillanceAudit", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, Date> recertificationAudit =
		createColumn(
			"recertificationAudit", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, Date> preAassessmentAudit =
		createColumn(
			"preAassessmentAudit", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, Date> anyOtherService =
		createColumn(
			"anyOtherService ", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjCompanyDetailTable() {
		super("nbp_ncbj_company_detail", NcbjCompanyDetailTable::new);
	}

}