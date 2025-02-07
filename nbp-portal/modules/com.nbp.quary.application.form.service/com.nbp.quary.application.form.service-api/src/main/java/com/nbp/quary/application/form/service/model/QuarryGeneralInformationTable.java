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
 * The table class for the &quot;nbp_quarry_general_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryGeneralInformation
 * @generated
 */
public class QuarryGeneralInformationTable
	extends BaseTable<QuarryGeneralInformationTable> {

	public static final QuarryGeneralInformationTable INSTANCE =
		new QuarryGeneralInformationTable();

	public final Column<QuarryGeneralInformationTable, Long> generalInfoId =
		createColumn(
			"generalInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<QuarryGeneralInformationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryGeneralInformationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryGeneralInformationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryGeneralInformationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryGeneralInformationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryGeneralInformationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryGeneralInformationTable, String>
		proposedNumberOfEmploy = createColumn(
			"proposedNumberOfEmploy", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryGeneralInformationTable, String>
		nonRefundableFee = createColumn(
			"nonRefundableFee", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryGeneralInformationTable, String>
		convictedUnderQuarryLaw = createColumn(
			"convictedUnderQuarryLaw", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryGeneralInformationTable, String> giveDetails =
		createColumn(
			"giveDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryGeneralInformationTable, String> licenseRefused =
		createColumn(
			"licenseRefused", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryGeneralInformationTable, Date> dateOfSignature =
		createColumn(
			"dateOfSignature", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<QuarryGeneralInformationTable, Long>
		quarryApplicationId = createColumn(
			"quarryApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private QuarryGeneralInformationTable() {
		super("nbp_quarry_general_info", QuarryGeneralInformationTable::new);
	}

}