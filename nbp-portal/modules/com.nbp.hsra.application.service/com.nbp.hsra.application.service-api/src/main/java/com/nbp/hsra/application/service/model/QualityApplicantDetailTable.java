/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_quality_applicant&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QualityApplicantDetail
 * @generated
 */
public class QualityApplicantDetailTable
	extends BaseTable<QualityApplicantDetailTable> {

	public static final QualityApplicantDetailTable INSTANCE =
		new QualityApplicantDetailTable();

	public final Column<QualityApplicantDetailTable, Long>
		qualityApplicantDetailId = createColumn(
			"qualityApplicantDetailId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QualityApplicantDetailTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, String> expertSurname =
		createColumn(
			"expertSurname", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, String> expertFirstName =
		createColumn(
			"expertFirstName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, String> expertId =
		createColumn(
			"expertId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, String> expertPosition =
		createColumn(
			"expertPosition", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, String> expertTelephone =
		createColumn(
			"expertTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, String> expertMobile =
		createColumn(
			"expertMobile", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, String> expertEmail =
		createColumn(
			"expertEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, Date> expertDate =
		createColumn(
			"expertDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualityApplicantDetailTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private QualityApplicantDetailTable() {
		super("nbp_hsra_quality_applicant", QualityApplicantDetailTable::new);
	}

}