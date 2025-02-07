/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_attract_gen_dec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionGenDeclareInfo
 * @generated
 */
public class AttractionGenDeclareInfoTable
	extends BaseTable<AttractionGenDeclareInfoTable> {

	public static final AttractionGenDeclareInfoTable INSTANCE =
		new AttractionGenDeclareInfoTable();

	public final Column<AttractionGenDeclareInfoTable, Long>
		attractionGenDeclareInfoId = createColumn(
			"attractionGenDeclareInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionGenDeclareInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, String>
		newAttractionsGenOwnerName = createColumn(
			"newAttractionsGenOwnerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, String>
		newAttractionsCompanyLaw = createColumn(
			"newAttractionsCompanyLaw", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, Date>
		newAttractionsDate = createColumn(
			"newAttractionsDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, String>
		newAttractionsName = createColumn(
			"newAttractionsName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, Date>
		newAttractionsStartDate = createColumn(
			"newAttractionsStartDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, String>
		newAttractionsSituatedLand = createColumn(
			"newAttractionsSituatedLand", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, String>
		newAttractionsActivities = createColumn(
			"newAttractionsActivities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, Date> attractionNewDate =
		createColumn(
			"attractionNewDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionGenDeclareInfoTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionGenDeclareInfoTable() {
		super("nbp_jtb_attract_gen_dec", AttractionGenDeclareInfoTable::new);
	}

}