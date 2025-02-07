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
 * The table class for the &quot;nbp_jtb_attract_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractDetailFormInfo
 * @generated
 */
public class AttractDetailFormInfoTable
	extends BaseTable<AttractDetailFormInfoTable> {

	public static final AttractDetailFormInfoTable INSTANCE =
		new AttractDetailFormInfoTable();

	public final Column<AttractDetailFormInfoTable, Long>
		attractDetailFormInfoId = createColumn(
			"attractDetailFormInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractDetailFormInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, String>
		newAttractionsOwnerName = createColumn(
			"newAttractionsOwnerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, String>
		newAttractionsLocation = createColumn(
			"newAttractionsLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, String>
		newAttractionsMailing = createColumn(
			"newAttractionsMailing", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, String>
		newAttractionsTelephone = createColumn(
			"newAttractionsTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, String>
		newAttractionsFaxNum = createColumn(
			"newAttractionsFaxNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, String>
		newAttractionsEmailAddr = createColumn(
			"newAttractionsEmailAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, String>
		newAttractionsEmpNum = createColumn(
			"newAttractionsEmpNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, String>
		newAttractionsParish = createColumn(
			"newAttractionsParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractDetailFormInfoTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractDetailFormInfoTable() {
		super("nbp_jtb_attract_detail", AttractDetailFormInfoTable::new);
	}

}