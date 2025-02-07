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
 * The table class for the &quot;nbp_ncbj_company_det_gen&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailGen
 * @generated
 */
public class NcbjCompanyDetailGenTable
	extends BaseTable<NcbjCompanyDetailGenTable> {

	public static final NcbjCompanyDetailGenTable INSTANCE =
		new NcbjCompanyDetailGenTable();

	public final Column<NcbjCompanyDetailGenTable, Long>
		ncbjCompanyDetailGenId = createColumn(
			"ncbjCompanyDetailGenId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjCompanyDetailGenTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, String> companyAddress =
		createColumn(
			"companyAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, String> headOfCompany =
		createColumn(
			"headOfCompany", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, String> jobTitleOne =
		createColumn(
			"jobTitleOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, String> companyEmailOne =
		createColumn(
			"companyEmailOne", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, String> companyNumOne =
		createColumn(
			"companyNumOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, String> contactName =
		createColumn(
			"contactName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, String> jobTitleTwo =
		createColumn(
			"jobTitleTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, String> companyEmailTwo =
		createColumn(
			"companyEmailTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, String> companyNumTwo =
		createColumn(
			"companyNumTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjCompanyDetailGenTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjCompanyDetailGenTable() {
		super("nbp_ncbj_company_det_gen", NcbjCompanyDetailGenTable::new);
	}

}