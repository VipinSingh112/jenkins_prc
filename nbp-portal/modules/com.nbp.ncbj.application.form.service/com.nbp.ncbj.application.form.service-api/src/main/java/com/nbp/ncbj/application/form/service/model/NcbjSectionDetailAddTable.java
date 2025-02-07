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
 * The table class for the &quot;nbp_ncbj_section_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionDetailAdd
 * @generated
 */
public class NcbjSectionDetailAddTable
	extends BaseTable<NcbjSectionDetailAddTable> {

	public static final NcbjSectionDetailAddTable INSTANCE =
		new NcbjSectionDetailAddTable();

	public final Column<NcbjSectionDetailAddTable, Long>
		ncbjSectionDetailAddId = createColumn(
			"ncbjSectionDetailAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjSectionDetailAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionDetailAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionDetailAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionDetailAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionDetailAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionDetailAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionDetailAddTable, String> addDetails =
		createColumn(
			"addDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionDetailAddTable, String> addNumHaccp =
		createColumn(
			"addNumHaccp", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionDetailAddTable, String> addTypeHaccp =
		createColumn(
			"addTypeHaccp", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionDetailAddTable, String> addHazard =
		createColumn(
			"addHazard", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionDetailAddTable, String> addConsentLic =
		createColumn(
			"addConsentLic", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionDetailAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionDetailAddTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjSectionDetailAddTable() {
		super("nbp_ncbj_section_detail", NcbjSectionDetailAddTable::new);
	}

}