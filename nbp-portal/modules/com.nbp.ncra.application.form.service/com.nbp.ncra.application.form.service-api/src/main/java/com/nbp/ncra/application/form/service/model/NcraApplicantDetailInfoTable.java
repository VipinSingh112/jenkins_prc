/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncra_applicant_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicantDetailInfo
 * @generated
 */
public class NcraApplicantDetailInfoTable
	extends BaseTable<NcraApplicantDetailInfoTable> {

	public static final NcraApplicantDetailInfoTable INSTANCE =
		new NcraApplicantDetailInfoTable();

	public final Column<NcraApplicantDetailInfoTable, Long>
		ncraApplicantDetailInfoId = createColumn(
			"ncraApplicantDetailInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcraApplicantDetailInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, String>
		applicantBusinessName = createColumn(
			"applicantBusinessName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, String> applicantAddress =
		createColumn(
			"applicantAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, String> applicantContact =
		createColumn(
			"applicantContact", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, String> applicantTeleNum =
		createColumn(
			"applicantTeleNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, String> applicantFaxNo =
		createColumn(
			"applicantFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, String>
		applicantEmailAddr = createColumn(
			"applicantEmailAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, String>
		applicantLocation = createColumn(
			"applicantLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcraApplicantDetailInfoTable, Long> ncraApplicationId =
		createColumn(
			"ncraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcraApplicantDetailInfoTable() {
		super("nbp_ncra_applicant_details", NcraApplicantDetailInfoTable::new);
	}

}