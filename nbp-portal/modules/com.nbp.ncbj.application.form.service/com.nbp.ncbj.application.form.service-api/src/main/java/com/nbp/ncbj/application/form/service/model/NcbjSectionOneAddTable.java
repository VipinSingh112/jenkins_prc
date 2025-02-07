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
 * The table class for the &quot;nbp_ncbj_section_one_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOneAdd
 * @generated
 */
public class NcbjSectionOneAddTable extends BaseTable<NcbjSectionOneAddTable> {

	public static final NcbjSectionOneAddTable INSTANCE =
		new NcbjSectionOneAddTable();

	public final Column<NcbjSectionOneAddTable, Long> ncbjSectionOneAddId =
		createColumn(
			"ncbjSectionOneAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjSectionOneAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, String> headOfCompanyName =
		createColumn(
			"headOfCompanyName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, String> JobTitle = createColumn(
		"JobTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, Date> eMeilAddress =
		createColumn(
			"eMeilAddress", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, Date> telephoneNumber =
		createColumn(
			"telephoneNumber", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, Date> contactName =
		createColumn(
			"contactName", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, Date> contactNameJobTitle =
		createColumn(
			"contactNameJobTitle", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, Date> contactNameEmailAddress =
		createColumn(
			"contactNameEmailAddress", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, Date> contactNameTelephoneNum =
		createColumn(
			"contactNameTelephoneNum ", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneAddTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjSectionOneAddTable() {
		super("nbp_ncbj_section_one_add", NcbjSectionOneAddTable::new);
	}

}