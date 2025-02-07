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
 * The table class for the &quot;nbp_ncbj_business_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjBusinessDetail
 * @generated
 */
public class NcbjBusinessDetailTable
	extends BaseTable<NcbjBusinessDetailTable> {

	public static final NcbjBusinessDetailTable INSTANCE =
		new NcbjBusinessDetailTable();

	public final Column<NcbjBusinessDetailTable, Long> ncbjBusinessDetailId =
		createColumn(
			"ncbjBusinessDetailId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjBusinessDetailTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, String> quotationAddressOne =
		createColumn(
			"quotationAddressOne", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, String> quotationProductTypes =
		createColumn(
			"quotationProductTypes", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, String>
		quotationApplicantShifts = createColumn(
			"quotationApplicantShifts", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, String> quotationEmpNum =
		createColumn(
			"quotationEmpNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, String> quotationHeadOffices =
		createColumn(
			"quotationHeadOffices", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, String>
		quotationFullTimeEmploy = createColumn(
			"quotationFullTimeEmploy", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, String>
		quotationPartTimeEmploy = createColumn(
			"quotationPartTimeEmploy", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, String> quotationContractors =
		createColumn(
			"quotationContractors", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, String>
		quotationContractedWorker = createColumn(
			"quotationContractedWorker", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjBusinessDetailTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjBusinessDetailTable() {
		super("nbp_ncbj_business_detail", NcbjBusinessDetailTable::new);
	}

}