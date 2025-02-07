/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_quarry_applicant_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicatntInformation
 * @generated
 */
public class QuarryApplicatntInformationTable
	extends BaseTable<QuarryApplicatntInformationTable> {

	public static final QuarryApplicatntInformationTable INSTANCE =
		new QuarryApplicatntInformationTable();

	public final Column<QuarryApplicatntInformationTable, Long>
		auarryApplicantId = createColumn(
			"auarryApplicantId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<QuarryApplicatntInformationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicatntInformationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicatntInformationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicatntInformationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicatntInformationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicatntInformationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicatntInformationTable, String>
		nameOfApplicant = createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicatntInformationTable, String>
		addressOfApplicant = createColumn(
			"addressOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicatntInformationTable, String>
		telephoneOfApplicant = createColumn(
			"telephoneOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicatntInformationTable, String>
		emailOfApplicant = createColumn(
			"emailOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicatntInformationTable, String> trnAndTcc =
		createColumn(
			"trnAndTcc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicatntInformationTable, Long>
		quarryApplicationId = createColumn(
			"quarryApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private QuarryApplicatntInformationTable() {
		super(
			"nbp_quarry_applicant_info", QuarryApplicatntInformationTable::new);
	}

}