/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_add_ins_phy_sec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceSec
 * @generated
 */
public class AddPhyResourceSecTable extends BaseTable<AddPhyResourceSecTable> {

	public static final AddPhyResourceSecTable INSTANCE =
		new AddPhyResourceSecTable();

	public final Column<AddPhyResourceSecTable, Long> addPhyResourceSecId =
		createColumn(
			"addPhyResourceSecId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddPhyResourceSecTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceSecTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceSecTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceSecTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceSecTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceSecTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceSecTable, String> number = createColumn(
		"number_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceSecTable, String> location = createColumn(
		"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceSecTable, String> activitiesPerformed =
		createColumn(
			"activitiesPerformed", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceSecTable, String> contactDetails =
		createColumn(
			"contactDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceSecTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceSecTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddPhyResourceSecTable() {
		super("nbp_janaac_add_ins_phy_sec", AddPhyResourceSecTable::new);
	}

}