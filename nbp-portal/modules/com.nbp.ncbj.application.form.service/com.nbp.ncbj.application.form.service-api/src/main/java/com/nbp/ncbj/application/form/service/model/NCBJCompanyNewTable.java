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
 * The table class for the &quot;nbp_ncbj_new_company&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NCBJCompanyNew
 * @generated
 */
public class NCBJCompanyNewTable extends BaseTable<NCBJCompanyNewTable> {

	public static final NCBJCompanyNewTable INSTANCE =
		new NCBJCompanyNewTable();

	public final Column<NCBJCompanyNewTable, Long> nCBJCompanyNewId =
		createColumn(
			"nCBJCompanyNewId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<NCBJCompanyNewTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, String> companyName = createColumn(
		"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, String> companyAddress =
		createColumn(
			"companyAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, String> headOfCompany =
		createColumn(
			"headOfCompany", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, String> jobTitleOne = createColumn(
		"jobTitleOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, String> companyEmailOne =
		createColumn(
			"companyEmailOne", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, String> companyNumOne =
		createColumn(
			"companyNumOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, String> contactName = createColumn(
		"contactName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, String> jobTitleTwo = createColumn(
		"jobTitleTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, String> companyEmailTwo =
		createColumn(
			"companyEmailTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, String> companyNumTwo =
		createColumn(
			"companyNumTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NCBJCompanyNewTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NCBJCompanyNewTable() {
		super("nbp_ncbj_new_company", NCBJCompanyNewTable::new);
	}

}