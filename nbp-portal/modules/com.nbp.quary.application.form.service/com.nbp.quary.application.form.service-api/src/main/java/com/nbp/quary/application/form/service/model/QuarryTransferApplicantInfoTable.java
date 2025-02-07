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
 * The table class for the &quot;nbp_quarry_transfer_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryTransferApplicantInfo
 * @generated
 */
public class QuarryTransferApplicantInfoTable
	extends BaseTable<QuarryTransferApplicantInfoTable> {

	public static final QuarryTransferApplicantInfoTable INSTANCE =
		new QuarryTransferApplicantInfoTable();

	public final Column<QuarryTransferApplicantInfoTable, Long>
		quarryTransferInfoId = createColumn(
			"quarryTransferInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QuarryTransferApplicantInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String>
		transferCompanyName = createColumn(
			"transferCompanyName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String>
		transferLicenceNumber = createColumn(
			"transferLicenceNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String>
		transferLicenseLease = createColumn(
			"transferLicenseLease", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String>
		transferLeaseReason = createColumn(
			"transferLeaseReason", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String>
		nameOfApplicant = createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String> telephone =
		createColumn(
			"telephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String> email =
		createColumn("email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String>
		nationalityOfApplicant = createColumn(
			"nationalityOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String>
		addressInJamaica = createColumn(
			"addressInJamaica", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String>
		nameOfDirector = createColumn(
			"nameOfDirector", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String>
		nationalityOfDirector = createColumn(
			"nationalityOfDirector", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, Date> dateOfTransfer =
		createColumn(
			"dateOfTransfer", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, String> trnAndTcc =
		createColumn(
			"trnAndTcc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryTransferApplicantInfoTable, Long>
		quarryApplicationId = createColumn(
			"quarryApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private QuarryTransferApplicantInfoTable() {
		super(
			"nbp_quarry_transfer_info", QuarryTransferApplicantInfoTable::new);
	}

}