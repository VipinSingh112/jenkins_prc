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
 * The table class for the &quot;nbp_creative_social_box&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeSocialMediaAddBox
 * @generated
 */
public class CreativeSocialMediaAddBoxTable
	extends BaseTable<CreativeSocialMediaAddBoxTable> {

	public static final CreativeSocialMediaAddBoxTable INSTANCE =
		new CreativeSocialMediaAddBoxTable();

	public final Column<CreativeSocialMediaAddBoxTable, Long>
		creativeSocialBoxId = createColumn(
			"creativeSocialBoxId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeSocialMediaAddBoxTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeSocialMediaAddBoxTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeSocialMediaAddBoxTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeSocialMediaAddBoxTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeSocialMediaAddBoxTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeSocialMediaAddBoxTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeSocialMediaAddBoxTable, String> socialMedia =
		createColumn(
			"socialMedia", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeSocialMediaAddBoxTable, String> profileName =
		createColumn(
			"profileName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeSocialMediaAddBoxTable, String>
		counterSocislMedia = createColumn(
			"counterSocislMedia", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeSocialMediaAddBoxTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeSocialMediaAddBoxTable() {
		super("nbp_creative_social_box", CreativeSocialMediaAddBoxTable::new);
	}

}