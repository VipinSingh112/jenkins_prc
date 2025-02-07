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
 * The table class for the &quot;nbp_jtb_car_rent_condition&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentCondition
 * @generated
 */
public class AttractionCarRentConditionTable
	extends BaseTable<AttractionCarRentConditionTable> {

	public static final AttractionCarRentConditionTable INSTANCE =
		new AttractionCarRentConditionTable();

	public final Column<AttractionCarRentConditionTable, Long>
		attractionCarRenConditId = createColumn(
			"attractionCarRenConditId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionCarRentConditionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentConditionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentConditionTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentConditionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentConditionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentConditionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentConditionTable, String>
		ncrConditionProp = createColumn(
			"ncrConditionProp", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentConditionTable, Long>
		jtbApplicationId = createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionCarRentConditionTable() {
		super(
			"nbp_jtb_car_rent_condition", AttractionCarRentConditionTable::new);
	}

}