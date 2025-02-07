/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_creative_contact_box&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeContactInfoAddBox
 * @generated
 */
public class CreativeContactInfoAddBoxTable
	extends BaseTable<CreativeContactInfoAddBoxTable> {

	public static final CreativeContactInfoAddBoxTable INSTANCE =
		new CreativeContactInfoAddBoxTable();

	public final Column<CreativeContactInfoAddBoxTable, Long>
		creativeContactBoxId = createColumn(
			"creativeContactBoxId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeContactInfoAddBoxTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeContactInfoAddBoxTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeContactInfoAddBoxTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeContactInfoAddBoxTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeContactInfoAddBoxTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeContactInfoAddBoxTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeContactInfoAddBoxTable, String>
		contactTelephone = createColumn(
			"contactTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeContactInfoAddBoxTable, String> contactFax =
		createColumn(
			"contactFax", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeContactInfoAddBoxTable, String>
		contactEmailAddress = createColumn(
			"contactEmailAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeContactInfoAddBoxTable, String> counterContact =
		createColumn(
			"counterContact", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeContactInfoAddBoxTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeContactInfoAddBoxTable() {
		super("nbp_creative_contact_box", CreativeContactInfoAddBoxTable::new);
	}

}