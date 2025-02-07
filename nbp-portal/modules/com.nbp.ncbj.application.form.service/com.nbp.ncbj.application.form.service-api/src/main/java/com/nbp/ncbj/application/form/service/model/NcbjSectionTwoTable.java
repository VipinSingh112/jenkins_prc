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
 * The table class for the &quot;nbp_ncbj_section_two&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionTwo
 * @generated
 */
public class NcbjSectionTwoTable extends BaseTable<NcbjSectionTwoTable> {

	public static final NcbjSectionTwoTable INSTANCE =
		new NcbjSectionTwoTable();

	public final Column<NcbjSectionTwoTable, Long> ncbjSectionTwoId =
		createColumn(
			"ncbjSectionTwoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<NcbjSectionTwoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionTwoTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionTwoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionTwoTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionTwoTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionTwoTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionTwoTable, String> incomingMaterials =
		createColumn(
			"incomingMaterials", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionTwoTable, String> productStorage =
		createColumn(
			"productStorage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionTwoTable, String> buildingSiteAspects =
		createColumn(
			"buildingSiteAspects", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionTwoTable, String> wasteDischarges =
		createColumn(
			"wasteDischarges", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionTwoTable, String> transportDetails =
		createColumn(
			"transportDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionTwoTable, String> subcontractedActivities =
		createColumn(
			"subcontractedActivities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionTwoTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjSectionTwoTable() {
		super("nbp_ncbj_section_two", NcbjSectionTwoTable::new);
	}

}