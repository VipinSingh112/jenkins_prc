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
 * The table class for the &quot;nbp_hsra_detail_applicant&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantSecTwo
 * @generated
 */
public class DetailOfApplicantSecTwoTable
	extends BaseTable<DetailOfApplicantSecTwoTable> {

	public static final DetailOfApplicantSecTwoTable INSTANCE =
		new DetailOfApplicantSecTwoTable();

	public final Column<DetailOfApplicantSecTwoTable, Long>
		detailOfAppliSecTwoId = createColumn(
			"detailOfAppliSecTwoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<DetailOfApplicantSecTwoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, String> organizationName =
		createColumn(
			"organizationName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, String>
		nuclearMailingAddr = createColumn(
			"nuclearMailingAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, String> nuclearTrnNumber =
		createColumn(
			"nuclearTrnNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, String>
		nuclearTelephoneNo = createColumn(
			"nuclearTelephoneNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, String> nuclearFaxNo =
		createColumn(
			"nuclearFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, String> nuclearEmailAddr =
		createColumn(
			"nuclearEmailAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantSecTwoTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private DetailOfApplicantSecTwoTable() {
		super("nbp_hsra_detail_applicant", DetailOfApplicantSecTwoTable::new);
	}

}